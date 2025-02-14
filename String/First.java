
public class First {
    public static void printString(String fullName){
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }
    }
    public static void main(String[] args) {
        String firstName="Shubhangi ";
        String lastName=new String("Bhapkar");
        String fullName=firstName + lastName;
        System.out.println(firstName +" "+lastName);
        System.out.println("I am " + fullName);
        System.out.println(firstName.charAt(0));
        printString(fullName);
    }
}
