/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */import java.util.Random;

public class TriangleFuzzTest {static class __CLR4_4_18f8flx0dvsel{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u004d\u0061\u006e\u0075\u006c\u0061\u005c\u005c\u0041\u0063\u0061\u0064\u0065\u006d\u0069\u0063\u0073\u005c\u005c\u004d\u0061\u0073\u0074\u0065\u0072\u0020\u0069\u006e\u0020\u0043\u0079\u0062\u0065\u0072\u0020\u0053\u0065\u0063\u0075\u0072\u0069\u0074\u0079\u005c\u005c\u0053\u0065\u006d\u0020\u0033\u005c\u005c\u0053\u0045\u004e\u0047\u0036\u0033\u0032\u0030\u0020\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0020\u0056\u0065\u0072\u0069\u0066\u0069\u0063\u0061\u0074\u0069\u006f\u006e\u0020\u0061\u006e\u0064\u0020\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0041\u0073\u0073\u0069\u0067\u006e\u006d\u0065\u006e\u0074\u0020\u0032\u005c\u005c\u0043\u006f\u0064\u0065\u0062\u0061\u0073\u0065\u005c\u005c\u0046\u0075\u007a\u007a\u005f\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u005f\u004b\u0057\u0049\u0043\u005f\u0050\u0072\u006f\u0067\u0072\u0061\u006d\u005c\u005c\u0046\u0075\u007a\u007a\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u005f\u0047\u0072\u006f\u0075\u0070\u0031\u0039\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717504581094L,8589935092L,352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_18f8flx0dvsel.R.inc(303);
        __CLR4_4_18f8flx0dvsel.R.inc(304);int maxIterations = 10000;
        __CLR4_4_18f8flx0dvsel.R.inc(305);Random rand = new Random();
        __CLR4_4_18f8flx0dvsel.R.inc(306);int upperBound = 10;
        __CLR4_4_18f8flx0dvsel.R.inc(307);int[] outputs = new int[5]; // To track each unique output

        __CLR4_4_18f8flx0dvsel.R.inc(308);long startTime = System.currentTimeMillis();
        __CLR4_4_18f8flx0dvsel.R.inc(309);int i;
        __CLR4_4_18f8flx0dvsel.R.inc(310);for (i = 0; (((i < maxIterations)&&(__CLR4_4_18f8flx0dvsel.R.iget(311)!=0|true))||(__CLR4_4_18f8flx0dvsel.R.iget(312)==0&false)); i++) {{
            __CLR4_4_18f8flx0dvsel.R.inc(313);int a = rand.nextInt(upperBound); // Generate random integers upto upperBound
            __CLR4_4_18f8flx0dvsel.R.inc(314);int b = rand.nextInt(upperBound);
            __CLR4_4_18f8flx0dvsel.R.inc(315);int c = rand.nextInt(upperBound);

            __CLR4_4_18f8flx0dvsel.R.inc(316);String result = TriangleProgram.triangle(a, b, c);
            __CLR4_4_18f8flx0dvsel.R.inc(317);System.out.println("Test " + (i + 1) + ": " + a + ", " + b + ", " + c + " -> " + result);

            __CLR4_4_18f8flx0dvsel.R.inc(318);if ((((result.equals("non-triangle"))&&(__CLR4_4_18f8flx0dvsel.R.iget(319)!=0|true))||(__CLR4_4_18f8flx0dvsel.R.iget(320)==0&false))) {{
                __CLR4_4_18f8flx0dvsel.R.inc(321);outputs[0]++;
            } }else {__CLR4_4_18f8flx0dvsel.R.inc(322);if ((((result.equals("equilateral triangle"))&&(__CLR4_4_18f8flx0dvsel.R.iget(323)!=0|true))||(__CLR4_4_18f8flx0dvsel.R.iget(324)==0&false))) {{
                __CLR4_4_18f8flx0dvsel.R.inc(325);outputs[1]++;
            } }else {__CLR4_4_18f8flx0dvsel.R.inc(326);if ((((result.equals("isosceles triangle"))&&(__CLR4_4_18f8flx0dvsel.R.iget(327)!=0|true))||(__CLR4_4_18f8flx0dvsel.R.iget(328)==0&false))) {{
                __CLR4_4_18f8flx0dvsel.R.inc(329);outputs[2]++;
            } }else {__CLR4_4_18f8flx0dvsel.R.inc(330);if ((((result.equals("triangle"))&&(__CLR4_4_18f8flx0dvsel.R.iget(331)!=0|true))||(__CLR4_4_18f8flx0dvsel.R.iget(332)==0&false))) {{
                __CLR4_4_18f8flx0dvsel.R.inc(333);outputs[3]++;
            } }else {__CLR4_4_18f8flx0dvsel.R.inc(334);if ((((result.equals(""))&&(__CLR4_4_18f8flx0dvsel.R.iget(335)!=0|true))||(__CLR4_4_18f8flx0dvsel.R.iget(336)==0&false))) {{
                __CLR4_4_18f8flx0dvsel.R.inc(337);outputs[4]++; // Capture any errors or undefined results
            }
            // Check if all possible outputs have been found
            }}}}}__CLR4_4_18f8flx0dvsel.R.inc(338);if ((((outputs[0] > 0 && outputs[1] > 0 && outputs[2] > 0 && outputs[3] > 0)&&(__CLR4_4_18f8flx0dvsel.R.iget(339)!=0|true))||(__CLR4_4_18f8flx0dvsel.R.iget(340)==0&false))) {{
                __CLR4_4_18f8flx0dvsel.R.inc(341);break;
            }
        }}
        }__CLR4_4_18f8flx0dvsel.R.inc(342);long endTime = System.currentTimeMillis();
        __CLR4_4_18f8flx0dvsel.R.inc(343);long duration = endTime - startTime;

        // Print the results
        __CLR4_4_18f8flx0dvsel.R.inc(344);System.out.println("--------Fuzz Testing Results:---------");
        __CLR4_4_18f8flx0dvsel.R.inc(345);System.out.println("Non-triangle: " + outputs[0]);
        __CLR4_4_18f8flx0dvsel.R.inc(346);System.out.println("Equilateral triangle: " + outputs[1]);
        __CLR4_4_18f8flx0dvsel.R.inc(347);System.out.println("Isosceles triangle: " + outputs[2]);
        __CLR4_4_18f8flx0dvsel.R.inc(348);System.out.println("Ordinary triangle: " + outputs[3]);
        __CLR4_4_18f8flx0dvsel.R.inc(349);System.out.println("Errors: " + outputs[4]);
        __CLR4_4_18f8flx0dvsel.R.inc(350);System.out.println("Total iterations: " + i);
        __CLR4_4_18f8flx0dvsel.R.inc(351);System.out.println("Time taken: " + duration + " ms");
    }finally{__CLR4_4_18f8flx0dvsel.R.flushNeeded();}}
}

