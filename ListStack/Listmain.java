
public class Listmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListStack<String> stack = new LitsStack<String>();
		stack.push("apple"); stack.push("orange"); stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();

	}

}
