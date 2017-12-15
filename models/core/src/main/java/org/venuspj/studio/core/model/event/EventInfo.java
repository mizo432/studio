package org.venuspj.studio.core.model.event;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.performer.Performers;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * イベントの情報
 */
public class EventInfo {
    /**
     * 概要
     */
    private Outline outline;
    /**
     * 名前、詳細
     */
    private Descriptor descriptor;
    /**
     * フライヤー
     */
    private Flyers flyers;

    /**
     * イベント参加プレーヤー.
     */
    private Performers performers;

    EventInfo() {

    }

    public EventInfo(Outline anOutline,
                     Descriptor aDescriptor,
                     Flyers anyFlyers,
                     Performers anyPerformers) {
        outline = anOutline;
        descriptor = aDescriptor;
        flyers = anyFlyers;
        performers = anyPerformers;

    }

    public static EventInfo emptyEventInfo() {
        return new EventInfo(Outline.emptyOutline(),
                Descriptor.emptyDescriptor(),
                Flyers.emptyFlyers(),
                Performers.empty());
    }

    public Outline getOutLine() {
        return outline;
    }

    public Descriptor getDescriptor() {
        return descriptor;
    }

    public static final class EventInfoBuilder extends ObjectBuilder<EventInfo, EventInfoBuilder> {
        protected Outline outline;
        protected Descriptor descriptor;
        protected Flyers flyers;
        protected Performers performers;

        @Override
        protected void apply(EventInfo vo, EventInfoBuilder builder) {
            builder.withOutline(vo.outline);
            builder.withDescriptor(vo.descriptor);
            builder.withFlyers(vo.flyers);
            builder.withPerformers(vo.performers);

        }

        private EventInfoBuilder withPerformers(Performers anyPerformers) {
            if (isNull(anyPerformers)) return getThis();
            addConfigurator(builder -> builder.performers = anyPerformers);
            return getThis();

        }

        private EventInfoBuilder withFlyers(Flyers anyFlyers) {
            if (isNull(anyFlyers)) return getThis();
            addConfigurator(builder -> builder.flyers = anyFlyers);
            return getThis();
        }

        public EventInfoBuilder withDescriptor(Descriptor aDescriptor) {
            if (isNull(aDescriptor)) return getThis();
            addConfigurator(builder -> builder.descriptor = aDescriptor);
            return getThis();

        }

        public EventInfoBuilder withOutline(Outline anOutline) {
            if (isNull(anOutline)) return getThis();
            addConfigurator(builder -> builder.outline = anOutline);
            return getThis();

        }

        @Override
        protected EventInfo createValueObject() {
            return new EventInfo(outline, descriptor, flyers, performers);
        }

        @Override
        protected EventInfoBuilder getThis() {
            return this;
        }

        @Override
        protected EventInfoBuilder newInstance() {
            return new EventInfoBuilder();
        }
    }

}
