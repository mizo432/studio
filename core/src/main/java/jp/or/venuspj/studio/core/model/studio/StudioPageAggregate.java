package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.studio.core.model.player.Players;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/01/28.
 */
public class StudioPageAggregate {
     Studio studio;
     Players players;
     Links studioLinks;
     Newses studioNewses;

    StudioPageAggregate(){}
    public StudioPageAggregate(Studio aStudio,Players aPlayers,Links aStudioLinks,Newses aStudioNewses){
        studio = aStudio;
        players = aPlayers;
        studioLinks = aStudioLinks;
        studioNewses = aStudioNewses;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("studio",studio)
                .add("players",players)
                .add("studioLinks",studioLinks)
                .add("studioNewses",studioNewses)
                .omitNullValues()
                .toString();
    }
}
