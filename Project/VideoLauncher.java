import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int choice;
		VideoStore vs=new VideoStore();
		do
		{
			System.out.println("Main \n==========");
			System.out.println("1. Add Video:");
			System.out.println("2. Checkout Video:");
			System.out.println("3. Return Video:");
			System.out.println("4. Receive Rating:");
			System.out.println("5. List Inventory:");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice");
			choice=ss.nextInt();
			switch(choice)
			{
			case 1: System.out.print("Enter the name of the video you want to add:");
			             String c=ss.next();
			             vs.addVideo(c);
			             break;
			case 2:System.out.print("Enter the name of the video you want to check out:");
			            vs.doCheckout(ss.next());
			            break;
			case 3:System.out.print("Enter the Name of the video you want to Return:");
			            vs.doReturn(ss.next());
			            break;
			case 4:System.out.print("Enter the name of the video you want to rate ");
			           System.out.print("Enter the rating for this video");
			           vs.ReceiveRating(ss.next(),ss.nextInt());
			case 5:vs.listInventory();
			           break;
			case 6:System.out.println("Exiting!!!!!!  Thanks for using this application");
			           System.exit(1); 
			           break;
			
			}
		}while(!(choice==6));

	}

}
