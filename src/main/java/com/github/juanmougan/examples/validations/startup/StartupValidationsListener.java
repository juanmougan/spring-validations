package com.github.juanmougan.examples.validations.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Runs some validations on startup.
 */
@Slf4j
public class StartupValidationsListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("Starting all validations");
    }
}
