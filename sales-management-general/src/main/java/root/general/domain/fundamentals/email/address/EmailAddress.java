package root.general.domain.fundamentals.email.address;

import jp.or.venuspj.ddd.model.value.StringValue;

/**
 */
public class EmailAddress implements StringValue {
    private String value;
    EmailAddress(){}
    public EmailAddress(String aValue){
        value = aValue;
    }
    @Override
    public String asText() {
        return value;
    }
}
