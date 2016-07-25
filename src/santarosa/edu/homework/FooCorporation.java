package santarosa.edu.homework;

public class FooCorporation {

	public static void main(String[] args) {
		Employee[] employees = { new Manager("John", "McMillan", 1, 45), new Manager("Melissa", "Montero", 2, 55),
				new Engineer("Eddy", "Lehman", 3, 7), new Engineer("Phillip", "Smith", 4, 42),
				new Engineer("Adam", "Spancer", 5, 38), new Engineer("Sofia", "Stevenson", 6, 44) };

		((Manager) employees[0]).setBasePay(120.0f);
		((Manager) employees[0]).setHoursPlayingGolf(10);

		((Manager) employees[1]).setBasePay(255.50f);
		((Manager) employees[1]).setHoursPlayingGolf(5);

		((Engineer) employees[2]).setBasePay(220.00f);
		((Engineer) employees[2]).setHoursInTraffic(8);

		((Engineer) employees[3]).setBasePay(124.50f);
		((Engineer) employees[3]).setHoursInTraffic(12);

		((Engineer) employees[4]).setBasePay(248.0f);
		((Engineer) employees[4]).setHoursInTraffic(5);

		((Engineer) employees[5]).setBasePay(320.0f);
		((Engineer) employees[5]).setHoursInTraffic(7);

		for (Employee employee : employees) {
			employee.weeklyPay();
			System.out.println(employee.getLastName() + " " + employee.getWorkHour() + " " + employee.getSalary());
		}
	}

}
