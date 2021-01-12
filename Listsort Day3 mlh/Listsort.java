import java.util.*; 
  
public class Listsort 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of strings 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("Hello"); 
        al.add("Everyone"); 
        al.add("Have"); 
        al.add("a"); 
        al.add("Good");
        al.add("Day"); 
         
         System.out.println("List after the use of" + " Collection.sort() :\n" + al);
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al); 
  
        // Let us print the sorted list 
        System.out.println("List after the use of" + " Collection.sort() :\n" + al); 
    } 
} 