package hexlet.code;

import java.util.Scanner;

class Cli {
        public static String greeting() {
            Scanner userName = new Scanner(System.in);
            String name;
            name = userName.nextLine();
            return "Hello, " + name + "!";
        }
}
