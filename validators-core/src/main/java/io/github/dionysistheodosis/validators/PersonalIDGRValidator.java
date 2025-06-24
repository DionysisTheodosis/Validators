package io.github.dionysistheodosis.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PersonalIDGRValidator implements ConstraintValidator<ValidGRPersonalID, String> {

    @Override
    public void initialize(ValidGRPersonalID constraintAnnotation) {
        //It's empty because we don't need a default value on PersonalID
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Check if the PersonalID starts with 2 letters and continue by 6 digits
        return value != null && value.matches("\\p{L}{2}\\d{6}");
    }
}
