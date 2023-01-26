// Аргументы — конкретные значения параметров функции



/*
    BufferedReader
*/

FileReader reader = new FileReader("result.txt");
BufferedReader br = new BufferedReader(reader);
while (br.ready()) { String line = br.readLine(); }
br.close();



/*
    SCANNER
*/

import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String command = scanner.nextLine();
int age = Integer.parseInt(scanner.readLine());



/*
    PATH
*/

Path path = Paths.get(userInputPath);
Files.list(path).collect(Collectors.toList());      // вывести содержание папки
Path newDirectory = Files.createDirectory(path);    // новая папка
Path newFile = Files.createFile(path);              // новый файл
Files.move(path, path.resolveSibling(newName), StandardCopyOption.REPLACE_EXISTING); // переименовать
if (!Files.isDirectory(path)) Files.deleteIfExists(path);   // удалить



/*
    READ FROM FILE
*/

public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String sourceFileName = reader.readLine();
    FileInputStream fileInputStream = new FileInputStream(sourceFileName);

    Scanner scanner = new Scanner(fileInputStream);
    StringBuilder builder = new StringBuilder();

    while (scanner.hasNextLine()) {
        builder.append(scanner.nextLine()).append("\n");
    }

    System.out.print(builder.toString());

    scanner.close();
    reader.close();
}


/*
    OBJECT
*/

boolean isPassport = document instanceof RussianPassport;
if (document instanceof Snils) {}


@Override 
public boolean equals(Object obj) {
    // проверяем адреса объектов
    if (this == obj) {
        return true;
    }
    // проверяем ссылку на null
    if (obj == null) {
        return false;
    }
    // сравниваем классы
    if (this.getClass() != obj.getClass()) {
        return false; 
    }
    Book otherBook = (Book) obj;
    return Objects.equals(title, otherBook.title) &&
           Objects.equals(author, otherBook.author) && 
           (pagesNumber == otherBook.pagesNumber);
}

@Override 
public int hashCode() {
    int hash = 17; 
    if (firstName != null) {
        hash = hash + firstName.hashCode();
    }
    hash = hash * 31;

    if (lastName != null) { 
        hash = hash + lastName.hashCode();
    }
    return hash;
}




/*
    OPTIONAL
*/

public static Optional<String> longestName(List<String> names) {
    if (names.isEmpty()) {
        return Optional.empty();
    }
    String max = names.get(0);
    for (String name : names) {
        if (name.length() > max.length()) {
            max = name;
        }
    }
    return Optional.of(max);
}
if (longestOptional.isPresent()) {
    String longestName = longestOptional.get();
}




/*
    STREAMS
*/

Stream<String> names = Stream.of("Арсений", "Иван", "Аня");

List<String> citiesToVisit = List.of("Лондон", "Мадрид", "Владивосток");
Stream<String> visitStream = citiesToVisit.stream();




/*
    COMPARATOR interface
*/

// сортировать список в лексикографической последовательности 
@Override
public int compare(Item item1, Item item2) {
    return String.CASE_INSENSITIVE_ORDER.compare(item1.name, item2.name);
}

// анонимный класс компаратора
Comparator<String> comparator = new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
};




/*
    TREE_SET & TREE_MAP
*/

public class Film implements Comparable<Film> {
    public String title;
    public String directorName;
    public int rating;

    @Override
    public int compareTo(Film film) {
        return this.rating - film.rating;
    }
}

Comparator<Film> comparator = new Comparator<Film>() {
    @Override
    public int compare(Film o1, Film o2) {
        return o1.rating - o2.rating;
    }
};

Set<Film> film = new TreeSet<>(comparator); 




/*
    ALGORIRHM
*/

// Objects comparison
interface Comparable<T>;    // inside your class with @Override int compareTo(Object o)
interface Comparator<T>;    // external class with @Override int compare(Object o1, Object o2)

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
    ITERATOR
*/

final Iterator<String> iterator;
iterator = listName.iterator();

while (iterator.hasNext()) {
    final String element = iterator.next();
    System.out.print(element);
}




/*
    ENUM
*/

enum VisaType {
    CLASSIC,
    GOLD;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
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
    JUNIT
*/

public class FortuneCookieFactoryTest {
    private static FortuneCookieFactory factory;

    @BeforeEach
    public void beforeEach() {
        final FortuneConfig config = new FortuneConfig(true);
        factory = new FortuneCookieFactory(
                config, singletonList("positive"), singletonList("negative"));
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        factory.bakeFortuneCookie();
        assertEquals(1, factory.getCookiesBaked());
    }
}


class ExceptionTest {
    @Test
    void shouldThrowException() {
        final ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                new Executable() {
                    @Override
                    public void execute() { int number = 10 / 0; }
                });
        assertEquals("/ by zero", exception.getMessage());
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
    TIME
*/

Instant currentTimestamp = Instant.now();               // текущая временная метка
Instant.ofEpochMilli(currentTimestamp);                 // получить время из метки
long milliseconds = currentTimestamp.toEpochMilli();    // от начала эпохи до текущего момент

LocalDateTime currentMoment = LocalDateTime.now();      // текущее время и дата
LocalDateTime dateTime = LocalDateTime.of(2222, FEBRUARY, 2, 22, 22);


DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");
String formatDateTime = now.format(formatter);
LocalDateTime dateTime = LocalDateTime.parse("2021-12-21T21:21:21");
System.out.println(dateTime);


LocalTime taskStart = LocalTime.of(9, 0);
Duration duration = Duration.between(taskStart, taskFinish);
Duration tenMinutes = Duration.ofMinutes(10);


LocalDateTime dateTime = LocalDateTime.now();
ZoneId zone = ZoneId.of("UTC+3");
ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zone);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Время: HH:mm:ss. Регион: VV, смещение: ZZZZZ");




/*
    PERFORMANCE
*/

public static long getInsertTimeInMs(List list) {
    long startTime = System.nanoTime();
    anyLongOperation(list);
    long elapsedTime = System.nanoTime() - startTime;
    return elapsedTime / 1000000;
}
