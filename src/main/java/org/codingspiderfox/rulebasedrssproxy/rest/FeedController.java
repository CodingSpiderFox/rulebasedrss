package org.codingspiderfox.rulebasedrssproxy.rest;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndEntryImpl;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.codingspiderfox.rulebasedrssproxy.dal.FeedEntryRepository;
import org.codingspiderfox.rulebasedrssproxy.dal.FeedRepository;
import org.codingspiderfox.rulebasedrssproxy.entities.Feed;
import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;

@RestController
public class FeedController {

    @Autowired
    private FeedEntryRepository feedEntryRepository;

    @Autowired
    private FeedRepository feedRepository;

    @Autowired
    private ConfigurationController configurationController;

    @GetMapping(path = "/")
    public void test() {
        String url = "file:///home/user/Downloads/programming.rss";

        try (XmlReader reader = new XmlReader(new URL(url))) {
            SyndFeed feed = new SyndFeedInput().build(reader);
            System.out.println(feed.getTitle());
            System.out.println("***********************************");

            if(feedRepository.findAll().isEmpty()) {
                Feed feedEntity = new Feed();
                feedEntity.setUrl(url);
                feedEntity = feedRepository.save(feedEntity);
            }

            for (SyndEntry entry : feed.getEntries()) {
                System.out.println(entry);
                System.out.println("***********************************");

                FeedEntry feedEntry = new FeedEntry();
                feedEntry.setFeed(feedRepository.findAll().get(0));
                feedEntry.setFeedItem(((SyndEntryImpl)entry));

                feedEntryRepository.save(feedEntry);
            }
            System.out.println("Done");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}