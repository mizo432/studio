package jp.or.venuspj.studio.core.model.news;

import jp.or.venuspj.ddd.model.entity.AbstractEntity;
import jp.or.venuspj.studio.core.fundamentals.note.Note;

/**
 * Created by mizoguchi on 2017/04/29.
 */
public class News extends AbstractEntity<News> {
    Title title;
    Note note;

}
