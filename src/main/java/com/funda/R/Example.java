package com.funda.R;

/**
 * Created by wonjun-pc on 2016-06-02.
 */

import org.rosuda.JRI.Rengine;
import org.rosuda.JRI.REXP;

public class Example {
    public static void main (String[] args)
    {
        System.out.println("Creating Rengine (with arguments)");
        System.out.println(System.getProperty("java.library.path"));
        String[] Rargs = {"--vanilla"};
        Rengine re = new Rengine(Rargs, false, null);
        System.out.println("Rengine created, waiting for R");

        if (!re.waitForR()) {
            System.out.println("Cannot load R");
            return;
        }

        REXP rn = re.eval("rnorm(4)");
        double[] rnd = rn.asDoubleArray();

        for(int i=0; i<rnd.length; i++){
            System.out.print(rnd[i] + " ");
        }
        System.out.println();

        re.end();
        System.out.println("Bye.");
    }
}