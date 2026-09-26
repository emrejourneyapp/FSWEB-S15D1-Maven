package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List<String> groceryList= new ArrayList<>();
    Scanner s = new Scanner(System.in);
    public void startGrocery(){
        while(true){
            System.out.println("Merhaba işlem seçiniz :");
            System.out.println("0 uygulamayı durduracak.");
            System.out.println("1 e tıklandığında ekrana bir prompt bastırın.");
            System.out.println("2 e tıklandığında ekrana bir prompt bastırın.");
            String input;
            int state = s.nextInt();
            s.nextLine();
            if(state == 0){
                System.exit(0);
            } else if(state == 1){
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.(Birden fazla için , kullanabilirsiniz)");
                input = s.nextLine();
                addItems(input);
            } else if(state == 2){
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.(Birden fazla için , kullanabilirsiniz)");
                input = s.nextLine();
                removeItems(input);
            }
        }
    }

    public void addItems(String input){
        //input : elma / elma,armut / elma, armut, muz /
        String[] items = input.split(",");
        for(String item : items){
            item = item.trim();
            if(!checkItemIsInList(item)){
                groceryList.add(item);
            } else{
                System.out.println("Listede var: " + item);
            }
        }
        printSorted();
    }
    public void removeItems(String input){
        String[] items = input.split(",");
        for(String item : items){
            item = item.trim();
            if(checkItemIsInList(item)){
                groceryList.remove(item);
            } else{
                System.out.println("Listede yok: " + item);
            }
        }
        printSorted();
    }
    public boolean checkItemIsInList(String product){
        return groceryList.contains(product);//küçük büyük harf
    }
    public void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }

}
