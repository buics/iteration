package ITERATIONS.ITERATIONS;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Capacity {

	Integer total_days; //storage variable for the total number of days from the starting date and ending date
	Integer total_hours_estimation; //storage variable for the conversation of total days to total hours.
    
	Setup_Iteration iterate;
	
	
	
	
 public Integer getTotal_days()  {
      
	
  //  DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
   // Date endDate   = df.parse(iterate.end_date);
   // Date startDate = df.parse(iterate.start_date);
    //total_days=(int)((endDate.getTime()-startDate.getTime()) / (1000 * 60 * 60 * 24));
      return total_days;
	}
	public void setTotal_days(Integer total_days) {
		this.total_days = total_days;

    }
	public Integer getTotal_hours_estimation() throws ParseException {
		
			return getTotal_days()*24;
	}
	public void setTotal_hours_estimation(Integer total_hours_estimation) {
		this.total_hours_estimation = total_hours_estimation;
	}

	
}