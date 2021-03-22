package controller;
import entity.PhoneBook;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class PhoneBookCrawler {
    public Optional findPhoneByNameAndPunishIfNothingFound(String nametobecheck)
    {
        PhoneBook obj=new PhoneBook();
       Optional result= obj.findPhoneByName(nametobecheck);
       if(result.isPresent())
           return Optional.of(result.get());

       return Optional.of("Punish");

    }
    public Optional findPhoneByNameAndPrintPhoneBookIfNothingFound(String nametobecheck)
    {
        PhoneBook obj=new PhoneBook();
        obj.LoadData();
        Optional result= obj.findPhoneByName(nametobecheck);
        if(result.isPresent())
            return Optional.of(result.get());

        return Optional.of(obj.getPhonebook());

    }
    public Optional findPhoneByNameAndPunishIfNothingFoundStream(String nametobecheck)
    {
        PhoneBook obj=new PhoneBook();
        obj.LoadData();
        Optional result=obj.getPhonebook().entrySet().stream().filter( e -> nametobecheck.equalsIgnoreCase(e.getKey())).map(Map.Entry::getValue).findFirst();
        if(result.isPresent())
            return Optional.of(result.get());
        return Optional.of("Punish");

    }
    public Optional findPhoneByNameAndPrintPhoneBookIfNothingFoundStream(String nametobecheck)
    {
        PhoneBook obj=new PhoneBook();
        obj.LoadData();
        Optional result=obj.getPhonebook().entrySet().stream().filter( e -> nametobecheck.equalsIgnoreCase(e.getKey())).map(Map.Entry::getValue).findFirst();
        if(result.isPresent())
            return Optional.of(result.get());
        return Optional.of(obj.getPhonebook());
    }
    public Optional findPhoneNumberByNameOrNameByPhoneNumber(String nametobesearch,int numertobesearch)
    {
        PhoneBook obj=new PhoneBook();
        obj.LoadData();
        Optional result=obj.findNameByPhoneNumber(nametobesearch,numertobesearch );
        if(result.isPresent())
            return Optional.of(result.get());

        return Optional.empty();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the no of data");
        int noofdata=sc.nextInt();
        PhoneBook obj=new PhoneBook();
        obj.LoadData();
        for (Map.Entry mapElement:obj.getPhonebook().entrySet()
        ) {String key=(String)mapElement.getKey();

            System.out.println(key);

        }
        PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler();

        //Exercise 2
        Optional phone = phoneBookCrawler.findPhoneByNameAndPunishIfNothingFound("punit");
        System.out.println(phone);

        Optional phone2 = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("niki");

        Optional phone3 = phoneBookCrawler.findPhoneByNameAndPunishIfNothingFoundStream("niki");

        Optional phone4 = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundStream("punit");
        Optional phone7 = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("niki",
                84475);
    }





}
