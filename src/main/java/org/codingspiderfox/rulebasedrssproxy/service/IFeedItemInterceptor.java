package org.codingspiderfox.rulebasedrssproxy.service;

import java.util.List;
import java.util.Properties;
import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;

public interface IFeedItemInterceptor {

  List<FeedEntry> intercept(List<FeedEntry> entries, Properties config);
}
