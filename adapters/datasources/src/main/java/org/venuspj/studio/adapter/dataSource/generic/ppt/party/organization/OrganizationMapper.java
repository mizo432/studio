package org.venuspj.studio.adapter.dataSource.generic.ppt.party.organization;

import org.apache.ibatis.annotations.Mapper;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationCriteria;

@Mapper
public interface OrganizationMapper {

    Party findOne(PartyIdentifier anIdentifier);

    void update(Organization entity);

    void insert(Organization entity);

    void delete(PartyIdentifier partyIdentifier);

    void delete(OrganizationCriteria criteria);
}
