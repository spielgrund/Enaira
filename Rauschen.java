package Enaira;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Rauschen {
    Random rnd = new Random();
    int rndsize = 25;


    public String rauschenHinzufuegen(String string,double prozentsatz){
        //System.out.println(string);
        String[] stringarray = string.split("");
        //System.out.println(Arrays.toString(stringarray));

        int i = 0;
        double prozentvonstring = (double) stringarray.length / 100 * prozentsatz;
        Gradient gradient = new Gradient(0,stringarray.length-1,(int)prozentvonstring);
        //System.out.println(prozentvonstring);
        //System.out.println(gradient);
        for(int al : gradient.getArraylist()){
            char c = stringarray[al].charAt(0);
            stringarray[al] = String.valueOf((char)(c + rnd.nextInt(rndsize)));
        }

        //System.out.println(Arrays.toString(stringarray));
        return Arrays.toString(stringarray);
    }

    public String rauschenEntfernen(String[] stringarr){
        //System.out.println(Arrays.toString(stringarr));
        int hack = 0;
        int anzahlarrays = stringarr.length;
        int laengearrays = stringarr[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < laengearrays; i++) {
                char[] temp = new char[anzahlarrays];
            for (int j = 0; j < anzahlarrays; j++) {
                temp[j] = stringarr[j].charAt(i);

            }
            //System.out.print(maxChar(temp));
            String s = String.valueOf(maxChar(temp));
            //System.out.println(s);

                sb.append(s);

        }
        //System.out.println(sb.toString());
       // System.out.println(sb);
        return sb.toString();
    }

    public char doppelChar(char[] chararr){
        for (int i = 0; i < chararr.length; i++) {
            for (int j = 0; j < chararr.length; j++) {
                if(i != j && chararr[i] == chararr[j]){
                    return chararr[i];
                }
            }

        }
        return chararr[0];
    }

    public char maxChar(char[] chararr){
        int[] intarr = new int[200];
        for(char c : chararr){
            //System.out.println(c);
            intarr[c]++;
        }

        return (char)maximum_index(intarr);
    }
    static int maximum_index(int[] a)
    {
        int maximum,index=0,i=1;
        maximum=a[0];
        while(i<a.length)
        {
            if(maximum<a[i])
            {
                maximum=a[i];
                index=i;
            }
            i++;
        }
        return index;
    }
}
