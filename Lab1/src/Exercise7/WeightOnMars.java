package Exercise7;

public class WeightOnMars {
	
	double mass;
	
	public WeightOnMars(double mass){
		this.mass = mass;
	}
	
	void setMass(double mass) {
		this.mass = mass;
	}
	
	public void calculateWeight() {
		double earthWeight = mass * 9.80665;
		double marsWeight = mass * 3.711;

		System.out.println("Mass: "+ mass +"kg\nWeight on Earth: " + earthWeight +"N\nWeight on Mars: "+ marsWeight +"N");
		System.out.println("Mass: "+ mass +"kg\nWeight on Earth: " + earthWeight +"N\nWeight on Mars: "+ marsWeight +"N\n");
	}
	
}