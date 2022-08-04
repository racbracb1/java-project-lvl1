package hexlet.code;

public class Utils {
    public static int randomNumber() {
        final int randomTill = 100;
        return (int) (Math.random() * randomTill + 1);
    }
    public static int randomNumber(int maxValue) {
        return (int) (Math.random() * maxValue + 1);
    }
}
