
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

public class MyTest2 {

	// test fixture
	public static final String NUME = "Gigel";
	public static final int VARSTA = 20;
	public static final ArrayList<Integer> NOTE = new ArrayList<>();

	public Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		NOTE.add(9);
		NOTE.add(10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(NUME, VARSTA, NOTE);
	}

	@Test
	public void testConstructorRightCreareObiect() {

		try {
			Student student = new Student(NUME, VARSTA, NOTE);
			assertNotNull(student);
		} catch (Exception e) {
			fail("Nu trebuia sa primim exceptie pentru valori OK");
		}
	}
	
	@Test
	public void testSetVarstaRight() {
		int varstaModificata = 30;
		//int varstaModificata = VARSTA++;
		//int varstaModificata = student.getVarsta() + 1;
		
		student.setVarsta(varstaModificata);
		
		assertEquals(varstaModificata, student.getVarsta());
		
	}

}
