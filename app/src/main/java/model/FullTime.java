package model;



import model.abstracts.Employee;
import model.abstracts.Vehicle;
import model.enums.Gender;

public class FullTime extends Employee {
    private int salary;
    private int bonus;




    public FullTime(int salary, int bonus, String name, int age, Gender gen, Vehicle vehicle) {
        super(name,age, gen ,vehicle);
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calcEarning() {

        return this.getSalary()+this.getBonus();
    }





}
