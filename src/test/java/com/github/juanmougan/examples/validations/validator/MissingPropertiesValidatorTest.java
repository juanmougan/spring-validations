package com.github.juanmougan.examples.validations.validator;

import org.junit.Test;

public class MissingPropertiesValidatorTest {

    public static final String FILE_PATH = "file.path";

    @Test
    public void validateOk() {
        Validator validator = new MissingPropertiesValidator(FILE_PATH);
        validator.validate();
    }

    @Test(expected = RuntimeException.class)
    public void validateFailed() {
        Validator validator = new MissingPropertiesValidator(null);
        validator.validate();
    }

}
