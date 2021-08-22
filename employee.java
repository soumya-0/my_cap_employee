import java.io.*;
public class employee
{ 
	int y[]=new int[3];
	String name[]=new String[3];
	String ad[]=new String[3];
	public void accept()throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter the names");
		for(int i=0;i<3;i++)
			name[i]=br.readLine();
		System.out.println("Enter the year");
		for(int i=0;i<3;i++)
			y[i]=Integer.parseInt(br.readLine());
		System.out.println("Enter the address");
		for(int i=0;i<3;i++)
			ad[i]=br.readLine();
		
	}
	public void display()
	{
		System.out.println("Name"+" "+"Year"+" "+"address");
		for(int i=0;i<3;i++)
			System.out.println(name[i]+"    "+y[i]+"    "+ad[i]);
	}
	public void main(String args[])throws IOException
	{
		employee ob=new employee();
		ob.accept();
		ob.display();
	}
}