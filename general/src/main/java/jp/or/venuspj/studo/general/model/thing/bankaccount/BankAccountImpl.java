package jp.or.venuspj.studo.general.model.thing.bankaccount;

import jp.or.venuspj.studo.general.fundamentals.name.Name;
import jp.or.venuspj.studo.general.model.relationship.party.organization.bank.Bank;
import jp.or.venuspj.studo.general.model.relationship.party.organization.bank.branch.BankBranch;
import jp.or.venuspj.util.objects2.Objects2;

public class BankAccountImpl implements BankAccount {
    private Bank bank;
    private BankBranch bankBranch;
    private BankAccountClassification bankAccountClassification;
    private BankAccountNo bankAccountNo;
    private Name holderName;

    BankAccountImpl() {
    }

    public BankAccountImpl(Bank aBank, BankBranch aBankBranch, BankAccountClassification aBankAccountClassification, BankAccountNo aBankAccountNo, Name aHolderName) {
        bank = aBank;
        bankBranch = aBankBranch;
        bankAccountClassification = aBankAccountClassification;
        bankAccountNo = aBankAccountNo;
        holderName = aHolderName;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("bank", bank)
                .add("bankBranch", bankBranch)
                .add("bankAccountClassification", bankAccountClassification)
                .add("bankAccountNo", bankAccountNo)
                .add("holderName", holderName)
                .omitNullValues()
                .toString();
    }
}
