package org.codingspiderfox.rulebasedrssproxy.service;

import java.util.List;
import java.util.Properties;
import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;

public class FeedItemInterceptor {

  public List<FeedEntry> intercept(List<FeedEntry> inputData, Properties interceptionHints) {
    return inputData;
  }
}
