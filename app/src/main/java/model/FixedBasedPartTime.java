package model;



import model.abstracts.PartTime;
import model.abstracts.Vehicle;
import model.enums.Gender;

public class FixedBasedPartTime  extends PartTime {

    private int fixedamount;

    public FixedBasedPartTime(int fixedamount, int rate, float hours , String name, int age, Gender gen , Vehicle vehicle) {
        super( rate,  hours ,  name,  age, gen , vehicle);
        this.fixedamount = fixedamount;
    }

    public int getFixedamount() {
        return fixedamount;
    }

    public void setFixedamount(int fixedamount) {
        this.fixedamount = fixedamount;
    }

    public float fixedAmountCalcEarnings()
    {
        return this.getFixedamount()+((float)this.getHours()*this.getRate());
    }

}
