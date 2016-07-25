/**
 * Manager is a subclass of Employee class which provides common interfaces 
 * related to the employee's general information.
 * Manager object encapsulates the hours spending on a golf course which is 
 * considered as worked hours.
 * 
 * @author	Kim Nguyen
 * @version	%I%, %G%
 * @since	1.0
 */
package santarosa.edu.homework;

public class Manager extends Employee {
	private int hoursPlayingGolf;

	public Manager(String firstName, String lastName, int id, int workHour) {
		super(firstName, lastName, id, workHour);
		hoursPlayingGolf = 0;
	}

	/**
	 * Returns the number of hours spending on golf course which is considered
	 * as worked hours
	 * 
	 * @return the integer which holds information about the number of hours the
	 *         manager spends on a golf course
	 */
	public int getHoursPlayingGolf() {
		return hoursPlayingGolf;
	}

	/**
	 * Sets the number of hours the manager spends on a golf course which is
	 * considered as worked hours, as well as updates the number of worked hours
	 * 
	 * @param hoursPlayingGolf
	 *            the amount of time, which is calculated in hour, which the
	 *            manager spends on a golf course
	 */
	public void setHoursPlayingGolf(int hoursPlayingGolf) {
		this.hoursPlayingGolf = hoursPlayingGolf;
		setWorkHour(getWorkHour() + getHoursPlayingGolf());
	}

}
