package org.venuspj.studio.generic.fundamentals.note;

import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTimeMock;
import org.venuspj.studio.generic.fundamentals.description.DescriptionMock;
import org.venuspj.util.strings2.Strings2;

public class NoteMock {
    public static Note createDummy(NoteType aNoteType) {
        return aNoteType.getNote();
    }

    public enum NoteType {
        STUDIO_NOTE, DEFAULT, NEWS1_NOTE, NEWS2_NOTE, NEWS3_NOTE, NEWS4_NOTE, NEWS5_NOTE, NEWS6_NOTE, NEWS7_NOTE, NEWS8_NOTE, NEWS9_NOTE, NEWS10_NOTE;

        public String text() {
            return Strings2.repeat(name() + ", ", 10);
        }

        public Note getNote() {
            return new Note(DescriptionMock.createDummy(DescriptionMock.DescriptionType.NEWS1_DESCRIPTION),
                    RecordDateTimeMock.createDummy(RecordDateTimeMock.RecordDateTimeType.TREE_DAYS_BEFORE),
                    NoteWriterMock.createDummy(NoteWriterMock.NoteWriterType.NEWS1_WRITER));
        }
    }

}
