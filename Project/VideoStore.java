public class VideoStore
{
	Video[] store;
	public VideoStore()
	{
		store =new Video[5];
	}
	public void addVideo(String name)
	{
		store[0]=new Video(name);
		System.out.println("Video"+'"'+ store[0].getName()+'"'+" added successfully");
	}
	public void doCheckout(String name)
	{
		if(store[0].videoName.equals(name))
		{
			store[0].doCheckout();
		}
	}
		public void doReturn(String name)
		{
			if(store[0].videoName.equals(name))
			{
				store[0].doReturn();
			}
		}
		public void ReceiveRating(String name, int rating)
		{
			if(store[0].videoName.contentEquals(name));
			{
				store[0].receiveRating(rating);
			}
			System.err.println("Rating "+'"'+store[0].getRating()+'"'+" has been mapped to the Video "+store[0].getName()+'"');
		}
		public void listInventory()
		{
			System.out.println("------------------------------------------------------");
			System.out.println("Video Name |  Checkout Status | Rating");
			System.out.println(store[0].getName()+"|"+ store[0].getcheckout()+"|"+ store[0].getRating() );
			System.out.println("------------------------------------------------------");
		}
	
}
