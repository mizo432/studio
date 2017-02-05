package jp.or.venuspj.ColorUml.domain.model.description;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ColorUml.domain.fundamentals.Note.Note;
import jp.or.venuspj.ColorUml.domain.model.Assess;
import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.Ppt;
import jp.or.venuspj.ColorUml.domain.model.Ppts;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.Optional;

public class DescriptionImpl<PPT extends Ppt<PPT>,D extends DescriptionImpl<PPT,D>> implements Description<D> {
    Ppts<PPT> partyPlaceThings;

    Note note;

    Optional<Assess> assessOptional;

    DescriptionImpl() {
    }

    DescriptionImpl(Note note, Ppts<PPT> aPartyPlaceThings, Optional<Assess> anAssessOptional) {
        partyPlaceThings = aPartyPlaceThings;
        assessOptional = anAssessOptional;

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
}
