package empwag;

public class empwage {

	public static void main(String[] args) {
		 final int FULL_TIME = 1;
		 int emp_type = (int) (Math.random() * 100) % 2;
		 if (emp_type == FULL_TIME)
		 {
			 System.out.println("employee is present");
		 }
		 else
		 {
			 System.out.println("employee is absent");
		 }

	}

}
