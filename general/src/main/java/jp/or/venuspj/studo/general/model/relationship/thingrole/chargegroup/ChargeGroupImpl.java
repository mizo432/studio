package jp.or.venuspj.studo.general.model.relationship.thingrole.chargegroup;

import jp.or.venuspj.ddd.model.entity.EntityIdentifier;
import jp.or.venuspj.ddd.model.value.DecidableSameIdentifierAs;
import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.studo.general.fundamentals.Caption;
import jp.or.venuspj.studo.general.fundamentals.name.Name;
import jp.or.venuspj.studo.general.model.place.address.PostAddressee;
import jp.or.venuspj.studo.general.model.place.partnerbase.PartnerBases;
import jp.or.venuspj.studo.general.model.relationship.party.organization.partner.Partner;
import jp.or.venuspj.studo.general.model.relationship.thingrole.bankaccount.OurBankAccount;
import jp.or.venuspj.studo.general.model.relationship.thingrole.bankaccount.PartnerBankAccount;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.Optional;

public class ChargeGroupImpl implements ChargeGroup, Value, DecidableSameIdentifierAs<ChargeGroup>,DecidableSameValueAs<ChargeGroup> {
    ChargeGroupId chargeGroupId;
    Name name;
    Caption caption;
    PartnerBases partnerBases;
    Partner partner;
    PostAddressee invoicePostAddressee;
    Optional<PartnerBankAccount> partnerBankAccountOptional;
    Optional<OurBankAccount> ourBankAccountOptional;

    ChargeGroupImpl() {
    }

    public ChargeGroupImpl(ChargeGroupId aChargeGroupId, Name aName, PartnerBases aPartnerBases, Partner aPartner, PostAddressee anInvoicePostAddressee, Caption aCaption) {
        chargeGroupId = aChargeGroupId;
        name = aName;
        caption = aCaption;
        invoicePostAddressee = anInvoicePostAddressee;
        partnerBases = aPartnerBases;
        partner = aPartner;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("chargeGroupId", chargeGroupId)
                .add("name", name)
                .add("caption", caption)
                .add("invoicePostAddressee", invoicePostAddressee)
                .add("partnerBankAccountOptional", partnerBankAccountOptional)
                .add("ourBankAccountOptional", ourBankAccountOptional)
                .omitNullValues()
                .toString();
    }

    @Override
    public boolean sameValueAs(ChargeGroup other) {
        return false;
    }

    @Override
    public boolean sameIdentifierAs(ChargeGroup other) {
        return Objects2.nonNull(other) &&
                chargeGroupId.sameValueAs(other.chargeGroupId());
    }

    @Override
    public ChargeGroupId chargeGroupId() {
        return chargeGroupId;
    }

    @Override
    public EntityIdentifier<ChargeGroup> getIdentifier() {
        return null;
    }

    @Override
    public ChargeGroup clone() {
        return null;
    }
}
