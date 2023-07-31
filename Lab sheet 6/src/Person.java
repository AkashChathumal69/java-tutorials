public class Person {
    public static void main(String[] args) throws Exception {
        Student s=new Student();
        Lecturer l=new Lecturer();
        s.setID(1234);
        s.setName("kamal");
        s.setCourse("Computer Science");
        System.out.println("Student ID is "+s.getID());
        System.out.println("Student Name is "+s.getName());
        System.out.println("Student Course is "+s.getCourse());
        l.setID(5678);
        l.setName("Saman");
        l.setProg("Computer Science");
        System.out.println("Lecturer ID is "+l.getID());
        System.out.println("Lecturer Name is "+l.getName());
        System.out.println("Lecturer Programme is "+l.getProg());
    }
}
