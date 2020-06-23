package impliment;

 class Sample implements Printable,Showable
{
	public void show();
	{
		System.out.println("from interface showable");
	}
	public void print();
	{
		System.out.println("from interface printable")
	}


	public static void main(String[] args) 
	{
	

	Sample ob= new Sample();
	ob.show();
	ob.print();
	
   }}
