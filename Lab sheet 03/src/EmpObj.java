public class EmpObj {
    public static void main(String[] args) throws Exception {
        Employee b1=new Employee();
        b1.setName("Bogdan");
        b1.setBsal(50000);  
    
        System.out.println("Employee Name :"+b1.getName());
        System.out.println(("Basic salary:"+b1.getBsal()));

        b1.bonus(10000.00f);
    }
}
