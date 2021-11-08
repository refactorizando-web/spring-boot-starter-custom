package com.refactorizando.example.starter.time.logging.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("logging.method.exec")
public class LoggingProperties {

    private String loggerName = "AuditLogger";

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }
}
