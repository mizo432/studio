package jp.or.venuspj.studio.core.model;

import jp.or.venuspj.ddd.model.entity.EntityIdentifier;

public class PlayerImpl implements Player {
    EntityIdentifier<Player> identifier;
    PlayerValue value;
    PlayerImpl(){

    }
    public PlayerImpl(EntityIdentifier<Player> anIdentifier,PlayerValue aValue){
        identifier = anIdentifier;
        value = aValue;
    }

    @Override
    public PlayerValue value() {
        return value;
    }

    @Override
    public EntityIdentifier<Player> identifier() {
        return identifier;
    }
}
