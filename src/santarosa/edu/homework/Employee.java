/**
 * Employee is a base class for all different Employees's type. 
 * It provides common interfaces that share among employees.
 * 
 * @author	Kim Nguyen
 * @version	%I%, %G%
 * @since 	1.0
 */
package santarosa.edu.homework;

public class Employee implements WorkingRules {
	private String firstName;
	private String lastName;
	private int id;
	private float salary;
	private float basePay;
	private int workHour;

	/**
	 * Employee constructor specifying the employee's first name, last name,
	 * their id and hours of working.
	 * 
	 * @param firstName
	 *            the first name of the employee
	 * @param lastName
	 *            the last name of the employee
	 * @param id
	 *            the identification of the employee
	 * @param workHour
	 *            the number of hours the employee spends on working
	 */
	public Employee(String firstName, String lastName, int id, int workHour) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.workHour = workHour;
	}

	/**
	 * Calculates the amount that the employee should receives every week. The
	 * amount will be set to zero if error occurs.
	 */
	public final void weeklyPay() {

		if (getBasePay() < 8.0) {
			System.out.println("rate is less than minimum wage");
			setSalary(0);
			return;
		}

		if (getWorkHour() > 60) {
			System.out.println("number of hours greater than 60");
			setSalary(0);
			return;
		}

		if (getWorkHour() <= MAX_HOURS) {
			setSalary(getBasePay() * getWorkHour());
		} else {
			int overtime = MAX_HOURS - getWorkHour();
			float baseWage = getBasePay() * getWorkHour();
			float overtimeWage = getBasePay() * OVERTIME_RATE * overtime;
			setSalary(baseWage + overtimeWage);
		}
	}

	/**
	 * Returns the String object that carries the employee's first name
	 * 
	 * @return the string to hold the first name of the employee
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the employee's first name which is one of the mandatory fields
	 * required to construct the Employee object
	 * 
	 * @param firstName
	 *            the string that stores the first name of the employee
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the String object that carries the employee's last name
	 * 
	 * @return the string to hold the first name of the employee
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the employee's last name which is one of the mandatory fields
	 * required to construct the Employee object
	 * 
	 * @param lastName
	 *            the string that stores the last name of the employee
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the integer that holds the employee's identification
	 * 
	 * @return the integer to hold the identification of the employee
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the employee's identification which is one of the mandatory fields
	 * required to construct the Employee object
	 * 
	 * @param id
	 *            the integer that stores the identification of the employee
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the float that holds the employee's salary which shows how much
	 * the employee receives weekly
	 * 
	 * @return the float to hold the weekly payment of the employee
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * Sets the amount that the employee receives every week
	 * 
	 * @param salary
	 *            the float holds the amount that the employee receiving every
	 *            week
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * Returns the float that holds the minimum amount which the employee
	 * receives per hour
	 * 
	 * @return the minimum hourly pay rate which the employee receives
	 */
	public float getBasePay() {
		return basePay;
	}

	/**
	 * Sets the minimum hourly pay rate which the employee receives
	 * 
	 * @param basePay
	 *            the float that holds the minimum amount which the employee
	 *            receives per hour
	 */
	public void setBasePay(float basePay) {
		this.basePay = basePay;
	}

	/**
	 * Returns the number of hours that the employee worked in a week
	 * 
	 * @return the integer that hold the weekly hours which the employee
	 *         committed
	 */
	public int getWorkHour() {
		return workHour;
	}

	/**
	 * Sets the weekly hours that the employee committed
	 * 
	 * @param workHour
	 *            the number of hours that the employee works in a week
	 */
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
}
