https://github.com/ka5trulkin

@PathVariable
https://www.baeldung.com/spring-pathvariable

@RequestParam 
https://www.baeldung.com/spring-request-param

@RequestBody
https://www.baeldung.com/spring-request-response-body

// тренажер git
https://learngitbranching.js.org/?locale=ru_RU

// валидация в spring boot
https://struchkov.dev/blog/ru/spring-boot-validation/

// PostsgreSQL cert
https://www.enterprisedb.com/training

// data Structures
https://www.youtube.com/playlist?list=PLpPXw4zFa0uKKhaSz87IowJnOTzh9tiBk

// spring потрошитель
https://www.youtube.com/playlist?list=PL6yLoZ_3Y0HKGL3F7vv2SNSrA3TkbXtBX

// kafka
https://www.youtube.com/watch?v=-AZOi3kP9Js


// Нормализация БД
https://youtu.be/zqQxWdTpSIA





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
    LIST
*/

https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html

// create an array list from different values
ArrayList<String> name = new ArrayList<>(Arrays.asList(str1, str2, str3));

// create a const array
List<String> name = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(str1, str2)));
solarSystem.add(str3);  // Exception in thread "main" java.lang.UnsupportedOperationException

// swap values
Collections.swap(arrayListName, arrayListName.indexOf(str1), arrayListName.indexOf(str2));

ArrayList<Integer> listAllId = new ArrayList<>();
Collections.max(listAllId);




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

@Test
void shouldThrowException() {
    final ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> { int number = 10 / 0; });
    assertEquals("/ by zero", exception.getMessage());
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




/*
    GSON
*/

String lastLikeInfoStr = "{ \"user\": \"Алексей\", \"hours\": 12, \"minutes\": 30}";
Gson gson = new Gson();
LastLikeInfo lastLikeInfo = gson.fromJson(lastLikeInfoStr, LastLikeInfo.class);

LikesInfo likesInfo = new LikesInfo();
String likesInfoSerialized = gson.toJson(likesInfo);

GsonBuilder gsonBuilder = new GsonBuilder();
gsonBuilder.serializeNulls();
Gson gson = gsonBuilder.create();

class LocalDateAdapter extends TypeAdapter<LocalDate> {
    private static final DateTimeFormatter formatterWriter = DateTimeFormatter.ofPattern("dd--MM--yyyy");
    private static final DateTimeFormatter formatterReader = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public void write(final JsonWriter jsonWriter, final LocalDate localDate) throws IOException {
        jsonWriter.value(localDate.format(formatterWriter));
    }

    @Override
    public LocalDate read(final JsonReader jsonReader) throws IOException {
        return LocalDate.parse(jsonReader.nextString(), formatterReader);
    }
}
GsonBuilder gsonBuilder = new GsonBuilder();
gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateAdapter());
Gson gson = gsonBuilder.create();




/*
    HTTPServer
*/

private static final int PORT = 8080;
public static void main(String[] args) throws IOException {
    HttpServer httpServer = HttpServer.create();
    httpServer.bind(new InetSocketAddress(PORT), 0);
    httpServer.createContext("/hello", new HelloHandler());
    httpServer.start();
}
static class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String method = httpExchange.getRequestMethod();
        
        Headers requestHeaders = httpExchange.getRequestHeaders();
        List<String> contentTypeValues = requestHeaders.get("Content-type");
        if ((contentTypeValues != null) && (contentTypeValues.contains("application/json"))) {
            System.out.println("Это JSON!");
        }

        Headers headers = httpExchange.getResponseHeaders();
        headers.set("Content-Type", "text/plain");
        headers.set("X-your-own-header", "any-information-you-want");
        httpExchange.sendResponseHeaders(200, 0);

        InputStream inputStream = httpExchange.getRequestBody();
        String body = new String(inputStream.readAllBytes(), DEFAULT_CHARSET);

        String path = httpExchange.getRequestURI().getPath();
        String name = path.split("/")[2];
        String response = "Привет, " + name + "!";

        try (OutputStream os = httpExchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}




/*
    URI
*/

public static void main(String[] args) {
    HttpClient client = HttpClient.newHttpClient();

    // укажите URL запроса, включая его параметры
    URI url = URI.create("https://api.exchangerate.host/convert?base=RUB&symbols=USD");

    // создайте объект, описывающий запрос с необходимой информацией
    HttpRequest request = HttpRequest.newBuilder()
            .uri(url)
            .header("Accept", "application/json")
            .GET()
            .build();

    try {
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Код статуса: " + response.statusCode());
        System.out.println("Ответ: " + response.body());

        if (response.statusCode() == 200) {
            JsonElement jsonElement = JsonParser.parseString(response.body());
            if(!jsonElement.isJsonObject()) { // проверяем, точно ли мы получили JSON-объект
                System.out.println("Ответ от сервера не соответствует ожидаемому.");
                return;
            }
            // получите курс доллара и евро и запишите в переменные rateUSD и rateEUR
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonObject ratesObj = jsonObject.getAsJsonObject("rates");

            double rateUSD = ratesObj.get("USD").getAsDouble();
            double rateEUR = ratesObj.get("EUR").getAsDouble();
        } else {
            System.out.println("Сервер вернул код состояния: " + response.statusCode());
        }
    } catch (IOException | InterruptedException e) { // обработка ошибки отправки запроса
        System.out.println("Во время выполнения запроса '" + url + "' возникла ошибка.\n" +
                "Проверьте, пожалуйста, адрес и повторите попытку.");
    }
}



/*
    LOGGER
*/

TRACE (англ. «отслеживать») — для трассировочных сообщений,
которые предоставляют очень подробную информацию о каком-либо процессе. 
DEBUG (англ. «отлаживать») — для отладочных сообщений,
которые важны во время анализа некорректного поведения программы
INFO (англ. «информация») — для сообщений,
которые помогают понять текущее состояние программы.
WARN (англ. «предупреждать») — для сообщений с предупреждениями,
которые появляются в случае, если что-то пошло не так.
ERROR (англ. «ошибка») — для сообщений о критических ошибках, требующих оперативного вмешательства,
без которого программа не сможет продолжить работу.

// Уровень логгера по пакетам
application.properties
logging.level.ru.yandex.practicum=debug
logging.level.org.springframework.web.servlet.DispatcherServlet=debug

// инициализация логгера и использование
private static final Logger log = LoggerFactory.getLogger(SimpleController.class);

log.info("Получен запрос.");
log.debug("Текущее количество постов: {}", posts.size());

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency> 
https://docs.jboss.org/hibernate/beanvalidation/spec/2.0/api/javax/validation/constraints/package-summary.html



/*
    LOMBOK
    https://projectlombok.org/features/
*/

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point {
    private int x;
    private int y;
} 



/*
    SPRING
*/

@ControllerAdvice("ru.yandex.practicum.controllers")
@ControllerAdvice(assignableTypes = {DogsInteractionController.class, CatsInteractionController.class})

@GetMapping("/feed")
public Map<String, Integer> methodName() {
    throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Метод ещё не реализован.");
}

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, Integer> handleOverflow(final OverflowException e) {
        return Map.of("level", e.getLevel());
    }
}
