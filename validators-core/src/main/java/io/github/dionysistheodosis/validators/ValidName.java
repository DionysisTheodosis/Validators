package io.github.dionysistheodosis.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidator.class)
@Documented
public @interface ValidName {

    String message() default "Invalid Name format should contain at least 2 unicode characters";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}