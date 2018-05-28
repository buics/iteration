package ITERATIONS.ITERATIONS;

import java.util.List;

public class Backlog_Items {
    
	String final_status; //Select the final status of your iteration if it is complete or Not. If Not proceed
	//to another iteration Ex: Sprint 2.
	List<Setup_Iteration> iteration_list;//Show all the details of Setup_Iteration
	List<Backlog> backlog_list;// Show all the details of the Backlog.
    
	public List<Backlog> getBacklog_list() {
		return backlog_list;
	}

	public void setBacklog_list(List<Backlog> backlog_list) {
		this.backlog_list = backlog_list;
	}
	

}
