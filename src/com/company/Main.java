package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите 5 имен: ");
            listA.add(in.nextLine());
        }
        Iterator<String> iterA = listA.iterator();
        System.out.printf("Вы ввели следущие именаA: \n", listA);
        while (iterA.hasNext()){
            System.out.println(iterA.next());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите 5 имен: ");
            listB.add(in.nextLine());
        }
        Iterator<String> iterB = listB.iterator();
        System.out.printf("Вы ввели следущие именаB: \n", listB);
        while (iterB.hasNext()){
            System.out.println(iterB.next());
        }

        Collections.reverse(listB);
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));

        } System.out.println("Список C" + listC);

        Comparator<String> dlinaListC = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(listC, dlinaListC);
        Iterator<String> iterC = listC.iterator();
        while (iterC.hasNext()){
            System.out.println(iterC.next());
        }
    }
}
