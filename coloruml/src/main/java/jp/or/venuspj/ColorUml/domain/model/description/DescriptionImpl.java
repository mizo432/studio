package jp.or.venuspj.ColorUml.domain.model.description;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ColorUml.domain.fundamentals.Note.Note;
import jp.or.venuspj.ColorUml.domain.model.Assess;
import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.PartyPlaceThings;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.Optional;

public class DescriptionImpl implements Description {
    PartyPlaceThings partyPlaceThings;

    Note note;

    Optional<Assess> assessOptional;

    protected DescriptionImpl() {
    }

    protected DescriptionImpl(Note aNote, PartyPlaceThings aPartyPlaceThings, Optional<Assess> anAssessOptional) {
        partyPlaceThings = aPartyPlaceThings;
        assessOptional = anAssessOptional;
        note = aNote;

    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("note", note)
                .add("assessOptional", assessOptional);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    @Override
    public PartyPlaceThings partyPlaceThings() {
        return partyPlaceThings;
    }
}
