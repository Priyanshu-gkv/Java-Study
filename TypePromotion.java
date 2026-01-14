/*
* ALL ABOUT TYPE PROMOTION AND TYPE CASTINGS
*/

class TypePromotion {
    public static void main(String[] args) {
        // Type Promotion (byte/short/char -> int)
        char a = 'A';
        byte b = 3;
        short c = 25;

        System.out.println(a + b + c); // Type Promotion to int

        /*
         * If we add "ANY STRING" with our expression then type promotion doesn't exist
         * there
         */
        System.out.println(" Hello : " + a + b + c);

        String str = "Hello There,";
        System.out.println(str + a + b + c);

        // IF OPERAND NOT IN EXPERSSION THEN NO TYPE PROMOTION EXIST THERE
        System.out.println(
                "Operand not in expression that's why the exact value which is assign at the time of delcaration prints. Which is -> "
                        + a); // print A not 65

        int d = a; // Implicit type conversion
        System.out.println("Value of A in Integer is : " + d);

        float devide = (a / (float) b); // Explicit type conversion (Type Casting)
        System.out.println(devide);

        float e = 55.56f;
        System.out.println((a / c) * b + e); /*
                                              * 2nd type of type promotion (if any one operand is float/double or long
                                              * than the whole expression is promoted as float/double or long
                                              * RESPECTIVELY)
                                              */

        double f = 5.4;
        System.out.println(a / f); /*
                                    * 2nd type of type promotion (if any one operand is float/double or long
                                    * than the whole expression is promoted as float/double or long
                                    * RESPECTIVELY)
                                    */

        long g = 55;
        System.out.println(b * g);/*
                                   * 2nd type of type promotion (if any one operand is float/double or long
                                   * than the whole expression is promoted as float/double or long
                                   * RESPECTIVELY)
                                   */

    }
}