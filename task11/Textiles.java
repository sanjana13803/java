class Textiles
{
	static String addMaterials[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean Materials(String Texture)
	{
		System.out.println("Texture added started");
		boolean isnameAdded=false;
		if(Texture != null)
		{
			addMaterials[index] = Texture;
			index++;
			isnameAdded =true;
		}else
		{
			System.out.println("Texture name is not added");
		}   System.out.println("Texture added ended");
		return isnameAdded;
	}
	public static void getAllMaterialinfo()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		for(String Texture : addMaterials)
		{
			System.out.println("The available textute are: "+ Texture);
		}
	}
	public static boolean updateTexture(String oldname, String newname)
	{
		System.out.println("--------------------------------------------------------------------------------------");
		boolean isNameUpdated = true;
		for(index=0; index < addMaterials.length; index++)
		{
			if(oldname == addMaterials[index])
			{
				addMaterials[index] = newname;
				isNameUpdated = true;
			}
		}
		if(isNameUpdated = false)
		{
			System.out.println(oldname + "Not found");
		}return isNameUpdated;
	}
}