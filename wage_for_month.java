package empwag;

public class wage_for_month {

	public static void main(String[] args) {
		final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20;
    
        int totalwage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++)
        {
            int empType = (int) (Math.random() * 100) % 3;
            int workinghours =0;
            switch (empType)
            {
                case FULL_TIME:
                    workinghours = 8;
                    break;
                case PART_TIME:
                    workinghours = 4;
                    break;
                default:
            }
            int wage = workinghours * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + wage);
            totalwage += wage;
	}
        System.out.println("total wage for a month is " + totalwage);
	}
}
