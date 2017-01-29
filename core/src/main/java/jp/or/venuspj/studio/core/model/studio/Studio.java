package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.studo.general.fundamentals.name.Name;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/01/28.
 */
public class Studio {
    Name name;

    Studio(){

    }

    Studio(Name aName){

    }

    @Override
    public String toString() {

        return Objects2
                .toStringHelper(this)
                .add("name",name)
                .omitNullValues()
                .toString();
    }
}
