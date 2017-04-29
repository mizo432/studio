package jp.or.venuspj.studio.core.model.studio.profile;

import jp.or.venuspj.studio.core.fundamentals.note.Note;

/**
 */
public class Profile {
    Note note = Note.defailtNote();

    Profile() {

    }

    public Profile(Note aNote) {
        note = aNote;

    }

    public static Profile defailtProfile() {
        return new Profile();
    }
}
