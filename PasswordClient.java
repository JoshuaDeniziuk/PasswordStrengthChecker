package passwordstrength;
import java.util.Scanner; //importing scanner class

public class PasswordClient {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); // Creating scanner object
        StrengthChecker checker = new StrengthChecker(); //calling the Strength Checker
        
        //prompt the user to enter a password
        System.out.println(" Enter Password: ");
        String pswd = obj.nextLine();
        
        if (checker.evaluation(pswd)){
            System.out.println("Valid Password: Good Job");
        }
        else{
            int check = 1;
            while (check ==1) {
                System.out.println("The password must contain at least one instance of a special character.");
                System.out.println("The password must contain at least one instance of a lowercase letter.");
                System.out.println("The password must contain at least one instance of an uppercase letter.");
                System.out.println("The password must contain at least one instance of a digit.");
                System.out.println("The password must contain between 12 and 24 characters.");
                System.out.println("Try again Here: ");
                pswd = obj.nextLine();
                if(checker.evaluation(pswd)){
                    check = 0;
                    System.out.println("Valid Password: Good Job");
                }
                
            }
        }
    
    
    
    
    }
}
