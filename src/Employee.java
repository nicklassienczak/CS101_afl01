public class Employee {

    public String firstName;
    public String lastName;
    public double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        if (monthlySalary < 0) {
            monthlySalary = 0.0;
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary * 12;
    }

    public void salaryIncrease(double salaryPerc) {
        double salaryIncrease = (salaryPerc / 100 + 1);
        double yearInc = (monthlySalary * salaryIncrease);
        System.out.println(firstName + " " + lastName + "'s new yearly salary is " + yearInc + ", after a " + salaryPerc + "% increase.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
