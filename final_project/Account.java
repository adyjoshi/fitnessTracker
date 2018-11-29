import java.util.ArrayList;

public class Account {
	String username;
	String password; //TODO: Encryption Algorithm for Password instead of storing in plain text.
	String email;
	ArrayList<Activity> activities;
	ArrayList<Account> friends;

	public Account(){
		username = "undefined";
		password = "undefined";
		email = "undefined";
		activities = new ArrayList<Activity>();
		friends = new ArrayList<Account>();
	}

	public Account(String u){
		username = u;
		password = "undefined";
		email = "undefined";
		activities = new ArrayList<Activity>();
		friends = new ArrayList<Account>();
	}
	
	public Account(String u, String p){
		username = u;
		password = p;
		email = "undefined";
		activities = new ArrayList<Activity>();
		friends = new ArrayList<Account>();
	}
	
	public Account(String u, String p, String e){
		username = u;
		password = p;
		email = e;
		activities = new ArrayList<Activity>();
		friends = new ArrayList<Account>();
	}
	
	public void setUsername(String u){
		username = u;
	}

	public String getUsername(){
		return username;
	}
}
