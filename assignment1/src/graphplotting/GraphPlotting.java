package graphplotting;
import java.util.Random;
import java.util.Scanner;

public class GraphPlotting {
	public static int remdupval(int a[],int length) /*to remove duplicate values*/ {
		//check if length is equal 0 or 1
		if(length==0||length==1) {
			return length;
		}
		return 0;
	}

	public static void main(String[] args) {
	    
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Input number of nodes:");
			int nodes =scanner.nextInt();
			
			//check if number of nodes is a positive number
			
			if(nodes>=0) //if nodes greater or equal to 0
			{
				System.out.println("Number of nodes is a positive number");
				System.out.println("Proceed!");
			}
			else {
				System.out.println("Number of nodes should be a positive number!");
				}
		
			Random random=new Random();  //create a random class
			int array[]= {random.nextInt(15)};  //array storing 15 random value
			int length=array.length;
			length=remdupval(array,length);
			
			for(int i=0;i<nodes;i++) {
			
				for(int j=0;j<length;j++) {
					
			System.out.println("Print random values for:");  
			int x=random.nextInt(15);	//x-nodes
			System.out.println("x= "+ x);
		
			int y=random.nextInt(15);  //y-nodes
			System.out.println("y= "+ y);
			System.out.println("Nodes "+ i +":("+x+","+y+")");  
			}
			
			
		}
	}
	}
	}


