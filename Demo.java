package final__;

public class Demo {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.put("A");
        hashTable.put("B");
        hashTable.put("C");
        hashTable.put("D");

        System.out.println("Hash table başlangıcı:");
        hashTable.printHashTable();

        String itemToDelete = "B";
        if (hashTable.delete(itemToDelete))
            System.out.println("\n" + itemToDelete + " silindi.");

        System.out.println("\nGüncel hal:");
        hashTable.printHashTable();
    }

}
