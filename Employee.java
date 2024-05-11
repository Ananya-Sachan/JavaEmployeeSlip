package assign5pt2;

abstract class Employee {
 private String name;
private String employeeId;
private String designation;
private String department;
private double basicWage;

public Employee(String name, String employeeId, String designation, String department, double basicWage) {
  this.name = name;
  this.employeeId = employeeId;
  this.designation = designation;
  this.department = department;
  this.basicWage = basicWage;
}
public double getBasicWage() {
	  return basicWage;
	}

public abstract double calculateEarnings();

public double calculateDeductions() {
  // Replace with the actual formulas to calculate deductions based on your company's policy
  double epf = basicWage * 0.12;
  double esi = 152;
  double professionalTax = 10;
  double loanRecovery = 20;
  return epf + esi + professionalTax + loanRecovery;
}

public double calculateNetSalary() {
  return calculateEarnings() - calculateDeductions();
}

public void printPaySlip() {
  System.out.println("===============================");
  System.out.println("         Pay Slip            ");
  System.out.println("===============================");
  System.out.println("Name: " + name);
  System.out.println("Employee ID: " + employeeId);
  System.out.println("Designation: " + designation);
  System.out.println("Department: " + department);
  System.out.println("Basic Wage: ₹" + basicWage);
  System.out.println("===============================");
  System.out.println("Earnings");
  System.out.println("Basic Wage: ₹" + basicWage);
  // Add calls to other earnings methods here
  System.out.println("Total Earnings: ₹" + calculateEarnings());
  System.out.println("===============================");
  System.out.println("Deductions");
  System.out.println("EPF: ₹" + calculateDeductions());
  // Add calls to other deductions methods here
  System.out.println("Total Deductions: ₹" + calculateDeductions());
  System.out.println("===============================");
  System.out.println("Net Salary: ₹" + calculateNetSalary());
  System.out.println("===============================");
}
}

