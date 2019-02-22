package com.github.juanmougan.examples.validations.validator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class MissingPropertiesValidator implements Validator {

    @Value("${file.path}")
    private String filePath;

    @Override
    public void validate() {
        if (StringUtils.isEmpty(filePath)) {
            throw new RuntimeException("Property missing: file.path");
        }
    }
}
