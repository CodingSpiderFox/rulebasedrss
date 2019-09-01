package org.codingspiderfox.rulebasedrssproxy.dal;

import org.codingspiderfox.rulebasedrssproxy.entities.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends JpaRepository<Feed, String> {
}
