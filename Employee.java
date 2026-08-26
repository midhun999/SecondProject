public class Employee   {

    public static void main(String[] args)  {

        System.out.println("This is Employee class file");
        System.out.println("Hi");
        System.out.println("Third line");
    }

    void m1()	{

	System.out.println("PR1");

    }

    public static void sum()	{

        int a = 10;
        int b = 10;
        int c = a + b;
        System.out.println(c);
        System.out.println("Method Executed  -> act as dev 2 from local");
        System.out.println("Bye -- added in GitHub act as dev 1");

    }

    void m2()	{

	System.out.println("New method m2 added from local");

    }

    public void sub()   {

        int a = 10;
        int b = 20;
        int c = a - b;

        System.out.println(c);

    }

    public void div()   {

        int a = 5, b = 5;
        int c = a / b;

        System.out.println(c);
    }
    
    public void mul()   {
        int a = 10, b = -6;
        int c = a * b;

        System.out.println("Multiplication : " + c);
    }

    public void mod()   {

        int a = 10;
        int b = 3;
        int c = a % b;

        System.out.println("Hello");
    }

    public void pow()   {
        int a = 10;
        int b = 20;
        double c = Math.pow(a, b);

        System.out.println(c);
        System.out.println("Bye");
        System.out.println("Pow method executed");
    }

}
