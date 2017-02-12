package jp.or.venuspj.studo.general.fundamentals.name;

import jp.or.venuspj.ColorUml.domain.fundamentals.Name.Name;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/02/11.
 */
public class NamePair implements Name {
    SimpleName longName;
    SimpleName shortName;

    NamePair() {
    }

    public NamePair(SimpleName aLongName, SimpleName aShortName) {
        longName = aLongName;
        shortName = aShortName;
    }

    @Override
    public int hashCode() {
        return Objects2.hash(longName, shortName);
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .add("longName",longName)
                .add("shortName",shortName)
                .omitNullValues()
                .toString();
    }
}
