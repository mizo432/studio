package org.venuspj.studio.core.fundamentals.snsContact;

import org.venuspj.util.objects2.Objects2;

/**
 */
public class SnsContact {
    SnsKind snsKind;
    SnsId snsId;

    SnsContact() {
    }

    public SnsContact(SnsKind aSnsKind, SnsId aSnsId) {
        snsKind = aSnsKind;
        snsId = aSnsId;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("snsKind", snsKind)
                .add("snsId", snsId)
                .omitNullValues()
                .toString();
    }
}
