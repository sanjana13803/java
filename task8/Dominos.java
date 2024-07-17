 class Dominos
{
public static double takeOrder(String foodName)
{
if (foodName == "Marghertia")
{
	return 109.00;
}
if (foodName == "PeppyPanner")
{
	return 259.00;
}
if (foodName == "FarmHouse ")
{
	return 259.00;
}
if (foodName == "CheesenCorn ")
{
	return 209.00;
}
if (foodName == "Veg Extravaganza "){
	return 299.00;
}
if (foodName == "Maxican Green Wave"){
	return 259.00;
}
if (foodName == "Pepper Barbecue Chicken"){
	return 249.00;
}
if (foodName == "Chicken Keema Paraaatha Pizza"){
	return 249.00;
}
if (foodName == "Indi Chicken Tikka "){
	return 359.00;
}
if (foodName == "Spiced Double Chicken"){
	return 309.00;
}
if (foodName == "Chicken Dominator"){
	return 3559.00;
}
if (foodName == "Choco lava Cake"){
	return 109.00;
}
if (foodName == "Butterscot…
[9:44 am, 3/7/2024] Rachana Cs: class DominosRunner
{
	public static void main(String []foodname)
	{
		double finalresult=Dominos.takeOrder("Marghertia");
		System.out.println(finalresult);
		double finalresult1=Dominos.takeOrder("PeppyPanner");
		System.out.println(finalresult1);
		double finalresult2=Dominos.takeOrder("FarmHouse");
		System.out.println(finalresult2);
		double finalresult3=Dominos.takeOrder("CheesenCorn");
		System.out.println(finalresult3);
		double finalresult4=Dominos.takeOrder("VegExtravaganza");
		System.out.println(finalresult4);
		double finalresult5=Dominos.takeOrder("ChickenDominator");
		System.out.println(finalresult5);
		double finalresult6=Dominos.takeOrder("XYZ");
		System.out.println(finalresult6);
	}
}
[9:44 am, 3/7/2024] Rachana Cs: class Zepto{
public static double takeOrder(String foodName){
if (foodName == "Homemade ChocolateCake"){
	return 99.00;
}
if (foodName == "Blueberry Oatmeal cake"){
	return 104.00;
}
if (foodName == "Masala Lemonade"){
	return 160.00;
}
if (foodName == "Mint Chaas"){
	return 126.00;
}
if (foodName == "Peri Peri Potato Wedges"){
	return 120.00;
}
if (foodName == "Chessy Wedges"){
	return 220.00;
}
if (foodName == "Magic Masala Wedges"){
	return 180.00;
}
if (foodName == "Tadka Crouton Nachos"){
	return 200.00;
}
if (foodName == "Mexican Potato Nachos"){
	return 190.00;
}
if (foodName == "ToKyo Tossed Veggle"){
	return 130.00;
}
if (foodName == "Schezwan Corn Nuggets"){
	return 108.00;
}
if (foodName == "Thai Fried Strips"){
	return 145.00;
}
if (foodName == "…
 class ZeptoRunner
{

public static void main(String foodName[])
{
System.out.println("Main started");
double value0=Zepto.takeOrder("ToKyo Tossed Veggle");
System.out.println(value0);
double value1=Zepto.takeOrder("Veggle in Chill Garlic Sauce");
System.out.println(value1);
double value2=Zepto.takeOrder("BBQ Chicken SandWich");
System.out.println(value2);
double value3=Zepto.takeOrder("Chilli Paneer");
System.out.println(value3);
double value4=Zepto.takeOrder("Schezwan Corn Nuggets");
System.out.println(value4);
double value5=Zepto.takeOrder("Blueberry Oatmeal cake");
System.out.println(value5);
double value6=Zepto.takeOrder("Masala Lemonade");
System.out.println(value6);
double value7=Zepto.takeOrder("Homemade ChocolateCake");
System.out.println(value7);
System.out.println("Main ended");
}
}