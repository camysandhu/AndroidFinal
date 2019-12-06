package model;


import model.abstracts.PartTime;
import model.abstracts.Vehicle;
import model.enums.Gender;

public class CommissionBasedPartTime extends PartTime {


    private int commission;


    public CommissionBasedPartTime(int commission, int rate, float hours, String name, int age , Gender gen , Vehicle vehicle) {
        super(rate, hours, name, age, gen , vehicle);
        this.commission = commission;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public float commissionCalcEarnings()
    {
        return ((float)this.getCommission()/100*(this.getHours()*this.getRate()))+(this.getHours()*this.getRate());
    }




}
