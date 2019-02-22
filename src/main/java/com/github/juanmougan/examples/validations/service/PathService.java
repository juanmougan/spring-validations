package com.github.juanmougan.examples.validations.service;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Paths;

/**
 * Very basic example of a service that reads a property and adds a preffix.
 */
@Service
//@NoArgsConstructor
@Slf4j
public class PathService {

    @Value("${file.path}")
    private String filePath;

    public static final String PREFIX = "hello-world";

    @Autowired
    public PathService() {
        log.info("Creating bean PathService");
    }

    /**
     * Prepends a prefix to a given file path.
     * @return the full path.
     */
    public String resolvePath() {
        return Paths.get(PREFIX, filePath).toString();
    }

}
