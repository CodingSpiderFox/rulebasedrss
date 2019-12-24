package org.codingspiderfox.rulebasedrssproxy.service;

import org.codingspiderfox.rulebasedrssproxy.entities.Feed;
import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule
public class SubjectContainsFilterRule extends FilterRule{

  @Condition
  public boolean when(@Fact("feedEntry")FeedEntry feedEntry, @Fact("searchString") String searchString) {
    if(feedEntry.getSubject().contains(searchString)) {
      return true;
    }
    return false;
  }

  @Action
  public void then(@Fact("feedEntry")FeedEntry feedEntry) {
    addResultItem(feedEntry);
  }
}
