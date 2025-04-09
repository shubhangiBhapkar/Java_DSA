public class OOPS {
    public static void main(String[] args){
        Pen p1=new Pen();
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        Student s1=new Student();
        s1.calPer(98,67 , 50);
        System.out.println(s1.percentage);

        Bank b1= new Bank();
        b1.username="shubhangi";
        //b1.password="abcde";
        b1.setPass("abc");
    }
}

class Bank{
    public String username;
    private String password;

    public void setPass(String pwd){
        password=pwd;
    }
}


class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

     void setColor(String newColor){
        color=newColor;
    }
     void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int roll;
    float percentage;

    public void calPer(int chem, int phy, int bio){
        percentage=(chem+phy+bio)/3;
    }
}
