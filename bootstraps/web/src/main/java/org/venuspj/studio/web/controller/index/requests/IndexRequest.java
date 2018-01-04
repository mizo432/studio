package org.venuspj.studio.web.controller.index.requests;

import org.venuspj.studio.core.model.event.EventCriteria;
import org.venuspj.studio.core.model.role.thingRole.product.ProductCriteria;
import org.venuspj.studio.core.model.topic.TopicCriteria;
import org.venuspj.studio.core.usecase.event.events.FetchEventsRequest;
import org.venuspj.studio.core.usecase.product.products.FetchProductsRequest;
import org.venuspj.studio.core.usecase.topic.topics.FetchTopicsRequest;

public class IndexRequest implements FetchTopicsRequest, FetchEventsRequest, FetchProductsRequest {
    @Override
    public TopicCriteria getTopicCriteria() {
        TopicCriteria result = new TopicCriteria();
//            result.
        return result;
    }

    @Override
    public EventCriteria getEventCriteria() {
        EventCriteria result = new EventCriteria();
//            result.
        return result;
    }

    @Override
    public ProductCriteria getProductCriteria() {
        ProductCriteria result = new ProductCriteria();
//            result.
        return result;
    }
}
