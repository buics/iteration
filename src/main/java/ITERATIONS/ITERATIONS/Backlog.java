package ITERATIONS.ITERATIONS;

public class Backlog {
	
	String story_name;// Assuming that you will create a title of your story
	
	Activity activities; // It will create/add activities from your story.

	public Activity getActivities() {
		return activities;
	}

	public void setActivities(Activity activities) {
		this.activities = activities;
	}

	public String getStory_name() {
		return story_name;
	}

	public void setStory_name(String story_name) {
		this.story_name = story_name;
	}
	

}
