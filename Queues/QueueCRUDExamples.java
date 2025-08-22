package Queues;
import java.util.*;

public class QueueCRUDExamples {

    public static void main(String[] args) {
        // --- 1. Using LinkedList ---
        Queue<String> linkedListQueue = new LinkedList<>();
        System.out.println("📦 LinkedList Queue:");
        performCRUD(linkedListQueue);

        // --- 2. Using PriorityQueue ---
        Queue<String> priorityQueue = new PriorityQueue<>();
        System.out.println("\n🏷️ PriorityQueue (sorted):");
        performCRUD(priorityQueue);

        // --- 3. Using ArrayDeque ---
        Queue<String> arrayDequeQueue = new ArrayDeque<>();
        System.out.println("\n🚀 ArrayDeque Queue:");
        performCRUD(arrayDequeQueue);
    }

    public static void performCRUD(Queue<String> queue) {
        // --- CREATE ---
        queue.offer("Banana");
        queue.offer("Apple");
        queue.offer("Cherry");
        System.out.println("After CREATE: " + queue);

        // --- READ ---
        System.out.println("Peek (front): " + queue.peek());

////
//        // --- UPDATE (simulate by converting to list) ---
        List<String> tempList = new ArrayList<>(queue);
        if (tempList.size() > 1) {
            tempList.set(1, "Blueberry");  // Update second item
        }
        queue.clear(); // Clear old queue
        queue.addAll(tempList);
        System.out.println("After UPDATE: " + queue);
//
////        // --- DELETE ---
        String removed = queue.poll(); // Remove head
        System.out.println("Deleted: " + removed);
        System.out.println("After DELETE: " + queue);
    }
}
