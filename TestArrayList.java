
public class TestArrayList {
	public static void main(String[] arg) {
		ArrayList<Character> s = new ArrayList();
		s.add(0, 'A');
		s.add(0, 'B');
		System.out.println(s.get(1));
		//s.set(2, 'C');
		System.out.println("s.set(2, 'C') = error");
		s.add(2, 'C');
		//s.add(4, 'D');
		System.out.println("s.add(4, 'D') = error");
		System.out.println(s.remove(1));
		s.add(1, 'D');
		s.add(1, 'E');
		//System.out.println(s.get(4));
		System.out.println("s.get(4) = error");
		s.add(4, 'F');
		System.out.println(s.set(2, 'G'));
		System.out.println(s.get(2));
		
		
	}
}
