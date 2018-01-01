package org.venuspj.studio.core.model.topic.infomation;

import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTime;
import org.venuspj.studio.generic.fundamentals.note.Note;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifiers;

public class TopicInformation {
    private final Title title;
    private final RecordDateTime recordDateTime;


    private final PartyIdentifiers studioPlayerIdentifiers;
    private final Note note;

    TopicInformation() {
        title = Title.empty();
        recordDateTime = RecordDateTime.create();
        note = Note.empty();

        studioPlayerIdentifiers = PartyIdentifiers.create();
    }

    public TopicInformation(Title aTitle, RecordDateTime aRecordDateTime, Note aNote, PartyIdentifiers anyStudioPlayerIdentifiers) {
        title = aTitle;
        recordDateTime = aRecordDateTime;
        note = aNote;
        studioPlayerIdentifiers = anyStudioPlayerIdentifiers;
    }

    public static TopicInformation create() {
        return new TopicInformation();
    }

    public Title getTitle() {
        return title;
    }

    public RecordDateTime getRecordDateTime() {
        return recordDateTime;
    }

    public PartyIdentifiers getStudioPlayerIdentifiers() {
        return studioPlayerIdentifiers;
    }

    public Note getNote() {
        return note;
    }
}
