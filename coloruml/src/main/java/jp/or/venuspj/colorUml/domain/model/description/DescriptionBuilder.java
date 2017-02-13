package jp.or.venuspj.colorUml.domain.model.description;

import jp.or.venuspj.colorUml.domain.fundamentals.note.Note;
import jp.or.venuspj.colorUml.domain.model.Assess;
import jp.or.venuspj.colorUml.domain.model.Description;
import jp.or.venuspj.colorUml.domain.model.PartyPlaceThings;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.Optional;

/**
 */
public class DescriptionBuilder extends ObjectBuilder<Description, DescriptionBuilder> {

    PartyPlaceThings partyPlaceThings;
    Note note;
    Optional<Assess> assessOptional = Optional.empty();

    @Override
    protected void apply(Description vo, DescriptionBuilder builder) {
        DescriptionImpl concreteVo = (DescriptionImpl) vo;
        builder.withNote(concreteVo.note);
        builder.withAssessOptional(concreteVo.assessOptional);
        builder.withPartyPlaceThings(concreteVo.partyPlaceThings);
    }

    public DescriptionBuilder withPartyPlaceThings(PartyPlaceThings aPartyPlaceThings) {
        if (Objects2.isNull(aPartyPlaceThings)) return getThis();
        addConfigurator(builder -> builder.partyPlaceThings = aPartyPlaceThings);
        return getThis();

    }

    public DescriptionBuilder withAssessOptional(Optional<Assess> anAssessOptional) {
        if (Objects2.isNull(anAssessOptional)) return getThis();
        addConfigurator(builder -> builder.assessOptional = anAssessOptional);
        return getThis();
    }

    public DescriptionBuilder withNote(Note aNote) {
        if (Objects2.isNull(aNote)) return getThis();
        addConfigurator(builder -> builder.note = aNote);
        return getThis();
    }

    @Override
    protected Description createValueObject() {
        return new DescriptionImpl(note,
                partyPlaceThings,
                assessOptional);
    }

    @Override
    protected DescriptionBuilder getThis() {
        return this;
    }

    @Override
    protected DescriptionBuilder newInstance() {
        return new DescriptionBuilder();
    }

    public DescriptionBuilder withNote(String aNote) {
        if (Objects2.isNull(aNote)) return getThis();
        addConfigurator(builder -> builder.note = new Note(aNote));
        return getThis();
    }
}
