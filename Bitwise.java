class Bitwise
{
      public static void main(String[] args)
      {
          byte fs = 53; // Combined flag status of 00110101

          System.out.println("Flag 1:" +(( (fs&1)>0)? "ON":"off"));
          System.out.println("Flag 2:" +(( (fs&2)>0)? "ON":"off"));
          System.out.println("Flag 3:" +(( (fs&4)>0)? "ON":"off"));
          System.out.println("Flag 4:" +(( (fs&8)>0)? "ON":"off"));
          System.out.println("Flag 5:" +(( (fs&16)>0)? "ON":"off"));
          System.out.println("Flag 6:" +(( (fs&32)>0)? "ON":"off"));
          System.out.println("Flag 7:" +(( (fs&64)>0)? "ON":"off"));
          System.out.println("Flag 8:" +(( (fs&128)>0)? "ON":"off"));

      }
}


/*Working with bits... In addition to the regular operators described
  earlier in this chapter, Java provides special operators for binary
  arithmatic. These are less commonly used than other operators, 
  but are briefly discussed here to simply provide an awareness of
  their existence.

  The Java "Bitwise" operators can be used with the int integer data
  type to manipulate the bits of the binary representation of a value.
  This requires an understanding of the binary numbering, where eight
  bits in a byte represent decimal values zero to 225. For example,
  53 is binary 00110101
  (0 * 128, 0 * 64, 1 * 32, 1 * 16, 0 * 8, 1 * 4, 0 * 2, 1 * 1)

  //How it works - The binary representation of 53 is 00110101
    so the set bits are....
    1 + 4 + 16 + 32 = 53
  
  Binary addition operations are performed like decimal arithmatic:
                53   =    00110101
           +     7   =    00000111
                60   =    00111100

  Binary addition operators, listed below, allow more specialized
  operations to be performed in binary arithmatic.
  Operator:    Operation:    Example:     Result:
  &            AND           a & b        1 if both bits are 1
  |            OR            a | b        1 if either bit is 1
  ^            XOR           a ^ b        1 if both bits differ
  ~            NOT            ~a          Inverts the bits
  <<           Left shift    n << p       Moves n bits p left
  >>           Right shift   n >> p       Moves n bits p right

  For example, using the bitwise & operator in binary arithmatic:
                53    =    00110101
          &      7    =    00000111
                 5    =    00000101
  //Here, the bitwise & operation returns one or zero to determine each 
    flags status.

  //Dont confuse the logical AND operator && with the bitwise & operator,
    or the logical OR operator || with the bitwise | operator.*/ 
  

       
  