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



}
