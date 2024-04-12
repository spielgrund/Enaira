package Enaira;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String string = "Hallo Welt, dies ist eine Testnachricht. Schauen wir mal, ob es funktioniert!";
        String[] split = string.split("");
        StringBuilder sb = new StringBuilder();
//        for(String s : split){
//            sb.append(s);
//        }
        //System.out.println(sb);
        System.out.println();
        String[] array = Arrays.copyOf(split,split.length);
        System.out.println(array);

    }


}
