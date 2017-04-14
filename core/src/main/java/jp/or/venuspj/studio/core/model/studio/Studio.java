package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.studio.core.fundamentals.Name;
import jp.or.venuspj.util.objects2.Objects2;

public class Studio {
    Name name = Name.defaultName();

    Studio() {

    }

    public Studio(Name aName) {
        name = aName;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("name", name)
                .omitNullValues()
                .toString();
    }
}
