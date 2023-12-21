import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 size of stack after push" + stack.size());
        System.out.println("pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.println(" %s" + stack.pop());
        }     System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("2.1 size of stack after push" + stack.size());
        System.out.println("pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.println( "%" + stack.pop());
        }
        System.out.println("2.2 size of stack after pop operation : " +stack.size());
    }

}
