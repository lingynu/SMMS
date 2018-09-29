package Java2;

import java.util.ArrayList;

public class Station {
	private ArrayList<Passenger> people=new ArrayList<>();
	private int stationNumber;
	public Station(int number) {
		stationNumber=number;
	}
	public int getNumber() {
		return stationNumber;
	}
	public void add(Passenger p) {
		people.add(p);
	}
	public boolean hasPeopleWaiting() {
		return people.size()>0;
	}
	public Passenger get(int index) {
		return people.get(index);
	}
	public Passenger remove(int index) {
		return people.remove(index);
	}
	public int peopleWaiting() {
		return people.size();
	}
	public String toString() {
		return people.toString();
	}
}
