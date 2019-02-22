package com.github.juanmougan.examples.validations.validator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class MissingPropertiesValidator implements Validator {

    private String filePath;

    public MissingPropertiesValidator(@Value("${file.path}") String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void validate() {
        if (StringUtils.isEmpty(filePath)) {
            throw new RuntimeException("Property missing: file.path");
        }
    }
}
