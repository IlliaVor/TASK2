package Dialog;

import java.util.Scanner;

import static java.sql.DriverManager.println;

public class Dialog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello! Welcome to my project.I would love to know more about you ");

        // Gather information
        System.out.println("Could you please tell me your first name? ");
        String name = in.nextLine();

        System.out.print("Great, " + name + "! Can you also tell me your last name?, please? ");
        String lastName = in.nextLine();

        System.out.print("Thank you, " + name + " " + lastName + ".  Next up, I'd love to know your age. How old are you? ");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Perfect! " + age + " these are your best years:).  Now, let's talk about your contact information. Write down your e-mail address, please ");
        String email = in.nextLine();


        System.out.print("Thanks! Moving on, could you share your phone number with us? ");
        String phoneNumber = in.nextLine();

        System.out.print("Nice, got it, " + phoneNumber + ".  Now, let's discuss your current location. What city and country are you in? ");
        String location = in.nextLine();

        System.out.print("Awesome! " + location + " it`s nice place. Just a couple more things. Do you have any hobbies you'd like to tell us about? ");
        String hobbies = in.nextLine();

        System.out.print("That's cool! " + hobbies + " sounds fun).  Lastly, could you let us know whether you prefer tea or coffee?. ");
        String answear = in.nextLine();

        System.out.print("Do you have programming experience? (yes/no) ");
        String programmingexperience = in.nextLine();

        boolean yesJavaExp = programmingexperience.contains("yes") || programmingexperience.contains("Yes");
        String experienceAnswear = yesJavaExp ?
                "That's great! Java programming is a valuable skill." :
                "No worries! Learning Java can be a rewarding experience.";
        System.out.println(experienceAnswear);




       //Summarize the conversation
     System.out.println("Thank you, " + name + "! I've got all the information I need. Let's do a quick recap:");
     System.out.println("Full Name: " + name + " " + lastName);
     System.out.println("Age " + age );
     System.out.println("Email: " + email);
     System.out.println("Phone number: " + phoneNumber);
     System.out.println("Location: " + location);
     System.out.println("Favorite drink " + answear);
     System.out.println("Hobbie: " + hobbies);
     System.out.println("Programming Experience: " + programmingexperience);

        System.out.print("Is everything correct? If so, type \"true\". If not, type \"false\": ");
        boolean isCorrect = in.nextBoolean();


        if (isCorrect) {
            System.out.println("Great! Thanks for sharing your information.");
        } else {
            System.out.println("Oops! Let's try again.");
        }





    }

}
