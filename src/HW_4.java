import java.util.*;

public class HW_4 {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        Boolean flag = true;
        while (flag){
            Scanner scanner = new Scanner(System.in);
            String current=scanner.nextLine();
            if (current.equals("print")){
                System.out.println(queue);
            }
            else if (current.equals("revert")){
                queue.pollFirst();
            }
            else if (current.equals("exit")){
                flag=false;
            }
            else queue.addFirst(current);
        }
    }

}
