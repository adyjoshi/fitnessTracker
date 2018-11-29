import java.util.ArrayList;

public class Activity {
	String name;
	ArrayList<Statistic> statistics;
	int favorite;

	public Activity(){
		name = "undefined";
		favorite = -1;
		statistics = new ArrayList<Statistic>();
	}
	
	public Activity(String n){
		name = n;
		favorite = -1;
		statistics = new ArrayList<Statistic>();
	}
	
	public Activity(String n, int f){
		name = n;
		favorite = f;
		statistics = new ArrayList<Statistic>();
	}

	public String getName(){
		return name;
	}

	public int getFavorite(){
		return favorite;
	}

	public void setName(String n){
		name = n;
	}

	public void setFavorite(int f){
		favorite = f;
	}

	public void addStatistic(Statistic s){
		statistics.add(s);
	}

	public void delStatistic(int i){
		statistics.remove(i);
	}
}
