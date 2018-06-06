import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Main {

    final static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    public static void main(String[] args) {
        /**
         * @apiNote Default methods
         */
//        Formula formula = new Formula() {
//            @Override
//            public double calculate(int a) {
//                return sqrt(a * 100);
//            }
//        };
//
//        System.out.println(formula.calculate(100));
//        System.out.println(formula.sqrt(100));

        /**
         * @apiNote Lambda Expressions
         */
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
//
//        Collections.sort(names, Comparator.reverseOrder());

        /**
         * @apiNote Functional Interfaces
         */
//        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
//        Integer converted = converter.convert("123");
//        System.out.println(converted);
        /**
         * @apiNote Method References
         */
//        Converter<String, Integer> converter = Integer::valueOf;
//        Integer converted = converter.convert("123");
//        System.out.println(converted);
        /**
         * @apiNote Object References
         */
//        Something something = new Something();
//        Converter<String,String> converter = something::startsWith;
//        String converted = converter.convert("Java");
//        System.out.println(converted);
        /**
         * @apiNote Object Reference Cont.
         * We create a reference to the Person constructor via Person::new.
         * The Java compiler automatically chooses the right constructor by matching the signature of PersonFactory.create.
         */
//        PersonFactory<Person> personFactory = Person::new;
//        Person person = personFactory.create("Fadıl", "Fıdıllıoğlu");
//        System.out.println(person.toString());
        /**
         * @apiNote Lambda Scopes
         */
//        final int num = 1;
//        Converter<Integer, String> stringConverter = from -> String.valueOf(from + num);
//        stringConverter.convert(2);
        /**
         * @apiNote Predicates
         * Predicates are boolean-valued functions of one argument.
         */
//        Predicate<String> predicate = s -> s.length() > 0;
//
//        predicate.test("foo");
//        predicate.negate().test("foo");
//
//        Predicate<Boolean> nonNull = Objects::nonNull;
//        Predicate<Boolean> isNull = Objects::isNull;
//
//        Predicate<String> isEmpty = String::isEmpty;
//        Predicate<String> isNotEmpty = isEmpty.negate();
//
//        nonNull.test(false);
//        isNull.test(null);   // true
        /**
         * @apiNote Functions
         * Functions accept one argument and produce a result.
         */
//        Function<String,Integer> toInteger = Integer::valueOf;
//        Function<String, String> backToString = toInteger.andThen(String::valueOf);
//
//        System.out.println(toInteger.apply("123").getClass());
//        System.out.println(backToString.apply("123").getClass());
        /**
         * @apiNote Suppliers
         * Suppliers produce a result of a given generic type. Unlike Functions, Suppliers don't accept argument!
         */
//        Supplier<Person> personSupplier = Person::new;
//        System.out.println(personSupplier.get());
        /**
         * @apiNote Consumers
         */
//        Comparator<Person> comparator = Comparator.comparing(o -> o.firstName);
//
//        Person p1 = new Person("Omer", "Erkul");
//        Person p2 = new Person("Yağız", "Ünsal");
//
//        System.out.println(comparator.compare(p1, p2));  // < 0
//        System.out.println(comparator.reversed().compare(p1, p2)); // > 0
        /**
         * @apiNote Optionals
         * Optionals are utilities to prevent NullPointerException
         */
//        Optional<String> optional = Optional.of("bam");
//        optional.isPresent();
//        optional.get();
//        optional.orElse("fallback");
//        optional.ifPresent(s -> System.out.println(s.charAt(0)));

        /**
         * @apiNote Streams
         */
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("abc1");
        stringCollection.add("abc2");
        stringCollection.add("bca1");
        stringCollection.add("bca2");
        stringCollection.add("dcb2");
        stringCollection.add("dcb3");
        stringCollection.add("dcc2");
        stringCollection.add("dab1");
        stringCollection.add("bbb2");
        //Filter
//      stringCollection
//              .stream()
//              .filter(f -> f.startsWith("d"))
//              .forEach(System.out::println);

        //Sorted
//        stringCollection
//                .stream()
//                .sorted()
//                .filter(f -> f.startsWith("d"))
//                .forEach(System.out::println);
        //Map
//        stringCollection
//                .stream()
//                .map(String::toUpperCase)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
        //Match
//        boolean anyStartsWithA = stringCollection
//                .stream()
//                .anyMatch(s -> s.startsWith("a"));
//
//        System.out.println(anyStartsWithA);
//
//        boolean allStartsWithA = stringCollection
//                .stream()
//                .allMatch(s -> s.startsWith("a"));
//
//        System.out.println(allStartsWithA);
//
//        boolean noneStartsWithZ = stringCollection
//                .stream()
//                .noneMatch(s -> s.startsWith("z"));
//
//        System.out.println(noneStartsWithZ);
        //Count
//        long startsWithD =
//                stringCollection
//                        .stream()
//                        .filter(s -> s.startsWith("d"))
//                        .count();
//
//        System.out.println(startsWithD);
        //Reduce
//        Optional<String> reduced =
//                stringCollection
//                        .stream()
//                        .sorted()
//                        .reduce((s, s2) -> s + "#" + s2);
//
//        reduced.ifPresent(System.out::println);
        /**
         * @apiNote Parallel Streams
         */
//        Integer max = 1000000;
//        List<String> val = new ArrayList<>(max);
//        for (int i = 0; i < max; i++) {
//            UUID uuid = UUID.randomUUID();
//            val.add(uuid.toString());
//        }
        //Measure of Sequential Sort
//        long t0 = System.nanoTime();
//        long count = val
//                .stream()
//                .sorted()
//                .count();
//        System.out.println(count);
//        long t1 = System.nanoTime();
//        long milis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("Sequential sort took: %d ms", milis));  //Sequential sort took: 636 ms
        //Measure of Parallel Sort
//        long t0 = System.nanoTime();
//        long count = val.parallelStream().sorted().count();
//        System.out.println(count);
//        long t1 = System.nanoTime();
//        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("Parallel sort took: %d ms", millis)); //Parallel sort took: 312 ms
        /**
         * @apiNote Map
         */
//        Map<Integer, String> map = new HashMap<>();
//
//        for (int i = 0; i < 10; i++) {
//            map.putIfAbsent(i, "val" + i);
//        }

//        map.forEach((integer, s) -> System.out.println(s));
//        map.computeIfPresent(3, (integer, s) -> integer + s);
//        System.out.println(map.get(3));
//
//        map.computeIfPresent(9, (integer, s) -> null);
//        System.out.println(map.containsKey(9));
//
//        map.computeIfAbsent(23, s -> "val" + s);
//        System.out.println(map.containsKey(23));
//
//        map.putIfAbsent(3, "hey");
//        System.out.println(map.get(3));
//
//        map.remove(3);
//        System.out.println(map.get(3));
//
//        map.remove(3, "val33");
//        System.out.println(map.get(3));
//
//        System.out.println(map.getOrDefault(42, "Not Found!"));

//        map.merge(9, "val9", (s, s2) -> s.concat(s2));
//        map.get(9);

//        map.merge(9, "concat", (s, s2) -> s.concat(s2));
//        System.out.println(map.get(9));
        /**
         * @apiNote Date API
         */
            //Clock
//        Clock clock = Clock.systemDefaultZone();
//        long milis = clock.millis();
//
//        Instant instant = clock.instant();
//        Date legacyDate = Date.from(instant);
//        System.out.println(legacyDate);
            //Timezones
//        ZoneId.getAvailableZoneIds()
//                .parallelStream()
//                .filter(s -> s.contains("Istanbul"))
//                .sorted()
//                .forEach(System.out::println);
//        ZoneId zone1 = ZoneId.of("Europe/Berlin");
//        ZoneId zone2 = ZoneId.of("Brazil/East");
//        System.out.println(zone1.getRules());
//        System.out.println(zone2.getRules());
//
//        LocalTime now1 = LocalTime.now(zone1);
//        LocalTime now2 = LocalTime.now(zone2);
//
//        System.out.println(now1.isBefore(now2));
//
//        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
//        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
//
//        System.out.println(hoursBetween);
//        System.out.println(minutesBetween);
//
//        LocalTime late = LocalTime.of(23, 59, 59);
//        System.out.println(late);
//
//        DateTimeFormatter turkishFormat =
//                DateTimeFormatter
//                        .ofLocalizedTime(FormatStyle.SHORT)
//                        .withLocale(Locale.GERMAN);
//
//        LocalTime leetTime = LocalTime.parse("13:38", turkishFormat);
//        System.out.println(leetTime);

            //LocalDate
//        LocalDate today = LocalDate.now();
//        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
//        LocalDate yesterday = tomorrow.minusDays(2);
//
//        LocalDate myBirthDay = LocalDate.of(1994, Month.DECEMBER, 11);
//        DayOfWeek dayOfWeek = myBirthDay.getDayOfWeek();
//        System.out.println(dayOfWeek);
//        System.out.println(today);
//        System.out.println(tomorrow);
//        System.out.println(yesterday);
//
//        /**Parsing LocalDate*/
//        DateTimeFormatter germanFormat =
//                DateTimeFormatter
//                        .ofLocalizedDate(FormatStyle.MEDIUM)
//                        .withLocale(Locale.GERMAN);
//
//        LocalDate ramazanBayrami = LocalDate.parse("14.06.2018",germanFormat);
//        System.out.println(ramazanBayrami);

            //LocalDateTime Deep intro
//        LocalDateTime ofe = LocalDateTime.of(1994, Month.DECEMBER, 11, 23, 59, 59, 999);
//        DayOfWeek dayOfWeek = ofe.getDayOfWeek();
//        System.out.println(dayOfWeek);
//
//        Month month = ofe.getMonth();
//        System.out.println(month);
//
//        long minuteOfDay = ofe.getLong(ChronoField.MINUTE_OF_DAY);
//        System.out.println(minuteOfDay);
//
//        Instant instant = ofe
//                .atZone(ZoneId.systemDefault())
//                .toInstant();
//
//        Date legacyDate = Date.from(instant);
//        System.out.println(legacyDate);
//
//        System.out.println();
//        System.out.println();
//
//        DateTimeFormatter dateTimeFormatter =
//                DateTimeFormatter
//                        .ofPattern("E MMM-dd, yyy - HH:mm");
//
//        LocalDateTime parsedDate = LocalDateTime.parse("Sun Dec-11, 1994 - 23:59", dateTimeFormatter);
//        String string = dateTimeFormatter.format(parsedDate);
//        System.out.println(string);

        /**
         * @apiNote Annotations
         */
//        Hint hint = Person.class.getAnnotation(Hint.class);
//        System.out.println(hint);
//
//        Hints hints1 = Person.class.getAnnotation(Hints.class);
//        System.out.println(hints1.value().length);
//
//        Hint[] hints2 = Person.class.getAnnotationsByType(Hint.class);
//        System.out.println(hints2.length);
    }
}
