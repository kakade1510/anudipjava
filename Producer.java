package MutiThread.com;

public class Producer {

	private int availableproduct=2000;
	
	synchronized public void demand(int demandno)
	{
		System.out.println("available product before demand"+availableproduct);
		try
		{
			if(demandno>availableproduct)
			wait();
			availableproduct-=demandno;
			System.out.println("available product after demand"+availableproduct);	
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	
	synchronized public void supply(int demandno)
	{
		System.out.println("available product before supply"+availableproduct);
		availableproduct+=demandno;
		System.out.println("available product after supply"+availableproduct);
		notify();
}
}