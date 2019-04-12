package com.company;
import java.util.*;



public class PhoneBook {private HashMap<String, PhoneRecord> pb;
    private Scanner sc = new Scanner(System.in);
    public PhoneBook() {
        pb = new HashMap<String, PhoneRecord>();
        pb.put("Ермолаев", new PhoneRecord("746-52-34", "ermolaev@mail.com"));
        pb.put("Васюткин", new PhoneRecord("895-78-18", "vas@mail.com"));
        pb.put("Беглов", new PhoneRecord("422-46-13", "beglov@mail.com"));
        pb.put("Капрош", new PhoneRecord("746-11-41", "kaprosh@mail.com"));
    }



    public void go() {
        System.out.print("Узнать номер телефона по фамилии: ");
        System.out.println(getPhoneByName(sc.next().toLowerCase()));

        System.out.print("Узнать электронную почту по фамилии:  ");
        System.out.println(getEmailByName(sc.next().toLowerCase()));
    }

    public String getPhoneByName(String name) {
        try {
            PhoneRecord o = pb.get(name);
            return o.getPhone();
        } catch(NullPointerException e) {
            return "Не найти";
        }
    }

    public String getEmailByName(String name) {
        try {
            PhoneRecord o = pb.get(name);
            return o.getEmail();
        } catch(NullPointerException e) {
            return "Не найти";
        }
    }
}
