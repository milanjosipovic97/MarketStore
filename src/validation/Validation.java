package validation;

import exception.InvalidValue;

public interface Validation {
    boolean isValid(double value, Object o) throws InvalidValue;
}
