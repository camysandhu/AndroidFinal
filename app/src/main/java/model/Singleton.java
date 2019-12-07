package model;


import java.util.ArrayList;
import java.util.List;

import model.abstracts.Employee;
import model.enums.Gender;


public class Singleton {
			
	
			static Singleton obj = null;
			List<Employee> employees;
			private Singleton()
			{


				employees = new ArrayList<>();

				Intern intern = new Intern("Lambton College","Camy", 20, Gender.MALE , null);
				FullTime fullTime = new FullTime(10000, 500,"Harman", 30, Gender.MALE ,new MotorCycle("BMW112","BMW" , "CAMY", 16));
				CommissionBasedPartTime commissionBasedPartTime = new CommissionBasedPartTime(10, 14, 5, "Varinder", 27 , Gender.FEMALE ,new Car("Audi","A10" , "Dhillon", 16) );
				FixedBasedPartTime fixedBasedPartTime = new FixedBasedPartTime(1000, 5, 5,"Sachin", 27 , Gender.MALE ,new MotorCycle("Challenger","Dodge" , "JATT", 15) );



				addIntoList(intern);
				addIntoList(fullTime);
				addIntoList(commissionBasedPartTime);
				addIntoList(fixedBasedPartTime);
			}
			public static Singleton getObj()
			{
				if(obj == null)
				{
					obj = new Singleton();

				}
				return obj;
			}
			public void addIntoList(Employee temp)
			{
				employees.add(temp);

			}
			public void  displayList()
			{
				for(Employee e : this.employees)
				{
					System.out.print(e);
					System.out.print("\n");
				}
			}
			public ArrayList<Employee> getList()
			{
				return  ((ArrayList<Employee>)this.employees);
			}


			
}
