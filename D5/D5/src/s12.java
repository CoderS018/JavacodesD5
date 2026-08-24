import java.util.HashSet;
import java.util.Iterator;
public class s12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		System.out.println("Size of hash before adding element:"+set.size());
		System.out.println("HashSet is empty before value:"+set.isEmpty());
		System.out.println("containing of Hashset before adding element:"+set);
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		set.add(null);
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add(null);
		System.out.println("Size of hash after adding element:"+set.size());
		System.out.println("HashSet is empty after value:"+set.isEmpty());
		System.out.println("containing of Hashset after adding element:"+set);
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}
	}

}
