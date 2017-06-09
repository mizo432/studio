package jp.or.venuspj.studio.core.model.studio.profile;

import jp.or.venuspj.studio.core.fundamentals.note.Note;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class Profile {
    Note note = Note.defailtNote();

    Profile() {

    }

    public Profile(Note aNote) {
        note = aNote;

    }

    public static Profile defaultProfile() {
        return new Profile();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("note", note)
                .omitNullValues()
                .toString();

    }
}
