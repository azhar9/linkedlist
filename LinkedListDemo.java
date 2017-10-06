class LinkedListDemo
{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		for(int i=0;i<5;i++)
			list.add(i);

		list.traverse();
		list.revTraverse(list.getHead());
		System.out.println("Size:"+list.size());
		list.insert(2,500);
		list.insertAtBegin(1000);
		list.deleteEnd();
		list.deleteBegin();
		System.out.println("Position:"+list.search(4));
	}
}