import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTreeTest {

	BSTree tree1;
	BSTree tree2;
	
	Integer numA;
	Integer numB;
	Integer numC;
	Integer numD;
	Integer numE;
	
	
	@BeforeEach
	void setUp() throws Exception 
	{
		tree1 = new BSTree();
		tree2 = new BSTree();
		
		numA = 3;
		numB = 8;
		numC = 12;
		numD = 16;
		numE = 1;
		
		
	}

	@Test
	void testTree() 
	{
		assertNull(tree1.isEmpty());
		
		tree1.insert(numB);
		assertEquals(1, tree1.getSize());
		assertEquals(0, tree1.retrieveDepth(numB));
		
		
	}

}
