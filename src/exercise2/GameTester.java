package exercise2;
public abstract class GameTester {
    protected String name;

    private Boolean status;
    public GameTester(String aname,Boolean astatus){
        name=aname;
        status=astatus;

    }


    public abstract void setSalary();
}
