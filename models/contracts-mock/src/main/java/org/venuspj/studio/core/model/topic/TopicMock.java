package org.venuspj.studio.core.model.topic;


import org.venuspj.studio.core.model.topic.infomation.TopicInformation;
import org.venuspj.studio.generic.fundamentals.note.NoteMock;

/**
 */
public class TopicMock {
    public static Topic createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        DEFAULT {
            @Override
            public Integer idValue() {
                return 1;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS1_NOTE;
            }


            @Override
            public TopicInformation createTopicInformation(MockType aMockType) {
                return TopicInformation.create();
            }
        }, NEWS1 {
            @Override
            public Integer idValue() {
                return 1;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS1_NOTE;
            }

            @Override
            public Topic create() {
                return null;
            }

        }, NEWS2 {
            @Override
            public Integer idValue() {
                return 2;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS2_NOTE;
            }
        }, NEWS3 {
            @Override
            public Integer idValue() {
                return 3;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS3_NOTE;
            }
        }, NEWS4 {
            @Override
            public Integer idValue() {
                return 4;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS4_NOTE;
            }
        }, NEWS5 {
            @Override
            public Integer idValue() {
                return 5;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS5_NOTE;
            }
        }, NEWS6 {
            @Override
            public Integer idValue() {
                return 6;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS6_NOTE;
            }
        }, NEWS7 {
            @Override
            public Integer idValue() {
                return 7;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS7_NOTE;
            }
        }, NEWS8 {
            @Override
            public Integer idValue() {
                return 8;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS8_NOTE;
            }
        }, NEWS9 {
            @Override
            public Integer idValue() {
                return 9;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS9_NOTE;
            }
        }, NEWS10 {
            @Override
            public Integer idValue() {
                return 10;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS10_NOTE;
            }
        };


        public abstract Integer idValue();

        public String newsTitle() {
            return name() + "_TITLE";
        }

        public abstract NoteMock.NoteType noteType();

        public Topic create() {
            return new Topic(TopicIdentifierMock.createDummy(this)
                    , TopicInformationMock.create(this)
            );
        }

        public TopicInformation createTopicInformation(MockType aMockType) {
            return new TopicInformation.Builder()
                    .withNote(NoteMock.createDummy(noteType()))
                    .build();
        }
    }
}
