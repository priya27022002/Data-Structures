import java.util.*;

public class Queuerev {

    public void reverser(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<Integer>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
    
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Queue<Integer> que = new ArrayDeque<Integer>();
            for (int i = 0; i < 5; i++) {
                que.add(sc.nextInt());
            }
            System.out.println(que);
            Queuerev rev = new Queuerev();
            rev.reverser(que);
            System.out.println(que);
        }

    }
}