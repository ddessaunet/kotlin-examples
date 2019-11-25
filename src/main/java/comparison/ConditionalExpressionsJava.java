package comparison;

import java.util.Objects;

public class ConditionalExpressionsJava {

    public static void main(String[] args) {
        String params;

        if (args.length == 0) {
            params = "100";
        } else {
            params = args[0];
        }

        int value;
        if (Objects.equals(params, "100")) {
            value = 1;
        } else if (Objects.equals(params, "300")){
            value = 2;
        } else {
            value = 70;
        }

        int actual = 0;

        switch (actual) {
            case 1:
                System.out.println("It was one"); actual = 20; break;
            case 2:
                System.out.println("It was two"); actual = 30; break;
            default:
                if (value > 0 && value < 100) {
                    actual = 40;
                    System.out.println("It was somewhere in between these numbers");
                } else {
                    value = 0;
                }
        }
        System.out.format("Value is %d and Actual is %d", value, actual);
    }
}
