public class Employee {
    private String EmployeeID;
    private String name;
    private String department;
    private double salary;
    private String designation;

    public Employee() {
        setDepartment("E000");
        setName("No name");
        setDepartment("No department");
        setSalary(0.0);
        setDesignation("no designation");
    }

    public Employee(String EmployeeID, String name, String department, double salary, String designation) {
        setEmployeeID(EmployeeID);
        setName(name);
        setDepartment(department);
        setSalary(salary);
        setDesignation(designation);
    }

    public void setEmployeeID(String EmployeeID) {
        if (EmployeeID == null) {
            System.out.println("Input is not valid");
            System.exit(0);
        } else {
            this.EmployeeID = EmployeeID;
        }
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Input is not valid");
            System.exit(0);
        } else {
            this.name = name;
        }
    }

    public void setDepartment(String department) {
        if (department == null) {
            System.out.println("Input is not valid");
            System.exit(0);
        } else {
            this.department = department;
        }
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative");
            System.exit(0);
        } else {
            this.salary = salary;
        }
    }

    public void setDesignation(String designation) {
        if (designation == null) {
            System.out.println("Input is not valid");
            System.exit(0);
        } else {
            this.designation = designation;
        }
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public double addBonus() {
        double bonus = 200;
        return getSalary() + bonus;
    }

    public double deduction(double absentDays, double totalDays) {
        return addBonus() - (addBonus() * (absentDays / totalDays));
    }


    public String toString() {
        return "Employee ID : " + getEmployeeID() + "\n" + "Employee Name : " + getName() + "\n" +
                "Department name: " + getDepartment() + "\n" + "Salary: " + getSalary() + "\n" + "Designation: " + getDesignation() + "\n" + "Salary after adding bonus is : " + addBonus();
    }

    public boolean equal(Employee otherEmployee) {
        return (EmployeeID.equals(otherEmployee.EmployeeID) && name.equals(otherEmployee.name) && department.equals(otherEmployee.department) && (salary == otherEmployee.salary) && designation.equals(otherEmployee.designation));
    }


}
