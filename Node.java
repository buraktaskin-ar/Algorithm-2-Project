package final__;

public class Node {


     Node next;
     Node prev;
     String item;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Node(String item){
        this.item = item;
        prev = null;
        next = null;
    }






}
