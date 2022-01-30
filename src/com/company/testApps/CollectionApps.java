package com.company.testApps;

import java.util.Scanner;
import java.util.TreeSet;

public class CollectionApps {
    public static void main(String[] args) {
        TreeSet<String> mailSet = new TreeSet<>();
        mailSet.add("kirill@yandex.ru");
        mailSet.add("kirill@mail.ru");
        mailSet.add("L337kampot@gmail.com");
        mailSet.add("Kampot1337@yandex.ru");
        Scanner vvod = new Scanner(System.in);
        String command = " ";
        System.out.println("Введите команду! \n LIST || ADD || EXIT");
        while (!command.equals("EXIT"))
        {
            command = vvod.nextLine();
            switch (command)
            {
                case ("LIST"):
                    System.out.println("email Adress LIST: ");
                    for (String email : mailSet)
                    {
                        System.out.println(email);
                    }
                    break;
                case ("ADD"):
                    System.out.print("Введите email адресс для добавления: ");
                    String adress = vvod.nextLine();
                    adress = adress.trim();
                    if(adress.contains("@") && adress.contains(".ru"))
                    {
                        mailSet.add(adress);
                        System.out.println("Адрес успешно добавлен!");
                    }
                    else if (adress.contains("@") && adress.contains(".com"))
                    {
                        mailSet.add(adress);
                        System.out.println("Адрес успешно добавлен!");
                    }
                    else
                    {
                        System.out.println("Неверный формат адреса.");
                    }
                    break;
                case ("EXIT"):
                    System.out.println("Работа завершена.");
                    break;
                default:
                    System.out.println("Такой команды нет. \nДоступные команды: LIST, ADD.");

            }
        }

    }
}
