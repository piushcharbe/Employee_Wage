package empwag;

public class part_time_empwage {

	public static void main(String[] args) {
		final int PART_TIME = 1;
		final int FULL_TIME = 2;
		final int WAGE_PER_HR = 20;
		int emp_type = (int) (Math.random() * 100) % 3;
		int workinghours = 0;
		if (emp_type == FULL_TIME)
		 {
			 System.out.println("employee is present full time");
			 workinghours = 8;
		 }
		 else if (emp_type == PART_TIME)
		 {
			 System.out.println("employee is present part time");
			 workinghours = 4;
		 }
		 else
		 {
			 System.out.println("employee is absent");
		 }
		int wage = workinghours * WAGE_PER_HR;
		System.out.println("employee daily wage is " + wage);

	}

}
