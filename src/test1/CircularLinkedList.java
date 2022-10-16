package test1;
//API
public class CircularLinkedList {
	//Will require Tail
	private Node head;

	private class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
		}
		public Node()
		{
			
		}
	}
	
	public void add(int val)
	{
		Node newBox=new Node(val);
		if(head!=null)
		{
			Node trev=new Node();
			trev=head;
			while(trev!=null)
			{
				trev=trev.next;
			}
			newBox.next=head;
			trev=newBox;
			head=newBox;
		}else
		{
			newBox.next=head;
			head=newBox;
		}
	}
	public void display() {
		Node trev=new Node();
		trev=head;
		while(trev!=null)
		{
			System.out.print("-->"+trev.data);
			trev=trev.next;
		}
	}
}
