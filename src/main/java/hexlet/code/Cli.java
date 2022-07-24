package hexlet.code;

import java.util.Scanner;

class Cli {
    private String name;

    public static String greeting() {
        Scanner userName = new Scanner(System.in);
        String name;
        //this.name = name;
        name = userName.nextLine();
        return "Hello, " + name + "!";
    }
    public String getName() {
        return this.name;
    }
}
