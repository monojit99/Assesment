package basicprograms;

import java.util.Scanner;

public class BatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		Batch sbatch=new Batch();
		//Chose option from the menu
		do {
			System.out.println("1.Create Batch\n2.Display Student Details by batch\n3.Update\n4.Exit");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				//handle the exception
				try {
				sbatch.createBatch();
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				sbatch.displayStudent();
				break;
			case 3:
				//handle the exception
				try {
				sbatch.update();
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.exit(0);
			
			}
		}while(true);

	}

}