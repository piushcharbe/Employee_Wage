package empwag;

public class dailyempwage {

	public static void main(String[] args) {
		final int FULL_TIME = 1;
		final int WAGE_PER_HR = 20;
		int emp_type = (int) (Math.random() * 100) % 2;
		int workinghours = 0;
		if (emp_type == FULL_TIME)
		 {
			 System.out.println("employee is present");
			 workinghours = 8;
		 }
		 else
		 {
			 System.out.println("employee is absent");
		 }
		int wage = workinghours * WAGE_PER_HR;
		System.out.println("employee daily wage is " + wage);

	}

}

