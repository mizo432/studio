package org.venuspj.studio.generic.fundamentals.note;

import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTime;
import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.util.dateProvider.DateProvider;
import org.venuspj.util.objects2.Objects2;

public class Note {
    protected Description description;
    protected RecordDateTime dateTimeOfRecord;
    protected NoteWriter writer;

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

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("description", description)
                .add("dateTimeOfRecord", dateTimeOfRecord)
                .add("writer", writer)
                .omitNullValues()
                .toString();
    }
}
