/*
    Name: Elaine Gombos
    Date: 9/6/2022
    Description: generate a profile for a fictional character based on some
           user input.

*/

package introprojectcharacter;

import java.util.Scanner;

public class IntroProjectCharacter
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name; 
        String homeland;
        int characterClass;
        int strength;
        int intelligence;
        int money;
        int colReady;
        System.out.println("Welcome . . .");
        System.out.println("Here you will find your character's strengths"
                + " weaknesses, and fate,");
        System.out.println("along with some other mundane information");
        System.out.println("Please input your character name:");
        name = input.nextLine();
        System.out.println("Next, your homeland:");
        homeland = input.nextLine();
        System.out.println("Finally, choose your class");
        System.out.println("1 - the hockey boy \t 2 - the nerd \t 3 - the "
                + "professor");
        System.out.println("4 - the drama queen \t 5 - the choir kid "
                + "\t 6 - the best AP CS student");
        characterClass = input.nextInt();
        
        System.out.println(" ");
        System.out.println(name + " of " + homeland);
        
        strength = (int) (Math.random()*15);
        System.out.println("Your strength is: " + strength);
        
        intelligence = (int) (characterClass * 2 + 35);
        System.out.println("Your intelligence is: " + intelligence);
        
        colReady = (int) (characterClass * 16);
        System.out.println("Your college readiness is: " + colReady);
        
        money = (int) (strength / 3 + 21);
        System.out.println ("You have " + money + " bulldog bucks to begin "
                + "your journey");
        
        System.out.println ("Thanks for visiting! Best of luck :D");
        




    }

}

