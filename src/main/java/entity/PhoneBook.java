package entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.stream.Stream;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneBook {
    static Map<String,Integer> phonebook=new HashMap<String, Integer>();
    static int noofenteries;
    public void LoadData()
    {

           phonebook.put("punit",896 );
           phonebook.put("niki", 59);

    }
public Optional findPhoneByName(String Name)
  {

      if(phonebook.containsKey(Name))
      {
          return Optional.of(phonebook.get(Name));
      }
      if(Name=="")
      {
          String str="No Number associated with Name";
          return Optional.ofNullable(str);
      }
      return Optional.empty();

  }
    public Optional findNameByPhoneNumber(String name,int phonenumber)
    {

         Optional result=phonebook.entrySet().stream().filter(e -> name.equals(e.getKey())).map(Map.Entry::getValue).findFirst();
         if(result.isPresent())
         {
             return result;
         }
         return phonebook.entrySet().stream().filter(e ->phonenumber==e.getValue()).map(Map.Entry::getValue).findFirst();

    }
    public Map<String, Integer> getPhonebook() {
        return phonebook;
    }
    public void setPhonebook(Map<String, Integer> phonebook) {
        this.phonebook = phonebook;
    }
    @Override
    public String toString() {
        return "PhoneBook{" +
                "noofenteries=" + noofenteries +

                ", phonebook=" + phonebook +
                '}';
    }





}
