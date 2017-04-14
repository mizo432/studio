import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class Dummy {
    private static final Logger LOGGER = LoggerFactory.getLogger(Dummy.class);

    @Test
    public void test01() {
        LOGGER.info("JapaneseDate.now():" + JapaneseDate.now());
        LOGGER.info("JapaneseDate.now():" + JapaneseDate.now().format(DateTimeFormatter.ofPattern("GGGYY年MM月dd日")));
    }

}
