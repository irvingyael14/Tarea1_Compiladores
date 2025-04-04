import java.util.*;

class MyStack<T> {
    private Stack<T> stack;

    public MyStack() {
        stack = new Stack<>();
    }

    public void push(T value) {
        stack.push(value);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

class MyQueue<T> {
    private Queue<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T value) {
        queue.add(value);
    }

    public T dequeue() {
        if (!queue.isEmpty()) {
            return queue.poll();
        }
        return null;
    }

    public T peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

class MyDictionary<K, V> {
    private HashMap<K, V> dictionary;

    public MyDictionary() {
        dictionary = new HashMap<>();
    }

    public void put(K key, V value) {
        dictionary.put(key, value);
    }

    public V get(K key) {
        return dictionary.get(key);
    }

    public boolean containsKey(K key) {
        return dictionary.containsKey(key);
    }

    public void remove(K key) {
        dictionary.remove(key);
    }
}

public class Main {
    public static void main(String[] args) {
      // Demostración de Stack
      MyStack<Integer> stack = new MyStack<>();
      System.out.println("Stack isEmpty: " + stack.isEmpty());
      stack.push(1);
      stack.push(2);
      stack.push(3);
      System.out.println("Stack peek: " + stack.peek());
      System.out.println("Stack Pop: " + stack.pop());
      System.out.println("Stack peek despues de pop: " + stack.peek());
      System.out.println("Stack isEmpty: " + stack.isEmpty());

      // Demostración de Queue
      MyQueue<String> queue = new MyQueue<>();
      System.out.println("Queue isEmpty: " + queue.isEmpty());
      queue.enqueue("A");
      queue.enqueue("B");
      queue.enqueue("C");
      System.out.println("Queue peek: " + queue.peek());
      System.out.println("Queue dequeue: " + queue.dequeue());
      System.out.println("Queue peek despues de dequeue: " + queue.peek());
      System.out.println("Queue isEmpty: " + queue.isEmpty());

      // Demostración de Diccionario
      MyDictionary<String, Integer> dictionary = new MyDictionary<>();
      dictionary.put("One", 1);
      dictionary.put("Two", 2);
      System.out.println("Diccionario Get: " + dictionary.get("One"));
      System.out.println("Diccionario contiene 'Two': " + dictionary.containsKey("Two"));
      dictionary.remove("One");
      System.out.println("Diccionario Contiene 'One' despues de la eliminacion: " + dictionary.containsKey("One"));
    }
}
