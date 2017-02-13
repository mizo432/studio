package root.general.domain.model.chargeGroup;

import jp.or.venuspj.colorUml.domain.model.partyPlaceThing.place.Address;
import root.general.domain.fundamentals.name.SimpleName;

/**
 * 郵送先設定
 */
public class MailingConfig {
    private SimpleName sendName;
    private PostCode postCode;
    private Address address;
    private ChargeGroupStaff staff;
    private ChargeSendHonorific chargeSendHonorific;
    private ChargeByCompanyName chargeByCompanyName;
}
