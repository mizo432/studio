package org.venuspj.studio.fundamentals.breadcrumbs;

import org.venuspj.studio.generic.fundamentals.caption.Caption;
import org.venuspj.studio.generic.fundamentals.url.Uri;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class Breadcrumb {
    private Caption text;
    private Uri path;

    public Breadcrumb(Caption aText, Uri aPath) {
        text = aText;
        path = aPath;
    }

    public Caption getText() {
        return text;
    }

    public Uri getPath() {
        return path;
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
