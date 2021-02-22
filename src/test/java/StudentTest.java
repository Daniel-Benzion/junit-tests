import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class StudentTest {

	private Student student1, student2;

	@Before
	public void initialize() {
		this.student1 = new Student(12L, "Dan");
		this.student2 = new Student(34L, "Bob");

	}

	@Test
	public void assertInitialization() {
		assertNotNull(student1);
		assertNotNull(student2);
	}

	@Test
	public void assertId() {
		assertEquals(12L, student1.getId());
		assertEquals(34L, student2.getId());
	}

	@Test
	public void assertName() {
		assertEquals("Dan", student1.getName());
		assertEquals("Bob", student2.getName());
	}

	@Test
	public void assertGradesInit() {
		assertNotNull(student1.getGrades());
		assertNotNull(student2.getGrades());
	}

	@Test
	public void assertAddGrade() {
		student1.addGrade(23);
		assertEquals(1, student1.getGrades().size());
		student2.addGrade(24);
		assertEquals((Integer)23, student1.getGrades().get(0));
		assertEquals((Integer)24, student2.getGrades().get(0));
		student1.clearGrades();
		student2.clearGrades();
	}

	@Test
	public void assertClearGrades() {
		student1.addGrade(56);
		student1.addGrade(78);
		student2.addGrade(180);
		student2.addGrade(900);
		assertEquals(2, student1.getGrades().size());
		assertEquals(2, student2.getGrades().size());
		student1.clearGrades();
		student2.clearGrades();
		assertEquals(0, student1.getGrades().size());
		assertEquals(0, student2.getGrades().size());
	}

	@Test
	public void assertGetGradeAverage() {
		student1.addGrade(1);
		student1.addGrade(2);
		student1.addGrade(3);
		student2.addGrade(4);
		student2.addGrade(5);
		student2.addGrade(6);

		assertEquals(2, student1.getGradeAverage(), 0);
		assertEquals(5, student2.getGradeAverage(), 0);
	}

}
