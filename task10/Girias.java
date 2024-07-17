class Girias{

static String homeAppliances[]={null,null,null,null,null,null,
null,null,null,null,null,null};

static int index;

public static boolean createHomeAppliances(String homeAppliance){

      boolean isHomeAppliancesAdded=false;
	  if(homeAppliance!=null){
	  homeAppliances[index]=homeAppliance;
	  index++;
	  isHomeAppliancesAdded=true;
	  }else System.out.println("The Home appliances must be added...");
	  
	  return isHomeAppliancesAdded;
	  }
	  
	  public static void getHomeAppliances(){
	  System.out.println("The Home Appliances are");
	  for(String homeAppliance:homeAppliances){
	   System.out.println(homeAppliance);
	   }
	   }
	   }
	  