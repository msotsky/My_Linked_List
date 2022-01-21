public class MyLinkedList {
		Node head;
		int length;
		
		MyLinkedList(){
			head = null;
			length = 0;
		}
	
		private static class Node{
			Object data;
			Node next;
			
			Node(Object data){
				this.data = data;
				next = null;
			}
			
			public Node getNext() {
				return this.next;
			}
			
			public void setNext(Node nextRef) {
				this.next = nextRef;
			}
			
			public Object getData() {
				return this.data;
			}
		}
		
		public boolean isEmpty() {
			return head==null;
		}
		
		public int getLength() {
			return length;
		}
		
		public void addToFront(Object obj) {
			Node myNode = new Node(obj);
			myNode.setNext(head);
			head = myNode;	
			length++;
		}
		
		public void insertAtEnd(Object obj) {
			if (head == null) {
			      head = new Node(obj);
			    } else {
			      Node current = head;
			      while (current.getNext() != null) {
			        current = current.getNext();
			      }
			      current.setNext(new Node(obj));
			    }
			
			length++;
		} 
		
		 public String toString() {
			    Object obj;
			    String result = "[ ";

			    Node cur = head;

			    while (cur != null) {
			      obj = cur.getData(); // need to add getData method to Node class to get this line to compile
			      result = result + obj.toString() + " ";
			      cur = cur.next;
			    }
			    result = result + "]";
			    return result;
			  }
			
}

