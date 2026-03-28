public class HelloApp {
    public static void main(String[] args) {

        String greeting;

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        } else {
            // Default case
            greeting = "Hello, World!";
        }

        // Print the greeting
        System.out.println(greeting);
    }
}