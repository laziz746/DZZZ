package com.company;


import java.util.*;

public class Main {



    public static void main(String[] args) {
        String text = "\n" +
                "\n" +
                "Люблю тебя, Петра творенье, Люблю твой строгий, стройный вид,Невы державное теченье, Береговой ее гранит, Твоих оград узор чугунный, Твоих задумчивых ночей Прозрачный сумрак, блеск безлунный, Когда я в комнате моей" +
                "Пишу, читаю без лампады, И ясны спящие громады Пустынных улиц, и светла Адмиралтейская игла";



        S tring[] words = text.toLowerCase().split(" ");

        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Set<Map.Entry<String, Integer>> set = hm.entrySet();

        for (String word : words) {
            int value = 0;
            try {
                value = hm.get(word);
            } catch(NullPointerException e) { }
            hm.put(word, value + 1);
        }
        hm.forEach((k, v) -> System.out.println( k + ": " + v));


        System.out.println("Стихиотворение имеет" + hm.size() + " неповторяющихся слов.");



        PhoneBook pb = new PhoneBook();
        pb.go();

    }
}
