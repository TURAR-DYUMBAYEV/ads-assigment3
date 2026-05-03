public class Main {
    public static void main(String[] args) {
        System.out.println("=== HashTable Test ===");

        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(100);

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(i, "Key" + i);
            Student student = new Student("Student" + i, 18 + i % 5);
            table.put(key, student);
        }

        table.printBucketSizes();
        System.out.println("HashTable size: " + table.size());

        System.out.println("\n=== BST Test ===");

        BST<Integer, String> tree = new BST<>();

        tree.put(5, "Five");
        tree.put(3, "Three");
        tree.put(7, "Seven");
        tree.put(1, "One");
        tree.put(4, "Four");

        System.out.println("BST size: " + tree.size());
        System.out.println("Get key 3: " + tree.get(3));

        System.out.println("In-order traversal:");
        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        tree.delete(3);

        System.out.println("After delete key 3:");
        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
    }
}
}