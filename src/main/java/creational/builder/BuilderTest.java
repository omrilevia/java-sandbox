package creational.builder;

public class BuilderTest {
    public void testBuilders() {
        String builderTest = "abc123";
        TextConverter tcNumToLetter = new NumberToLetterConverter();
        TextConverter tcLetterToNum = new LetterToNumberConverter();

        for (int i = 0; i < builderTest.length(); i++) {
            if (Character.isDigit(builderTest.charAt(i))) {
                tcLetterToNum.convertNumber(builderTest.charAt(i));
                tcNumToLetter.convertNumber(builderTest.charAt(i));
            } else {
                tcLetterToNum.convertChar(builderTest.charAt(i));
                tcNumToLetter.convertChar(builderTest.charAt(i));
            }
        }

        System.out.println(tcNumToLetter.getConvertedText());
        System.out.println(tcLetterToNum.getConvertedText());
    }
}
