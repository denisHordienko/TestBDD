package feature.salary;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.io.Console;
import java.util.List;

import com.hascode.tutorial.cucumber.salary.Employee;
import com.hascode.tutorial.cucumber.salary.SalaryManager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalarySteps {
	SalaryManager manager;

	@Given("^the salary management system is initialized with the following data$")
	public void the_salary_management_system_is_initialized_with_the_following_data(final List<Employee> employees) throws Throwable {
		manager = new SalaryManager(employees);
	}

	@When("^the boss increases the salary for the employee with id (\\d+) by (\\d+)%$")
	public void the_boss_increases_the_salary_for_the_employee_with_id_by(final int id, final int increaseInPercent) throws Throwable {
		manager.increaseSalary(id, increaseInPercent);
	}

	@Then("^the payroll for the employee with id (\\d+) should display a salary of (\\d+)$")
	public void the_payroll_for_the_employee_with_id_should_display_a_salary_of(final int id, final float salary) throws Throwable {
		Employee nominee = manager.getPayroll(id);
		assertThat(nominee.getSalary(), equalTo(salary));
	}

	@When("^the boss increases the salary for the <user> with id <id> by (\\d+)%$")
	public void the_boss_increases_the_salary_for_the_user_with_id_id_by_(int arg1) throws Throwable {
		//TODO: add Table
	}
	
	@When("^i want save this string to Git$")
	public void save_changes(int arg1) throws Throwable {
		//TODO: add Table
	}
	
	@When("^this also must be re-stored on GIT!!!!$")
	public void save_changes__dsac(int arg1) throws Throwable {
		//TODO: add Table
	}

	@When("^the boss increases the salary for the employee with id '(\\d+)' by (\\d+)%$")
	public void theBossIncreasesTheSalaryForTheEmployeeWithIdBy(int arg0, int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
