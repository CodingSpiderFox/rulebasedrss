package org.codingspiderfox.rulebasedrssproxy.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    @PostMapping(path = "/defaultDelayTime")
    public void setDefaultDelayTime(@RequestBody long delayTimeInMsecs) {


    }
}
