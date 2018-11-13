/* Cubes are being piled until the volume of m is met.
*  Given a volume of m find what n is via:
*  n^3 + (n-1)^3 + ... + 1^3 = m
*  If we do find an equivalent return n
*  else return -1.
*/

public class ASum {
     public static long findNb(long m) {
	long blocks = 0;      //we must return a long and compare longs
    	long volume = 0;
//The while loop below is adding one block to blocks every loop
//The loop invariant for this is: volume < m 
//because this must be held before and after the loop 
  	while(volume < m){      
    		blocks++;
    		volume += blocks*blocks*blocks;
//The if checks if we have reached our goal while in the loop
    	if(volume == m){
      		return blocks;
    		}
  	}
//If we find that we haven't reached our goal of volume == m
//then volume > m and we should return -1 to indicate no fitting blocks
  return -1;
	}
}
