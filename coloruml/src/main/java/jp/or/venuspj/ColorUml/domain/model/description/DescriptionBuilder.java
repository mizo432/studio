package jp.or.venuspj.ColorUml.domain.model.description;

import jp.or.venuspj.ColorUml.domain.fundamentals.Note.Note;
import jp.or.venuspj.ColorUml.domain.model.Assess;
import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.Ppt;
import jp.or.venuspj.ColorUml.domain.model.Ppts;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.Optional;

/**
 */
public class DescriptionBuilder<D extends Description<D>, PPT extends Ppt<PPT>> extends ObjectBuilder<D, DescriptionBuilder<D,PPT>> {

    Ppts<PPT> partyPlaceThings;
    Note note;
    Optional<Assess> assessOptional = Optional.empty();

    @Override
    protected void apply(D vo, DescriptionBuilder<D,PPT> builder) {
        DescriptionImpl concreteVo = (DescriptionImpl) vo;
        builder.withNote(concreteVo.note);
        builder.withAssessOptional(concreteVo.assessOptional);
        builder.withPartyPlaceThings(concreteVo.partyPlaceThings);
    }

    public DescriptionBuilder withPartyPlaceThings(Ppts<PPT> aPartyPlaceThings) {
        if (Objects2.isNull(aPartyPlaceThings)) return getThis();
        addConfigurator(builder -> builder.partyPlaceThings = aPartyPlaceThings);
        return getThis();

    }

    public DescriptionBuilder withAssessOptional(Optional<Assess> anAssessOptional) {
        if (Objects2.isNull(anAssessOptional)) return getThis();
        addConfigurator(builder -> builder.assessOptional = anAssessOptional);
        return getThis();
    }

    private DescriptionBuilder withNote(Note aNote) {
        if (Objects2.isNull(aNote)) return getThis();
        addConfigurator(builder -> builder.note = aNote);
        return getThis();
    }

    @Override
    protected D createValueObject() {
        return (D) new DescriptionImpl(note,
                partyPlaceThings,
                assessOptional);
    }

    @Override
    protected DescriptionBuilder getThis() {
        return this;
    }

    @Override
    protected DescriptionBuilder newInstance() {
        return newInstance();
    }
}
