package jp.or.venuspj.ColorUml.domain.model.description.thing;

import jp.or.venuspj.ColorUml.domain.fundamentals.Note.Note;
import jp.or.venuspj.ColorUml.domain.model.Assess;
import jp.or.venuspj.ColorUml.domain.model.PartyPlaceThings;
import jp.or.venuspj.ColorUml.domain.model.description.DescriptionImpl;
import jp.or.venuspj.ColorUml.domain.model.description.ThingDescription;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Things;

import java.util.Optional;

/**
 * Created by mizoguchi on 2017/02/12.
 */
public class ThingDescriptionImpl extends DescriptionImpl implements ThingDescription {

    ThingDescriptionImpl() {
        super();
    }
    ThingDescriptionImpl(Note aNote, PartyPlaceThings aPartyPlaceThings, Optional<Assess> anAssessOptional) {
        super(aNote, aPartyPlaceThings, anAssessOptional);
    }

    @Override
    public Things findAvailable() {
        things().assess();
        return null;
    }

    @Override
    public Things things() {
        return null;
    }

    @Override
    public PartyPlaceThings partyPlaceThings() {
        return null;
    }
}
