
public class DataTypeTester {
    public static void testByte(){
	    byte a = 10, b = 12, c;
	    byte temp;
		
	    System.out.println("\n *********** Byte *********** ");
	    System.out.println(" *** Arithmetic Operators ***\n");
		
	    // addition
            c = (byte)(a + b);
	    System.out.printf("%d + %d = %d\n", a, b, c);
	    // subtraction
	    c = (byte)(a - b);
	    System.out.printf("%d - %d = %d\n", a, b, c);
	    // multiplication
	    c = (byte)(a * b);
	    System.out.printf("%d * %d = %d\n", a, b, c);
	    // division
	    c = (byte)(a / b);
	    System.out.printf("%d / %d = %d\n", a, b, c);
	    // modulus
	    c = (byte)(a % b);
	    System.out.printf("%d %% %d = %d\n", a, b, c);

	    // c = (byte)(a / 0); --> Arithmetical Exception
	    // c = (byte)(a % 0); --> Arithmetical Exception

	    System.out.println("\n *** Simple Assignment Operator ***\n");
		
	    // assignment;
	    c = a;
	    System.out.printf("a = %d, c = a --> c = %d\n", a, a);
		
	    System.out.println("\n *** Unary Operators ***\n");
		
	    a = 34;
	    // unary minus
	    c = (byte)(-a);
	    System.out.printf("-%d = %d\n", a, c);
	    // unary plus
	    c = (byte)(+a);
	    System.out.printf("+%d = %d\n", a, c);
	    // prefix increment
	    a = 34;
	    System.out.printf("++%d = %d\n", a, ++a);
	    // postfix increment
	    a = 34;
	    System.out.printf("%d++ = %d\n", a, a++);
	    // prefix decrement
	    a = 34;
	    System.out.printf("--%d = %d\n", a, --a);
	    // postfix decrement
	    a = 34;
	    System.out.printf("%d-- = %d\n", a, a--);
	    a = 34;
            //!a //logical complement operator

	    System.out.println("\n *** Equality and Relational Operators ***\n");
		
	    // equal to
	    System.out.printf("%d == %d --> %b\n", a, b, a == b);
	    // not equal to
	    System.out.printf("%d != %d --> %b\n", a, b, a != b);
	    // greater than
	    System.out.printf("%d > %d --> %b\n", a, b, a > b);
	    // greater than or equal to
	    System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
	    // less than
	    System.out.printf("%d < %d --> %b\n", a, b, a < b);
	    // less than or equal to
	    System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
	    
	    System.out.println("\n *** Logical Operators ***\n");
		
	    // logical AND
	    System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
	    							    (a > b) && (a > 0));
	    // bitwise logical AND
	    System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
						  		    (a > b) & (a > 0));
	    // logical OR
	    System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
						  		    (a >= b) || (b != 0));
	    // bitwise logical OR
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
						  		    (a >= b) | (b != 0));
	    // logical XOR
	    System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
						  		    (a >= b) ^ (b != 0));
	    // logical NOT
	    System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
	    System.out.println("\n *** Bitwise Operators ***\n");
		
	    c = (byte)(a & b); // bitwise AND
	    System.out.printf("%d & %d = %d\n", a, b, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s & %s = %s\n", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
							Integer.toBinaryString((b & 0xFF) + 0x100).substring(1),
							    Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));
	    c = (byte)(a | b); // bitwise OR
	    System.out.printf("\n%d | %d = %d\n", a, b, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s | %s = %s\n", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                    Integer.toBinaryString((b & 0xFF) + 0x100).substring(1),
                                                        Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));
	    c = (byte)(a ^ b); // bitwise XOR
	    System.out.printf("\n%d ^ %d = %d\n", a, b, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                    Integer.toBinaryString((b & 0xFF) + 0x100).substring(1),
                                                        Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));
	    c = (byte)(~a); // bitwise unary compliment
	    System.out.printf("\n~%d = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("~%s = %s\n", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));
	    c = (byte)(a << 1); // left shift
	    System.out.printf("\n%d << 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s << 1 = %s\n", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                    Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));
	    c = (byte)(a >> 1); // right shift
	    System.out.printf("\n%d >> 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                    Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));
	    a = -34;
	    c = (byte)(a >> 1); // right shift
	    System.out.printf("\n%d >> 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
	                                            Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));
	    a = 34;
	    c = (byte)(a >>> 1); // zero fill right shift
	    System.out.printf("\n%d >>> 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                    Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));

	    a = -34;
	    c = (byte)(a >>> 1); // zero fill right shift
	    System.out.printf("\n%d >>> 1 = %d ", a, c);
	    System.out.print("--> Wrong result! Should be \"111\"\n");
	    System.out.println("in binary form:");
	    System.out.printf("%s >>> 1 = %s ", Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                     Integer.toBinaryString((c & 0xFF) + 0x100).substring(1));

            System.out.print("--> Wrong result! Should be \"01101111\"\n");

            System.out.println("\n *** Assignment Operators ***\n");
		
            c = 22;
            System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
            System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
            System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
            System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
            System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		
            // c %= 0; --> Arithmetical Exception
            // c /= 0; --> Arithmetical Exception

            temp = c;
            System.out.printf("\n%d |= %d --> c = %d\n", c, a, c |= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s |= %s --> c = %s\n", Integer.toBinaryString((c & 0xFF) + 0x100).substring(1),
                                                           Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                               Integer.toBinaryString(((c|=a) & 0xFF) + 0x100).substring(1));
            temp = c;
            System.out.printf("\n%d &= %d --> c = %d\n", c, a, c &= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s &= %s --> c = %s\n", Integer.toBinaryString((c & 0xFF) + 0x100).substring(1),
                                                           Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                               Integer.toBinaryString(((c&=a) & 0xFF) + 0x100).substring(1));
		
            temp = c;
            System.out.printf("\n%d >>= 1 --> c = %d\n", c, c >>= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s >>= %s --> c = %s\n", Integer.toBinaryString((c & 0xFF) + 0x100).substring(1),
                                                            Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                                Integer.toBinaryString(((c >>= 1) & 0xFF) + 0x100).substring(1));
            temp = c;
            System.out.printf("\n%d <<= 1 --> c = %d\n", c, c <<= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s <<= %s --> c = %s\n", Integer.toBinaryString((c & 0xFF) + 0x100).substring(1),
                                                            Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                                Integer.toBinaryString(((c <<= 1) & 0xFF) + 0x100).substring(1));
            temp = c;
            System.out.printf("\n%d >>>= 1 --> c = %d ", c, c >>>= 1);
            System.out.print("--> Wrong result! Should be \"111\"\n");
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s >>> %s --> c = %s ", Integer.toBinaryString((c & 0xFF) + 0x100).substring(1),
                                                           Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                               Integer.toBinaryString(((c >>>= 1) & 0xFF) + 0x100).substring(1));
            System.out.print("--> Wrong result! Should be \"01101111\"\n");

            temp = c;
            System.out.printf("\n%d ^= %d --> c = %d\n", c, a, c ^= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s ^= %s --> c = %s\n", Integer.toBinaryString((c & 0xFF) + 0x100).substring(1),
                                                           Integer.toBinaryString((a & 0xFF) + 0x100).substring(1),
                                                               Integer.toBinaryString(((c ^= a) & 0xFF) + 0x100).substring(1));
		
            System.out.println("\n *** Misc Operators ***");
            System.out.println(" Condition Operator:\n");
            System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                                                                (a > b ? a : b));
		
            System.out.println("\n Type Cast Operator:\n");
		
            //byte bt = 55;
            int  nt = 88;
            short sh = -1034;
            char ch = '\u0034';
            long l = 10000000000000000L;
            float f = 3.9f;
            double d = 78534572.625;
            boolean bool = true;

            c = (byte)nt;
            System.out.printf("byte = int: c = (byte)%d --> c = %d\n", nt, c);
            c = (byte)sh;
            System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
            c = (byte)ch;
            System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
            c = (byte) l;
            System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
            c = (byte) f;
            System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
            c = (byte) d;
            System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
            //c = (byte)bool;
            System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);
	}
	
	public static void testShort(){
	    short a = -8, b = 5, c;
	    short temp;
		
	    System.out.println("\n *********** Short ********** ");
	    System.out.println(" *** Arithmetic Operators ***\n");
		
	    // addition
            c = (short)(a + b);
            System.out.printf("%d + %d = %d\n", a, b, c);
            // subtraction
            c = (short)(a - b);
            System.out.printf("%d - %d = %d\n", a, b, c);
            // multiplication
            c = (short)(a * b);
            System.out.printf("%d * %d = %d\n", a, b, c);
            // division
            c = (short)(a / b);
            System.out.printf("%d / %d = %d\n", a, b, c);
            // modulus
            c = (short)(a % b);
            System.out.printf("%d %% %d = %d\n", a, b, c);

            // c = (short)(a / 0); --> Arithmetical Exception
            // c = (short)(a % 0); --> Arithmetical Exception
            
            System.out.println("\n *** Simple Assignment Operator ***\n");
	
            // assignment;
            c = a;
            System.out.printf("a = %d, c = a --> c = %d\n", a, a);
		
            System.out.println("\n *** Unary Operators ***\n");
		
            a = 67;
            // unary minus
            c = (short)(-a);
            System.out.printf("-%d = %d\n", a, c);
            // unary plus
            c = (short)(+a);
            System.out.printf("+%d = %d\n", a, c);
            // prefix increment
            a = 67;
            System.out.printf("++%d = %d\n", a, ++a);
            // postfix increment
            a = 67;
            System.out.printf("%d++ = %d\n", a, a++);
            // prefix decrement
            a = 67;
            System.out.printf("--%d = %d\n", a, --a);
            // postfix decrement
            a = 67;
            System.out.printf("%d-- = %d\n", a, a--);
            a = 67;
            //!a; //logical complement operator

            System.out.println("\n *** Equality and Relational Operators ***\n");
		
            // equal to
            System.out.printf("%d == %d --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("%d != %d --> %b\n", a, b, a != b);
            // greater than
            System.out.printf("%d > %d --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("%d < %d --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
	
            System.out.println("\n *** Logical Operators ***\n");
		
            // logical AND
            System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
						  (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
						  (a > b) & (a > 0));
            // logical OR
            System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
						  (a >= b) || (b != 0));
            // bitwise logical OR
            System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
						  (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
						  (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
            System.out.println("\n *** Bitwise Operators ***\n");
		
            c = (short)(a & b); // bitwise AND
            System.out.printf("%d & %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s & %s = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
						    Integer.toBinaryString((b & 0xFFFF) + 0x10000).substring(1),
						        Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (short)(a | b); // bitwise OR
            System.out.printf("\n%d | %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s | %s = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((b & 0xFFFF) + 0x10000).substring(1),
                                                        Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (short)(a ^ b); // bitwise XOR
            System.out.printf("\n%d ^ %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((b & 0xFFFF) + 0x10000).substring(1),
                                                        Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (short)(~a); // bitwise unary compliment
            System.out.printf("\n~%d = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("~%s = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (short)(a << 1); // left shift
            System.out.printf("\n%d << 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s << 1 = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (short)(a >> 1); // right shift
            System.out.printf("\n%d >> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            a = -67;
            c = (short)(a >> 1); // right shift
            System.out.printf("\n%d >> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            a = 67;
            c = (short)(a >>> 1); // zero fill right shift
            System.out.printf("\n%d >>> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                     Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));

            a = -67;
            c = (short)(a >>> 1); // zero fill right shift
            System.out.printf("\n%d >>> 1 = %d ", a, c);
            System.out.print("--> Wrong result! Should be \"32734\"\n");
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s ", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));

            System.out.print("--> Wrong result! Should be \"0111111111011110\"\n");

            System.out.println("\n *** Assignment Operators ***\n");
		
            c = 15;
            System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
            System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
            System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
            System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
            System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		
            // c %= 0; --> Arithmetical Exception
            // c /= 0; --> Arithmetical Exception
		
            temp = c;
            System.out.printf("\n%d |= %d --> c = %d\n", c, a, c |= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s |= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                           Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                               Integer.toBinaryString(((c|=a) & 0xFFFF) + 0x10000).substring(1));
            temp = c;
            System.out.printf("\n%d &= %d --> c = %d\n", c, a, c &= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s &= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                           Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                               Integer.toBinaryString(((c&=a) & 0xFFFF) + 0x10000).substring(1));
		
            temp = c;
            System.out.printf("\n%d >>= 1 --> c = %d\n", c, c >>= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s >>= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                            Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                                Integer.toBinaryString(((c >>= 1) & 0xFFFF) + 0x10000).substring(1));
            temp = c;
            System.out.printf("\n%d <<= 1 --> c = %d\n", c, c <<= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s <<= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                            Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                                Integer.toBinaryString(((c <<= 1) & 0xFFFF) + 0x10000).substring(1));
            temp = c;
            System.out.printf("\n%d >>>= 1 --> c = %d ", c, c >>>= 1);
            System.out.print("--> Wrong result! Should be \"32734\"\n");
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s >>> %s --> c = %s ", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                           Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                               Integer.toBinaryString(((c >>>= 1) & 0xFFFF) + 0x10000).substring(1));
            System.out.print("--> Wrong result! Should be \"0111111111011110\"\n");

            temp = c;
            System.out.printf("\n%d ^= %d --> c = %d\n", c, a, c ^= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s ^= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                           Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                               Integer.toBinaryString(((c ^= a) & 0xFFFF) + 0x10000).substring(1));
		
            System.out.println("\n *** Misc Operators ***");
            System.out.println(" Condition Operator:\n");
		
            System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
							        (a > b ? a : b));
		
            System.out.println("\n Type Cast Operator:\n");
		
            byte bt = 55;
            int  nt = 88;
            //short sh = -1034;
            char ch = '\u0034';
            long l = 10000000000000000L;
            float f = 3.9f;
            double d = 78534572.625;
            boolean bool = true;

            c = (short)bt;
            System.out.printf("short = bt: c = (short)%d --> c = %d\n", bt, c);
            c = (short)nt;
            System.out.printf("short = int: c = (short)%d --> c = %d\n", nt, c);
            c = (short)ch;
            System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
            c = (short)l;
            System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
            c = (short)f;
            System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
            c = (short)d;
            System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
            //c = (short)bool;
            System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
	}
	
	public static void testChar(){
	    char a = '\u0024'; //'$' 
	    char b = '\u0021'; //'!'
	    char c;
	    char temp;
		
	    System.out.println("\n *********** Char ********** ");
	    System.out.println(" *** Arithmetic Operators ***\n");
		
	    // addition
            c = (char)(a + b);
            System.out.printf("'%c' + '%c' = '%c'\n", a , b , DataTypeTester.StringtoChar(c));
            System.out.println("in hex form:");
            System.out.printf("0x%x + 0x%x = 0x%x\n", a & 0xFFFF , 
							    b & 0xFFFF, 
								c & 0xFFFF);
            // subtraction
            c = (char)(a - b);
            System.out.printf("\n'%c' - '%c' = '%c'\n", a, b, DataTypeTester.StringtoChar(c));
            System.out.println("in hex form:");
            System.out.printf("0x%x - 0x%x = 0x%x\n", a & 0xFFFF , 
						          b & 0xFFFF, 
						              c & 0xFFFF);
            // multiplication
            c = (char)(a * b);
            System.out.printf("\n'%c' * '%c' = '%c'\n", a, b, DataTypeTester.StringtoChar(c));
            System.out.println("in hex form:");
            System.out.printf("0x%x * 0x%x = 0x%x\n", a & 0xFFFF , 
							    b & 0xFFFF, 
							        c & 0xFFFF);
            // division
            c = (char)(a / b);
            System.out.printf("\n'%c' / '%c' = '%c'\n", a, b, DataTypeTester.StringtoChar(c));
            System.out.println("in hex form:");
            System.out.printf("0x%x / 0x%x = 0x%x\n", a & 0xFFFF , 
							    b & 0xFFFF, 
							        c & 0xFFFF);
            // modulus
            c = (char)(a % b);
            System.out.printf("\n'%c' %% '%c' = '%c'\n", a, b, DataTypeTester.StringtoChar(c));
            System.out.println("in hex form:");
            System.out.printf("0x%x %% 0x%x = 0x%x\n", a  & 0xFFFF , 
						              b & 0xFFFF, 
						                  c & 0xFFFF);
		
            // c = (char)(a / 0); --> Arithmetical Exception
            // c = (char)(a % 0); --> Arithmetical Exception
		
            System.out.println("\n *** Simple Assignment Operator ***\n");
		
            // assignment;
            c = '\u0039';
            System.out.printf("a = '%c', c = a --> c = '%c'\n", a, a);
		
            System.out.println("\n *** Unary Operators ***\n");
		
            a = '\u0030'; //'0';
            // unary minus
            c = (char)(-a);
            System.out.printf("'-%c' = '%c' ", a, DataTypeTester.StringtoChar(c));
            System.out.print("--> Wrong result! Should be '0'\n");
            System.out.println("in hex form:");
            System.out.printf("-0x%x = 0x%x ", a & 0xFFFF , 
					           c & 0xFFFF);
            System.out.print("--> Wrong result! Should be '0x30'\n");
            // unary plus
            c = (char)(+a);
            System.out.printf("\n'+%c' = '%c'\n", a, c);
            System.out.println("in hex form:");
            System.out.printf("+0x%x = 0x%x\n ", a & 0xFFFF , 
					             c & 0xFFFF);
            // prefix increment
            a = '\u0031'; //'1'
            temp = a;
            System.out.printf("\n'++%c' = '%c'\n", a, ++a);
            System.out.println("in hex form:");
            a = temp;
            System.out.printf("++0x%x = 0x%x \n", a & 0xFFFF , 
						      ++a & 0xFFFF);
            // postfix increment
            a = '\u0031';
            temp = a;
            System.out.printf("\n'%c++' = '%c'\n", a, a++);
            System.out.println("in hex form:");
            a = temp;
            System.out.printf("0x%x++ = 0x%x \n", a & 0xFFFF , 
                                                      a++ & 0xFFFF);
            // prefix decrement
            a = '\u0031';
            System.out.printf("\n'--%c' = '%c'\n", a, --a);
            System.out.println("in hex form:");
            a = temp;
            System.out.printf("--0x%x = 0x%x \n", a & 0xFFFF , 
                                                      --a & 0xFFFF);
            // postfix decrement
            a = '\u0031';
            System.out.printf("\n'%c--' = '%c'\n", a, a--);
            System.out.println("in hex form:");
            a = temp;
            System.out.printf("0x%x-- = 0x%x \n", a & 0xFFFF , 
						      a-- & 0xFFFF);
            a = '\u0031'; 
            //!a; //logical complement operator

            System.out.println("\n *** Equality and Relational Operators ***\n");
		
            b = '\u0032'; //'2'
            // equal to
            System.out.printf("'%c' == '%c' --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("'%c'!= '%c' --> %b\n", a, b, a != b);
            // greater than
            System.out.printf("'%c' > '%c' --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("'%c' >= '%c' --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("'%c' < '%c' --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("'%c' <= '%c' --> %b\n", a, b, a <= b);
		
            System.out.println("\n *** Logical Operators ***\n");
		
            // logical AND
            System.out.printf("('%c' > '%c') && ('%c' > 0) --> %b\n", a, b, a,
                                                                          (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("('%c' > '%c') & ('%c' > 0) --> %b\n", a, b, a,
						                         (a > b) & (a > 0));
            // logical OR
            System.out.printf("('%c' >= '%c') || ('%c' != 0) --> %b\n", a, b, b,
						                            (a >= b) || (b != 0));
            // bitwise logical OR
            System.out.printf("('%c' >= '%c') | ('%c' != 0) --> %b\n", a, b, b,
						                           (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("('%c' >= '%c') ^ ('%c' != 0) --> %b\n", a, b, b,
						                          (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!('%c' >= '%c') --> %b\n", a, b, !(a >= b));
		
            System.out.println("\n *** Bitwise Operators ***\n");
		
            c = (char)(a & b); // bitwise AND
            System.out.printf("'%c' & '%c' = '%c'\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s & %s = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
						    Integer.toBinaryString((b & 0xFFFF) + 0x10000).substring(1),
						        Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (char)(a | b); // bitwise OR
            System.out.printf("\n'%c' | '%c' = '%c'\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s | %s = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((b & 0xFFFF) + 0x10000).substring(1),
                                                        Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (char)(a ^ b); // bitwise XOR
            System.out.printf("\n'%c' ^ '%c' = '%c'\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((b & 0xFFFF) + 0x10000).substring(1),
                                                        Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (char)(~a); // bitwise unary compliment
            System.out.printf("\n~'%c' = '%c'\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("~%s = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (char)(a << 1); // left shift
            System.out.printf("\n'%c' << 1 = '%c'\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s << 1 = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
            c = (char)(a >> 1); // right shift
            System.out.printf("\n'%c' >> 1 = '%c'\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                    Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));
		
            c = (char)(a >>> 1); // zero fill right shift
            System.out.printf("\n'%c' >>> 1 = '%c'\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                     Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1));

            System.out.println("\n *** Assignment Operators ***\n");
		
            c = '\u0032'; //'2'
		
            temp = c;
            System.out.printf("'%c' += '%c' --> c = '%c'\n", c, a, c += a);
            System.out.println("in hex form:");
            c = temp;
            System.out.printf("0x%x += 0x%x --> 0x%x\n", c & 0xFFFF , 
					                     a & 0xFFFF,
					                         (c += a)& 0xFFFF);
            temp = c;
            System.out.printf("\n'%c' -= '%c' --> c = '%c'\n", c, a, c -= a);
            System.out.println("in hex form:");
            c = temp;
            System.out.printf("0x%x -= 0x%x --> 0x%x\n", c & 0xFFFF , 
							     a & 0xFFFF,
							         (c -= a)& 0xFFFF);
            temp = c;
            System.out.printf("\n'%c' *= '%c' --> c = '%c'\n", c, a, c *= a);
            System.out.println("in hex form:");
            c = temp;
            System.out.printf("0x%x *= 0x%x --> 0x%x\n", c & 0xFFFF , 
							     a & 0xFFFF,
							         (c *= a)& 0xFFFF);
            temp = c;
            System.out.printf("\n'%c' /= '%c' --> c = '%c'\n", c, a, c /= a);
            System.out.println("in hex form:");
            c = temp;
            System.out.printf("0x%x /= 0x%x --> 0x%x\n", c & 0xFFFF , 
							     a & 0xFFFF,
							         (c /= a)& 0xFFFF);
            temp = c;
            System.out.printf("\n'%c' %%= '%c' --> c = '%c'\n", c, a, c %= a);
            System.out.println("in hex form:");
            c = temp;
            System.out.printf("0x%x %%= 0x%x --> 0x%x\n", c & 0xFFFF , 
							      a & 0xFFFF,
							          (c %= a)& 0xFFFF);
		
		
            //c %= 0;// --> Arithmetical Exception
            // c /= 0; //--> Arithmetical Exception
	
            c = '\u0038'; //'8'
		
            temp = c;
            System.out.printf("\n'%c' |= '%c' --> c = '%c'\n", c, a, c |= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s |= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                           Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                               Integer.toBinaryString(((c|=a) & 0xFFFF) + 0x10000).substring(1));
            temp = c;
            System.out.printf("\n'%c' &= '%c' --> c = '%c'\n", c, a, c &= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s &= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                           Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                               Integer.toBinaryString(((c&=a) & 0xFFFF) + 0x10000).substring(1));
		
            temp = c;
            System.out.printf("\n'%c' >>= 1 --> c = '%c'\n", c, c >>= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s >>= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                            Integer.toBinaryString((1 & 0xFFFF) + 0x10000).substring(1),
                                                                Integer.toBinaryString(((c >>= 1) & 0xFFFF) + 0x10000).substring(1));
            temp = c;
            System.out.printf("\n'%c' <<= 1 --> c = '%c'\n", c, c <<= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s <<= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                            Integer.toBinaryString((1 & 0xFFFF) + 0x10000).substring(1),
                                                                Integer.toBinaryString(((c <<= 1) & 0xFFFF) + 0x10000).substring(1));
            temp = c;
            System.out.printf("\n'%c' >>>= 1 --> c = '%c' ", c, c >>>= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s >>> %s --> c = %s\n ", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                             Integer.toBinaryString((1 & 0xFFFF) + 0x10000).substring(1),
                                                                 Integer.toBinaryString(((c >>>= 1) & 0xFFFF) + 0x10000).substring(1));

            temp = c;
            System.out.printf("\n'%c' ^= '%c' --> c = '%c'\n", c, a, c ^= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s ^= %s --> c = %s\n", Integer.toBinaryString((c & 0xFFFF) + 0x10000).substring(1),
                                                           Integer.toBinaryString((a & 0xFFFF) + 0x10000).substring(1),
                                                               Integer.toBinaryString(((c ^= a) & 0xFFFF) + 0x10000).substring(1));
		
            System.out.println("\n *** Misc Operators ***");
            System.out.println(" Condition Operator:\n");
            System.out.printf("'%c' > '%c' ? '%c' : '%c' --> '%c'\n", a, b, a, b,
                                                                          (a > b ? a : b));
		
            System.out.println("\n Type Cast Operator:\n");
		
            byte bt = 55;
            int  nt = 88;
            short sh = 100;
            //char ch = '\u0034';
            long l = 10000000000000000L;
            float f = 3.9f;
            double d = 78534572.625;
            boolean bool = true;

            c = (char)bt;
            System.out.printf("char = bt: c = (char)%d --> c = '%c'\n", bt, c);
            c = (char)nt;
            System.out.printf("char = int: c = (char)%d --> c = '%c'\n", nt, c);
            c = (char)sh;
            System.out.printf("char = short: c = (char)%d --> c = '%c'\n", sh, c);
            /*c = (char)ch;
            System.out.printf("char = char: c = (short)'%c' --> c = %d\n", ch, c);*/
            c =  (char)l;
            System.out.printf("char = long: c = (char)%d --> c = '%c'\n", l, c);
            c =  (char)f;
            System.out.printf("char = float: c = (char)%f --> c = '%c'\n", f, c);
            c =  (char)d;
            System.out.printf("char = double: c = (char)%f --> c = '%c'\n", d, c);
            //c = (chart)bool;
            System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool);
	}
	
	public static void testInt(){
	    int a = 7, b = 5, c;
	    int temp;
		
	    System.out.println("\n ********** Integer ********* ");
	    System.out.println(" *** Arithmetic Operators ***\n");
	
	    // addition
	    c = a + b;
	    System.out.printf("%d + %d = %d\n", a, b, c);
	    // subtraction
	    c = a - b;
	    System.out.printf("%d - %d = %d\n", a, b, c);
	    // multiplication
	    c = a * b;
	    System.out.printf("%d * %d = %d\n", a, b, c);
	    // division
	    c = a / b;
	    System.out.printf("%d / %d = %d\n", a, b, c);
	    // modulus
	    c = a % b;
	    System.out.printf("%d %% %d = %d\n", a, b, c);
		
	    // c = a / 0; --> Arithmetical Exception
	    // c = a % 0; --> Arithmetical Exception
		
	    System.out.println("\n *** Simple Assignment Operator ***\n");
		
	    // assignment;
	    c = a;
	    System.out.printf("a = %d, c = a --> c = %d\n", a, a);
	
	    System.out.println("\n *** Unary Operators ***\n");
		
	    a = 7;
	    // unary minus
	    c = -a; 
	    System.out.printf("-%d = %d\n", a, c);
	    // unary plus
	    c = +a; 
	    System.out.printf("+%d = %d\n", a, c);
	    // prefix increment
	    a = 7;
	    System.out.printf("++%d = %d\n", a, ++a);
	    // postfix increment
	    a = 7;
	    System.out.printf("%d++ = %d\n", a, a++);
	    // prefix decrement
	    a = 7;
	    System.out.printf("--%d = %d\n", a, --a);
	    // postfix decrement
	    a = 7;
	    System.out.printf("%d-- = %d\n", a, a--);
	    a = 7;
	    //!a; //logical complement operator
		
	    System.out.println("\n *** Equality and Relational Operators ***\n");
		
	    // equal to
	    System.out.printf("%d == %d --> %b\n", a, b, a == b);
	    // not equal to
	    System.out.printf("%d != %d --> %b\n", a, b, a != b);
	    // greater than
	    System.out.printf("%d > %d --> %b\n", a, b, a > b);
	    // greater than or equal to
	    System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
	    // less than
	    System.out.printf("%d < %d --> %b\n", a, b, a < b);
	    // less than or equal to
	    System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		
	    System.out.println("\n *** Logical Operators ***\n");
		
	    // logical AND
	    System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
						                    (a > b) && (a > 0));
	    // bitwise logical AND
	    System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
	                                                           (a > b) & (a > 0));
	    // logical OR
	    System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
						                      (a >= b) || (b != 0));
	    // bitwise logical OR
	    System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
						                     (a >= b) | (b != 0));
	    // logical XOR
	    System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
						                     (a >= b) ^ (b != 0));
	    // logical NOT
	    System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
	    System.out.println("\n *** Bitwise Operators ***\n");
		
	    c = a & b; // bitwise AND
	    System.out.printf("%d & %d = %d\n", a, b, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
						    Integer.toBinaryString(b), 
							Integer.toBinaryString(c));
	    c = a | b; // bitwise OR
	    System.out.printf("\n%d | %d = %d\n", a, b, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
						    Integer.toBinaryString(b), 
							Integer.toBinaryString(c));
	    c = a ^ b; // bitwise XOR
	    System.out.printf("\n%d ^ %d = %d\n", a, b, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
						    Integer.toBinaryString(b), 
						        Integer.toBinaryString(c));
	    c = ~a; // bitwise unary compliment
	    System.out.printf("\n~%d = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
						Integer.toBinaryString(c));
	    c = a << 1; // left shift
	    System.out.printf("\n%d << 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
						    Integer.toBinaryString(c));
	    c = a >> 1; // right shift
	    System.out.printf("\n%d >> 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
						    Integer.toBinaryString(c));
	    a = -7;
	    c = a >> 1; // right shift
	    System.out.printf("\n%d >> 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
						    Integer.toBinaryString(c));
	    a = 7;
	    c = a >>> 1; // zero fill right shift
	    System.out.printf("\n%d >>> 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
						     Integer.toBinaryString(c));
	    a = -7;
	    c = a >>> 1; // zero fill right shift
	    System.out.printf("\n%d >>> 1 = %d\n", a, c);
	    System.out.println("in binary form:");
	    System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
						     Integer.toBinaryString(c));
		
	    System.out.println("\n *** Assignment Operators ***\n");
		
	    c = 2;
	    System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
	    System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
	    System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
	    System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
	    System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		
	    // c %= 0; --> Arithmetical Exception
	    // c /= 0; --> Arithmetical Exception
		
	    temp = c;
	    System.out.printf("\n%d |= %d --> c = %d\n", c, a, c |= a);
	    System.out.println("in binary form:");
	    c = temp;
	    System.out.printf("%s |= %s --> c = %s\n", Integer.toBinaryString(c),
						           Integer.toBinaryString(a),
						               Integer.toBinaryString(c |= a));
	    temp = c;
	    System.out.printf("\n%d &= %d --> c = %d\n", c, a, c &= a);
	    System.out.println("in binary form:");
	    c = temp;
	    System.out.printf("%s &= %s --> c = %s\n", Integer.toBinaryString(c),
						           Integer.toBinaryString(a),
						               Integer.toBinaryString(c &= a));
	    temp = c;
	    System.out.printf("\n%d >>= 1 --> c = %d\n", c, c >>= 1);
	    System.out.println("in binary form:");
	    c = temp;
	    System.out.printf("%s >>= %s --> c = %s\n", Integer.toBinaryString(c),
							    Integer.toBinaryString(1),
							        Integer.toBinaryString(c >>= 1));
	    temp = c;
	    System.out.printf("\n%d <<= 1 --> c = %d\n", c, c <<= 1);
	    System.out.println("in binary form:");
	    c = temp;
	    System.out.printf("%s <<= %s --> c = %s\n", Integer.toBinaryString(c),
							    Integer.toBinaryString(1),
							        Integer.toBinaryString(c <<= 1));
	    temp = c;
	    System.out.printf("\n%d >>>= 1 --> c = %d\n", c, c >>>= 1);
	    System.out.println("in binary form:");
	    c = temp;
	    System.out.printf("%s >>> %s --> c = %s\n", Integer.toBinaryString(c),
							    Integer.toBinaryString(1),
							        Integer.toBinaryString(c >>> 1));
	    temp = c;
	    System.out.printf("\n%d ^= %d --> c = %d\n", c, a, c ^= a);
	    System.out.println("in binary form:");
	    c = temp;
	    System.out.printf("%s ^= %s --> c = %s\n", Integer.toBinaryString(c),
						           Integer.toBinaryString(a),
						               Integer.toBinaryString(c ^= a));
		
	    System.out.println("\n *** Misc Operators ***");
	    System.out.println(" Condition Operator:\n");
	    System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
	                                                        (a > b ? a : b));
		
	    System.out.println("\n Type Cast Operator:\n");

	    int nt = -73;
	    byte bt = 55;
	    short sh = -1034;
	    char ch = '\u0034';
	    long l = 10000000000000000L;
	    float f = 3.9f;
	    double d = 78534572.625;
	    boolean bool = true;

	    c = nt;
            System.out.printf("int = int: c = %d --> c = %d\n", nt, c);
            c = bt;
            System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
            c = sh;
            System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
            c = ch;
            System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
            c = (int) l;
            System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
            c = (int) f;
            System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
            c = (int) d;
            System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
            //c = (int)bool;
            System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
	}
	
	public static void testLong(){
            long a = 700234242L, b = -24326912347123L, c;
            long temp;

            System.out.println("\n ************ Long ********** ");
            System.out.println(" *** Arithmetic Operators ***\n");

            // addition
            c = a + b;
            System.out.printf("%d + (%d) = %d\n", a, b, c);
            // subtraction
            c = a - b;
            System.out.printf("%d - (%d) = %d\n", a, b, c);
            // multiplication
            c = a * b;
            System.out.printf("%d * (%d) = %d\n", a, b, c);
            // division
            c = a / b;
            System.out.printf("%d / (%d) = %d\n", a, b, c);
            // modulus
            c = a % b;
            System.out.printf("%d %% (%d) = %d\n", a, b, c);

            // c = a / 0; --> Arithmetical Exception
            // c = a % 0; --> Arithmetical Exception

            System.out.println("\n *** Simple Assignment Operator ***\n");

            // assignment;
            c = a;
            System.out.printf("%d = %d\n", a, c);

            System.out.println("\n *** Unary Operators ***\n");

            a = 56789L;
            // unary minus
            c = -a;
            System.out.printf("-%d = %d\n", a, c);
            // unary plus
            c = +a;
            System.out.printf("+%d = %d\n", a, c);
            // prefix increment
            a = 56789L;
            System.out.printf("++%d = %d\n", a, ++a);
            // postfix increment
            a = 56789L;
            System.out.printf("%d++ = %d\n", a, a++);
            // prefix decrement
            a = 56789L;
            System.out.printf("--%d = %d\n", a, --a);
            // postfix decrement
            a = 56789L;
            System.out.printf("%d-- = %d\n", a, a--);
            a = 56789L;
            //!a; //logical complement operator

            System.out.println("\n *** Equality and Relational Operators ***\n");

            b = -3423415L;
            // equal to
            System.out.printf("%d == %d --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("%d != %d --> %b\n", a, b, a != b);
            // greater than
            System.out.printf("%d > %d --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("%d < %d --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

            System.out.println("\n *** Logical Operators ***\n");

            // logical AND
            System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                                                                    (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                                                                    (a > b) & (a > 0));
            // logical OR
            System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                                                                    (a >= b) || (b != 0));
            // bitwise logical OR
            System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                                                                    (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                                                                    (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

            System.out.println("\n *** Bitwise Operators ***\n");

            a = 256L;
            b = -128L;
            c = a & b; // bitwise AND
            System.out.printf("%d & %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                                                    Long.toBinaryString(b),
                                                        Long.toBinaryString(c));
            c = a | b; // bitwise OR
            System.out.printf("\n%d | %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                                                    Long.toBinaryString(b),
                                                        Long.toBinaryString(c));
            c = a ^ b; // bitwise XOR
            System.out.printf("\n%d ^ %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                                                    Long.toBinaryString(b),
                                                        Long.toBinaryString(c));
            c = ~a; // bitwise unary compliment
            System.out.printf("\n~%d = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("~%s = %s\n", Long.toBinaryString(a),
                                                Long.toBinaryString(c));
            c = a << 1; // left shift
            System.out.printf("\n%d << 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
                                                    Long.toBinaryString(c));
            a = 15L;
            c = a >> 1; // right shift
            System.out.printf("\n%d >> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                                                    Long.toBinaryString(c));
            a = -15L;
            c = a >> 1; // right shift
            System.out.printf("\n%d >> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                                                    Long.toBinaryString(c));
            a = 15L;
            c = a >>> 1; // zero fill right shift
            System.out.printf("\n%d >>> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                                                     Long.toBinaryString(c));
            a = -15L;
            c = a >>> 1; // zero fill right shift
            System.out.printf("\n%d >>> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                                                     Long.toBinaryString(c));

            System.out.println("\n *** Assignment Operators ***\n");

            c = 2973L;
            System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
            System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
            System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
            System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
            System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

            //c %= 0; --> Arithmetical Exception
            //c /= 0; //--> Arithmetical Exception

            temp = c;
            System.out.printf("\n%d |= %d --> c = %d\n", c, a, c |= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s |= %s --> c = %s\n", Long.toBinaryString(c),
                                                           Long.toBinaryString(a),
                                                               Long.toBinaryString(c |= a));
            temp = c;
            System.out.printf("\n%d &= %d --> c = %d\n", c, a, c &= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s &= %s --> c = %s\n", Long.toBinaryString(c),
                				           Long.toBinaryString(a),
                				               Long.toBinaryString(c &= a));

            temp = c;
            System.out.printf("\n%d >>= 1 --> c = %d\n", c, c >>= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s >>= %s --> c = %s\n", Long.toBinaryString(c),
                                                            Long.toBinaryString(1),
                                                                Long.toBinaryString(c >>= 1));
            temp = c;
            System.out.printf("\n%d <<= 1 --> c = %d\n", c, c <<= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s <<= %s --> c = %s\n", Long.toBinaryString(c),
                                                            Long.toBinaryString(1),
                                                                Long.toBinaryString(c <<= 1));
            temp = c;
            System.out.printf("\n%d >>>= 1 --> c = %d\n", c, c >>>= 1);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s >>> %s --> c = %s\n", Long.toBinaryString(c),
                                                            Long.toBinaryString(1),
                                                                Long.toBinaryString(c >>> 1));
            temp = c;
            System.out.printf("\n%d ^= %d --> c = %d\n", c, a, c ^= a);
            System.out.println("in binary form:");
            c = temp;
            System.out.printf("%s ^= %s --> c = %s\n", Long.toBinaryString(c),
                                                           Long.toBinaryString(a),
                                                               Long.toBinaryString(c ^= a));

            System.out.println("\n *** Misc Operators ***");
            System.out.println(" Condition Operator:\n");
            System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                                                            (a > b ? a : b));

            System.out.println("\n Type Cast Operator:\n");

            int nt = -73;
            byte bt = 55;
            short sh = -1034;
            char ch = '\u0034';
            //long l = 10000000000000000L;
            float f = 3.9f;
            double d = 78534572.625;
            boolean bool = true;

            c = nt;
            System.out.printf("long = int: c = %d --> c = %d\n", nt, c);
            c = bt;
            System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
            c = sh;
            System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
            c = ch;
            System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
            /*c = l;
            System.out.printf("long = long: c = %d --> c = %d\n", l, c);*/
            c = (long)f;
            System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
            c =  (long)d;
            System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
            //c = (long)bool;
            System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
	
	}
	
	public static void testFloat(){
	    float a = 7.2f, b = 5.3f, c;
	    float temp;

	    System.out.println("\n *********** Float ********** ");
	    System.out.println(" *** Arithmetic Operators ***\n");

	    // addition
	    c = a + b;
	    System.out.printf("%f + %f = %f\n", a, b, c);
	    // subtraction
	    c = a - b;
	    System.out.printf("%f - %f = %f\n", a, b, c);
	    // multiplication
	    c = a * b;
	    System.out.printf("%f * %f = %f\n", a, b, c);
	    // division
	    c = a / b;
	    System.out.printf("%f / %f = %f\n", a, b, c);
	    // modulus
	    c = a % b;
	    System.out.printf("%f %% %f = %f\n", a, b, c);
	    c = a / 0.0f;
            System.out.printf("%f / %f = %f\n", a, 0.0f, c);
            c = a % 0.0f;
            System.out.printf("%f %% %f = %f\n", a, 0.0f, c);

            System.out.println("\n *** Simple Assignment Operator ***\n");

            // assignment;
            c = a;
            System.out.printf("a = %f, c = a --> c = %f\n", a, a);

            System.out.println("\n *** Unary Operators ***\n");

            a = 7.2f;
           // unary minus
            c = -a;
            System.out.printf("-%f = %f\n", a, c);
            // unary plus
            c = +a;
            System.out.printf("+%f = %f\n", a, c);
            // prefix increment
            a = 7.2f;
            System.out.printf("++%f = %f\n", a, ++a);
            // postfix increment
            a = 7.2f;
            System.out.printf("%f++ = %f\n", a, a++);
            // prefix decrement
            a = 7.2f;
            System.out.printf("--%f = %f\n", a, --a);
            // postfix decrement
            a = 7.2f;
            System.out.printf("%f-- = %f\n", a, a--);
            a = 7.2f;
            //!a; //logical complement operator

            System.out.println("\n *** Equality and Relational Operators ***\n");

            // equal to
            System.out.printf("%f == %f --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("%f != %f --> %b\n", a, b, a != b);
            // greater than
            System.out.printf("%f > %f --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("%f < %f --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
            
            System.out.println("\n *** Logical Operators ***\n");

            // logical AND
            System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                                                                   (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                                                                  (a > b) & (a > 0));
            // logical OR
            System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                                                                      (a >= b) || (b != 0.0f));
            // bitwise logical OR
            System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                                                                     (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,
                                                                     (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

            System.out.println("\n *** Bitwise Operators ***\n");

            // c = a & b; // bitwise AND
            // c = a | b; // bitwise OR
            // c = a ^ b; // bitwise XOR
            // c = ~a; // bitwise unary compliment
            // c = a << 1; // left shift
            // c = a >> 1; // right shift
            // c = a >>> 1; // zero fill right shift

            System.out.print("Invalid\n");

            System.out.println("\n *** Assignment Operators ***\n");

            c = 2.5f;
            System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
            System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
            System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
            System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
            System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
            System.out.printf("%f /= %f --> c = %f\n", c, 0.0f, c /= 0);
            
            c = 2.5f;
            System.out.printf("%f %%= %f --> c = %f\n", c, 0.0f, c %= 0);

            // c |= a;
            // c &= a;
            // c >>= 1;
            // c <<= 1;
            // c >>>= 1;
            // c ^= a;

            System.out.println("\n *** Misc Operators ***");
            System.out.println(" Condition Operator:\n");
            
            System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
				                                (a > b ? a : b));

            System.out.println("\n Type Cast Operator:\n");

            int nt = -73;
            byte bt = 55;
            short sh = -1034;
            char ch = '\u0034';
            long l = 10000000000000000L;
            //float f = 3.9f;
            double d = 7853535345.625;
            boolean bool = true;

            c = nt;
            System.out.printf("float = int: c = %d --> c = %f\n", nt, c);
            c = bt;
            System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
            c = sh;
            System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
            c = ch;
            System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
            c =  l;
            System.out.printf("float = long: c = %d --> c = %f\n", l, c);
            /*c =  f;
	    System.out.printf("float = float: c = (float)%f --> c = %d\n", f, c);*/
            c = (float) d;
            System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
            //c = (float)bool;
            System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
	}
	
	public static void testDouble(){
            double a = -5.12, b = 5.355, c;
            double temp;

            System.out.println("\n ********** Double ********** ");
            System.out.println(" *** Arithmetic Operators ***\n");

            // addition
            c = a + b;
            System.out.printf("%f + %f = %f\n", a, b, c);
            // subtraction
            c = a - b;
            System.out.printf("%f - %f = %f\n", a, b, c);
            // multiplication
            c = a * b;
            System.out.printf("%f * %f = %f\n", a, b, c);
            // division
            c = a / b;
            System.out.printf("%f / %f = %f\n", a, b, c);
            // modulus
            c = a % b;
            System.out.printf("%f %% %f = %f\n", a, b, c);

            c = a / 0.0;
            System.out.printf("%f / %f = %f\n", a, 0.0, c);
            c = a % 0.0;
            System.out.printf("%f %% %f = %f\n", a, 0.0, c);

            System.out.println("\n *** Simple Assignment Operator ***\n");

            // assignment;
            c = a;
            System.out.printf("a = %f, c = a --> c = %f\n", a, a);

            System.out.println("\n *** Unary Operators ***\n");

            a = -5.12;
            // unary minus
            c = -a;
            System.out.printf("-(%f) = %f\n", a, c);
            // unary plus
            c = +a;
            System.out.printf("+(%f) = %f\n", a, c);
            // prefix increment
            a = -5.12;
            System.out.printf("++(%f) = %f\n", a, ++a);
            // postfix increment
            a =-5.12;
            System.out.printf("(%f)++ = %f\n", a, a++);
            // prefix decrement
            a = -5.12;
            System.out.printf("--(%f) = %f\n", a, --a);
            // postfix decrement
            a = -5.12;
            System.out.printf("(%f)-- = %f\n", a, a--);
            a = -5.12;
            //!a; //logical complement operator

            System.out.println("\n *** Equality and Relational Operators ***\n");

            // equal to
            System.out.printf("%f == %f --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("%f != %f --> %b\n", a, b, a != b);
            // greater than
            System.out.printf("%f > %f --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("%f < %f --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("%f <= %f --> %b\n", a, b, a <= b);

            System.out.println("\n *** Logical Operators ***\n");

            // logical AND
            System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                                                                    (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                         				           (a > b) & (a > 0));
            // logical OR
            System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                						      (a >= b) || (b != 0));
            // bitwise logical OR
            System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                					            (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,
                					             (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

            System.out.println("\n *** Bitwise Operators ***\n");

            // c = a & b; // bitwise AND
            // c = a | b; // bitwise OR
            // c = a ^ b; // bitwise XOR
            // c = ~a; // bitwise unary compliment
            // c = a << 1; // left shift
            // c = a >> 1; // right shift
            // c = a >>> 1; // zero fill right shift

            System.out.print("Invalid\n");

            System.out.println("\n *** Assignment Operators ***\n");

            c = 2.12;
        
            System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
            System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
            System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
            System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
            System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
            System.out.printf("%f /= %f --> c = %f\n", c, 0.0f, c /= 0);
        
            c = 2.12;
        
            System.out.printf("%f %%= %f --> c = %f\n", c, 0.0f, c %= 0);

            // c |= a;
            // c &= a;
            // c >>= 1;
            // c <<= 1;
            // c >>>= 1;
            // c ^= a;

            System.out.println("\n *** Misc Operators ***");
            System.out.println(" Condition Operator:\n");
        
            System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                                                            (a > b ? a : b));

            System.out.println("\n Type Cast Operator:\n");

            int nt = -73;
            byte bt = 55;
            short sh = -1034;
            char ch = '\u0034';
            long l = 10000000000000000L;
            float f = 3.9f;
            //double d = 78534572.625;
            boolean bool = true;

            c = nt;
            System.out.printf("double = int: c = %d --> c = %f\n", nt, c);
            c = bt;
            System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
            c = sh;
            System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
            c = ch;
            System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
            c =  l;
            System.out.printf("double = long: c = %d --> c = %f\n", l, c);
            c =  f;
            System.out.printf("double = float: c = %f --> c = %f\n", f, c);
            /*c = d;
            System.out.printf("double = double: c = %f --> c = %d\n", d, c);*/
            //c = (double)bool;
            System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool);
	}
	
	public static void testBoolean(){
	    boolean a = true, b = false, c;
		
	    System.out.println("\n ********** Boolean ********* ");
	    System.out.println(" *** Arithmetic Operators ***\n");
		
	    System.out.println(" Invalid\n");
		
	    // c = a + b; // addition
	    // c = a - b; // subtraction
	    // c = a * b; // multiplication
	    // c = a / b; // division
	    // c = a % b; // modulus

	    System.out.println(" *** Simple Assignment Operator ***\n");
		
	    // assignment;
	    a = true;
	    System.out.printf(" a = %b, c = a --> c = %b\n", a, a );
		
	    System.out.println("\n *** Unary Operators ***\n");
		
	    System.out.println(" Invalid");
		
	    // c = -a; // unary minus
	    // c = +a; // unary plus
	    // c = ++a; // prefix increment
	    // c = a++; // postfix increment
	    // c = --a; // prefix decrement
	    // c = a--; // postfix decrement
	    //!a; //logical complement operator
		
	    System.out.println("\n *** Equality and Relational Operators ***\n");
		
	    // equal to
	    System.out.printf("%b == %b --> %b\n", a, b, a == b);
	    // not equal to
	    System.out.printf("%b != %b --> %b\n", a, b, a != b);
		
	    // c = a > b; // greater than
	    // c = a >= b; // greater than or equal to
	    // c = a < b; // less than
	    // c = a <= b; // less than or equal to

	    System.out.println("\n *** Logical Operators ***\n");

	    // logical AND
	    c = a && b;
	    System.out.printf("%b && %b --> %b\n", a, b, c);
		
	    // logical OR
	    c = a || b;
	    System.out.printf("%b || %b --> %b\n", a, b, c);
			
	    // boolean XOR
	    c = a ^ b;
	    System.out.printf("%b ^ %b --> %b\n", a, b, c);
		
	    // logical NOT
	    System.out.printf("!%b --> %b\n", a, !a);

	    System.out.println("\n *** Bitwise Operators ***\n");

	    // bitwise AND
	    c = a & b; 
	    System.out.printf("%b & %b = %b", a, b, c);
		
	    // bitwise OR
	    c = a | b; 
	    System.out.printf("\n%b | %b = %b", a, b, c);

	    // bitwise XOR
	    c = a ^ b; 
	    System.out.printf("\n%b ^ %b = %b\n", a, b, c);

	    // c = ~a;      // bitwise unary compliment
	    // c = a << 1;  // left shift
	    // c = a >> 1;  // right shift
	    // c = a >> 1;  // right shift
	    // c = a >>> 1; // zero fill right shift
	    // c = a >>> 1; // zero fill right shift

	    System.out.println("\n *** Assignment Operators ***");
	    
	    System.out.printf("\n%b |= %b --> c = %b", c, a, c |= a);
	    System.out.printf("\n%b &= %b --> c = %b", c, a, c &= a);
	    System.out.printf("\n%b ^= %b --> c = %b\n", c, a, c ^= a);

	    // c += a;
	    // c -= a;
	    // c *= a;
	    // c /= a;
	    // c %= a;
	    // c >>= 1;
	    // c <<= 1;
	    // c >>>= 1;

            System.out.println("\n *** Misc Operators ***");
            System.out.println(" Condition Operator:\n");

            System.out.printf("%b ? %b : %b --> %b\n", c, a, b, c ? a: b);

            System.out.println("\nType Cast Operator:");

            int  in = -73;
            byte bt = 55;
            short sh = -1034;
            char ch = '\u0034';
            long l = 10000000000000000L;
            float f = 3.9f;
            double d = 78534572.625;
            //boolean bool = true;

            // c = boolean(in);
            // c = boolean(byte);
            // c = boolean(short);
            // c = boolean(char);
            // c = boolean(long);
            // c = boolean(float);
            // c = boolean(double);
            // c = bool;
            System.out.print("\nInvalid\n");

	}

	public static void testString(){

	    String a = "Hello ";
	    String b = "Epam";
	    String c;


	    System.out.println("\n ********** String ********** ");
	    System.out.println(" *** Arithmetic Operators ***\n");

	    // addition (concatenation)
	    c = a + b;
	    System.out.printf("%s + %s = %s\n", a, b, c);

	    // c = a - b; // subtraction
	    // c = a * b; // multiplication
	    // c = a / b; // division
	    //c = a % b; // modulus

	    System.out.println("\n *** Simple Assignment Operator ***\n");

	    // assignment;
		
	    a = "Booyah!";
	    System.out.printf("a = %s, c = a --> c = %s\n", a, a);

	    System.out.println("\n *** Unary Operators ***\n");
		
	    // c = -a; // unary minus
	    // c = +a; // unary plus
	    // ++a;    // prefix increment
	    // a++;    // postfix increment
	    // --a;    //prefix decrement
	    // a--;    //postfix decrement
	    //!a;     //logical complement operator
		
	    System.out.print("Invalid\n");

	    System.out.println("\n *** Equality and Relational Operators ***\n");

	    // equal to (reference equality)
	    System.out.printf("%s == %s --> %b\n", a, b, a == b);

	    // not equal to
	    System.out.printf("%s != %s --> %b\n", a, b, a != b);

	    // a > b;  // greater than
	    // a >= b; // greater than or equal to
	    // a < b;  // less than
	    // a <= b  // less than or equal to

	    System.out.println("\n *** Logical Operators ***\n");

	    System.out.println("Invalid");

	    // a && b;  // logical AND
	    // a & b;   // bitwise logical AND
	    // a || b   // logical OR
	    // a | b    // bitwise logical OR
	    // a ^ b    // logical XOR
	    // !a       // logical NOT

	    System.out.println("\n *** Bitwise Operators ***\n");

	    System.out.println("Invalid");

	    // c = a & b   // bitwise AND
	    // c = a | b   // bitwise OR
	    // c = a ^ b   // bitwise XOR
	    // c = ~a      // bitwise unary compliment
	    // c = a << 1  // left shift
	    // c = a >> 1  // right shift
	    // c = a >>> 1  // zero fill right shift

	    System.out.println("\n *** Assignment Operators ***\n");

	    c = "Epam ";

	    System.out.printf("%s += %s --> c = %s\n", c, a, c += a);

	    // c -= a;
	    // c *= a;
	    // c /= a;
	    // c %= a;
	    // c %= a;
	    // c /= a;
	    // c |= a;
	    // c &= a;
	    // c >>= 1;
	    // c <<= 1;
	    // c >>>= 1;
	    // c ^= a;

	    System.out.println("\n *** Misc Operators ***");
	    System.out.println(" Condition Operator:\n");
	    System.out.printf("%s == %s ? %s : %s --> %s\n", a, b, a, b,
				                                 (a == b ? a : b));

	    System.out.println("\n Type Cast Operator:\n");

	    int nt = -73;
	    byte bt = 55;
	    short sh = -1034;
	    char ch = '\u0034';
	    long l = 10000000000000000L;
	    float f = 3.9f;
	    double d = 78534572.625;
	    boolean bool = true;

	    // c = nt;
	    // c = bt;
	    // c = sh;
	    // c = ch;
	    // c = l;
	    // c = f;
	    // c = d;
	    // c = bool;

	    System.out.print("Invalid\n");

	    System.out.println("\n 'Instanceof' operator: \n"); //specified only for reference types

	    System.out.printf ( "\"%s\" instance of String --> %b\n ", a, (a instanceof String) );

	}
	

	public static void testAnimal(){
	
	    Animal Dog = new Animal("Charlie", 3);
	    
	    Animal Cat = new Animal( "Marlo", 5);

	    Animal Unknown = new Animal("Unknown", 0);

	    System.out.println("\n ********** User's reference type (claas Animal) ********** ");
	    System.out.println(" ****************** Arithmetic Operators ******************\n");

	    // Unknown = Dog + Cat; // addition
	    // Unknown = Dog - Cat; // subtraction
	    // Unknown = Dog * Cat; // multiplication
	    // Unknown = Dog * Cat; // division
	    // Unknown = Dog % Cat; // modulus

		
	    System.out.print("Invalid\n");

	    System.out.println("\n *** Simple Assignment Operator ***\n");

	    // assignment;
		
	    Unknown = Cat;
		
	    System.out.printf("%s = %s\n", Unknown, Dog);

	    System.out.println("\n *** Unary Operators ***\n");


	    // Dog = -Dog;  // unary minus
	    // Dog = +Dog;  // unary plus
	    // ++Dog;       // prefix increment
	    // Dog++;       // postfix increment
	    // --Dog;       // prefix decrement
	    // Dog--;       // postfix decrement
	    // !Dog;        // logical complement operator

            System.out.print("Invalid\n");

            System.out.println("\n *** Equality and Relational Operators ***\n");

            // equal to
            System.out.printf("Dog == Cat --> %b\n", Dog == Cat);
            // not equal to
            System.out.printf("Dog != Cat --> %b\n", Dog != Cat);

            // Dog > Cat;   // greater than
            // Dog >= Cat;  // greater than or equal to
            // Dog < Cat;   // less than
            // Dog <= Cat;  // less than or equal to

            System.out.println("\n *** Logical Operators ***\n");
            
            // Dog && Cat;  // logical AND
            // Dog & Cat;   // bitwise logical AND
            // Dog || Cat;  // logical OR
            // Dog | Cat;   // bitwise logical OR
            // Dog ^ Cat;   // logical XOR
            // !Dog;        // logical NOT

            System.out.print("Invalid\n");

            System.out.println("\n *** Bitwise Operators ***\n");

            // Unknown = Dog & Cat;  // bitwise AND
            // Unknown = Dog | Cat;  // bitwise OR
            // Unknown = Dog ^ Cat;  // bitwise XOR
            // Unknown = ~Dog;       // bitwise unary compliment
            // Unknown = Dog << 1;   // left shift
            // Unknown = Dog >> 1;   // right shift
            // Unknown = Dog >>> 1;  // zero fill right shift

            System.out.print("Invalid\n");

            System.out.println("\n *** Assignment Operators ***\n");

            // Creature += Dog;
            // Creature -= Dog;
            // Creature *= Dog;
            // Creature /= Dog;
            // Creature %= Dog;
            // Creature |= Dog;
            // Creature &= Dog;
            // Creature >>= Dog;
            // Creature <<= Dog;
            // Creature >>>= Dog;
            // Creature ^= Dog;

            System.out.print("Invalid\n");

            System.out.println("\n *** Misc Operators ***");
            System.out.println(" Condition Operator:\n");
            System.out.printf("%s == %s ? %s : %s --> %s\n",Cat, Dog, Cat, Dog, (Cat == Dog) ? Cat : Dog);

            System.out.println("\n 'Instanceof' operator: \n"); //specified only for reference types

            System.out.printf ( "\"%s\" instance of Animal --> %b\n ", Dog, (Dog instanceof Animal) );

            System.out.println("\n Type Cast Operator:\n");

            int nt = -73;
            byte bt = 55;
            short sh = -1034;
            char ch = '\u0034';
            long l = 10000000000000000L;
            float f = 3.9f;
            double d = 78534572.625;
            boolean bool = true;

            //Cat = nt;
            //Cat = bt;
            //Cat = sh;
            //Cat = ch;
            //Cat =  l;
            //Cat =  f;
            //Cat =  d;
            //Cat = bool;
		
            Animal Rabbit = new Animal("Moony", 1);
            Creature Rabbito = Rabbit;
            
            System.out.print("Upcasting: subclass (Animal) to superclass (Creature):\nAnimal Rabbit = new Animal(\"Moony\")\n");
            System.out.print("Creature Rabbito = Rabbit\n");
		
            Creature Coon = new Animal("Donny", 2);
            Animal MainCoon = (Animal)Coon;

            System.out.print("\nDowncasting: superclass (Creature) to subclass (Animal):\n");
            System.out. print("Creature Coon = new Animal(\"Donny\", 2)\nAnimal MainCoon = (Animal)Coon\n ");
		
	}

	static class Animal extends Creature {

	    public String name;
	    public int age;

	    /* Constructor */
	    public Animal(String name, int age) {
		this.age = age;
		this.name = name;
	    }

	    public String Innoculate(int age) {

	        String status;

		if (age < 3) {
		    status = "Underaged for innoculation...";

		} else {
		    status = "Successfully innoculated!";
		}
		return status;
	    }
	}

	static class Creature{

	    public String name;
	    public int weight;
	    public int age;

	}

	public static char StringtoChar(char ch){

	    String str = Integer.toHexString(ch);

	    // parse string for integer (16 bit)
            int parse = Integer.parseInt(str, 16);

            // converts parse in to its UTF-16 representation stored in a char array
            char result[] = Character.toChars(parse);

            // we need only one char
            return result[0];
	}
}
