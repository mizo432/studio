package org.venuspj.studio.adapter.dataSource.generic.ppt.party.organization;

import org.apache.ibatis.annotations.Mapper;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

@Mapper
public interface OrganizationMapper {

    Party findOne(PartyIdentifier anIdentifier);
}
