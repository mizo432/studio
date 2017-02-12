package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.studio.core.model.link.Links;
import jp.or.venuspj.studio.core.model.news.Newses;
import jp.or.venuspj.studio.core.model.player.Players;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class StudioPageAggregateBuilder extends ObjectBuilder<StudioPageAggregate, StudioPageAggregateBuilder> {
    private Studio studio;
    private Players players;
    private Links studioLinks;
    private Newses studioNewses;

    @Override
    protected void apply(StudioPageAggregate vo, StudioPageAggregateBuilder builder) {
        builder.withStudio(vo.studio);
        builder.withPlayers(vo.players);
        builder.withStudioLinks(vo.studioLinks);
        builder.withStudioNewses(vo.studioNewses);
    }

    private StudioPageAggregateBuilder withStudioNewses(Newses aStudioNewses) {
        if(Objects2.isNull(aStudioNewses)) return getThis();
        addConfigurator(builder -> builder.studioNewses = aStudioNewses);
        return getThis();
    }

    private StudioPageAggregateBuilder withStudioLinks(Links aStudioLinks) {
        if(Objects2.isNull(aStudioLinks)) return getThis();
        addConfigurator(builder -> builder.studioLinks = aStudioLinks);
        return getThis();
    }

    private StudioPageAggregateBuilder withPlayers(Players aPlayers) {
        if(Objects2.isNull(aPlayers)) return getThis();
        addConfigurator(builder -> builder.players = aPlayers);
        return getThis();
    }

    private StudioPageAggregateBuilder withStudio(Studio aStudio) {
        if(Objects2.isNull(aStudio)) return getThis();
        addConfigurator(builder -> builder.studio = aStudio);
        return getThis();
    }

    @Override
    protected StudioPageAggregate createValueObject() {
        return new StudioPageAggregate(studio,players,studioLinks,studioNewses);
    }

    @Override
    protected StudioPageAggregateBuilder getThis() {
        return this;
    }

    @Override
    protected StudioPageAggregateBuilder newInstance() {
        return new StudioPageAggregateBuilder();
    }
}
