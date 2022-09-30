class A1 extends Thread
{
    public void run()


    {
        System.out.println("Hello World by extending Thread class");
    }
}

class A2 implements Runnable
{
    public void run()
    {
        System.out.println("Hello World by implementing runnable interface");

    }
}

public class Practicle_1
{
    public static void main(String[] args)
    {
        A1 obj1=new A1();
        obj1.start();
        A2 obj2=new A2();
        Thread t=new Thread(obj2);
        t.start();
        System.out.println("Prepared by grisha_21CE153");
    }
}