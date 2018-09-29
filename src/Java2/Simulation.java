package Java2;

import java.util.ArrayList;
import java.util.Random;

public class Simulation {
	private Random generator;   
	private ArrayList<Car> cars = new ArrayList<>();   
	private double faresCollected = 0.0;   
	private int milesDriven = 0;   
	private Station[] stations;	   
	public Simulation(Random generator)
	   {	      
	this.generator = generator;	   
	}	   
	public void addCar(Car car) { 
	cars.add(car); 
	}	   
	public double getFares() { 
	return faresCollected; 
	}	   
	public int getMilesDriven() { 
	return milesDriven; 
	}
	   /**
	    * Pick up passengers from a station.
	    * @station the station to load passengers from.
	    * @car the car that we want to load the passengers into.
	    */	   
	public void loadPassengers(Station station, Car car)
	   {	      
	int carDest = car.getDestination();	      	      
	for (int i = station.peopleWaiting() - 1; 
	car.hasRoom() && i >= 0; i--)
	      {	         
	int passDest = station.get(i).getDestination();	         
	if (passDest == carDest)
	         {	            
	car.add(station.remove(i));
	         }	      
	}
	      //Now, anyone else going on the way.	      
	int stationNumber = station.getNumber();	      
	for (int i = station.peopleWaiting() - 1; car.hasRoom() && i >= 0; i--)
	      {	         
	int passDest = station.get(i).getDestination();	         
	if (stationNumber > carDest && passDest < stationNumber && passDest >= carDest ||
	             stationNumber < carDest && passDest > stationNumber && passDest <= carDest)
	         {	            
	car.add(station.remove(i));
	         }
	      }
	   }	   	   
	public void driveAllCars()
	   {	      
	while (cars.size() > 0)
	      {	         
	for (int i = cars.size() - 1; i >= 0; i--)
	         {	            
	Car car = cars.get(i);	            
	loadPassengers(stations[car.getLocation() - 1], car);	            
	car.drive();	            
	car.dropOff();	            
	if (car.hasArrived())
	            {	               
	faresCollected += car.getFares();	               
	milesDriven += car.getMilesDriven();	               
	cars.remove(i);
	            }
	         }
	      }
	   }	   
	   /**
	    * Load a scenario into the simulator.
	    * @param numStations - the number of stations to add.
	    */	   
	public void loadRandomScenario(int numStations)
	   {	      
	stations = new Station[numStations];	      
	faresCollected = 0.0; // no revenue yet	      
	milesDriven = 0;	      
	      // Visit each station; generate a station, cars and passengers	      
	int carID = 1000;	      
	for (int station = 0; station < numStations; station++)
	      {	         
	Station s = new Station(station + 1);	         
	stations[station] = s;	         
	int stationNumber = s.getNumber();	                  
	final int NUM_PASSENGERS = 10 + generator.nextInt(numStations * 3);	         
	for (int pass = 0; pass < NUM_PASSENGERS; pass++)
	         {	            
	int dest = 1 + generator.nextInt(numStations);	            
	while (dest == stationNumber)
	            {	               
	dest = 1 + generator.nextInt(numStations);
	            }	            
	String name = "P#" + station + "-" + pass;          
	s.add(new Passenger(name, dest));
	         }	         
	final int NUM_CARS = NUM_PASSENGERS / 3;	         
	for (int car = 0; car < NUM_CARS; car++)
	         {	            
	int dest = 1 + generator.nextInt(numStations);	            
	while (dest == stationNumber)
	            {	                
	dest = 1 + generator.nextInt(numStations);
	            }	            
	cars.add(new Car(carID++, stationNumber, dest));
	         }
	      }
	   }
	   /**
	    * Calcuate the revenue per mile.
	    */	   
	public double getRevenuePerMile()
	   {	      
	if (milesDriven > 0)
	      {	         
	return faresCollected / milesDriven;
	      }	      
	return 0;
	   }
}
