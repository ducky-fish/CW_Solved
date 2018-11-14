/*Imagine a pyramid constructed of odd numbers where
 *the length of each row is increased by 1 each time
 * e.g. row1(1) row2(3 5) row3(7 9 11)
 *Goal is to take n and find that row in the pyramid
 *add and return all the results in that row.
 */
  public static int rowSumOddNumbers(int n) {
    //mod_count exists to return our mod for comparison
    //result will be what we return
    //count_up is our counter to mod by
    //temp_n is what we wish to multiply our result by
    int m_c = 0;
    int result = 0;
    int count_up = 0;
    int temp_n = n;
    //We make sure that n is greater than 0
    //While it is greater than 0 we count up and then
    //take mod 10 of our number to see the last number
    //in the int. If it's odd then the last number will
    //be 1, 3, 5, 7, or 9 meaning we decrease our n. 
    //Result is equivalent to current result + count.
    // 
    //The loop invariant is that n > 0 and n !< 0
    if(n > 0){
      while(n > 0){
        count_up++;
        m_c = count_up % 10;
        if(m_c == 1 || m_c == 3 || m_c == 5 || m_c == 7 || m_c == 9){
          n--;
          result = result + count_up;
        }
      }
    }
    else{
      System.out.print("That ain't right");
      return 0;
    }
    return result * temp_n;
  }
