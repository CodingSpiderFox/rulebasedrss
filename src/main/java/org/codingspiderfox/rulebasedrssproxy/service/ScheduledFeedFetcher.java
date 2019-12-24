package org.codingspiderfox.rulebasedrssproxy.service;

import com.rometools.rome.feed.atom.Feed;
import com.rometools.rome.feed.rss.Item;
import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.codingspiderfox.rulebasedrssproxy.FeedItemQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduledFeedFetcher {

  private List<Item> itemBuffer;

  public List<Item> getItemBuffer() {
    return itemBuffer;
  }

  @PostConstruct
  public void fetch() {
    LinkedList<FeedItemInterceptor> interceptorChain;
  }

  public void addFeed() {

  }
}
