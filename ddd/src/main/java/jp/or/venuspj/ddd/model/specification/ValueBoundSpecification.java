package jp.or.venuspj.ddd.model.specification;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

public abstract class ValueBoundSpecification<T> implements Specification<T> {
    private final String propertyName;
    private final Object value;

    public ValueBoundSpecification(String aPropertyName, Object aValue) {
        super();
        this.propertyName = aPropertyName;
        this.value = aValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean isSatisfiedBy(T candidate) {
        Field field = ReflectionUtils.findField(candidate.getClass(), propertyName);
        ReflectionUtils.makeAccessible(field);
        Object candidateValue = ReflectionUtils.getField(field, candidate);
        return isSatisfyingValue(candidateValue);
    }

    /**
     * See if a property value satisfies all the requirements expressed in this specification.
     * @param candidateValue the property value being verified
     * @return {@code true} if the requirements are satisfied, otherwise {@code false}
     */
    protected abstract boolean isSatisfyingValue(Object candidateValue);

    /**
     *
     * @return
     */
    public String propertyName() {
        return propertyName;
    }

    /**
     *
     * @return
     */
    public Object value() {
        return value;
    }
}
