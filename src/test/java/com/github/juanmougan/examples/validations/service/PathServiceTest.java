package com.github.juanmougan.examples.validations.service;

import com.github.juanmougan.examples.validations.validator.MissingPropertiesValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.file.Paths;

import static com.github.juanmougan.examples.validations.service.PathService.PREFIX;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;

@RunWith(SpringRunner.class)
public class PathServiceTest {

    private static final String SOME_FILE_NAME = "someFileName.txt";
    @MockBean
    private MissingPropertiesValidator validator;

    @Test
    public void resolvePathValidScenario() {
        doNothing().when(validator).validate();
        PathService service = new PathService(SOME_FILE_NAME);
        String fullName = service.resolvePath();
        assertEquals(Paths.get(PREFIX, SOME_FILE_NAME).normalize().toString(), fullName);
    }
}
