package com.company;

/**
 * This is javadoc
 */
public class _2_Generating_Javadocs {
    /**
     *
     * @param args these are arguments
     */


    public static void main(String[] args) {
        System.out.println("i am main");
    }

    /**
     *
     * @param a is added first num
     *
     * @param b is added second num
     * @return a+b
     * @throws Exception
     * @deprecated this is not right way
     * 
     */
    public int add(int a ,int b)throws Exception
    {if (a==0){
        throw new Exception();
    }
        return a+b;
    }
}
