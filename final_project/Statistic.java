import java.util.ArrayList;

public class Statistic {
	String name;
	String unit;
	ArrayList<Record> records;

	public Statistic(){
		name = "undefined";
		unit = "null";
		records = new ArrayList<Record>();
	}

	public Statistic(String n){
		name = n;
		unit = "null";
		records = new ArrayList<Record>();
	}

	public Statistic(String n, String u){
		name = n;
		unit = u;
		records = new ArrayList<Record>();
	}

	public String getName(){
		return name;
	}

	public String getUnit(){
		return unit;
	}

	public void setName(String n){
		name = n;
	}

	public void setUnit(String u){
		unit = u;
	}

	public void addRecord(Record r){
		records.add(r);
	}

	public void delRecord(int i){
		records.remove(i);
	}

	public String toString(){
		return name + unit + records;
	}

	/*
	public static void main(String args[]){
		System.out.print("Hello");
		Statistic s = new Statistic("heartrate", "bpm");
		s.addRecord(new Record(20181214, 100));
		s.addRecord(new Record(20181214, 119));
		s.delRecord(0);
		System.out.print(s.toString());
	}
	*/
}
