import java.util.Random;

class Odd extends Thread
{

	int arr[]= new int[15];
	Odd(int arr[]) 
	{
		this.arr = arr;
	}
	public void run()
	{
		for(int i=0; i<15; i++)
		{
			if(arr[i] % 2==0)
			{
				System.out.println(this.arr[i]+" is even");
			}
		}
	}
}

class Even extends Thread
{
	int arr[]= new int[15];


	Even(int arr[]) 
	{
		this.arr = arr;
	}
	public void run()
	{
		for(int i=0; i<15; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.println(this.arr[i]+" is odd");
			}
		}
		System.out.println("Prepared by grisha_21CE153");
	}
	
}
class Practicle_2
{
	public static void main(String args[])
	{
		int i;
		int arr[]= new int[15];
		Random r = new Random(); 
		for(i=0; i<arr.length; i++)
		{
			arr[i] = r.nextInt(100);
		}
		Odd obj1 = new Odd(arr); 
		Even obj2 = new Even(arr); 
		obj1.start();
		obj2.start();
	}
}


