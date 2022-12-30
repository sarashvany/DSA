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
			
			while(nodes<=0) {
			System.out.println("Number of nodes should be postive!");
			System.out.println("Input number of nodes:");
			nodes=scanner.nextInt();
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
			//int length=array.length;
			/*
			int xcoord=random.nextInt(15);
			int ycoord=random.nextInt(15);
			int arr[][]= {{nodes},{2}};
			for(int i=0;i<nodes;i++) {
				System.out.println("x= "+ xcoord);
				System.out.println("y= "+ ycoord);
				for(int j=0;j<i;j++) {
					if(xcoord == arr[j][xcoord] && ycoord == arr[j][ycoord])
					{
						System.out.println("x= "+ xcoord);
						System.out.println("y= "+ ycoord);
					
					}
						
						 // j is set to 0 so the loop starts again
					else 
						System.out.print(arr[i][xcoord] = xcoord);// if the coordinates are unique, we assign them
					System.out.print(arr[i][ycoord] = ycoord);
			}
			
			
		}*/
	}
	}
		}
	}
	}


