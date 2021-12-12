
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

public class MyTest2 {

	Student student;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Apel setup");
		
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		student = new Student("Gigel",21,note);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Apel setup global");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Apel teardown global");
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
