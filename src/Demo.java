public class Demo {
    public static void main(String[] args) {
        Manager a = new Manager("E001","Mark","HR",15000,"Manager");
        System.out.println(a);
        System.out.println();
        Manager b = new Manager("E012","Peter","R&D",15000,"Manager");
        System.out.println(b);
        System.out.println();
        Clerk c = new Clerk("E056","Samuel","Accounts",10000,"Clerk");
        System.out.println(c);
    }
}
