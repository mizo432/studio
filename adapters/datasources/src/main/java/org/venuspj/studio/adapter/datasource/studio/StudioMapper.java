package org.venuspj.studio.adapter.datasource.studio;

import org.apache.ibatis.annotations.Mapper;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;

import java.util.List;

@Mapper
public interface StudioMapper {

    List<Studio> findAll();

    Studio resolve(EntityIdentifier<Studio> identifier);

}
