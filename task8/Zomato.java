class Zomato
{
	public static double takeOrder(String foodname)
	{
		if(foodname== "Pannerfriedrice")
		{
			return 125.00;
		}
		if(foodname=="MushroomBriyani")
		{
			return 160.00;
		}
		if(foodname=="EggBriyani")
		{
			return 80.00;
		}
		
		if(foodname=="chickenpolipup")
		{
			return 120.00;
		}
		
		if(foodname== "ChocolateIceCream")
		{
			return 60.00;
		}if(foodname=="Bisibelibath")
		{
			return 70.00;
		}if(foodname=="IdliWada")
		{
			return 50.00;
		}if(foodname=="Gobi")
		{
			return 80.00;
		}if(foodname=="ChickenGababa")
		{
			return 180.00;
		}if(foodname=="LavaCake")
		{
			return 69.00;
		}if(foodname=="ButterChicken")
		{
			return 199.00;
		}if(foodname=="ChickenChops")
		{
			return 160.00;
		}if(foodname=="GulabJamun")
		{
			return 30.00;
		}if(foodname=="Prawnfry")
		{
			return 230.00;
		}if(foodname=="Egghurji")
		{
			return 70.00;
		}
		else
		{
			System.out.println(foodname +"Not found");
		}
		return 0.0;
	}
}