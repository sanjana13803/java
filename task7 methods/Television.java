class Television
{

	static boolean isConnected;
	static int currentTelevisionVolume;
	static int minTelevisionVolume;
	static int maxTelevisionVolume = 10;

	public static void onOrOff()
	{
		System.out.println("onOrOff() started");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Television Turned on");
		}else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Television Turned off");
		}
		System.out.println("onOrOff() ended");
		return;
	}
	
	public static void increaseTelevisionVolume()
	{
		System.out.println("increaseTelevisionVolume() started");
		if(isConnected == true)
		{
			if(currentTelevisionVolume < maxTelevisionVolume)
			{
				currentTelevisionVolume = currentTelevisionVolume + 1;
				System.out.println("The current Television Volume is " + currentTelevisionVolume);
			}else
			{
				System.out.println("Television Max Volume Reached");
			}
		}else
		{
			System.out.println("Gubee... Television na On Maadu...");
		}
		
		System.out.println("increaseTelevisionVolume() ended");
		return ;
		
	}

public static void decreaseTelevisionVolume()
{
	System.out.println("decreaseTelevisionVolume() started");
	if(isConnected == true)
	{
		if(currentTelevisionVolume > minTelevisionVolume)
		{
			currentTelevisionVolume = currentTelevisionVolume - 1;
			System.out.println("The current television volume is" + currentTelevisionVolume);
		}else
		{
			System.out.println("Television Min volume reached");
		}
		System.out.println("Gubee... Television na On Maadu...");
			}
		
		System.out.println("decreaseTelevisionVolume() ended");
		return ;
		
	}
		
			
}