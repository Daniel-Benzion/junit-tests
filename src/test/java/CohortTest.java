import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CohortTest {

	private Cohort cohort;
	private Student student1;
	private Student student2;

	@Before
	public void initialize() {
		this.cohort = new Cohort();
		student1 = new Student(12L, "Daniel");
		student2 = new Student(34L, "Bob");
	}

	@Test
	public void assertInit() {
		assertNotNull(cohort);
	}

	@Test
	public void assertList() {
		assertNotNull(cohort.getStudents());
	}

	@Test
	public void assertAddStudent() {
		cohort.addStudent(student1);
		assertEquals(1, cohort.getStudents().size());
		cohort.addStudent(student2);
		assertEquals(2, cohort.getStudents().size());
		cohort.clearCohort();
	}

	@Test
	public void assertClear() {
		cohort.addStudent(student1);
		assertEquals(1, cohort.getStudents().size());
		cohort.clearCohort();
		assertEquals(0, cohort.getStudents().size());
	}

	@Test
	public void assertGetAverage() {
		cohort.addStudent(student1);
		cohort.addStudent(student2);
		student1.addGrade(1);
		student2.addGrade(2);
		student1.addGrade(3);
		student2.addGrade(4);
		assertEquals(2.5, cohort.getCohortAverage(), 0);
	}
}
