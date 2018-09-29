package Java2;

import java.util.ArrayList;

public class Car {
	private int idNo;
	private int destination;
	private int location;
	private ArrayList<Passenger> passengers=new ArrayList<>();
	private double faresCollected=0.0;
	private int milesDriven=0;
	final double FARE_PER_MILE=1.0;
	final int MAX_PASSENGERS=3;
	{
	idNo=;
	location=station;
	destination=dest;
	}
	public int getLocation() {
		return location;
	}
	public int getDestination() {
		return destination;
	}
	public boolean hasArrived() {
		return location==destination;
	}
	public boolean hasRoom() {
		return passenger.size()<MAX_PASSENGERS;
	}
	public double getFares() {
		return faresCollected;
	}
	public int getMilesDriven() {
		return milesDriven;
	}
	public void driver() {
		if(location!=destination) {
			milesDriven++;
			faresCollected+=passengers.size()*FARE_PER_MILE;
			location=(location<destination)?location+1:location-1;
		}
	}
	public void dropOff() {
		for(int i=passengers.size()-1;i>=0;i--)
		{
			if(passengers.get(i).getDestination()==location)
			{
				passengers.remove(i);
			}
		}
	}
	public boolean add(Passenger p) {
		if(hasRoom()) {
			passengers.add(p);
			return true;
		}
		return false;
	}
	public String toString() {
		return "Car[idNo="+idNo+",location="+location+",destination="+destination+",passengers="+passengers+"1";
	}
	
}
