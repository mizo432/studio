package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;


/**
 * Created by mizoguchi on 2017/02/12.
 */
public class SerialNumberTest {
    @Test
    public void asText() throws Exception {
        SerialNumber target = new SerialNumber(10);
        String actual = target.asText();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("10");
    }

}