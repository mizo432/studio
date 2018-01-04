package org.venuspj.studio.generic.fundamentals.note;

import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTime;
import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.util.dateProvider.DateProvider;

public class Note {
    protected Description description = Description.empty();
    protected RecordDateTime dateTimeOfRecord = new RecordDateTime(DateProvider.currentDateTime());
    protected NoteWriter writer = new EmptyNoteWriter();

    Note() {
    }

    public Note(Description aDescription, RecordDateTime aDateTimeOfRecord, NoteWriter aNoteWriter) {
        description = aDescription;
        dateTimeOfRecord = aDateTimeOfRecord;
        writer = aNoteWriter;
    }

    public static Note empty() {
        return new Note(Description.empty(),
                new RecordDateTime(DateProvider.currentDateTime()),
                new EmptyNoteWriter());
    }


    public static Note create() {
        return new Note();
    }
}
