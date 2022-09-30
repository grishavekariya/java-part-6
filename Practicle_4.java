public class Practicle_4 extends Thread {
    public void run() {
    }
    public static void main(String[] args) 
    {
    Practicle_4 FIRST = new Practicle_4();
    Practicle_4 SECOND = new Practicle_4();
    Practicle_4 THIRD = new Practicle_4();
    FIRST.setPriority(3);
    SECOND.setPriority(5);
    THIRD.setPriority(7);
    System.out.println("Priority of FIRST Thread:" +FIRST.getPriority());
    System.out.println("Priority of SECOND Thread:" +SECOND.getPriority());
    System.out.println("Priority of THIRD Thread:" +THIRD.getPriority());
    
    System.out.println("Prepared by grisha_21CE153");
     }
    }