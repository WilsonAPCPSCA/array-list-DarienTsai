package thing;
import java.util.ArrayList;

public class emperorsNewGrove {
	/**
	 * to add 7 names to an arraylist
	 * @param u: the list
	 * @param a: a-g are cast names
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * @param g
	 * @return
	 */
	public static ArrayList adder(ArrayList<String> u, String a, String b, String c, String d, String e,String f, String g){
		u.add(a);u.add(b);u.add(c);u.add(d);u.add(e);u.add(f);u.add(g);
		return u;
	}
	
	/**
	 * driver method
	 * @param args: arguments
	 */
	public static void main(String[] args){
		ArrayList<String> init = new ArrayList<String>();
		
		ArrayList<String> emperorCast = adder(init, "Kuzco", "Yzma", "Chaca", "Tipo", "Kronk", "Bucky", "Pacha");
		System.out.println(emperorCast);
	}

}
