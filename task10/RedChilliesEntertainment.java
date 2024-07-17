class RedChilliesEntertainment{


static String movieActors[]={null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addMovieActors(String movieActor){
	boolean isMovieActorNameAdded=false;
	if(movieActor!=null){
		movieActors[index]=movieActor;
		index++;
		isMovieActorNameAdded=true;
	}
	else System.out.println("Please Provide Valid Movie Actor Names......");
	
	return isMovieActorNameAdded;
}

public static void getMovieActors(){
	System.out.println("The Movie Actor Names are");
	for(String movieActor:movieActors){
		System.out.println(movieActor);
	}
}
public static boolean updateMovieActors(String oldMovieActor, String newMovieActor)
	{
		boolean isMovieActorsUpdated=false;
		for(int index=0; index < MovieActors.length ; index++)
		{
			if(oldMovieActor == movieActors[index])
			if(oldMovieActor == movieActors[index])
			{
				MovieActors[index] = newMovieActor;
				isMovieActorUpdated=true;
			}
		}
		if(isMovieActorUpdated == false)
		{
			System.out.println(oldMovieActor + "Not added");
		}return isMovieActorUpdated;
	}
}


