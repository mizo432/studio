package org.venuspj.studio.core.model.news;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.fundamentals.note.Note;

/**
 */
public class News extends AbstractEntity<News> {
    private Title title;
    private Note note;

    News() {
        super(NewsIdentifier.defaultNewsId());
        title = Title.empty();
        note = Note.empty();
    }

    public News(NewsIdentifier aNewsIdentifier, Title aTitle, Note aNote) {
        super(aNewsIdentifier);
        title = aTitle;
        note = aNote;
    }

}
