package store.java;

public class Manager extends Staff {

    private String department;

    public Manager(String name, int id, String phoneNumber, String department)  {
        super(name, id, phoneNumber);
        this.department = department;
    }


}
