public class Empobj {
    public static void main(String[] args) throws Exception {
        Employee o1=new Employee();
        Employee o2=new Employee();

        o1.setID(123);
        o1.setName("Mr.Bogdan");
        o1.setDesignation("Clerk");

        o2.setID(456);
        o2.setName("Ms.Bird");
        o2.setDesignation("Attendent");

        System.out.println("Employee ID is "+o1.getID());
        System.out.println("Employee Name is "+o1.getName());
        System.out.println("Employee Designation is "+o1.getDesignation());
        System.out.println("Employee ID is "+o2.getID());
        System.out.println("Employee Name is "+o2.getName());
        System.out.println("Employee Designation is "+o2.getDesignation());
        
    }

    }

    /*Exercise 02:

Answer is: 9 & 6

  SuperB class;
First value 2 is assigning to the variable x in setIt() method.Then the value of x is increasing by 1 in the method,increase(). After that in triple() method the variable x is multiplying by 3.Then the present value of x which is 9 returns as the output in the method returnIt().

  SubC class;
First value 2 is assigning to the variable x in setIt() method.Then the value of x is increasing by 1 in the method,increase().After that the increased x value is added to 3 because the triple() method is overriden in subC class. Therefore the final output of the x is 6.

 */
