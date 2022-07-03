//Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера),
//если будут дубликаты фамилий, то должны выводиться оба номера
//(если помним Map не может хранить дубликаты, будет заменять номер телефона по ключу, нужно подумать как не допустить такого)


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//import java.util.Scanner;

public class Task1 { 
 
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<String, String>();
 
        phonebook.put("1121", "Иванов");
        phonebook.put("1122", "Петров");
        phonebook.put("1123", "Сидоров");
        phonebook.put("1124", "Иванов");

        Scanner iScanner=new Scanner(System.in);
        System.out.println("Введите фамилию  ");
        String Name= iScanner.nextLine();
        // System.out.println("Введите номер  ");
        // String PhoneNumber= iScanner.nextLine();
        iScanner.close();
                
        Set<Map.Entry<String,String>> contacts = phonebook.entrySet();
 
        for (Map.Entry<String,String> contact: contacts) {
            String phoneNumber = contact.getKey();
            final String name = contact.getValue();
            System.out.println(phoneNumber + " "+ name);
            
            // if (contact.getValue().equals(Name)) return contact.getKey();
            // System.out.println(name + phonebook.get(phoneNumber));

            if (phonebook.containsValue(Name))
            System.out.println(name + phonebook.get(name));
            
            // if (phonebook.containsKey(PhoneNumber))
            // System.out.println(name + phonebook.get(phoneNumber));
            
            else System.out.println("Нет в справочнике");
           
            
        }
    } 
}       