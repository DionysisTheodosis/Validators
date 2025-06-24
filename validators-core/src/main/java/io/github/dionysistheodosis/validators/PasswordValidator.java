package io.github.dionysistheodosis.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<ValidPassword, String> {

    @Override
    public void initialize(ValidPassword constraintAnnotation) {
        //It's empty because we don't need a default value on password
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
      /*   Check if the password field contains Password must contain one
         digit from 1 to 9, one lowercase letter, one uppercase letter,
         one special character, no space, and it must be 8-16 characters long.*/
        return value != null && value.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[#?!@$%^&*-_]).{8,}$");
    }
}