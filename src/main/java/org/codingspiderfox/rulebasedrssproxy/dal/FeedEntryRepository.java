package org.codingspiderfox.rulebasedrssproxy.dal;

import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  FeedEntryRepository extends JpaRepository<FeedEntry, String> {
}
