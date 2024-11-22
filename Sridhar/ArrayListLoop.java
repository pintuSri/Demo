import java.util.*;
public class ArrayListLoop{
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<>();
		names.add("Sridhar");
		names.add("Shankar");
		names.add("Sharan");
		names.add("Shiva");
		names.add("Shaara");
		System.out.println(names);
		
		for(int i=0; i<names.size(); i++){
			System.out.println(names.get(i));
		}
	}
}