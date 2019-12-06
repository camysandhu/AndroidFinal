package model;



import model.abstracts.Employee;
import model.abstracts.Vehicle;
import model.enums.Gender;

public class Intern extends Employee {
    private String schoolname;

    public Intern() {
        super();
    }



    public Intern(String schoolname, String name, int age , Gender gen , Vehicle vehicle ) {
        super(name,age, gen , vehicle);
        this.schoolname = schoolname;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }








}
