public class CopyConstructor {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="shubhangi";
        s1.roll=67;
        s1.password="abc";
        s1.marks[0]=100;
        s1.marks[1]=50;
        s1.marks[2]=87;

        // for(int i=0;i<3;i++){
        //     System.out.println(s1.marks[i]);
        // }
        Student s2=new Student(s1); //this statement will invoke the copy constructor
        s2.password="xyz";

        s1.marks[2]=200;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
    
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //default constructor
    Student(){
        marks=new int[3];
        System.out.println("Constructor is invoked..");
    }

    //copy constructor
    // Student(Student s1){
    //     marks =new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    //Deep copy
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
//not invoke int this code
    Student(String name){
        marks =new int[3];
        this.name=name;
    }
    Student(int roll){
        marks =new int[3];
        this.roll=roll;
    }
}
