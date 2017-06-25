package org.venuspj.studio.core.fundamentals.contact;

import org.venuspj.studio.core.fundamentals.telNo.TelNo;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class Contact {
    TelNo telNo;
    TelNo faxNo;
    HomepageUri homepageUri;

    Contact() {
    }

    Contact(TelNo aTelNo,
            TelNo aFaxNo,
            HomepageUri aHomepageUri) {
        telNo = aTelNo;
        faxNo = aFaxNo;
        homepageUri = aHomepageUri;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("telNo", telNo)
                .add("faxNo", faxNo)
                .add("homepageUri", homepageUri)
                .omitNullValues()
                .toString();
    }
}
