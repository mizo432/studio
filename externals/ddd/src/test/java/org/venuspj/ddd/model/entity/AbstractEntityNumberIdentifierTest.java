package org.venuspj.ddd.model.entity;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class AbstractEntityNumberIdentifierTest {

    @Test
    public void setValue1() {
        ConcreteNumberIdentifier target = new ConcreteNumberIdentifier();
        target.setValue(1);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void setValue2() {
        ConcreteNumberIdentifier target = new ConcreteNumberIdentifier(1);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void getValue() {
        ConcreteNumberIdentifier target = new ConcreteNumberIdentifier();
        System.out.println(toStringHelper(target).defaultConfig().toString());
        assertThat(target.getValue())
                .isEqualTo(Integer.valueOf(-1));
    }

    @Test
    public void equals1() {
        ConcreteNumberIdentifier target = new ConcreteNumberIdentifier();
        System.out.println(toStringHelper(target).defaultConfig().toString());
        assertThat(target.equals(target))
                .isTrue();
    }

    @Test
    public void hashCode1() {
        ConcreteNumberIdentifier target = new ConcreteNumberIdentifier();
        assertThat(target.hashCode())
                .isEqualTo(-2066598499);
    }

    private static class ConcreteNumberIdentifier extends AbstractEntityNumberIdentifier<ConcreteEntity> {
        ConcreteNumberIdentifier(){
           super(ConcreteEntity.class);
        }
        ConcreteNumberIdentifier(Integer aValue){
            super(ConcreteEntity.class,aValue);
        }

    }
}