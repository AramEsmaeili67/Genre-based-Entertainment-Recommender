import java.util.Scanner;

public class TVSeriesOrMovieRecommendation {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to choose their favorite TV series genre
        System.out.println("Please choose your favourite TV series Genre:");
        System.out.println("Input 1 for comedy");
        System.out.println("Input 2 for fiction");
        System.out.println("Input 3 for romance");

        // Read the user's choice
        int choice = scan.nextInt();
        String genre = ""; // Initialize a variable to store the recommended genre

        // Switch statement to recommend a TV series or movie based on the user's choice
        switch(choice) {
            case 1:
                genre = "Seinfeld"; // Recommend "Seinfeld" for comedy
                break;
            case 2:
                genre = "Gravity"; // Recommend "Gravity" for fiction
                break;
            case 3:
                genre = "Pride and Prejudice"; // Recommend "Pride and Prejudice" for romance
                break;
            default:
                genre = "Incorrect input. Please choose 1, 2, or 3."; // Display error message for invalid input
        }

        // Print the recommended TV series or movie based on the user's choice
        System.out.println("Based on your input, we recommend: " + genre);
    }
}

