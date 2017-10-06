//Programmer Azhar Syed. email:syedazhar9356@gmail.com
//Use it for free and if possible please do mention my name.:)
//If you love my work ping me.
//Happy programming

class Node
{
	private int data;
	private Node next;

	Node(int data,Node next)
	{
		this.data = data;
		this.next = next;
	}
	void setData(int data)
	{
		this.data = data;

	}
	int getData()
	{
		return data;

	}
	Node getNext()
	{
		return next;

	}
	void setNext(Node next)
	{
		this.next = next;

	}

	static Node getNewNode(int data,Node next)
	{
		Node newNode = new Node(data,next);
		return newNode;
	}
}