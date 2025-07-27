import java.util.*;
public class Course {
    public static void main(String[] args){
        int flag=0;int n=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of course:");
         n=sc.nextInt();
        String course[]=new String[n];
        System.out.println("Enter course names:");
        sc.nextLine(); //this is imp bcase after nextInt() it left the /n and we immediately use nextLine() so at 0 place /n will get store in array
        for(int i=0;i<course.length;i++){
            course[i]=sc.nextLine();
        }
        System.out.println("Enter the course to be searched:");
        String courseSearch=sc.nextLine();
        for (int i = 0; i <course.length; i++) {
            if(course[i].equals(courseSearch))
            {
                flag=1;
            }
        }

        if(flag==1){
            System.out.println(courseSearch+" course is available");
        }
        else {
            System.out.println(courseSearch+" course is not available");

        }
    }
}
