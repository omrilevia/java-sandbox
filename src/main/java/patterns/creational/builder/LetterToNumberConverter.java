package patterns.creational.builder;

public class LetterToNumberConverter extends TextConverter {
    @Override
    public void convertChar(char c) {
        convertedText += "1";
    }
}
