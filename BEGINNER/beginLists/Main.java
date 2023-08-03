package beginLists;

/**
 * @author amarjeet
 *
 */
public class Main{
	public static void main(String[] args) {
		var list = new LinkedList();
		list.addLast(45);
		list.addLast(35);
		list.addLast(12);
		list.addFirst(55);
		list.addFirst(65);
		list.print();
		list.deleteLast();
		list.print();
		list.deleteFirst();
		list.print();
		list.add_afterValue(45,32);
//		list.add_afterValue(12,69);
		list.deleteLast();
		list.print();
		list.add_atIndex(2, 69);
		list.print();
		System.out.println(list.contains(55));
		System.out.println(list.contains(25));
		System.out.println(list.indexOf(35));
		System.out.println(list.size());
		
	}
}