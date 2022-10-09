import java.util.Collections;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

class Array{

		public static void main(String args[]) 
		{
			    
		        
		            LinkedList<Integer> lang = new LinkedList<Integer>();
		            lang.add(8);
		            lang.add(2);
		            lang.add(1);
		            lang.add(6);
		            
		            java.util.Iterator<Integer> it = lang.iterator();
		            Collections.reverse(lang);
		            Collections.sort(lang);
			    while(it.hasNext())
			        System.out.print(it.next() + " ");
		        }
	
}
	
		
		
	
	
