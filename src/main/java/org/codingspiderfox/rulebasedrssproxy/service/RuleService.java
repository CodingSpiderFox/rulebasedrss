package org.codingspiderfox.rulebasedrssproxy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class RuleService {

  @Autowired
  RuleRepository ruleRepository;

  public List<FilterRule> findAll() {
    return ruleRepository.findAll();
  }
}
