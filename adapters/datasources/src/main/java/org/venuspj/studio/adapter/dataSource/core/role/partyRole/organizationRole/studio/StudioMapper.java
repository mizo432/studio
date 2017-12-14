package org.venuspj.studio.adapter.dataSource.core.role.partyRole.organizationRole.studio;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

@Mapper
public interface StudioMapper {

    Studio findOne(@Param("partyIdentifier") PartyIdentifier aPartyIdentifier);

}
