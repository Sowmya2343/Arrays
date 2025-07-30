import java.util.Scanner;
class jackedarray3dimension
{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createarray()
	{
		System.out.println("Enter school count:");
		int sch=sc.nextInt();
		arr=new String[sch][][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the  class count in school:"+(i+1));
		     arr[i]=new String[sc.nextInt()][];
		}
       for(int i=0;i<arr.length;i++)
       {   System.out.println("Inside school:"+(i+1));
    	   //System.out.println("Inside class:"+(i+1));
		for(int j=0;j<arr[i].length;j++)
		{   System.out.println("Inside class:"+(i+1));
			System.out.println("Enter the  student count in class:"+(j+1));
		     arr[i][j]=new String[sc.nextInt()];
		}
       }
          
		 System.out.println("Array created");
	}
	void collectdata()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{  System.out.println("Inside class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
				System.out.println("enter the name of the student no:"+(j+1));
				arr[i][j][k]=sc.next();
			}
		}
		}
		System.out.println("data collected");
		System.out.println("-------------------------");
		
	}
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{   System.out.println("Inside school no:"+(i+1));
			
			for(int j=0;j<arr[i].length;j++)
			{   System.out.println("Inside a class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
				System.out.println(" the name of the student no:"+(j+1)+"is "+arr[i][j][k]);
			
			}
		}
		}
		System.out.println("data displayed");
		System.out.println("-------------------------");
	}
}
public class threedimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jackedarray3dimension j3=new jackedarray3dimension();
		j3.createarray();
		j3.collectdata();
		j3.display();

	}

}