package org.codingspiderfox.rulebasedrssproxy;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.PostConstruct;
import org.codingspiderfox.rulebasedrssproxy.dal.FeedEntryRepository;
import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;
import org.springframework.beans.factory.annotation.Autowired;

public class FeedItemQueue {

  private ConcurrentHashMap<UUID       , FeedEntry> internalStore;

  @Autowired
  private FeedEntryRepository feedEntryRepository;

  @PostConstruct
  public void startup() {

  }

  public void add(FeedEntry entry) {
    this.internalStore.put(entry.getId(), entry);
  }

}
