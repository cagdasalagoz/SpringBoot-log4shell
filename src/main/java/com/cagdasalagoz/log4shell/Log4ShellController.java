package com.cagdasalagoz.log4shell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Log4ShellController {
    private static final Logger log = LogManager.getLogger(Log4ShellController.class);

    @PostMapping("/logThis")
    public void logThis(@RequestBody LogRequest logRequest) {
        log.info("Log: {}", logRequest.getLog());
    }

    @GetMapping("/requestWithHeader")
    public void requestWithHeader(@RequestHeader("justaheader") String apiVersion) {
        log.info("header value: {}", apiVersion);
    }
}
