
public class Student {

    static String institute = "ITV";
    private String name;



    public Student( String name) {
        super();

        this.name = name;
    }

    void dislay()
    {
        System.out.println("Name : " + name);
		System.out.println("Institute : "+ institute);
        System.out.println();
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Student s1 = new Student("raj");
        Student s2 = new Student("Kaushik");

        s1.dislay();
        s2.dislay();

//        System.out.println(Student.institute);



    }

}
