package org.venuspj.studio.generic.fundamentals.name;

import org.venuspj.ddd.model.criteria.AbstractConcreteCriteria;
import org.venuspj.ddd.model.criteria.Criteria;
import org.venuspj.ddd.model.criteria.text.TextCriteria;
import org.venuspj.ddd.model.value.StringValue;

import java.util.function.Predicate;

import static org.venuspj.util.objects2.Objects2.nonNull;
import static org.venuspj.util.objects2.Objects2.toStringHelper;
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

    public static Name empty() {
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

    public static class NameCriteria extends AbstractConcreteCriteria<Name> implements Predicate<Name> {
        private TextCriteria textCriteria = TextCriteria.create(this);

        public NameCriteria(Criteria aParentCriteria) {
            super(aParentCriteria);
        }

        NameCriteria() {
            super();
        }


        @Override
        public boolean test(Name aName) {
            return isEmpty() || textCriteria.test(aName.asText());
        }

        public void like(Name aName) {
            textCriteria.like(aName.asText());
            present();
        }

        public static NameCriteria create(Criteria aParentCriteria) {
            return new NameCriteria(aParentCriteria);
        }

    }
}
