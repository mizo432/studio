package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.ddd.model.entity.AbstractEntity;
import jp.or.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import jp.or.venuspj.studio.core.fundamentals.name.Name;
import jp.or.venuspj.studio.core.model.studio.profile.Profile;

public class Studio extends AbstractEntity<Studio> {
    Descriptor descriptor;
    Name name = Name.defaultName();
    Profile profile = Profile.defailtProfile();

    Studio() {
        super(StudioCode.defaultCode());

    }

    public Studio(Name aName, StudioCode aStudioCode, Profile aProfile, Descriptor aDescriptor) {
        super(aStudioCode);
        name = aName;
        profile = aProfile;
        descriptor = aDescriptor;

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
