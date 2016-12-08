// ArrayList not part of standard class, need to import
import java.util.ArrayList;

public class ArrayLists
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>(); // initialize ArrayList
		System.out.println(a.size()); 
		a.add(3); 
		a.add(4);
		System.out.println(a.size());
		System.out.println(a);
		
		// auto-boxes, making int i reference 
		Integer i = new Integer(5); 
		a.add(i);
		System.out.println(a);
		i = 6;
		System.out.println(a);
		a.add(0, -1); // overloading
		// you must add to right after the previous number, if your array has capacity 10
		// but is only holding [1, 2, 3], you have to add at index 4, cannot add at index 9
		 
		 
		// replaces number at a.size()-1 with 6, there must be something in the spot already 
		a.set(a.size() -1, 6);  
		
		a.remove(0); // removes the number at index 0, there must be something in the place already 
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(2);
		arr.add(0);
		arr.add(-2);
		arr.add(4);
		arr.add(2);
		System.out.println(arr);
		removeNum(arr, 2);
		System.out.println(arr);
		
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("eye");
		strArr.add("abc");
		strArr.add("elephant");
		System.out.println(strArr);
		replaceChar(strArr);
		System.out.println(strArr);


	}
	/** 
	 * takes in an ArrayList of Integer and an int and removes all occurrences of that int 
	 * from the ArrayList
	 * @param ArrayList<Integer> that will be searched and altered
	 * @param int n that will be removed in the ArrayList
	 */
	public static void removeNum(ArrayList<Integer> arr, int n)
	{
		if (arr.size() > 0)
		{
			int index = 0;
			while (index < arr.size()) 
			{
				if (arr.get(index) == n)
				{
					arr.remove(index);
				}
				else
				{
					index++;
				}
			}
		}
	}
	
	/** 
	 * takes in an ArrayList of Strings and replaces all occurrences of the character 'e' 
	 * with 'x' in the Strings in the given ArrayList
	 * @param ArrayList<String> that will be searched and altered
	 * @param char toReplace that is the character that will be replaced
	 */
	 public static void replaceChar(ArrayList<String> arr)
	 {
	 	for (int index = 0; index < arr.size(); index++)
	 	{
	 		String currentStr = arr.get(index);
	 		for (int charIndex = 0; charIndex < currentStr.length(); charIndex++)
	 		{
	 			if (currentStr.substring(charIndex, charIndex + 1).equals("e"))
	 			{
	 				currentStr = currentStr.substring(0, charIndex) + "x" + currentStr.substring(charIndex + 1);
	 			}
	 		}
			arr.set(index, currentStr);
	 	}	
	 }
}