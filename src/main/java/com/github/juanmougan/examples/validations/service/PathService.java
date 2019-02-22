package com.github.juanmougan.examples.validations.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Paths;

/**
 * Very basic example of a service that reads a property and adds a prefix.
 */
@Service
@Slf4j
public class PathService {

    private String filePath;

    public static final String PREFIX = "hello-world";

    public PathService(@Value("${file.path}") String filePath) {
        this.filePath = filePath;
    }

    /**
     * Prepends a prefix to a given file path.
     * @return the full path.
     */
    public String resolvePath() {
        return Paths.get(PREFIX, filePath).normalize().toString();
    }

}
