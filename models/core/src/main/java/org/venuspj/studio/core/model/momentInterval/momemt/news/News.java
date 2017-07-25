package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.core.fundamentals.note.Note;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class News extends AbstractEntity<News> {
    Title title;
    Note note;

    News() {
    }

    public News(NewsId aNewsId, Title aTitle, Note aNote) {
        super(aNewsId);
        title = aTitle;
        note = aNote;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("identifier", identifier())
                .add("title", title)
                .add("note", note)
                .omitNullValues()
                .toString();
    }
}
