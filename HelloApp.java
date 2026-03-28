public class HelloApp {
    public static void main(String[] args) {

        // If no arguments → default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // Enhanced for loop to combine names
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            // Print final greeting
            System.out.println("Hello, " + result + "!");
        }
    }
}