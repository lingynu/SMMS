package Java2;

public class SimulationTester {
	final int N_RUNS=1000;
	double revenuePerMile=0.0;
	for(int i=0;i<N_RUNS;i++) {
		Simulation sim=new Simulation(new Random(seed:42));
		sim.loadRandomScenario(numStations:30);
		sim.driveAllCars();
		revenuePerMile+=sim.getRevenuePerMile();
	}
	revenuePerMile/=N_RUNS;
	System.out.println("average Revenue per Mile:%,.2f%n",revenuePerMile);
	System.out.println("Expected:%,.2f%n",2.19);
}
