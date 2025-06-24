package io.github.dionysistheodosis.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AmkaValidator implements ConstraintValidator<ValidAmka, String> {

    @Override
    public void initialize(ValidAmka constraintAnnotation) {
        //It's empty because we don't need a default value on AMKA
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Check if the AMKA is exactly 11 digits
        return value != null && value.matches("\\d{11}");
    }
}

