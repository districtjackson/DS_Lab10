import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTreeTest {

	BSTree tree1;
	BSTree tree2;
	BSTree tree3;
	BSTree tree4;
	BSTree tree5;
	BSTree tree6;
	BSTree tree7;
	
	Integer num3;
	Integer num8;
	Integer num12;
	Integer num16;
	Integer num1;
	
	List<Integer> list;
	
	
	@BeforeEach
	void setUp() throws Exception 
	{
		tree1 = new BSTree();
		tree2 = new BSTree();
		tree3 = new BSTree();
		tree4 = new BSTree();
		tree5 = new BSTree();
		tree6 = new BSTree();
		tree7 = new BSTree();
		
		num3 = 3;
		num8 = 8;
		num12 = 12;
		num16 = 16;
		num1 = 1;
		
		
	}

	@Test
	void testTree() 
	{
		assertTrue(tree1.isEmpty());
		assertEquals(0, tree1.getSize());
		assertNull(tree1.largest());
		
		assertTrue(tree1.myEquals(tree2));
		
		
		tree1.insert(num12);
		tree2.insert(num12);
		assertEquals(1, tree1.getSize());
		assertEquals(0, tree1.retrieveDepth(num12));
		assertEquals(num12, tree1.retrieve(num12));
		assertFalse(tree1.isEmpty());
		assertEquals(num12, tree1.largest());
		assertTrue(tree1.myEquals(tree2));
		
		tree1.insert(num8);
		tree2.insert(num8);
		assertEquals(2, tree1.getSize());
		assertEquals(1, tree1.retrieveDepth(num8));
		assertEquals(num8, tree1.retrieve(num8));
		assertEquals(num12, tree1.largest());
		assertTrue(tree1.myEquals(tree2));
		
		tree1.insert(num3);
		tree2.insert(num3);
		assertEquals(3, tree1.getSize());
		assertEquals(2, tree1.retrieveDepth(num3));
		assertEquals(num3, tree1.retrieve(num3));
		assertEquals(num12, tree1.largest());
		assertTrue(tree1.myEquals(tree2));
		
		tree1.insert(num16);
		tree2.insert(num16);
		assertEquals(4, tree1.getSize());
		assertEquals(1, tree1.retrieveDepth(num16));
		assertEquals(num16, tree1.retrieve(num16));
		assertEquals(num16, tree1.largest());
		assertTrue(tree1.myEquals(tree2));
		
		tree1.insert(num1);
		tree2.insert(num1);
		assertEquals(5, tree1.getSize());
		assertEquals(3, tree1.retrieveDepth(num1));
		assertEquals(num1, tree1.retrieve(num1));
		assertTrue(tree1.myEquals(tree2));
		
		list = tree1.toList();	
		assertEquals(num1, list.get(0));
		assertEquals(num3, list.get(1));
		assertEquals(num8, list.get(2));
		assertEquals(num12, list.get(3));
		assertEquals(num16, list.get(4));
		
		assertEquals(num16, tree1.largest());
		assertEquals(40, tree1.sum());
		
		tree3.insert(100);
		tree3.insert(200);
		tree3.insert(300);
		tree3.insert(400);
		tree3.insert(500);
		
		assertEquals(1500, tree3.sum());
		assertEquals(500, tree3.largest().intValue());
		
		
		assertTrue(tree1.myEquals(tree2));
		assertFalse(tree1.myEquals(tree3));
		assertFalse(tree1.myEquals(tree4));
		assertFalse(tree4.myEquals(tree1));
		
		
		tree4.insert(4);
		tree4.insert(12);
		tree4.insert(9);
		tree4.insert(23);
		tree4.insert(18);
		tree4.insert(24);
		tree4.insert(50);
		tree4.insert(1);
		tree4.insert(13);
		tree4.insert(21);
		tree4.insert(43);
		tree4.insert(34);
		tree4.insert(44);
		tree4.insert(45);
		tree4.insert(29);
		tree4.insert(31);
		tree4.insert(8);
		
		assertEquals(409, tree4.sum());
		
		tree5.insert(4);
		tree5.insert(12);
		tree5.insert(9);
		tree5.insert(23);
		tree5.insert(18);
		tree5.insert(24);
		tree5.insert(50);
		tree5.insert(1);
		tree5.insert(13);
		tree5.insert(21);
		tree5.insert(43);
		tree5.insert(34);
		tree5.insert(44);
		tree5.insert(45);
		tree5.insert(29);
		tree5.insert(31);
		tree5.insert(8);
		
		assertTrue(tree4.myEquals(tree5));
		
		tree5.insert(2);
		assertFalse(tree4.myEquals(tree5));
		
		assertFalse(tree4.myEquals(tree1));
		assertFalse(tree4.myEquals(tree3));
		
		tree6.insert(4);
		tree6.insert(12);
		tree6.insert(9);
		tree6.insert(23);
		tree6.insert(18);
		tree6.insert(24);
		tree6.insert(50);
		tree6.insert(1);
		tree6.insert(13);
		tree6.insert(21);
		tree6.insert(43);
		tree6.insert(29);
		tree6.insert(44);
		tree6.insert(45);
		tree6.insert(34);
		tree6.insert(31);
		tree6.insert(8);
		
		assertFalse(tree4.myEquals(tree6));
		
		tree7.insert(4);
		tree7.insert(12);
		tree7.insert(9);
		tree7.insert(23);
		tree7.insert(18);
		tree7.insert(24);
		tree7.insert(50);
		tree7.insert(1);
		tree7.insert(21);
		tree7.insert(43);
		tree7.insert(34);
		tree7.insert(44);
		tree7.insert(45);
		tree7.insert(29);
		tree7.insert(31);
		tree7.insert(8);
		
		assertFalse(tree4.myEquals(tree7));
		
	}

}


















