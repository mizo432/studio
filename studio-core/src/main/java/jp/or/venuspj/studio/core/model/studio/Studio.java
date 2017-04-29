package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.ddd.model.entity.AbstractEntity;
import jp.or.venuspj.studio.core.fundamentals.name.Name;
import jp.or.venuspj.studio.core.model.studio.profile.Profile;

public class Studio extends AbstractEntity<Studio> {
    Name name = Name.defaultName();
    Profile profile = Profile.defailtProfile();

    Studio() {
        super(StudioCode.defaultCode());

    }

    public Studio(Name aName, StudioCode aStudioCode, Profile aProfile) {
        super(aStudioCode);
        name = aName;
        profile = aProfile;

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
