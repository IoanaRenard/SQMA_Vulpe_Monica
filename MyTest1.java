import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTest1 {

	Student student;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Apel setup global");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Apel teardown global");
	}
	
	@Test
	public void testGetMedieNoteCuValoriCorecte() {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		Student student = new Student("Student1",21,note);

		float medieAsteptata = 9.33f;
		
		float medieCalculata = student.getMedieNote();

		assertEquals("Verifica algoritmul. Nu este ok",
				(float)medieAsteptata,
				(float)medieCalculata, 0.005);
	}

}
