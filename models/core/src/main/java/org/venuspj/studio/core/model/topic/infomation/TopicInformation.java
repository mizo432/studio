package org.venuspj.studio.core.model.topic.infomation;

import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTime;
import org.venuspj.studio.generic.fundamentals.note.Note;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifiers;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

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

    public static class Builder extends ObjectBuilder<TopicInformation, Builder> {
        private Title title = Title.create();
        private RecordDateTime recordDateTime = RecordDateTime.create();
        private PartyIdentifiers studioPlayerIdentifiers = PartyIdentifiers.create();
        private Note note = Note.create();

        @Override
        protected void apply(TopicInformation vo, Builder aBuilder) {
            aBuilder.withTitle(vo.getTitle());
            aBuilder.withRecordDateTime(vo.getRecordDateTime());
            aBuilder.withStudioPlayerIdentifiers(vo.getStudioPlayerIdentifiers());
            aBuilder.withNote(vo.getNote());

        }

        public Builder withTitle(Title aTitle) {
            if (isNull(aTitle)) return getThis();
            addConfigurator(builder -> builder.title = aTitle);
            return getThis();
        }

        public Builder withRecordDateTime(RecordDateTime aRecordDateTime) {
            if (isNull(aRecordDateTime)) return getThis();
            addConfigurator(builder -> builder.recordDateTime = aRecordDateTime);
            return getThis();
        }

        public Builder withStudioPlayerIdentifiers(PartyIdentifiers anyStudioPlayerIdentifiers) {
            if (isNull(anyStudioPlayerIdentifiers)) return getThis();
            addConfigurator(builder -> builder.studioPlayerIdentifiers = anyStudioPlayerIdentifiers);
            return getThis();
        }

        public Builder withNote(Note aNote) {
            if (isNull(aNote)) return getThis();
            addConfigurator(builder -> builder.note = aNote);
            return getThis();
        }

        @Override
        protected TopicInformation createValueObject() {
            return new TopicInformation(title, recordDateTime, note, studioPlayerIdentifiers);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }
    }
}
