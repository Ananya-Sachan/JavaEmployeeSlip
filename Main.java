package assign5pt2;

public class Main {

	  public static void main(String[] args) {
	    // Sample employee data (replace with data from your attachment's formulas)
	    double basicWageNormal = 5000;
	    double hraNormal = 0.1 * basicWageNormal; // Assuming HRA is 10% of basic wage
	    double conveyanceAllowanceNormal = 1200; // Fixed conveyance allowance
	    double medicalAllowanceNormal = 800; // Fixed medical allowance
	    double otherAllowancesNormal = 500; // Other allowances (replace with actual amount)

	    double basicWageBonus = 7000;
	    double hraBonus = 0.12 * basicWageBonus; // Assuming HRA is 12% of basic wage for bonus employee
	    double conveyanceAllowanceBonus = 1500; // Fixed conveyance allowance (can be different for bonus employee)
	    double medicalAllowanceBonus = 1000; // Fixed medical allowance (can be different for bonus employee)
	    double otherAllowancesBonus = 600; // Other allowances (replace with actual amount)
	    double bonus = 2000; // Bonus amount

	    // Create employee objects
	    NormalEmployee normalEmployee = new NormalEmployee("John Doe", "EMP001", "Software Engineer", "IT", basicWageNormal,
	                                                       hraNormal, conveyanceAllowanceNormal, medicalAllowanceNormal, otherAllowancesNormal);
	    BonusEmployee bonusEmployee = new BonusEmployee("Jane Doe", "EMP002", "Sales Manager", "Sales", basicWageBonus,
	                                                     hraBonus, conveyanceAllowanceBonus, medicalAllowanceBonus, otherAllowancesBonus, bonus);

	    // Print payslips
	    System.out.println("===============================");
	    System.out.println("         Normal Employee       ");
	    System.out.println("===============================");
	    normalEmployee.printPaySlip();
	    System.out.println("\n");

	    System.out.println("===============================");
	    System.out.println("         Bonus Employee        ");
	    System.out.println("===============================");
	    bonusEmployee.printPaySlip();
	  }
	}