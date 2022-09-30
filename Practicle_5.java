class Q
{
   int num;
 public void set(int num)
 {
    System.out.println("producer produced- " +num);
    this.num=num;
 }
 public void get()
 {
    System.out.println("consumer consumed- " +num);
 }
}
class Producer implements Runnable
{
   Q q;
 public Producer(Q q)
 {
   this.q=q;
   Thread t=new Thread(this,"Producer");
   t.start();
 }
 public void run()
 {
   int i=0;
 while(true)
 {
   q.set(i++);
 try{
   Thread.sleep(1000);
 }
 catch(Exception e)
 {

 }
 }
 }
}
class consu implements Runnable
{
  Q q;
 public consu(Q q)
 {
   this.q=q;
   Thread t=new Thread(this,"Consumer");
   t.start();
 }
 public void run()
 {
 while(true)
 {
   q.get();
 try{
  Thread.sleep(1000);
 }
 catch(Exception e)
 {
    
 }
 }
 }
}
public class Practicle_5 {
 public static void main(String[] args) {
 Q q=new Q();
 new Producer(q);
 new consu(q);
 
System.out.println("Prepared by grisha_21CE153");
 }
}


