import java.util.Scanner;

public class MovieDriver {
	public static void main(String[]args) {
		
	
	
	boolean wanttocontinue = true;	
	while(wanttocontinue == true) {
	Scanner movie = new Scanner(System.in);	
	
	System.out.println("Enter the name of a movie:");
	String nameofmovie = movie.nextLine();
	
	
	System.out.println("Enter the rating ot the movie: ");
	String ratingofmovie = movie.nextLine();
	
	System.out.println("Enter the Number of tickets sold for this movie: ");
	int numberoftickets = movie.nextInt();
	
	
	System.out.println(nameofmovie + " (" + ratingofmovie + "):" + " Tickets Sold: " + numberoftickets);
	
	System.out.println("Do you want to enter another? (y or n): ");
	String tocontinue = movie.next();
	
	if (tocontinue.equals("y")) {
		continue;
	}else if(tocontinue.equals("n")) {
	System.out.println("Goodbye");
	break;
		
	}
	}
	
}
}