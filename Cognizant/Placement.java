import java.util.*;

public class Placement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of students placed in CSE:");
        int cse=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ece=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int mech=sc.nextInt();

        if(ece<0 || cse<0 || mech<0){
            System.out.println("Input is Invalid");
        }
        else {
        
            if(ece==0 && cse==0 && mech==0){
            System.out.println("None of the department has got the highest placement");
             }
            else if(cse==ece && cse>mech){
            System.out.println("Highest Placement");
            System.out.println("CSE");
            System.out.println("ECE");
            }
            else if(ece==mech && ece >mech){
            System.out.println("Highest Placement");
            System.out.println("ECE");
            System.out.println("MECH");
            }

            else if(mech==cse && mech>ece){
            System.out.println("Highest Placement");
            System.out.println("MECH");
            System.out.println("CSE");
         }

            else if(cse > ece && cse > mech){
            System.out.println("Highest Placement");
            System.out.println("CSE");
            
             }
            else if(ece>cse && ece > mech){
            System.out.println("Highest Placement");
            System.out.println("ECE");
            }
            else{
            System.out.println("Highest Placement");
            System.out.println("MECH");
            }
        }
        
    }
}
