package UnitTest.mavenproject;

public class CILab implements CILabInterface {
    private String myString="";

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        // Check if the usage of capitals in the word is correct
        if (myString == null) {
            return false;
        }

        int capitalCount = 0;
        int length = myString.length();

        for (int i = 0; i < length; i++) {
            char c = myString.charAt(i);
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }

        return capitalCount == 0 || capitalCount == length || (capitalCount == 1 && Character.isUpperCase(myString.charAt(0)));
    }
}