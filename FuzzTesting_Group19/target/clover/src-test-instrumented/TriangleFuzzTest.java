/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */import java.util.Random;

public class TriangleFuzzTest {static class __CLR4_4_18a8alwxm8voq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u004d\u0061\u006e\u0075\u006c\u0061\u005c\u005c\u0041\u0063\u0061\u0064\u0065\u006d\u0069\u0063\u0073\u005c\u005c\u004d\u0061\u0073\u0074\u0065\u0072\u0020\u0069\u006e\u0020\u0043\u0079\u0062\u0065\u0072\u0020\u0053\u0065\u0063\u0075\u0072\u0069\u0074\u0079\u005c\u005c\u0053\u0065\u006d\u0020\u0033\u005c\u005c\u0053\u0045\u004e\u0047\u0036\u0033\u0032\u0030\u0020\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0020\u0056\u0065\u0072\u0069\u0066\u0069\u0063\u0061\u0074\u0069\u006f\u006e\u0020\u0061\u006e\u0064\u0020\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0041\u0073\u0073\u0069\u0067\u006e\u006d\u0065\u006e\u0074\u0020\u0032\u005c\u005c\u0043\u006f\u0064\u0065\u0062\u0061\u0073\u0065\u005c\u005c\u0046\u0075\u007a\u007a\u005f\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u005f\u004b\u0057\u0049\u0043\u005f\u0050\u0072\u006f\u0067\u0072\u0061\u006d\u005c\u005c\u0046\u0075\u007a\u007a\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u005f\u0047\u0072\u006f\u0075\u0070\u0031\u0039\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717337230331L,8589935092L,347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_18a8alwxm8voq.R.inc(298);
        __CLR4_4_18a8alwxm8voq.R.inc(299);int maxIterations = 10;
        __CLR4_4_18a8alwxm8voq.R.inc(300);Random rand = new Random();
        __CLR4_4_18a8alwxm8voq.R.inc(301);int upperBound = 10;
        __CLR4_4_18a8alwxm8voq.R.inc(302);int[] outputs = new int[5]; // To track each unique output

        __CLR4_4_18a8alwxm8voq.R.inc(303);long startTime = System.currentTimeMillis();
        __CLR4_4_18a8alwxm8voq.R.inc(304);int i;
        __CLR4_4_18a8alwxm8voq.R.inc(305);for (i = 0; (((i < maxIterations)&&(__CLR4_4_18a8alwxm8voq.R.iget(306)!=0|true))||(__CLR4_4_18a8alwxm8voq.R.iget(307)==0&false)); i++) {{
            __CLR4_4_18a8alwxm8voq.R.inc(308);int a = rand.nextInt(upperBound); // Generate random integers upto upperBound
            __CLR4_4_18a8alwxm8voq.R.inc(309);int b = rand.nextInt(upperBound);
            __CLR4_4_18a8alwxm8voq.R.inc(310);int c = rand.nextInt(upperBound);

            __CLR4_4_18a8alwxm8voq.R.inc(311);String result = TriangleProgram.triangle(a, b, c);
            __CLR4_4_18a8alwxm8voq.R.inc(312);System.out.println("Test " + (i + 1) + ": " + a + ", " + b + ", " + c + " -> " + result);

            __CLR4_4_18a8alwxm8voq.R.inc(313);if ((((result.equals("non-triangle"))&&(__CLR4_4_18a8alwxm8voq.R.iget(314)!=0|true))||(__CLR4_4_18a8alwxm8voq.R.iget(315)==0&false))) {{
                __CLR4_4_18a8alwxm8voq.R.inc(316);outputs[0]++;
            } }else {__CLR4_4_18a8alwxm8voq.R.inc(317);if ((((result.equals("equilateral triangle"))&&(__CLR4_4_18a8alwxm8voq.R.iget(318)!=0|true))||(__CLR4_4_18a8alwxm8voq.R.iget(319)==0&false))) {{
                __CLR4_4_18a8alwxm8voq.R.inc(320);outputs[1]++;
            } }else {__CLR4_4_18a8alwxm8voq.R.inc(321);if ((((result.equals("isosceles triangle"))&&(__CLR4_4_18a8alwxm8voq.R.iget(322)!=0|true))||(__CLR4_4_18a8alwxm8voq.R.iget(323)==0&false))) {{
                __CLR4_4_18a8alwxm8voq.R.inc(324);outputs[2]++;
            } }else {__CLR4_4_18a8alwxm8voq.R.inc(325);if ((((result.equals("triangle"))&&(__CLR4_4_18a8alwxm8voq.R.iget(326)!=0|true))||(__CLR4_4_18a8alwxm8voq.R.iget(327)==0&false))) {{
                __CLR4_4_18a8alwxm8voq.R.inc(328);outputs[3]++;
            } }else {__CLR4_4_18a8alwxm8voq.R.inc(329);if ((((result.equals(""))&&(__CLR4_4_18a8alwxm8voq.R.iget(330)!=0|true))||(__CLR4_4_18a8alwxm8voq.R.iget(331)==0&false))) {{
                __CLR4_4_18a8alwxm8voq.R.inc(332);outputs[4]++; // Capture any errors or undefined results
            }

            // Check if all possible outputs have been found
            }}}}}__CLR4_4_18a8alwxm8voq.R.inc(333);if ((((outputs[0] > 0 && outputs[1] > 0 && outputs[2] > 0 && outputs[3] > 0)&&(__CLR4_4_18a8alwxm8voq.R.iget(334)!=0|true))||(__CLR4_4_18a8alwxm8voq.R.iget(335)==0&false))) {{
                __CLR4_4_18a8alwxm8voq.R.inc(336);break;
            }
        }}
        }__CLR4_4_18a8alwxm8voq.R.inc(337);long endTime = System.currentTimeMillis();
        __CLR4_4_18a8alwxm8voq.R.inc(338);long duration = endTime - startTime;

        // Print the results
        __CLR4_4_18a8alwxm8voq.R.inc(339);System.out.println("Fuzz Testing Results:");
        __CLR4_4_18a8alwxm8voq.R.inc(340);System.out.println("Non-triangle: " + outputs[0]);
        __CLR4_4_18a8alwxm8voq.R.inc(341);System.out.println("Equilateral triangle: " + outputs[1]);
        __CLR4_4_18a8alwxm8voq.R.inc(342);System.out.println("Isosceles triangle: " + outputs[2]);
        __CLR4_4_18a8alwxm8voq.R.inc(343);System.out.println("Ordinary triangle: " + outputs[3]);
        __CLR4_4_18a8alwxm8voq.R.inc(344);System.out.println("Errors: " + outputs[4]);
        __CLR4_4_18a8alwxm8voq.R.inc(345);System.out.println("Total iterations: " + i);
        __CLR4_4_18a8alwxm8voq.R.inc(346);System.out.println("Time taken: " + duration + " ms");
    }finally{__CLR4_4_18a8alwxm8voq.R.flushNeeded();}}
}

