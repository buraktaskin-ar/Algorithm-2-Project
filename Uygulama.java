package final__;

import java.util.Stack;

public class Uygulama {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();


        myList.addtoStart("12");
        myList.addtoStart("13");
        myList.addtoStart("14");
        myList.addtoStart("15");
        myList.addtoStart("16");

        myList.printOut();

        System.out.println(myList.remove(2));

        System.out.println();

        myList.printOut();

        System.out.println("Liste tersten yazılıyor..");

        Stack<String> stack = new Stack<String>();
        Node current = myList.head;
        while (current != null) {
            stack.push(current.item);
            current = current.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+"-");
}




    }




}
