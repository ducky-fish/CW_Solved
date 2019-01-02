//Swap Values
//User dnolan
//Solved by Rutledge

/*Pass array with two values to function that swaps the two (swapValues)
  Values aren't swapping 
  Reason why: All places where 'arguments' is written on lines 23, 24, & 25
  referenced 'args' however as shown in line 17 that is an object that's final
  ergo it cannot be modified.
*/

//Solution below
class Swapper{

  public Object[] arguments;
  
  public Swapper(final Object[] args){
    arguments=args;
  }
  
  public void swapValues() {
    Object[] args = new Object[]{arguments[0],arguments[1]};
    Object temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
  }
}
