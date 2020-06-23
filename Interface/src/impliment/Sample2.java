
 
package impliment;

 class Sample2 implements Showable2
 {
 	public void show();
 	{
 		System.out.println("from interface showable2");
 	}
 	public void print();
 	{
 		System.out.println("from interface printable")
 	}


 	public static void main(String[] args) 
 	{
 	

 	Sample2 ob= new Sample2();
 	ob.show();
 	ob.print();
 	
    }}
