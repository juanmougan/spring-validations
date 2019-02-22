package com.github.juanmougan.examples.validations.validator;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//@RunWith(SpringJUnit4ClassRunner.class)
public class MissingPropertiesValidatorTest {

    public static final String FILE_PATH = "file.path";

    private Validator validator = new MissingPropertiesValidator();

    private static final String SOME_VALID_PATH = "/some/valid/path";

    static {
        System.setProperty(FILE_PATH, SOME_VALID_PATH);
    }

    @After
    public void deleteProperties() {
        System.clearProperty(FILE_PATH);
    }

    @Test
    public void validateOk() {
        System.setProperty(FILE_PATH, SOME_VALID_PATH);
        validator.validate();
    }

//    @Test(expected = RuntimeException.class)
//    public void validateFailed() {
//        validator.validate();
//    }

}
