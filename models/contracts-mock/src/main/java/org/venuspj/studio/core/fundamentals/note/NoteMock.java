package org.venuspj.studio.core.fundamentals.note;

import org.venuspj.util.strings2.Strings2;

/**
 */
public class NoteMock {
    public static Note createDummy(NoteType aNoteType) {
        return new Note(aNoteType.text());
    }

    public enum NoteType {
        STUDIO_NOTE, DEFAULT;

        public String text() {
            return Strings2.repeat(name() + ", ", 10);
        }
    }
}
