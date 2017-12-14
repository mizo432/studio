package org.venuspj.studio.adapter.dataSource.generic.ppt.party.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationRepository;

@Repository
public class OrganizationDataSource implements OrganizationRepository {
    OrganizationMapper organizationMapper;

    @Autowired
    public OrganizationDataSource(OrganizationMapper anOrganizationMapper) {
        organizationMapper = anOrganizationMapper;
    }

    @Override
    public <I extends EntityIdentifier<Party>> Party resolve(I anIdentifier) {
        return organizationMapper.findOne((PartyIdentifier) anIdentifier);
    }

    @Override
    public boolean contains(EntityIdentifier<Party> anIdentifier) {
        return false;
    }

    @Override
    public <S extends Party> boolean contains(S anEntity) {
        return false;
    }

    @Override
    public <S extends Party> void store(S entity) {

    }

    @Override
    public <I extends EntityIdentifier<Party>> void delete(I anIdentifier) {

    }

    @Override
    public <I extends EntityIdentifier<Party>> void delete(Iterable<I> anyIdentifiers) {

    }

    @Override
    public <S extends Party> void delete(S anEntity) {

    }
}
