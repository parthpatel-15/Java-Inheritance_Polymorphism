package exercise2;

public class FullTimeGameTester extends GameTester {
    private int baseSalary=3000;
    private int salary ;
    private Double time;
    public FullTimeGameTester(String aname, Boolean astatus){
        super(aname,astatus);

    }
    @Override
    public void setSalary(){
        salary = baseSalary;
        System.out.println("welcome "+ super.name);
        System.out.println("you wanna work full time game tester.");
        System.out.println("your salary will be : $"+ salary);

    }

}
