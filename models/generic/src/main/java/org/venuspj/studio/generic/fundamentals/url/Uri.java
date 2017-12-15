package org.venuspj.studio.generic.fundamentals.url;

import java.net.URI;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Uri {
    URI value;

    public Uri(URI aValue) {
        value = aValue;

    }

    public Uri(String aValue) {
        value = URI.create(aValue);

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        return obj instanceof Uri &&
                equal(((Uri) obj).value, value);

    }

}
