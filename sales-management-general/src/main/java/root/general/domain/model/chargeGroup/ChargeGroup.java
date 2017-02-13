package root.general.domain.model.chargeGroup;

import jp.or.venuspj.ddd.model.entity.AbstractEntity;
import root.general.domain.fundamentals.name.SimpleName;
import root.general.domain.model.bankAccount.BankAccount;
import root.general.domain.model.partner.Partner;
import root.general.domain.model.partnerBranch.PartnerBranches;

/**
 * Created by mizoguchi on 2017/02/12.
 */
public class ChargeGroup extends AbstractEntity<ChargeGroup> {
    SimpleName chargeGroupName;
    CarryOverConfig carryOverConfig;
    MailingConfig mailingConfig;
    BankAccount receiveBankAccount;
    BankAccount partnersBankAccount;
    TaxCalculation taxCalculation;
    PartnerBranches branches;
    Partner partner;
    ChargeGroup(){}
    ChargeGroup(ChargeGroupIdentifier aChargeGroupIdentifier,
            SimpleName aChargeGroupName,
            CarryOverConfig aCarryOverConfig,
            MailingConfig aMailingConfig,
            BankAccount aReceiveBankAccount,
            BankAccount aPartnersBankAccount,
            TaxCalculation aTaxCalculation,
            PartnerBranches aBranches,
            Partner aPartner){
        super(aChargeGroupIdentifier);
        chargeGroupName = aChargeGroupName;
        mailingConfig = aMailingConfig;
        receiveBankAccount = aReceiveBankAccount;
        partnersBankAccount = aPartnersBankAccount;
        taxCalculation = aTaxCalculation;
        branches = aBranches;
        partner = aPartner;
    }
}
