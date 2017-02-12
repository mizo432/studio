package root.general.domain.model.bankAccount;

import jp.or.venuspj.ddd.model.entity.AbstractEntity;
import jp.or.venuspj.ddd.model.entity.EntityIdentifier;
import root.general.domain.model.bank.bankBranch.BankBranch;

/**
 */
public class BankAccount extends AbstractEntity<BankAccount> {
    BankBranch bankBranch;
    AccountClassification accountClassification;
    AccountNo accountNo;

    BankAccount() {
        super();
    }

    public BankAccount(EntityIdentifier<BankAccount> anIdentifier,
                       BankBranch aBankBranch,
                       AccountClassification anAccountClassification, AccountNo anAccountNo) {
        super(anIdentifier);
        bankBranch = aBankBranch;
        accountClassification = anAccountClassification;
        accountNo = anAccountNo;
    }
}
