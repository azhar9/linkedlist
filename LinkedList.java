class LinkedList
{

	private Node head = null;
	private int listSize = 0;

	void add(int data)
	{
		if(head == null)
		{
			Node newNode = Node.getNewNode(data,null);
			head = newNode;
			listSize++;
		}
		else
		{
			Node start = head;
			while(start.getNext()!=null)
			{
				start = start.getNext();
			}

			listSize++;
			Node newNode = Node.getNewNode(data,null);
			start.setNext(newNode);
		}
	}

	void traverse()
	{
		Node start = head;

		while(start!=null)
		{
			System.out.print(start.getData() +" ");
			start = start.getNext();
		}
		System.out.println("\n");
	}

	int size()
	{
		return this.listSize;
	}

	void insert(int pos,int data)
	{
		Node start = head;

		if(pos == 0){
			insertAtBegin(data);
			return;
		}

		if(pos<= size()-1 && pos>0)
		{
			int counter = 0;
			while(counter < pos -1)
			{
				start = start.getNext();
				counter++;
			}
			Node newNode = Node.getNewNode(data,start.getNext());
			start.setNext(newNode);

		}
		else
			System.out.println("ERROR");



	}

	void insertAtBegin(int data)
	{
		if(head == null)
		{
			Node newNode  = Node.getNewNode(data,null);
			head = newNode;
		}
		else
		{
			Node newNode = Node.getNewNode(data,head);
			head = newNode;
		}
	}

	void deleteEnd()
	{
		Node start = head;

		while(start.getNext().getNext()!=null)
		{
			start = start.getNext();
		}
		start.setNext(null);

	}

	void deleteBegin()
	{
		if(head!=null)
		{
			Node start = head;
			Node prev = null;

			if(start.getNext() == null)
				head = null;

			else
			{
				prev = start;
				start = start.getNext();

				prev.setNext(null);
				head = start;
			}
		}
		else
			System.out.println("ERROR");
	}

	void delete(int pos)
	{
		if(pos < size() && pos>=0)
		{
			Node start = head;
			Node prev = null;

			int counter = 0;
			while(counter < pos)
			{
				prev = start;
				start = start.getNext();
				counter++;
			}

			prev.setNext(start.getNext());
			start.setNext(null);
		}
		else
			System.out.println("ERROR");

	}

	int search(int num)
	{
		if(head !=null)
		{
		  Node start = head;
		  int index = 0;
		  while(start!=null)
		  {
			if(start.getData() == num)
			{
				return index;
			}
			index++;
			start = start.getNext();
		 }
	}


		return -1;

	}

	void revTraverse(Node start)
	{
		if(start!=null)
		{
			revTraverse(start.getNext());
			System.out.print(start.getData()+" ");
		}

	}

	Node getHead()
	{
		return this.head;
	}
	
}