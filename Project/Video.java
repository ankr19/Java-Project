
public class Video
{
	String videoName;
	boolean checkout;
	int rating;
	Video(String name)
	{
		videoName=name;
	}
	String getName()
	{
		return videoName;
	}
	void doCheckout()
	{
		System.err.println("Video "+'"'+getName()+'"'+" checkout successfully");
	}
	void doReturn()
	{
		checkout=true;
		System.err.println("Video "+'"'+getName()+'"'+"return successfully");
	}
	void receiveRating(int rating)
	{
		this.rating=rating;
	}
	int getRating()
	{
		return rating;
	}
	 boolean getcheckout()
	{
		return checkout;
	}
}





