class TelevisionRunner
{
	public static void main(String tel[])
	{
		System.out.println("main started");
		Television.onOrOff();
		Television.increaseTelevisionVolume();
		Television.decreaseTelevisionVolume();
		System.out.println("main ended");
	}

}