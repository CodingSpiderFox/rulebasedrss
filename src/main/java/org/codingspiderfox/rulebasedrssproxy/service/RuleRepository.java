package org.codingspiderfox.rulebasedrssproxy.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.data.repository.Repository;

public class RuleRepository implements Repository<Long, FilterRule> {

  public List<FilterRule> findAll() {
    return Arrays.asList(new SubjectContainsFilterRule());
  }
}
