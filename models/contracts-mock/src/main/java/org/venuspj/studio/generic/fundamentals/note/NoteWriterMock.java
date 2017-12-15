package org.venuspj.studio.generic.fundamentals.note;

public class NoteWriterMock {
    public static NoteWriter createDummy(NoteWriterType news1Writer) {
        return new EmptyNoteWriter();
    }

    public enum NoteWriterType {
        NEWS1_WRITER
    }
}
