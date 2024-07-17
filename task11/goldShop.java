class goldShop{
static String goldDesighns[] = {"null,null,null,null,null,null,null,null,null,null"};

static int goldIndex;

public static boolean crateGoldDesighns (String goldDesighn)
{
boolean isGoldDesighnCreated =false;
if (goldDesighn !=null)
{
	goldDesighns[goldIndex]= goldDesighn;
	goldIndex++;
	isGoldDesighnCreated =true;
}
	else  System.out.println("only provide a gold desighns ");
	return isGoldDesighnsCreated;
}



 public static void getGold()
 {
	 for(String goldDesighn :goldDesighns)
	 {
		 Syatem.out.println("The availeble gold Desighns are:"+ goldDesighn);
	 }
 }

 public static boolean updategoldDesighn(String oldDesighnName, String newDesighnName)
	{
		boolean isGoldDesighnUpdated=false;
		for(int index=0; index < GoldDesighns.length ; index++)
		{
			if(oldGoldDesighn == goldDesighns[index])
			{
				goldDesighns[index] = newGoldDesighn;
				isGoldDesighnUpdated=true;
			}
		}
		if(isGoldDesighnUpdated == false)
		{
			System.out.println(oldGoldDesighn + "Not added");
		}return isGoldDesighnUpdated;
	}
}