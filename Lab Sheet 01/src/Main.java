public class Main {

    public static void main(String[] args) 
    {
        Item n1=new Item(1234,"Colombo");
        System.out.println("Location: "+n1.getLocation());
        System.out.println("Description: "+n1.getDescription());
        
        n1.setLocation(456);
        n1.setDescription("NSBM");
        System.out.println("Location: "+n1.getLocation());
        System.out.println("Description: "+n1.getDescription());
        
        Monster m1=new Monster(789,"Galle");
        System.out.println("Location: "+m1.getLocation());
        System.out.println("Description: "+m1.getDescription());
    }
}




/*PART 02
1. Which of these keywords is used to refer to member of base class from a sub class?
 		b) super

3.	The modifier which specifies that the member can only be accessed in its own class is  
    	b) private 


4.	Which of these is a mechanism for naming and visibility control of a class and its content?
    	b) Packages



5.	Which of the following is correct way of importing an entire package ‘pkg’?
        c) import pkg.*			


6.	Which of these method of class String is used to extract a single character from a String object?
        c) charAt()	

7.	Which of these method of class String is used to obtain length of String object?
    	d) length()


PART 03

1.	Attributes and Behaviors
2.	fields
3.	methods
4.	encapsulation
5.	class
6.	interface, class, extends
7.	abstract class
8.	package
9.	Application Programming Interface

 */
