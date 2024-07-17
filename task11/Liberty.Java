class Liberty
{
	static String addShoeBrands[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean Shoes(String ShoeBrands)
	{
		System.out.println("Add shoe Brands started");
		boolean isShoeBrandAdded = false;
		if(ShoeBrands != null)
		{
			addShoeBrands[index] = ShoeBrands;
			index++;
			isShoeBrandAdded = true;
		}else
		{
			System.out.println("Shoe Brand is not added");
		}	System.out.println("Add Shoe Brands ended");
		return isShoeBrandAdded;
	}
	public static void getAllShoeBrands()
	{
		System.out.println("--------------------------------------------------------------------------------------------");
		for(String ShoeBrands : addShoeBrands)
		{
			System.out.println("The available shoe brands are: "+ShoeBrands);
		}
	}
	public static boolean updateShorBrands(String oldbrand, String newbrand)
	{
		System.out.println("-------------------------------------------------------------------------------------------");
		boolean isbrandNameUpdated=false;
		for(index=0; index < addShoeBrands.length; index++)
		{
			if(oldbrand == addShoeBrands[index])
			{
			addShoeBrands[index] = newbrand;
			isbrandNameUpdated = true;
			}
		}
	if(isbrandNameUpdated == false)
	{
		System.out.println(oldbrand + "Not found");
	}return isbrandNameUpdated;
	}
	public static boolean deleteShoeBrand(String shoeBrandTobeDeleted){
	System.out.println("deleteShoeBrand Started");
	boolean isShoeBrandDeleted = false;
	int newIndex , oldIndex;
	for(newIndex =0, oldIndex =0 ; oldIndex < shoeBrands.length; oldIndex++ ){
		if (shoeBrands[oldIndex] != shoeBrandTobeDeleted)
		{
			shoeBrands[newIndex] = shoeBrands[oldIndex];
			newIndex++;
		}
}
shoeBrands = Arrays.copyOf(shoeBrands , newIndex);
if (shoeBrands != null){
	isShoeBrandDeleted = true;
}
if(isShoeBrandDeleted == false){
	System.out.println(shoeBrandTobeDeleted +"notFound");
}
System.out.println("deleteShoeBrand ended");
return isShoeBrandDeleted;
}
}
	

