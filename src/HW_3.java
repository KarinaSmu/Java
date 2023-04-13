import java.util.*;

public class HW_3 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,7,47,-2,657,8));
        System.out.println(numbers);
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        removeEvenNumber(numbers);
        System.out.println(numbers);
        System.out.println(strings); // [string, my_string]
    }


    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        Iterator iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer num = (Integer) iterator.next();
            if (num%2==0){
               iterator.remove();
            }
        }
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator iterator = strings.iterator();
        while(iterator.hasNext()){
            String next = (String) iterator.next();
            Boolean digits=true;
            try {
                Integer.parseInt(next);
                digits=true;
            } catch (NumberFormatException e) {
                digits=false;
            }
            if (digits){
                iterator.remove();
            }
        }
    }
}
