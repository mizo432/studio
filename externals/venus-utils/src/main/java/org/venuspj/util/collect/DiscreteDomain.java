package org.venuspj.util.collect;

import org.venuspj.util.primitives.Ints;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

import static org.venuspj.util.base.Preconditions.checkArgument;
import static org.venuspj.util.collect.CollectPreconditions.checkNonNegative;

public abstract class DiscreteDomain<C extends Comparable> {

    /**
     * Returns the discrete domain for values of type {@code Integer}.
     *
     * @since 14.0 (since 10.0 as {@code DiscreteDomains.integers()})
     */
    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.INSTANCE;
    }

    private static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        private static final IntegerDomain INSTANCE = new IntegerDomain();

        IntegerDomain() {
            super(true);
        }

        @Override
        public Integer next(Integer value) {
            int i = value;
            return (i == Integer.MAX_VALUE) ? null : i + 1;
        }

        @Override
        public Integer previous(Integer value) {
            int i = value;
            return (i == Integer.MIN_VALUE) ? null : i - 1;
        }

        @Override
        Integer offset(Integer origin, long distance) {
            checkNonNegative(distance, "distance");
            return Ints.checkedCast(origin.longValue() + distance);
        }

        @Override
        public long distance(Integer start, Integer end) {
            return (long) end - start;
        }

        @Override
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override
        public String toString() {
            return "DiscreteDomain.integers()";
        }

        private static final long serialVersionUID = 0;
    }

    /**
     * Returns the discrete domain for values of type {@code Long}.
     *
     * @since 14.0 (since 10.0 as {@code DiscreteDomains.longs()})
     */
    public static DiscreteDomain<Long> longs() {
        return LongDomain.INSTANCE;
    }

    private static final class LongDomain extends DiscreteDomain<Long> implements Serializable {
        private static final LongDomain INSTANCE = new LongDomain();

        LongDomain() {
            super(true);
        }

        @Override
        public Long next(Long value) {
            long l = value;
            return (l == Long.MAX_VALUE) ? null : l + 1;
        }

        @Override
        public Long previous(Long value) {
            long l = value;
            return (l == Long.MIN_VALUE) ? null : l - 1;
        }

        @Override
        Long offset(Long origin, long distance) {
            checkNonNegative(distance, "distance");
            long result = origin + distance;
            if (result < 0) {
                checkArgument(origin < 0, "overflow");
            }
            return result;
        }

        @Override
        public long distance(Long start, Long end) {
            long result = end - start;
            if (end > start && result < 0) { // overflow
                return Long.MAX_VALUE;
            }
            if (end < start && result > 0) { // underflow
                return Long.MIN_VALUE;
            }
            return result;
        }

        @Override
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override
        public String toString() {
            return "DiscreteDomain.longs()";
        }

        private static final long serialVersionUID = 0;
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return BigIntegerDomain.INSTANCE;
    }

    private static final class BigIntegerDomain extends DiscreteDomain<BigInteger>
            implements Serializable {
        private static final BigIntegerDomain INSTANCE = new BigIntegerDomain();

        BigIntegerDomain() {
            super(true);
        }

        private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
        private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);

        @Override
        public BigInteger next(BigInteger value) {
            return value.add(BigInteger.ONE);
        }

        @Override
        public BigInteger previous(BigInteger value) {
            return value.subtract(BigInteger.ONE);
        }

        @Override
        BigInteger offset(BigInteger origin, long distance) {
            checkNonNegative(distance, "distance");
            return origin.add(BigInteger.valueOf(distance));
        }

        @Override
        public long distance(BigInteger start, BigInteger end) {
            return end.subtract(start).max(MIN_LONG).min(MAX_LONG).longValue();
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override
        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        private static final long serialVersionUID = 0;
    }

    final boolean supportsFastOffset;

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean supportsFastOffset) {
        this.supportsFastOffset = supportsFastOffset;
    }

    C offset(C origin, long distance) {
        checkNonNegative(distance, "distance");
        for (long i = 0; i < distance; i++) {
            origin = next(origin);
        }
        return origin;
    }

    public abstract C next(C value);

    public abstract C previous(C value);

    public abstract long distance(C start, C end);

    public C minValue() {
        throw new NoSuchElementException();
    }

    public C maxValue() {
        throw new NoSuchElementException();
    }
}