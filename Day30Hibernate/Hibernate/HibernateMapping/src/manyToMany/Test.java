package manyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
	@Id
	private int testId;
	private String testName;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(int testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
}
