package final__;



public class MyLinkedList {

     Node head = null;
     Node tail = null;
     private int size;

     public void addtoStart(String str){
          Node eleman = new Node(str);

          if(head == null){
              head= eleman;
              tail = eleman;
          }
          else{
               eleman.next = head;
               head.prev = eleman;
               head = eleman;
          }


     }

     public String getElement(int i) {


          Node current = head;
          int count = 0;

          while (count < i) {
               current = current.getNext();
               count++;
          }
          System.out.print("İstediğiniz eleman: ");
          return current.getItem();

     }

     public Node removeHead() {

          Node removedNode = head;

          if (head == tail) {
               head = null;
               tail = null;
          } else {
               head = head.getNext();
               head.setPrev(null);
          }

          size--;
          removedNode.setNext(null);
          System.out.print("Silinen düğümün referansı: ");
          return removedNode;
     }

     public Node removeLast() {


          Node removedNode = tail;

          if (head == tail) {
               head = null;
               tail = null;
          } else {
               tail = tail.getPrev();
               tail.setNext(null);
          }

          size--;
          removedNode.setPrev(null);
          System.out.print("Silinen düğümün referansı: ");
          return removedNode;
     }

     public Node remove(int i) {

          if (i == 0) {
               return removeHead();
          } else if (i == size - 1) {
               return removeLast();
          } else {
               Node current = head;
               int count = 0;

               while (count < i) {
                    current = current.getNext();
                    count++;
               }

               Node removedNode = current;
               Node prevNode = current.getPrev();
               Node nextNode = current.getNext();

               prevNode.setNext(nextNode);
               nextNode.setPrev(prevNode);

               size--;
               removedNode.setPrev(null);
               removedNode.setNext(null);
               System.out.print("Silinen düğümün referansı: ");
               return   removedNode;
          }
     }

     public void printOut(){
          Node temp = head;

          while(temp != null){
               System.out.print(temp.getItem()+"-");
               temp = temp.getNext();
          }
          System.out.println("Elemanlar yazdırıldı");

     }







}