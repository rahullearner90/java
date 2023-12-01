import java.util.*;
public class CollectionDemo {
public static void main(String[] args) {
// List interface
System.out.println("List Interface:");
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Python");
myList.add("C++");
myList.add("JavaScript");
System.out.println("Elements in the list: " + myList);
// Set interface
System.out.println("\nSet Interface:");
Set<Integer> mySet = new HashSet<>();
mySet.add(10);
mySet.add(20);
mySet.add(30);
mySet.add(20);
System.out.println("Elements in the set: " + mySet);
// Map interface
System.out.println("\nMap Interface:");
Map<String, Integer> myMap = new HashMap<>();
myMap.put("One", 1);
myMap.put("Two", 2);
myMap.put("Three", 3);
myMap.put("Two", 22);
System.out.println("Elements in the map: " + myMap);
// Iterating through the map
System.out.println("\nIterating through the map:");
for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}
public class practical4 {
    
}
