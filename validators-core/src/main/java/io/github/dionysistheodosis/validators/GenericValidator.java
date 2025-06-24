package io.github.dionysistheodosis.validators;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.NotNull;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
public class GenericValidator {
    private static final Logger logger = Logger.getLogger(GenericValidator.class.getName());

    private final Validator validator;

    public GenericValidator(@NotNull Validator validator) {
        this.validator = validator;
    }

    public <T> Set<T> validateAndFilter(Set<T> objects) {
        return objects.stream()
                .filter(this::isValid)
                .collect(Collectors.toSet());
    }

    public <T> boolean isValid(T object) {
        Set<ConstraintViolation<T>> violations = validator.validate(object);
        if (!violations.isEmpty()) {
            for (ConstraintViolation<T> violation : violations) {
                logger.log(Level.WARNING, "Validation error: {0}", violation.getMessage());
            }
            return false;
        }
        return true;
    }
}
