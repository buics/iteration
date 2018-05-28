package ITERATIONS.ITERATIONS;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Setup_Iteration_Controller {

	@RequestMapping("/iterate")
	
	public long getTotal_days() throws ParseException 
	{
		int total_days;
	   Setup_Iteration i = new Setup_Iteration();
		//Capacity c = new Capacity();
		   DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
	       Date endDate   = df.parse(i.end_date);
	       Date startDate = df.parse(i.start_date);
	      total_days=Math.round((int)((endDate.getTime()-startDate.getTime()) / (1000*24*60*60)));
	   //    total_days=Math.abs((int)((endDate.getTime())-startDate.getTime())/1000 * 60*60*24);
	     return total_days;
	}
	@RequestMapping("/iterates")
	public Integer Total_Hours_Estimation() throws ParseException 
	{
		
	      return (int) (getTotal_days()*24);
	}
	
}
