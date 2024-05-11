package assign5pt2;

class NormalEmployee extends Employee {
	  private double hra;
	  private double conveyanceAllowance;
	  private double medicalAllowance;
	  private double otherAllowances;

	  public NormalEmployee(String name, String employeeId, String designation, String department, double basicWage,
	                         double hra, double conveyanceAllowance, double medicalAllowance, double otherAllowances) {
	    super(name, employeeId, designation, department, basicWage);
	    this.hra = hra;
	    this.conveyanceAllowance = conveyanceAllowance;
	    this.medicalAllowance = medicalAllowance;
	    this.otherAllowances = otherAllowances;
	  }

	  @Override
	  public double calculateEarnings() {
	    return super.basicWage + hra + conveyanceAllowance + medicalAllowance + otherAllowances;
	  }
	}