package org.venuspj.studio.core.model.news;


import org.venuspj.studio.generic.fundamentals.note.NoteMock;

/**
 */
public class NewsMock {
    public static News createDummy(NewsType aNewsType) {
        return new News(NewsIdentifierMock.createDummy(aNewsType), TitleMock.createDummy(aNewsType), NoteMock.createDummy(aNewsType.noteType()));
    }

    public enum NewsType {
        DEFAULT {
            @Override
            public Integer idValue() {
                return 1;
            }

            @Override
            public NoteMock.NoteType noteType() {
                return NoteMock.NoteType.NEWS1_NOTE;
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
    }
}
