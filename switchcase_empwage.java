package empwag;

public class switchcase_empwage {

	public static void main(String[] args) {
		final int PART_TIME = 1;
		final int FULL_TIME = 2;
		final int WAGE_PER_HR = 20;
		int emp_type = (int) (Math.random() * 100) % 3;
		int workinghours = 0;
		switch (emp_type)
		{
		case FULL_TIME:
			System.out.println("employee is present full time");
			workinghours = 8;
		
			break;
		case PART_TIME:
			System.out.println("employee is present part time");
			workinghours = 4;
			
			break;
		default:
			System.out.println("employee is absent");
		}
		int wage = workinghours * WAGE_PER_HR;
		System.out.println("employee daily wage is " + wage);
	}

}
