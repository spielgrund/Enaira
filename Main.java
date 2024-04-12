package Enaira;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var io = new IO();
        var rauschen = new Rauschen();

//        Gradient gradient = new Gradient(0,5000,5);
//        System.out.println(gradient);

        String string = "Hallo Welt, dies ist eine Testnachricht. Schauen wir mal, ob es funktioniert!";
        //io.write("nachricht1.txt",string);
        int wdh = 10;
        String[] stringarr = new String[wdh];
        //System.out.println(rauschen.rauschenHinzufuegen(string, 25));
        for (int i = 0; i < wdh; i++) {
            stringarr[i] = rauschen.rauschenHinzufuegen(string, 25 );
        }
        System.out.println(Arrays.toString(stringarr));
        String ergebniss = rauschen.rauschenEntfernen(stringarr);
        System.out.println(ergebniss);
    }
}
