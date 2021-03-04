package passwordstrength;

    /** 
     * The goal of this program is to read a user's password
     *  from the console(<Password Client>) and evaluate whether it meets pre-
     *  defined strength requirements set by code author
   */

public class StrengthChecker {
    
    /** Boolean method allows the input to be evaluated by true or false values
     * Once failed The User will be Notified 
     * If passed, The Users input will be evaluated by a series of other parameters 
     * This continues until all parameters are met
     * The user should have a strong password after all said and done
     */
  
    public boolean evaluation(String pswd){
       
    return 
    /* 1 */  evalSpecChar(pswd) &&    
    /* 2 */  evalLowerCase(pswd) &&
    /* 3 */  evalUpperCase(pswd) &&
    /* 4 */  evalDigit(pswd) &&
    /* 5 */  evalMinLength(pswd) &&
    /* 6 */  evalMaxLength(pswd);            
    }
 
    /** The StrengthChecker will evaluate 6 aspects of the password
     * 1 The password (Must contain at least one instance of a special character.) 
     * 2 The password (Must contain at least one instance of a lowercase letter.)
     * 3 The password (Must contain at least one instance of an uppercase letter.)
     * 4 The password (Must contain at least one instance of a digit.)
     * 5&6 The password (Must contain between 12 and 24 characters.) 
     */
    
    //1
    public boolean evalSpecChar(String pswd){
        String regexp = ".*[$%^&*@#!].*"; //Here are the available special characters
        
        if(pswd.matches(regexp)){
            return true;
        }else{
            System.out.println("Invalid Password: Must contain at least one instance of a special character \n"
                    + "Choose from list: $,%,^,&,*,@,#,!.");
            return false;
        }        
    }
    
    //2
    public boolean evalLowerCase(String pswd){
        String regexp = ".*\\p{Lower}.*";
        
        if(pswd.matches(regexp)){
            return true;     
        }else{
            System.out.println("Invalid Password: Must contain at least one instance of a lowercase letter.");
            return false;
        }
    }
    
    //3
    public boolean evalUpperCase(String pswd){
        String regexp = ".*\\p{Upper}.*";
        
        if(pswd.matches(regexp)){
            return true;     
        }else{
            System.out.println("Invalid Password: Must contain at least one instance of an Uppercase letter.");
            return false;
        }
    }
    
    //4
    public boolean evalDigit(String pswd){
        String regexp = ".*\\d.*";
        
        if(pswd.matches(regexp)){
            return true;
        }else{
            System.out.println("Invalid Password: Must contain at least one instance of a digit.");
            return false;
        }
    }
    
    //5
    public boolean evalMinLength(String pswd){
       
        if(pswd.length() > 11){
            return true;
        }else{
            System.out.println("Invalid Password: Must contain between 12 and 24 characters.");
            return false;
        }
    }
    
    //6
    public boolean evalMaxLength(String pswd){
        
        if(pswd.length() <25){
            return true;
        }else{
            System.out.println("Invalid Password: Must contain between 12 and 24 characters.");
            return false;
        }
    }   
} // close class

    