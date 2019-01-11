//Find the Parity Outlier
//User obnounce
//Solved by Rutledge

/*Given an int array of at least three
 * entries there is one odd number  
 * and rest are even or vice versa
 * return the outlier as an int.
*/

public class FindOutlier{

//Given an int array we search for the 'Odd One Out'
//Take length of array, inspect index 0 and 1 for equality
//continue to increase index 0 (k) and 1 (j) until !=
//when != inspect the k+1 and j+1 pair for 
//
  static int find(int[] x){
   int arrayLength = x.length;
   int k = 0;
   int j = 1;
   while(arrayLength > 2){
     boolean index0 = evenChecker(x, k);
     boolean index1 = evenChecker(x, j);
     if(index0 != index1){
       boolean check0 = evenChecker(x, k+1);
       boolean check1 = evenChecker(x, j+1);
       if(check0 == check1){
         return x[k];
       }
       else{
         return x[j];
       }
   }
   else{
     arrayLength--;
     ++k;
     ++j;
   }
  }
  return x[++k];
}

//Given an int array and an int 
//Will check if the index given by int in the array
//is Even (True) or False (Odd) returning a boolean.
public static boolean evenChecker(int[] x, int index) {
    int y = x[index];
    if(y%2 == 0){               //Mod the number at the index by 2, a remainder indicates it's odd
      return true;
    }
    else{
      return false;
    }
}
}
