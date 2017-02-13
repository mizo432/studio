package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.ddd.model.entity.AbstractEntityIdentifier;

/**
 * Created by mizoguchi on 2017/02/11.
 */
public class StudioIdentifier extends AbstractEntityIdentifier<Studio> {
    StudioId studioId;

    StudioIdentifier() {
        super(Studio.class);
    }

    StudioIdentifier(StudioId aStudioId) {
        super(Studio.class);
        studioId = aStudioId;
    }

}
