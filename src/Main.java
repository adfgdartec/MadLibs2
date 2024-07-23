import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    //Call the intro method
        intro();
        Scanner input = new Scanner(System.in);
        System.out.println("Select Which Story you want?(type 1 or 2)");
        String number = input.nextLine();
        if(number.equals("1")) {
            Scanner userInput = new Scanner(System.in);
            String adjective = getUserInput("Enter an adjective: ", userInput);
            String noun = getUserInput("Enter an noun: ", userInput);
            String animal = getUserInput("Enter an animal: ", userInput);
            String noise = getUserInput("Enter an noise: ", userInput);
            // Call the printMadLib method
            printMadLib(adjective, noun, animal, noise);
        }
        else if(number.equals("2")){
            Scanner userInput = new Scanner(System.in);
            String adjective = getUserInput("Enter an adjective: ", userInput);
            String noun = getUserInput("Enter an noun: ", userInput);
            String animal = getUserInput("Enter an animal: ", userInput);
            String noise = getUserInput("Enter an noise: ", userInput);
            //Call the printMadLib method
            printMadLibNumberTwo(adjective, noun, animal, noise);
        }
    }
    public static void intro(){
        System.out.println("Welcome to the MadLibs");
    }
    public static void printMadLib(String adjective,  String noun,  String animal, String noise){
            String name = "James";
            String action = "running";
            int amntOfTime = 20;
            int daysRemaining = 30;
            String emotion = "sad";
            String hasFood = "has";
            double amountOfFood = 12.5;
            String isAttacked = "attacked";
            String anotherAnimal = "Grizzly Bear";
            String die = "die";
            String story = "Once upon a time, A " + animal + " named " + name + " that is " + adjective + " and is " + noise + " was " + action + " across the Anderson Bridge  for around\n" +
                    amntOfTime + " minutes and while he was running he saw " + noun + ". He sadly only has " + daysRemaining + " days remaining left on Earth, and when he figured this out he was extremely \n" +
                    emotion + ". He is very lucky because he " + hasFood + " food in his inventory. Specifically he has " + amountOfFood + " barrels of hay in his inventory.\n" +
                    " Due to this, he kept on eating, which made him very immobile. When he had 2 days left on Earth, a huge " + anotherAnimal + " " + isAttacked + " him, which caused him to \n" + die +
                    " in 2 minutes. He lived a beautiful life, and rest in peace soldier.";
            System.out.println(story);
    }
    public static void printMadLibNumberTwo(String adjective,  String noun,  String animal, String noise){
        String name = "James";
        String action = "running";
        int amntOfTime = 20;
        int daysRemaining = 30;
        String emotion = "sad";
        String hasFood = "has";
        double amountOfFood = 12.5;
        String isAttacked = "attacked";
        String anotherAnimal = "Grizzly Bear";
        String die = "die";
        String story = "Once upon a time, A " + animal + " named " + name + " that is " + adjective + " and is " + noise + " was " + action + " across the Anderson Bridge  for around\n" +
                amntOfTime + " minutes and while he was running he saw " + noun + ". He sadly only has " + daysRemaining + " days remaining left on Earth, and when he figured this out he was extremely \n" +
                emotion + ". He is very lucky because he " + hasFood + " food in his inventory. Specifically he has " + amountOfFood + " barrels of hay in his inventory.\n" +
                " Due to this, he kept on eating, which made him very immobile. When he had 2 days left on Earth, a huge " + anotherAnimal + " " + isAttacked + " him, which caused him to \n" + die +
                " in 2 minutes. He lived a beautiful life, and rest in peace soldier.";
        System.out.println(story);
    }
    public static String getUserInput(String message, Scanner userInput){
        System.out.print(message);
        return userInput.nextLine();

    }
}
