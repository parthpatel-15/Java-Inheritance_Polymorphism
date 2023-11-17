package exercise2;
import java.util.*;

public class Test {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("This application is for game tester.");
        System.out.println("Enter your name :");
        String name = s.nextLine();
        System.out.println("There are two options available for this job");
        System.out.println("a) Full time game tester");
        System.out.println("for this job enter 'FULL' only.");
        System.out.println("b) Part time game tester");
        System.out.println("for this job enter 'PART' only.");
        String a = s.nextLine();
        String jobTitle = a.toUpperCase();
        if (jobTitle.equals("FULL")){
            FullTimeGameTester ob1 = new FullTimeGameTester (name,true);
            ob1.setSalary();

        }
        else if (jobTitle.equals("PART")){
            System.out.println("enter time as you want to work part time in a day:");
            Double time= s.nextDouble();
            PartTimeGameTester ob1 = new PartTimeGameTester( name, false,time);
            ob1.setSalary();


        }
        else {
            System.out.println(" check your input:");
        }



    }
}
