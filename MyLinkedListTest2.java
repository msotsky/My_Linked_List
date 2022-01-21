import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest2 {

	@Test
	//void test() {
	//	fail("Not yet implemented");
	//}
	void isListEmptyWhenNothingIsAdded() {
		MyLinkedList myList = new MyLinkedList();
		assertTrue(myList.isEmpty(), ()->"List should be empty");
	}

	@Test
	void isListLengthZeroForEmptyList() {
		MyLinkedList myList = new MyLinkedList();
		assertEquals(myList.getLength(),0,()->"Length should be zero");
	}
	
	@Test
	void LengthOfListAfterAddingOneElement() {
		MyLinkedList myList = new MyLinkedList();
		myList.addToFront("Help");
		assertEquals(myList.getLength(),1,()->"Length should be one");
	}
	
	@Test
	void LengthOfListAfterAddingOneElementToEnd() {
		MyLinkedList myList = new MyLinkedList();
		myList.insertAtEnd("Me");
		assertEquals(myList.getLength(),1,()->"Length should be one");
	}
	
	@Test
	void whatIsInOurListWhenWeFoolishlyTryToAddSomething() {
		MyLinkedList myList = new MyLinkedList();
		myList.addToFront("Help");
		assertEquals(myList.toString(),"[ Help ]", ()->"The toString method should return the same output noted to the left");
	}
}
