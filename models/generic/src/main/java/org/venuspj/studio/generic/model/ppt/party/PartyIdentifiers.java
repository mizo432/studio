package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class PartyIdentifiers implements ListValue<PartyIdentifier> {

    List<PartyIdentifier> list = newArrayList();

    public PartyIdentifiers(Collection<? extends PartyIdentifier> anyPartyIds) {
        list.addAll(list);
    }

    private PartyIdentifiers() {

    }

    public static PartyIdentifiers create() {
        return new PartyIdentifiers();
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
