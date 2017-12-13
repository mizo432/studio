package org.venuspj.studio.adapter.presenters.studio;

import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class StudioViewModel {
    private String studioName;
    private String studioDescription;

    public StudioViewModel(String aStudioName,
                           String aStudioDescription) {
        studioName = aStudioName;
        studioDescription = aStudioDescription;

    }

    public String getStudioName() {
        return studioName;
    }

    public String getStudioDescription() {
        return studioDescription;
    }

    public static class Builder extends ObjectBuilder<StudioViewModel, Builder> {
        private String studioName;
        private String studioDescription;

        @Override
        protected void apply(StudioViewModel vo, Builder builder) {
            builder.withStudioName(vo.getStudioName());
            builder.withStudioDescription(vo.getStudioDescription());
        }

        public Builder withStudioDescription(String aStudioDescription) {
            if (isNull(aStudioDescription)) return getThis();
            addConfigurator(builder -> builder.studioDescription = aStudioDescription);
            return getThis();
        }

        public Builder withStudioName(String aStudioName) {
            if (isNull(aStudioName)) return getThis();
            addConfigurator(builder -> builder.studioName = aStudioName);
            return getThis();
        }

        @Override
        protected StudioViewModel createValueObject() {
            return new StudioViewModel(studioName,
                    studioDescription);
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
