package io.github.dionysistheodosis.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PersonalIDGRValidator.class)
@Documented
public @interface ValidGRPersonalID {

    String message() default "Invalid Greek PersonalID format should start with 2 letters and continue by 6 digits";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}