package application.subscriber.command;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscriberCommandTest {

    private static Validator validator;

    @BeforeClass
    public static void setUp(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void should_valid_with_error(){
        //given
        String emailIncorrectExample = "test!test.com";
        SubscriberCommand subscriberCommand = new SubscriberCommand(emailIncorrectExample);

        //when
        Set<ConstraintViolation<SubscriberCommand>> constraintViolations = validator.validate(subscriberCommand);

        //then
        assertThat(constraintViolations).hasSize(1);
    }

    @Test
    public void should_valid_without_error(){
        //given
        String emailIncorrectExample = "test@test.com";
        SubscriberCommand subscriberCommand = new SubscriberCommand(emailIncorrectExample);

        //when
        Set<ConstraintViolation<SubscriberCommand>> constraintViolations = validator.validate(subscriberCommand);

        //then
        assertThat(constraintViolations).isEmpty();
    }
}