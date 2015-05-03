package QueueUsingArray;

public class ImplementationClass {
    public static void main(String ar[]) {

        int first_number = 5;
        int second_number = 10;
        Queue x = new Queue();

        //x.printElementsInTheQueue();

        x.add(first_number);
        x.add(second_number);

        //x.printElementsInTheQueue();
        // Trying to peek in the queue
        if (x.peek() == -1)
            System.out.println("The queue does not have any element at all. Do not try to peek");
        else
            System.out.println(x.peek());
        x.printElementsInTheQueue();

        x.remove();

        System.out.println("Yo");
        x.printElementsInTheQueue();
    }
}
