import java.util.ArrayDeque;

public class Quest {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.push(1);   // [1]
        deque.push(2);  // [2,1]
        deque.push(3); // [3,,2,1]
        deque.poll(); // remove 3
        System.out.println(deque); // [2,1]
    }
}