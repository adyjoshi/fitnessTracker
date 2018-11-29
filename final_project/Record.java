public class Record{
	int date;
	int value;

	public Record(){
		date = -1;
		value = -1;
	}

	public Record(int d){
		date = d;
		value = -1;
	}

	public Record(int d, int v){
		date = d;
		value = v;
	}

	public int getDate(){
		return date;
	}

	public int getValue(){
		return value;
	}

	public void setDate(int d){
		date = d;
	}

	public void setValue(int v){
		value = v;
	}
	
	public String toString(){
		return Integer.toString(date) + Integer.toString(value);
	}
}
