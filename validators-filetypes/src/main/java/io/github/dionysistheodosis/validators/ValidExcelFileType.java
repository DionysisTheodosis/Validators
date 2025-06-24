package io.github.dionysistheodosis.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ExcelFileTypeValidator.class)
@Documented
public @interface ValidExcelFileType  {
    String message() default "Invalid Excel file type";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
