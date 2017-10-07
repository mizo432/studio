package org.venuspj.studio.core.fundamentals.note;

import org.venuspj.util.strings2.Strings2;

/**
 * @deprecated
 */
public class NoteMock {
    public static Note createDummy(NoteType aNoteType) {
        return new Note(aNoteType.text());
    }

    public enum NoteType {
        STUDIO_NOTE, DEFAULT, NEWS1_NOTE, NEWS2_NOTE, NEWS3_NOTE, NEWS4_NOTE, NEWS5_NOTE, NEWS6_NOTE, NEWS7_NOTE, NEWS8_NOTE, NEWS9_NOTE, NEWS10_NOTE;

        public String text() {
            return Strings2.repeat(name() + ", ", 10);
        }
    }
}
