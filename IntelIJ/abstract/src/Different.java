abstract class MyClass {
    abstract void calculate(int i);
}

class Sub1 extends MyClass {

    @Override
    void calculate(int i) {
        System.out.println(i * i);

    }

    void hii()
    {
        System.out.println("this is hii");
    }



}

class Sub2 extends MyClass {

    @Override
    void calculate(int i) {

        System.out.println(i * i * i);

    }
}

class Sub3 extends MyClass {

    @Override
    void calculate(int i) {
        System.out.println(i * i * i * i);
    }
}


public class Different {


    public static void main(String[] args) {

        System.out.println("Using sublcass variables: ");
        Sub1 ob1 = new Sub1();
        Sub2 ob2 = new Sub2();
        Sub3 ob3 = new Sub3();

        ob1.calculate(3);
        ob1.hii();
        ob2.calculate(4);
        ob3.calculate(5);


        System.out.println("Using myclass reference varible : ");
        MyClass ref;
        ref = new Sub1();
        ref.calculate(10);


        ref = new Sub2();
        ref.calculate(20);

        ref = new Sub3();
        ref.calculate(30);
    }
}






