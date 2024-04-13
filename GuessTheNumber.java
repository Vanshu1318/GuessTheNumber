import java.util.*;
public class GuessTheNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
            int usernumber=0;
        do{
            System.out.println("Guess the number between 0 to 100");
            usernumber=sc.nextInt();
            System.out.println(" if you want to stop your program type any number less than 0");
            if(usernumber==mynumber){
                System.out.println("WOOOOHOO ... Your number is Correct !!!!!!!!");
            }
            else if(usernumber>mynumber){
                System.out.println("Your number is too large !");
            }
            else{
                System.out.println("Your number is too small!");
            }
        }while(usernumber>=0);
            System.out.println("my number was : \n"+mynumber);

        
        
    }
}