package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class PartyIds implements ListValue<PartyIdentifier> {

    List<PartyIdentifier> list = newArrayList();

    public PartyIds(Collection<? extends PartyIdentifier> anyPartyIds) {
        list.addAll(list);
    }

    private PartyIds() {

    }

    public static PartyIds emptyPartyIds() {
        return new PartyIds();
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
