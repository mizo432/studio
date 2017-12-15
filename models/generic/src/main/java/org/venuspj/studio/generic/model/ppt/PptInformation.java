package org.venuspj.studio.generic.model.ppt;

import org.venuspj.util.builder.ObjectBuilder;

public class PptInformation {

    public static abstract class Builder<P extends PptInformation, B extends Builder<P, B>> extends ObjectBuilder<P, B> {

        @Override
        protected void apply(P vo, B builder) {

        }

    }
}
