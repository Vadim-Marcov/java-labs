package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
        Map<String, Athlete> athletes = new HashMap<>();

        athletes.put("Месси", new Footballer("Месси", 1, 44, 880));
        athletes.put("Роналду", new Footballer("Роналду", 2, 35, 970));
        athletes.put("Мбаппе", new Footballer("Мбаппе", 3, 15, 500));

        athletes.put("Джордан", new Basketballer("Джордан", 4, 6, 32000));
        athletes.put("Леброн", new Basketballer("Леброн", 5, 4, 40000));
        athletes.put("Коби", new Basketballer("Коби", 6, 5, 33000));

        athletes.put("Фелпс", new Swimmer("Фелпс", 7, 2, 3));
        athletes.put("Попов", new Swimmer("Попов", 8, 9, 6));

        Iterator<Map.Entry<String, Athlete>> iterator = athletes.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Athlete> entry = iterator.next();
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

    }
}
