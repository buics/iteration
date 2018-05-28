package ITERATIONS.ITERATIONS;

import org.springframework.data.annotation.Id;

public class Setup_Iteration {

	@Id
	String id;
	String iteration_name;//Enter Sprint name ex:Sprint 1 assuming your first Sprint
	String start_date="6/01/2018"; // Enter your starting date of your Sprint
	String end_date  ="6/20/2018"; // Enter your ending date of your Sprints
	
	Capacity capacities; // To get the total hours/days estimation of workloads Ex:  for each story
    	
	public Capacity getCapacities() {
		return capacities;
	}
	public void setCapacities(Capacity capacities) {
		this.capacities = capacities;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIteration_name() {
		return iteration_name;
	}
	public void setIteration_name(String iteration_name) {
		this.iteration_name = iteration_name;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
		
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
	
}
