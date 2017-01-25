package jp.or.venuspj.studio.core.model.player;

import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

public class PlayersBuilder extends ObjectBuilder<Players,PlayersBuilder> {

    private List<Player> list;

    @Override
    protected void apply(Players vo, PlayersBuilder builder) {
        builder.withList(vo.asList());

    }

    private PlayersBuilder withList(List<Player> aPlayers) {
        if(Objects2.isNull(aPlayers)) return getThis();
        addConfigurator(builder -> builder.list = aPlayers);
        return getThis();
    }

    @Override
    protected Players createValueObject() {
        return new PlayersImpl(list);
    }

    @Override
    protected PlayersBuilder getThis() {
        return this;
    }

    @Override
    protected PlayersBuilder newInstance() {
        return new PlayersBuilder();
    }

}
