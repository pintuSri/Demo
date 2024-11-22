import java.util.*;
public class HashMapLoop{
	public static void main(String[] args){
		HashMap<String, Integer> student = new HashMap<>();
		student.put("Sridhar", 37);
		student.put("Manu", 26);
		for(Integer key: student.values()){
			System.out.println(key);
		}
	}
}