package Enaira;
import java.util.Arrays;

//Die Raumsonde Vojager befindet sich am Rande des Sonnensystems. Um trotzdem Nachrichten in guter Qualität zur Erde schicken zu können,
//werden die Nachrichten mehrfach hintereinander gesendet, damit man Fehler in der Übertragung ausgleichen kann. Baue diese Funktion in Java nach.
//Die Nachrichten sollen erst zu einem bestimmten Prozentsatz zufällig verrauscht werden. Danach werden mehrere verrauschte Nachrichten gesammelt
//und wieder entrauscht. Viel Erfolg!

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
        System.out.println(rauschen.rauschenHinzufuegen2(string, 50));
        for (int i = 0; i < wdh; i++) {
            stringarr[i] = rauschen.rauschenHinzufuegen2(string, 75 );
        }
        System.out.println(Arrays.toString(stringarr));
        String ergebniss = rauschen.rauschenEntfernen(stringarr);
        System.out.println("/////////////////////////////");
        System.out.println(new String(ergebniss));
    }
}
