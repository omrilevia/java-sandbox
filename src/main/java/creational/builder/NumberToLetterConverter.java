package creational.builder;

public class NumberToLetterConverter extends TextConverter {

    @Override
    public void convertNumber(char c) {
        convertedText += "a";
    }
}
