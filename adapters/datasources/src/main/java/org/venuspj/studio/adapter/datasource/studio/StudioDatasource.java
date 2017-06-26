package org.venuspj.studio.adapter.datasource.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.studio.core.model.studio.Studio;
import org.venuspj.studio.core.model.studio.StudioRepository;
import org.venuspj.studio.core.model.studio.Studios;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 */
@Repository
public class StudioDatasource implements StudioRepository {
    StudioMapper studioMapper;

    @Autowired
    public StudioDatasource(StudioMapper aStudioMapper) {
        studioMapper = aStudioMapper;
    }

    public Studios findAll() {
        if (Objects2.nonNull(studioMapper)) {
            List<Studio> result = studioMapper.findAll();
            return new Studios(result);
        }
        return Studios.empty();
    }
}
