package org.venuspj.studio.adapter.datasource.studio;

import org.apache.ibatis.annotations.Mapper;
import org.venuspj.studio.core.model.studio.Studio;

import java.util.List;

@Mapper
public interface StudioMapper {

    List<Studio> findAll();

}
