package org.codingspiderfox.rulebasedrssproxy.service;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;

@Rule
public class FilterRule {

  private List<FeedEntry> resultItems = new ArrayList<>();

  protected void addResultItem(FeedEntry feedEntry) {
    resultItems.add(feedEntry);
  }

  @Condition
  public boolean when() {
    return false;
  }

  @Action
  public void then() {
    return;
  }

  public List<FeedEntry> getResult() {
    return resultItems;
  }
}