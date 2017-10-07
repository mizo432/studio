package org.venuspj.ddd.model.entity;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class DefaultEntityIdentifierTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultEntityIdentifierTest.class);

    @Test
    public void getKind1() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, uuid);
        String actual = target.getKind();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(ConcreteEntity.class.getName());
    }

    @Test
    public void getKind2() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class.getName(), uuid);
        String actual = target.getKind();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(ConcreteEntity.class.getName());
    }

    @Test
    public void toUUID() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, uuid);
        UUID actual = target.toUUID();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(uuid);
    }

    @Test
    public void hashCode1() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, uuid);
        int actual = target.hashCode();
        assertThat(actual)
                .isNotNull();

    }

    @Test
    public void equals1() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, uuid);
        boolean actual = target.equals(target);
        assertThat(actual)
                .isTrue();
    }

    @Test
    public void equals2() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, uuid);
        DefaultEntityIdentifier<ConcreteEntity> other = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, uuid);
        boolean actual = target.equals(other);
        assertThat(actual)
                .isTrue();
    }

    @Test
    public void equals3() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, uuid);
        boolean actual = target.equals(null);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals4() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, uuid);
        boolean actual = target.equals(Integer.valueOf(1));
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals5() throws Exception {
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, UUID.randomUUID());
        DefaultEntityIdentifier<ConcreteEntity> other = new DefaultEntityIdentifier<ConcreteEntity>(ConcreteEntity.class, UUID.randomUUID());
        boolean actual = target.equals(other);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals6() throws Exception {
        UUID uuid = UUID.randomUUID();
        DefaultEntityIdentifier<ConcreteEntity> target = new DefaultEntityIdentifier<>("A", uuid);
        DefaultEntityIdentifier<ConcreteEntity> other = new DefaultEntityIdentifier<>("B", uuid);
        boolean actual = target.equals(other);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void dummy() throws Exception {
        new ConcreteEntity();
    }

}