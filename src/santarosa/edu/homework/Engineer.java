/**
 * Engineer is a subclass of Employee which provides common interfaces 
 * related to the employee's general information.
 * Engineer object encapsulates the number of hours spending in traffic 
 * which is calculated as worked hours.
 * 
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */
package santarosa.edu.homework;

public class Engineer extends Employee {
	private int hoursInTraffic;

	/**
	 * Engineer constructor specifying the engineer's first name, last name,
	 * their id and hours of working.
	 * 
	 * @param firstName
	 *            the first name of the engineer
	 * @param lastName
	 *            the last name of the engineer
	 * @param id
	 *            the identification of the engineer
	 * @param workHour
	 *            the number of hours the engineer spends on working
	 */
	public Engineer(String firstName, String lastName, int id, int workHour) {
		super(firstName, lastName, id, workHour);
		setHoursInTraffic(0);
	}

	/**
	 * Returns the number of hours the engineer spends in traffic which is
	 * considered as worked hours
	 * 
	 * @return the integer that holds the number of hours the engineer spends in
	 *         traffic
	 */
	public int getHoursInTraffic() {
		return hoursInTraffic;
	}

	/**
	 * Sets the number of traffic hours which is calculated as worked hours, as
	 * well as updates the number of worked hours
	 * 
	 * @param hoursInTraffic
	 *            the number of hours the engineer spends in traffic
	 */
	public void setHoursInTraffic(int hoursInTraffic) {
		this.hoursInTraffic = hoursInTraffic;
		setWorkHour(getHoursInTraffic() + getWorkHour());
	}

}
