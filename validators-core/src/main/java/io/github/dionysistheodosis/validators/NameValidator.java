package io.github.dionysistheodosis.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<ValidName, String> {

    @Override
    public void initialize(ValidName constraintAnnotation) {
        //It's empty because we don't need a default value on Name
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Check if the name is at least 2 unicode characters from languages
        return value != null && value.matches("\\p{L}{2,}");
    }
}
