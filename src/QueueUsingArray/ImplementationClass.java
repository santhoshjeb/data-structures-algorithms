package QueueUsingArray;

public class ImplementationClass {
    public static void main(String ar[]) {

        int first_number = 5;
        int second_number = 10;
        Queue x = new Queue();

        x.enqueue(first_number);
        x.enqueue(second_number);
        x.dequeue();
        System.out.println(x.peek());
        System.out.println("-------------------------------");
        x.printElementsInTheQueue();
    }
}
