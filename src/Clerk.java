public class Clerk extends Employee{
        public Clerk() {
            this("E000", "No name", "no department", 0.0, "no designation");
        }
    public Clerk (String EmployeeID, String name,String department,double salary, String designation){
        super(EmployeeID,name,department,salary,designation);
    }

    public double addBonus(double salary){
        return salary += 100 ;
    }

    public String toString(){
        return super.toString() + "\n" + "Salary after adding the Bonus is : " + addBonus(getSalary());
    }
}

