/*
 * Develop an Single User application that stores Movie reviews that the user views. It will have 2 functions: Add a Movie review and Search for all Reviews on a Movie. 
 * It should be menu driven program where user can make choices and perform the operation. The App should be running continuously until the user wishes to close the application, of course thru' a menu choice. 
 * To Add Review to Movie------>Press 1
 * To Find Review for a movie---> Press 2
 * PS: any other key is considered as exit of the app....
 * */
import java.util.*;
class Movie {
	String movieName;
	String review;
	int rating;
	static int count=0;
	
	Movie IMDB[]= new Movie[10];
	
	public static void main(String[] args) {
		Movie M=new Movie();
		M.Io();
	}
	
	void addreview(String movieName, String review, int rating)
	{
		this.movieName=movieName;
		this.review=review;
		this.rating=rating;
		
		
	}
	
	void Io()
	{
		int choice=0;
		do {
			Scanner sc=new Scanner(System.in);
		System.out.println("Select the choice...\npress 1 for adding review \nfor searching the movie \nAny other key to exit...");
		choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
		System.out.println("Enter a Movie Name: ");
		sc.nextLine();
		String movieName=sc.nextLine();
		
		System.out.println("Enter a review: ");
		String review=sc.nextLine();
		
		System.out.println("Enter a Rating");
		int rating=sc.nextInt();
		this.addreview(movieName,review,rating);
		IMDB[count++]=this;
		break;
		
		case 2:
			System.out.println("Enter a Movie Name: ");
			sc.nextLine();
			String moviename=sc.nextLine();
			this.search(moviename);
			break;
		
		default:
			System.out.println("Invalid Entry");
			
		}
	}while(choice>0);
	
	}
	void search(String movieName)
	{
		for(int i=0; i<IMDB.length; i++)
		{
			if(movieName.equals(IMDB[i].movieName))
			{
				System.out.println(IMDB[i].movieName + IMDB[i].review + IMDB[i].rating);
				break;
			}
			/*else
			{
				System.out.println("Movie Not Found");
			}*/
		}
	}
}

	
	


