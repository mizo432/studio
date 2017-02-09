package org.venuspj.fx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DummyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DummyService.class);

    public void write() {
        LOGGER.info("call write");
    }
}
