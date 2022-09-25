public class Clerk extends Employee{
        public Clerk() {
            this("E000", "No name", "no department", 0.0, "no designation");
        }
    public Clerk (String EmployeeID, String name,String department,double salary, String designation){
        super(EmployeeID,name,department,salary,designation);
    }

    public double addBonus(){
            double bonus = 100;
        return getSalary() + bonus;
    }
    public double deduction(double absentDays, double totalDays){
        return addBonus() - (addBonus() * (absentDays/totalDays));
    }


//    public String toString(){
//        return super.toString() + "\n" + "Salary after adding the Bonus is : " + addBonus();
//    }
}

