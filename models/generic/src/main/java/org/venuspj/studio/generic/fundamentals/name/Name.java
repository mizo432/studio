package org.venuspj.studio.generic.fundamentals.name;

import org.venuspj.ddd.model.value.StringValue;

import java.util.function.Predicate;

import static org.venuspj.util.objects2.Objects2.*;
import static org.venuspj.util.strings2.Strings2.isNotEmpty;

public class Name implements StringValue {
    private String value;

    Name() {

    }

    public Name(String aValue) {
        value = aValue;

    }

    public static Name defaultName() {
        return new Name();
    }

    public static Name emptyName() {
        return new Name();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public String asText() {
        return value;
    }

    public boolean isPresent() {
        return nonNull(value) && isNotEmpty(value);
    }

    public static class NameCriteria implements Predicate<Name> {
        private EqualStringCriteria equalStringCriteria = EqualStringCriteria.emptyEqualStringCriteria();

        @Override
        public boolean test(Name aName) {
            return equalStringCriteria.test(aName);
        }
        NameCriteria equal(Name aName) {
            equalStringCriteria.setSource(aName);
            return this;
        }


    }
    private static class EqualStringCriteria implements Predicate<StringValue> {
        private boolean isEmpty = true;
        private StringValue source = null;

        @Override
        public boolean test(StringValue aStringValue) {
            if (isEmpty) return true;
            return equal(source.asText(),aStringValue.asText());
        }

        public void setSource(StringValue aStringValue) {
            source = aStringValue;
            isEmpty = false;
        }

        public static EqualStringCriteria emptyEqualStringCriteria(){
            return new EqualStringCriteria();
        }
    }

}
