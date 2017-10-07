package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitImpl;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;
import org.venuspj.util.objects2.Objects2;

/**
 * プレイヤー 組織の役割
 */
public class Player extends OrganizationRoleImpl {

    Name name = Name.defaultName();
    PlayerClassification playerClassification = PlayerClassification.OUTER_PLAYER;

    Player() {
        super();

    }

    public Player(OrganizationUnit anOrganizationUnit, PlayerClassification aPlayerClassification) {
        super(anOrganizationUnit);
        playerClassification = aPlayerClassification;
    }

    public static Player emptyPlayer() {
        return new Player(OrganizationUnitImpl.emptyOrganizationUnit(), PlayerClassification.NULL_PLAYER);
    }

    @Override
    public Party clone() {
        Player b = new Player(organizationUnit, playerClassification);

        /*ObjectクラスのcloneメソッドはCloneNotSupportedExceptionを投げる可能性があるので、try-catch文で記述(呼び出し元に投げても良い)*/
        try {
            b = (Player) super.clone(); //親クラスのcloneメソッドを呼び出す(親クラスの型で返ってくるので、自分自身の型でのキャストを忘れないようにする)
//            b.s=this.s.clone(); //親クラスのcloneメソッドで深いコピー(複製先のクラス型変数と複製元のクラス型変数で指しているインスタンスの中身が違うコピー)がなされていないクラス型変数をその変数のcloneメソッドで複製し、複製先のクラス型変数に代入
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("identifier", identifier())
                .add("name", name)
                .add("playerClassification", playerClassification)
                .omitNullValues()
                .toString();
    }

    public boolean isStudioPlayer() {
        return playerClassification.isStudioPlayer();
    }

}
