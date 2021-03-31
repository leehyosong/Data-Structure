import java.util.EmptyStackException;
public class ListStack<E> {
	private Node<E> top;
	private int size;
	public ListStack() {
		top = null;
		size = 0;
	}
	public int size() {return size;}
	public boolean isEmpty() {
		Node newNode = new Node(newItem, top);
		top = newNode;
		size++;
	}
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return top.getItem();
	}
	public E pop() {
		if(isEmpty()) throw new EmptyStackException();
		E topItem = top.getItem();
		top = top.getNext();
		size--;
		return topItem;
	 }
	public void print() {
		if(isEmpty()) System.out.print("������ �����.");
		else
			for (Node p = top; p != null; p = p.getNext())
				System.out.print(p.getItem()+"\t");
		System.out.println();
	}

}
