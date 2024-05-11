package assign5pt2;

class BonusEmployee extends NormalEmployee {
	  private double bonus;

	  public BonusEmployee(String name, String employeeId, String designation, String department, double basicWage,
	                         double hra, double conveyanceAllowance, double medicalAllowance, double otherAllowances, double bonus) {
	    super(name, employeeId, designation, department, basicWage, hra, conveyanceAllowance, medicalAllowance, otherAllowances);
	    this.bonus = bonus;
	  }

	  @Override
	  public double calculateEarnings() {
	    return super.calculateEarnings() + bonus;
	  }
	}
