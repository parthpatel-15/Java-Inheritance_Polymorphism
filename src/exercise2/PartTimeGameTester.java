package exercise2;

public class PartTimeGameTester extends GameTester {
    private Double salary;
    private Double time;
    public PartTimeGameTester(String aname, Boolean astatus, Double atime ) {
        super(aname, astatus);
        time = atime;

    }

    @Override
    public void setSalary(){
        salary= 20 * time;
        System.out.println("welcome "+ super.name);
        System.out.println("you wanna work part time game tester for"+time+"hours");
        System.out.println("your salary will be : $"+ salary);

    }
}
