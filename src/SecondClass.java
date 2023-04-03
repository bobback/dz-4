public class SecondClass {
    private int myField = 23;

    public String printAndReturnFieldValue() {
        String format = ("---<%d>---");
        String result = String.format(format, myField);
        System.out.println(result);
        return result;

    }
}