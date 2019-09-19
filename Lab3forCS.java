package cs115;
import java.util.*;
import java.lang.*;


public class Lab3forCS {
 public static void main(String[] args) {
//Question 1-3	 
	 BitSet bits1=new BitSet();       /*     THIS CREATE THE OBJECT bits1 and bits2         */ 
	 BitSet bits2=new BitSet() ;      /*             */
      bits1.set(2);     // To set the third place as 1
      bits1.toString(); 
      System.out.println("the value of bits1 is "+bits1);
      
      bits2.set(1);    // To set the second place as 1
      bits2.toString(); 
      System.out.println("The value of bits2 is"+bits2);
      
      bits1.or(bits2);
 
      //Question 4
      Scanner scan= new Scanner(System.in) ;  
      
     //Question 5
      System.out.println("Enter the length for your rectangle(integer only) ");
      int L=scan.nextInt();
      System.out.println("Enter the width for your rectangle (integer only) ");
      int W=scan.nextInt() ;  
      int area=L*W ; 
      System.out.println("The area of the rectangle is "+area );
      
      System.out.println("\n");
      
      //Question 6
      System.out.println("Enter the radius of the circle");
      double r=scan.nextDouble() ; 
      double circum=2*Math.PI*r;
      System.out.println("The circumference of the circle is "+circum);
      
      System.out.println("\n" + "********");
      //Question 7
      System.out.println("The solution expression we need to print is "+Math.sqrt((r)/L*W*2));
      
     //Question 8-12
      ArrayList arr1=new ArrayList() ;      //To create an array list object
      arr1.add(0, "Rishabh");
      arr1.add(1, "Tyagi");             // to add the name to the object
      
     System.out.println("The result of arr1 is "+arr1); 
     ArrayList arr2 = new ArrayList();
		arr2=arr1;								/*Create arr2 and make it equal to arr1*/
		arr2.add("Yiyang");
		arr2.add("Li");						/*Add my partner Yiyang Li into arr2*/
		
		System.out.println("The first element of arr2 is "+arr2.get(0));    /*Output the first element of arr2, it should be the first name of mine.
			                                                                  Since, earlier, I added my partner name in arr2, I make arr2 = arr1, the first two
			                                                                  elements of arr2 are my full name. Any other elements added later will be 
			                                                                  stored begin at the third space.*/
      
		int p = arr1.size();
		System.out.println("The size of arr1 is "+arr1.size());		/*Output should be 4, because the arr1 and arr2 point to
		 															the same array, when one of them changed, the either is 
		 															also changed.*/
		System.out.println("The last element of arr1 is "+arr1.get(--p));

 
 }
}
