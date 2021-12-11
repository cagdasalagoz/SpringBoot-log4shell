package com.cagdasalagoz.log4shell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Log4ShellController {
    private static final Logger log = LogManager.getLogger(Log4ShellController.class);


    @PostMapping("/logthis")
    public void createAppointment(@RequestBody LogRequest logRequest) {
        log.info("Log: {}", logRequest.getLog());
    }

}
