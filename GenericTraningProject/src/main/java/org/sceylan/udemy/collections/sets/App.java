package org.sceylan.udemy.collections.sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void run() {

        List<Contact> emails =  ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
//        printData("Phone List", phones);
//        printData("Email List", emails);

        Set<Contact> emails_ =  new HashSet<>(emails);
        Set<Contact> phones_ = new HashSet<>(phones);
//        printData("Phone List", phones_);
//        printData("Email List", emails_);

        Set<Contact> union = new HashSet<>();
        union.addAll(emails_);
        union.retainAll(phones_);
        printData("union",union);
//        int index =  emails.indexOf(new Contact("Robin Hood"));
//        Contact robinHood = emails.get(index);
//        robinHood.addEmail("Aselsan Havelsan");
//        System.out.println(robinHood);
    }

    public static void printData(String header, Collection<Contact> contacts) {

        System.out.println("----------------------------------------------");
        System.out.println(header);
        System.out.println("----------------------------------------------");
        contacts.forEach(System.out::println);
    }
}
