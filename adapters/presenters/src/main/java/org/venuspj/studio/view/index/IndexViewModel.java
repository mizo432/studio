package org.venuspj.studio.view.index;

import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.topic.news.NewsViewModel;
import org.venuspj.studio.view.player.players.PlayersViewModel;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

public class IndexViewModel {
    private PlayersViewModel players;
    private EventsViewModel events;
    private NewsViewModel news;

    public IndexViewModel(PlayersViewModel anyPlayers, EventsViewModel anyEvents, NewsViewModel anyNews) {
        players = anyPlayers;
        events = anyEvents;
        news = anyNews;
    }

    public NewsViewModel getNews() {
        return news;
    }

    public EventsViewModel getEvents() {
        return events;
    }

    public PlayersViewModel getPlayers() {
        return players;
    }

    public static class Builder extends ObjectBuilder<IndexViewModel, Builder> {
        private PlayersViewModel players = PlayersViewModel.create();
        private EventsViewModel events = EventsViewModel.create();
        private NewsViewModel news = NewsViewModel.create();

        @Override
        protected void apply(IndexViewModel vo, Builder builder) {
            builder.withPlayers(vo.getPlayers());
            builder.withEvents(vo.getEvents());
            builder.withNews(vo.getNews());

        }

        public Builder withPlayers(PlayersViewModel anyPlayers) {
            if (isNull(anyPlayers)) return getThis();
            addConfigurator(builder -> builder.players = anyPlayers);
            return getThis();
        }

        public Builder withEvents(EventsViewModel anyEvents) {
            if (isNull(anyEvents)) return getThis();
            addConfigurator(builder -> builder.events = anyEvents);
            return getThis();
        }

        public Builder withNews(NewsViewModel anyNews) {
            if (isNull(anyNews)) return getThis();
            addConfigurator(builder -> builder.news = anyNews);
            return getThis();
        }

        @Override
        protected IndexViewModel createValueObject() {
            return new IndexViewModel(players, events, news);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }
    }
}
