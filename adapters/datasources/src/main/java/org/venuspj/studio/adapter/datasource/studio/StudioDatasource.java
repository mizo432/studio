package org.venuspj.studio.adapter.datasource.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.core.model.studio.StudioRepository;
import org.springframework.stereotype.Repository;

/**
 */
@Repository
public class StudioDatasource implements StudioRepository {
    StudioMapper studioMapper;

    @Autowired
    public StudioDatasource(StudioMapper aStudioMapper){
        studioMapper = aStudioMapper;
    }
}
