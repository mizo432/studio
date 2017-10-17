package org.venuspj.studio.core.model.event.eventOutline;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifiers;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifiers;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitIds;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.ppt.place.PlaceImpl;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * イベントのアウトラインを保持するValueObject
 */
public class Outline {
    RecordDate recordDate;
    Address address;
    EntityIdentifiers<Party> playerIds = OrganizationUnitIds.emptyOrganizationUnitIds();
    Place place;

    Outline() {
    }

    public Outline(RecordDate aRecordDate, Address anAddress, EntityIdentifiers<Party> anPlayerIds, Place aPlace) {
        recordDate = aRecordDate;
        address = anAddress;
        playerIds = anPlayerIds;
        place = aPlace;
    }

    public static Outline defaultOutline() {
        return new Outline();
    }

    public static Outline emptyOutline() {
        return new Outline(
                RecordDate.emptyRecordDate(),
                Address.nullAddress(),
                DefaultEntityIdentifiers.emptyEntityIdentifiers(), PlaceImpl.emptyPlace());
    }

    public Iterable<EntityIdentifier<Party>> playerIds() {
        return playerIds;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("recordDate", recordDate)
                .add("address", address)
                .add("place", place)
                .add("playerIds", playerIds)
                .omitNullValues()
                .toString();
    }

    @Override
    public int hashCode() {
        return hash(recordDate, address, place, playerIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (isNull(obj)) return false;
        if (this == obj) return true;
        return (obj instanceof Outline)
                && equal(((Outline) obj).recordDate, recordDate)
                && equal(((Outline) obj).address, address)
                && equal(((Outline) obj).place, place)
                && equal(((Outline) obj).playerIds, playerIds);
    }

    public boolean sameValueAs(Outline anOutline) {
        return equals(anOutline);
    }

    public static final class OutlineBuilder extends ObjectBuilder<Outline, OutlineBuilder> {
        RecordDate recordDate;
        Address address;
        EntityIdentifiers<Party> playerIds = OrganizationUnitIds.emptyOrganizationUnitIds();
        Place place;

        @Override
        protected void apply(Outline vo, OutlineBuilder builder) {
            builder.withRecordDate(vo.recordDate);
            builder.withAddress(vo.address);
            builder.withPlayerIds(vo.playerIds);
            builder.withPlace(vo.place);
        }

        public OutlineBuilder withPlace(Place aPlace) {
            if (isNull(aPlace)) return getThis();

            addConfigurator(builder -> builder.place = aPlace);
            return getThis();
        }

        public OutlineBuilder withPlayerIds(EntityIdentifiers<Party> anyPlayerIds) {
            if (isNull(anyPlayerIds)) return getThis();

            addConfigurator(builder -> builder.playerIds = anyPlayerIds);
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
            return new Outline(recordDate, address, playerIds, place);
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
