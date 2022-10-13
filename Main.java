// Аргументы — конкретные значения параметров функции


/*
    SCANNER
*/

import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String command = scanner.nextLine();
int age = Integer.parseInt(scanner.readLine());



/*
    ALGORIRHM
*/

Collections.sort(arrayListName);
Collections.reverse(arrayListName);
Collections.min(arrayListName);
Collections.shuffle(arrayListName);
Collections.disjoint(arrayListName1, arrayListName2); // true if there are no same values



/*
    ARRAY
*/

https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html

// create an array list from different values
ArrayList<String> name = new ArrayList<>(Arrays.asList(str1, str2, str3));

// create a const array
List<String> name = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(str1, str2)));
solarSystem.add(str3);  // Exception in thread "main" java.lang.UnsupportedOperationException

// swap values
Collections.swap(arrayListName, arrayListName.indexOf(str1), arrayListName.indexOf(str2));



/*
    LINKED LIST
*/

linkedListName.peekFirst(); // get first-last or null
linkedListName.pollFirst(); // get and remove first-last or null



/*
    SET
*/

// remove some value from a set
Set<Cat> cats = createCats();
cats.remove(cats.iterator().next());



/*
    MAP
*/

https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html

// check if map contains key or value
hashMapName.containsKey(11111);
hashMapName.containsValue("value");

// get key or values
Set<Integer> keys = hashMapName.keySet();
ArrayList<String> values = new ArrayList<>(hashMapName.values());

// get key-value pair
for (Map.Entry<String, String> pair : hashMapName.entrySet())  {
    String key = pair.getKey();
    String value = pair.getValue();
}

hashMapName1.putAll(hashMapName2);  // merge two maps into one



/*
    ENUM
*/

public enum Month {
   JANUARY,
   FEBRUARY,
   MARCH
}


/*
    EXCEPTION
*/

public class DogIsNotReadyException extends Exception {
   public DogIsNotReadyException(String message) {
       super(message);
   }
}



/*
    TRACE
*/

// displays the name of the file and method in which it is called
public static void log(String message) {
    StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
    System.out.print(stackTraceElement.getFileName() + ": ");
    System.out.print(stackTraceElement.getMethodName() + ": " + message);
}

StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
for (StackTraceElement element : stackTraceElements) {
    System.out.println(element.getMethodName());
}

int stackTraceLength = method1().length - method10().length + 1;



/*
    PERFORMANCE
*/

public static long getInsertTimeInMs(List list) {
    long startTime = System.nanoTime();
    anyLongOperation(list);
    long elapsedTime = System.nanoTime() - startTime;
    return elapsedTime / 1000000;
}






