package Enaira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Gradient {
    private int min;
    private int max;
    private int size;
    private ArrayList<Integer> arraylist = new ArrayList<>();

    Random random = new Random();
    public Gradient(int min, int max, int size){
        for (int i = min; i <= max; i++) {
            arraylist.add(i);
        }
        Collections.shuffle(arraylist);
        ArrayList<Integer> temp = new ArrayList<>(arraylist.subList(0,size));
        arraylist = temp;

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Integer> getArraylist() {
        return arraylist;
    }

    public void setArraylist(ArrayList<Integer> arraylist) {
        this.arraylist = arraylist;
    }

    @Override
    public String toString() {
        return arraylist.toString();
    }
}
