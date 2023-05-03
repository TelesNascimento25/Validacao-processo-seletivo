package src;

public class ParametrosInvalidosException extends
RuntimeException {
    public ParametrosInvalidosException(String stringStringmessage) {
        super(stringStringmessage);
    }

    @Override
    public String toString() {
        return "ParametrosInvalidosException []";
    }
}