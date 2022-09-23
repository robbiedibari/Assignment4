public class Manager  extends Employee{
        public Manager(){
         this("E000","No name","no department" , 0.0,"no designation");
        }
        public Manager(String EmployeeID, String name,String department,double salary, String designation){
            super(EmployeeID,name,department,salary,designation);
        }

        public double addBonus(double salary){
            return salary += 300;
        }

        public String toString(){
            return super.toString() + "\n" + "Salary after adding the Bonus is : " + addBonus(getSalary());
        }
}
