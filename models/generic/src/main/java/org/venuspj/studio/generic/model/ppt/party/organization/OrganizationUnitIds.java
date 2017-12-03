package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.value.ListValue;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class OrganizationUnitIds implements ListValue<PartyIdentifier> {

    List<PartyIdentifier> list = newArrayList();

    public static OrganizationUnitIds empty() {
        return new OrganizationUnitIds();
    }

    @Override
    public List<PartyIdentifier> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<PartyIdentifier> iterator() {
        return asList().iterator();
    }
}
