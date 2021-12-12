import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

public class MyTest1 {

	Student student;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Apel setup global");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Apel setup");
		
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		student = new Student("Gigel",21,note);
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
	
	@Test
	public void testGetMedieNoteFaraNote() {
		
			ArrayList<Integer> note = new ArrayList<>();
			student.setNote(note);
		
			float medieAsteptata = 0;
			
			float medieCalculata = student.getMedieNote();
			
			assertEquals("Test medie fara note", medieAsteptata,
					medieCalculata, 0);
				
	}

}
