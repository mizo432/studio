package root.general.domain.model.bankAccount;

import root.general.domain.fundamentals.StringNumberValue;

/**
 */
public class AccountNo implements StringNumberValue {
    private String value;

    AccountNo() {

    }

    public AccountNo(String aValue) {
        value = aValue;
    }

    @Override
    public String asText() {
        return value;
    }
}
