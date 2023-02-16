import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.SSLServerSocketFactory;

public class Homework {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:Иван Иванов (и остальные)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
// 
// Иван Иванов 88001122333
// Иван Курицин 88001662333
// Иван Курицин 88001112333
// Иван Незлобин 88001122432
// Сергей Потапов 88001112453
// Сергей Потапов 8800163214
// Сергей Курицин 8800142421
// Михаил Незлобин 880012343
// 
// OutPut
// Иван - 3
// Сергей - 2
// Потому как если один сотрудник имеет 2 или более номера , его имя считаем 1 раз.

   




/**
 * @param args
 */
public static void main(String[] args) {

    List<String> phonebook = new ArrayList <> (Arrays.asList("Иван Иванов 88001122333",
    "Иван Курицин 88001662333",
    "Иван Курицин 88001112333",
    "Иван Незлобин 88001122432",
    "Сергей Потапов 88001112453",
    "Сергей Потапов 8800163214",
    "Сергей Курицин 8800142421",
    "Михаил Незлобин 880012343"));

    System.out.println(OutPut(getHasMap(phonebook)));


    public static Map<Integer, String> getHashMap(List<String> phonebook) {
        int i = 0;
        for (String item : phonebook) {
            map.put(i++, item);
            
        }
        return map;
    }


        }


    
}
