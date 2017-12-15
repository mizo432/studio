package org.venuspj.studio.generic.fundamentals.datetime;

public class RecordDateTimeMock {
    public static RecordDateTime createDummy(RecordDateTimeType treeDaysBefore) {
        return new RecordDateTime();
    }

    public enum RecordDateTimeType {TREE_DAYS_BEFORE}
}
