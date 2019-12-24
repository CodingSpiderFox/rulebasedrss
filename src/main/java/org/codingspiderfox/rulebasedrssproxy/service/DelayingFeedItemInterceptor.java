package org.codingspiderfox.rulebasedrssproxy.service;

import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Filter;
import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.beans.factory.annotation.Autowired;

public class DelayingFeedItemInterceptor implements IFeedItemInterceptor {

  @Autowired
  RuleService ruleService;

  @Override
  public List<FeedEntry> intercept(List<FeedEntry> entries, Properties config) {
    checkConfiguration(config);

    List<FilterRule> filterRules = ruleService.findAll();

    Rules rules = new Rules();
    rules.register(filterRules);

    RulesEngine rulesEngine = new DefaultRulesEngine();

    for(FeedEntry entry : entries) {
      Facts facts = new Facts();
      facts.put("feedEntry", entry);
      rulesEngine.fire(rules,facts);
    }

    List<FeedEntry>

    for(FeedEntry feedEntry: entries) {
      for(FilterRule filterRule : rules) {
        if(!filterRule.getResult().contains(feedEntry)) {
          continue;
        }
      }


    }
  }

  private void checkConfiguration(Properties config) {
    Objects.requireNonNull(config);

    if(!config.containsKey("DELAY_TIME")) {
      throw new IllegalArgumentException("config must contain DELAY_TIME");
    }

    Long delayTime = Long.parseLong(config.getProperty("DELAY_TIME"));
  }
}
