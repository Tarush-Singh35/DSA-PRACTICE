package test1;
//API
public class SinglyLinkedList {
	private Node head;
	private int size;
	public SinglyLinkedList() {
		this.size=0;
	}
	
	private class Node{
		private int data;
		private Node nextNode;
		
		public Node(int data){
			this.data=data;
		}
		public Node(){
		}
	}
	public void add(int val)
	{
		Node newBox=new Node(val);
		newBox.nextNode=head;
		head=newBox;
		size++;
	}
	public void display()
	{
		Node trav = new Node();
		trav=head;
		while(trav!=null)
		{
			System.out.print(trav.data+"-->");
			trav=trav.nextNode;
		}
	}
	public void insert(int val,int place)
	{
		Node newBox=new Node(val);
		Node trev1=new Node();
		Node temp=new Node();
		trev1=head;
		//Some loop to move trev
		int count=place;
		while(count>0)
		{
			trev1=trev1.nextNode;
			count--;
		}
		temp=trev1.nextNode;
		trev1.nextNode=newBox;
		newBox.nextNode=temp;
		size++;
	}
	public void remove(int place)
	{
		Node trev=new Node();
		trev=head;
		int count=place-1;
		while(count>0)
		{
			trev=trev.nextNode;
			count--;
		}
		trev.nextNode=trev.nextNode.nextNode;
		size--;
	}
}
