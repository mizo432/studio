package org.venuspj.studio.core.model.event.eventOutline;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.performer.Performers;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.ppt.place.PlaceImpl;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * イベントのアウトラインを保持するValueObject
 */
public class Outline {
    private RecordDate recordDate;
    private Address address;
    private Performers performers;
    private Place place;

    Outline() {
    }

    public Outline(RecordDate aRecordDate, Address anAddress, Performers anyPerformers, Place aPlace) {
        recordDate = aRecordDate;
        address = anAddress;
        performers = anyPerformers;
        place = aPlace;
    }

    public static Outline defaultOutline() {
        return new Outline();
    }

    public static Outline emptyOutline() {
        return new Outline(
                RecordDate.emptyRecordDate(),
                Address.nullAddress(),
                Performers.empty(), PlaceImpl.emptyPlace());
    }

    @Override
    public int hashCode() {
        return hash(recordDate, address, place, performers);
    }

    @Override
    public boolean equals(Object obj) {
        if (isNull(obj)) return false;
        if (this == obj) return true;
        return (obj instanceof Outline)
                && equal(((Outline) obj).recordDate, recordDate)
                && equal(((Outline) obj).address, address)
                && equal(((Outline) obj).place, place)
                && equal(((Outline) obj).performers, performers);
    }

    public boolean sameValueAs(Outline anOutline) {
        return equals(anOutline);
    }

    public static final class OutlineBuilder extends ObjectBuilder<Outline, OutlineBuilder> {
        RecordDate recordDate;
        Address address;
        Performers performers = Performers.empty();
        Place place;

        @Override
        protected void apply(Outline vo, OutlineBuilder builder) {
            builder.withRecordDate(vo.recordDate);
            builder.withAddress(vo.address);
            builder.withPerformers(vo.performers);
            builder.withPlace(vo.place);
        }

        public OutlineBuilder withPlace(Place aPlace) {
            if (isNull(aPlace)) return getThis();

            addConfigurator(builder -> builder.place = aPlace);
            return getThis();
        }

        public OutlineBuilder withPerformers(Performers anyPerformers) {
            if (isNull(anyPerformers)) return getThis();

            addConfigurator(builder -> builder.performers = anyPerformers);
            return getThis();
        }

        public OutlineBuilder withAddress(Address anAddress) {
            if (isNull(anAddress)) return getThis();

            addConfigurator(builder -> builder.address = anAddress);
            return getThis();
        }

        public OutlineBuilder withRecordDate(RecordDate aRecordDate) {
            if (isNull(aRecordDate)) return getThis();

            addConfigurator(builder -> builder.recordDate = aRecordDate);
            return getThis();
        }

        @Override
        protected Outline createValueObject() {
            return new Outline(recordDate, address, performers, place);
        }

        @Override
        protected OutlineBuilder getThis() {
            return this;
        }

        @Override
        protected OutlineBuilder newInstance() {
            return new OutlineBuilder();
        }
    }

}
