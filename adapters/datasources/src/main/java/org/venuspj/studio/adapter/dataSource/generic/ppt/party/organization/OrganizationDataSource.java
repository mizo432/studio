package org.venuspj.studio.adapter.dataSource.generic.ppt.party.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationCriteria;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationRepository;

import java.util.Collection;

import static org.venuspj.util.objects2.Objects2.isNull;

@Repository
public class OrganizationDataSource implements OrganizationRepository {
    OrganizationMapper organizationMapper;

    @Autowired
    public OrganizationDataSource(OrganizationMapper anOrganizationMapper) {
        organizationMapper = anOrganizationMapper;
    }

    @Override
    public <I extends EntityIdentifier<Party>> Party resolve(I anIdentifier) {
        final Party party = organizationMapper.findOne((PartyIdentifier) anIdentifier);
        if (isNull(party)) throw new EntityNotFoundRuntimeException(anIdentifier);
        return party;
    }

    @Override
    public boolean contains(EntityIdentifier<Party> anIdentifier) {
        try {
            resolve(anIdentifier);
            return true;
        } catch (EntityNotFoundRuntimeException success) {
            return false;

        }
    }

    @Override
    public <S extends Party> boolean contains(S anEntity) {
        try {
            resolve(anEntity.identifier());
            return true;
        } catch (EntityNotFoundRuntimeException success) {
            return false;

        }
    }

    @Override
    public <S extends Party> void store(S entity) {
        final PartyIdentifier identifier = (PartyIdentifier) entity.identifier();
        Organization organization = (Organization) entity;
        if (identifier.isSpecified()) {
            organizationMapper.update(organization);
            return;
        }
        organizationMapper.insert(organization);

    }

    @Override
    public <I extends EntityIdentifier<Party>> void delete(I anIdentifier) {
        PartyIdentifier partyIdentifier = (PartyIdentifier) anIdentifier;
        organizationMapper.delete(partyIdentifier);

    }

    @Override
    public <I extends EntityIdentifier<Party>> void delete(Iterable<I> anyIdentifiers) {
        OrganizationCriteria criteria = OrganizationCriteria.create();
        criteria.getIdentifier().in((Collection<PartyIdentifier>) anyIdentifiers);

        organizationMapper.delete(criteria);

    }

    @Override
    public <S extends Party> void delete(S anEntity) {
        if (contains(anEntity))
            organizationMapper.delete((PartyIdentifier) anEntity.identifier());

    }
}
