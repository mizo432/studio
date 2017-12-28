package org.venuspj.studio.fundamentals.breadcrumbs;

import org.venuspj.studio.generic.fundamentals.caption.Caption;
import org.venuspj.studio.generic.fundamentals.url.Uri;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Breadcrumb {
    Caption text;
    Uri path;

    public Breadcrumb(Caption aText, Uri aPath) {
        text = aText;
        path = aPath;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("text", text)
                .add("path", path)
                .omitNullValues()
                .toString();
    }

    @Override
    public int hashCode() {
        return hash(path, text);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        return obj instanceof Breadcrumb &&
                equal(((Breadcrumb) obj).text, text) &&
                equal(((Breadcrumb) obj).path, path);

    }
}
