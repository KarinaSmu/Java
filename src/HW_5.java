import java.sql.Array;
import java.util.*;

public class HW_5 {
    public static void main(String[] args) {
       System.out.println(isCorrectParentheses("()")); // true
       System.out.println(isCorrectParentheses("(")); // false
       System.out.println(isCorrectParentheses("())")); // false
       System.out.println(isCorrectParentheses("((()))")); // true
       System.out.println(isCorrectParentheses("()[]{}<>")); // true
       System.out.println(isCorrectParentheses("([)]")); // true
       System.out.println(isCorrectParentheses("][]")); // false
       System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('<', '>');
        map.put('{', '}');
        map.put('[', ']');
        Set<Character> set = map.keySet();
        Deque<Character> q = new ArrayDeque<>();

        if (parentheses.length()%2!=0){
            return false;
        }else{
            for (int i = 0; i < parentheses.length(); i++) {
                Character ch = parentheses.charAt(i);
                if (set.contains(ch)) {
                    q.addLast(ch);
                } else if (map.get(q.peekFirst())==ch) {
                    q.pollFirst();
                } else if (map.get(q.peekLast())==ch) {
                    q.pollLast();
                }
            }
            if (q.size() == 0) {
                return true;
            } else {
                return false;
            }
        }


        }



}
