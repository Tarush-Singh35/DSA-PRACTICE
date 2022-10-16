package test1;
//API
public class DoublyLinkedList {
	private Node head;

	private class Node{
		private Node next;
		private Node previous;
		private int data;
		
		public Node(int data){
			this.data=data;
		}
		public Node()
		{
			
		}
	}
	
	public void add(int val)
	{
		Node newBox=new Node(val);
		newBox.next=head;//Call by value
		if(head!=null)
		{
			head.previous=newBox;//can cause null pointer
		}
		head=newBox;
	}
	public void insert(int val,int place)
	{
		Node newBox=new Node(val);
		Node trev = new Node();
		Node temp = new Node();
		trev=head;
		int count=place;
		while(count>0)
		{
			trev=trev.next;
			count--;
		}
		temp=trev.next;
		newBox.next=temp;
		newBox.previous=trev;
		trev.next=newBox;
		temp.previous=newBox;
	}
	public void display()
	{
		Node trev = new Node();
		Node last = new Node();
		trev=head;
		while(trev!=null)
		{
			System.out.print(trev.data+"<=>");
			last=trev;
			trev=trev.next;
		}
		System.out.println("Reverse Printing");
		while(last!=null)
		{
			System.out.print(last.data+"<=>");
			last=last.previous;
		}
	}
	public void remove(int place)
	{
		Node trev = new Node();
		Node temp1 = new Node();
		Node temp2 = new Node();
		int count=place;
		trev=head;
		while(count>0)
		{
			trev=trev.next;
			count--;
		}
		temp1=trev.previous;
		temp2=trev.next;
		temp1.next=temp2;
		temp2.previous=temp1;
	}
	public void reversal()
	{
		
	}
}
