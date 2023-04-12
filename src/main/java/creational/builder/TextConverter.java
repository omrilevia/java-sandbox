package creational.builder;

public abstract class TextConverter {
    protected String convertedText = "";

    public void convertChar(char c) {
        convertedText += c;
    }

    public void convertNumber(char c) {
        convertedText += c;
    }

    public String getConvertedText() {
        return convertedText;
    }
}
