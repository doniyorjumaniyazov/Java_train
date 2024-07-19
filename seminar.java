// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Random;

// public class Seminar {
//     public static void main(String[] args) {
//         // Создаем ArrayList и заполняем его 10 случайными числами
//         ArrayList<Integer> list = new ArrayList<>();
//         Random rand = new Random();
//         for (int i = 0; i < 10; i++) {
//             list.add(rand.nextInt(100)); // Добавляем случайное число от 0 до 99
//         }
//         System.out.println(list);
//         // Сортируем список по возрастанию
//         Collections.sort(list);

//         // Выводим отсортированный список на экран
//         System.out.println("Sorted list: " + list);
//     }
// }

// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;

// public class Planets {
//     public static void main(String[] args) {
//         // Создаем список с названиями планет Солнечной системы с повторениями
//         ArrayList<String> planets = new ArrayList<>();
//         planets.add("Mercury");
//         planets.add("Venus");
//         planets.add("Earth");
//         planets.add("Mars");
//         planets.add("Jupiter");
//         planets.add("Saturn");
//         planets.add("Uranus");
//         planets.add("Neptune");
//         planets.add("Earth");
//         planets.add("Mars");
//         planets.add("Jupiter");
//         planets.add("Saturn");
//         planets.add("Earth");
//         planets.add("Mars");

//         // Используем HashMap для подсчета количества повторений каждой планеты
//         HashMap<String, Integer> planetCount = new HashMap<>();
//         for (String planet : planets) {
//             planetCount.put(planet, planetCount.getOrDefault(planet, 0) + 1);
//         }

//         // Выводим название каждой планеты и количество ее повторений
//         for (Map.Entry<String, Integer> entry : planetCount.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
//     }
// }

// 
// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

// import java.util.ArrayList;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         List<ArrayList<String>> catalog = new ArrayList<>();  // создаем внешний список
//         int rows = 6;
//         int cols = 6; // здесь для внутреннего списка определяем строки и столбцы, то есть 6*6

//         addHeader(catalog, "Proza", new String[]{"1", "2", "3"});
//         addHeader(catalog, "Fantasy", new String[]{"The Hobbit", "Harry Potter and the Sorcerer's Stone"});
//         addHeader(catalog, "Science", new String[]{"A Brief History of Time", "The Selfish Gene"});

//         // Пример использования
//         // printCatalog(catalog);
//         System.out.println(catalog);
//     }

//     public static void addHeader(List<ArrayList<String>> catalog, String genre, String[] books) {
//         ArrayList<String> genreList = new ArrayList<>();
//         genreList.add(genre); // Добавляем жанр на первую позицию
//         for (String book : books) {
//             genreList.add(book); // Добавляем книги на последующие позиции
//         }
//         catalog.add(genreList); // Добавляем внутренний список в каталог
//     }

//     // Метод для печати всего каталога
//     // public static void printCatalog(List<ArrayList<String>> catalog) {
//     //     for (ArrayList<String> genreList : catalog) {
//     //         String genre = genreList.get(0);
//     //         System.out.println("Genre: " + genre);
//     //         for (int i = 1; i < genreList.size(); i++) {
//     //             System.out.println("  Book: " + genreList.get(i));
//     //         }
//     //     }
//     // }
// }

// Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// // Сравните с предыдущим.
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         // Измерение времени добавления элементов в ArrayList
//         List<Integer> arrayList = new ArrayList<>();
//         long startTime = System.nanoTime();
//         for (int i = 0; i < 10000; i++) {
//             arrayList.add(i);
//         }
//         long endTime = System.nanoTime();
//         long arrayListTime = endTime - startTime;

//         // Измерение времени добавления элементов в LinkedList
//         List<Integer> linkedList = new LinkedList<>();
//         startTime = System.nanoTime();
//         for (int i = 0; i < 10000; i++) {
//             linkedList.add(i);
//         }
//         endTime = System.nanoTime();
//         long linkedListTime = endTime - startTime;

//         // Вывод результатов на русском языке
//         System.out.println("Время добавления 10000 элементов в ArrayList: " + arrayListTime + " наносекунд");
//         System.out.println("Время добавления 10000 элементов в LinkedList: " + linkedListTime + " наносекунд");

//         // Сравнение результатов
//         if (arrayListTime < linkedListTime) {
//             System.out.println("ArrayList быстрее на " + (linkedListTime - arrayListTime) + " наносекунд.");
//         } else if (arrayListTime > linkedListTime) {
//             System.out.println("LinkedList быстрее на " + (arrayListTime - linkedListTime) + " наносекунд.");
//         } else {
//             System.out.println("Оба списка имеют одинаковую производительность.");
//         }
//     }
// }
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка

// import java.util.LinkedList;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<>();
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("Введите строку вида text~num или print~num для завершения введите exit:");
//             String input = scanner.nextLine();

//             // Выход из цикла при вводе 'exit'
//             if (input.equalsIgnoreCase("exit")) {
//                 break;
//             }

//             // Разделение строки по ~
//             String[] parts = input.split("~");
//             if (parts.length != 2) {
//                 System.out.println("Некорректный ввод. Попробуйте снова.");
//                 continue;
//             }

//             String command = parts[0];
//             int index;
//             try {
//                 index = Integer.parseInt(parts[1]);
//             } catch (NumberFormatException e) {
//                 System.out.println("Некорректный формат числа. Попробуйте снова.");
//                 continue;
//             }

//             // Обработка команды 'print'
//             if (command.equalsIgnoreCase("print")) {
//                 if (index >= 0 && index < list.size()) {
//                     System.out.println("Значение на позиции " + index + ": " + list.get(index));
//                     list.remove(index);
//                 } else {
//                     System.out.println("Индекс вне диапазона. Попробуйте снова.");
//                 }
//             } else {
//                 // Добавление текста в указанную позицию
//                 while (list.size() <= index) {
//                     list.add(null);  // Заполнение промежуточных позиций null
//                 }
//                 list.set(index, command);
//             }
//         }
//         scanner.close();
//     }
// // }
// // Реализовать консольное приложение, которое:
// // 1. Принимает от пользователя и “запоминает” строки.
// // // 2. Если введено print, выводит строки так, чтобы последняя введенная
// // // была первой в списке, а первая - последней.
// // // 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

// // import java.util.LinkedList;
// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {
// //         LinkedList<String> list = new LinkedList<>();
// //         Scanner scanner = new Scanner(System.in);

// //         while (true) {
// //             System.out.println("Введите строку для запоминания, 'print' для вывода строк или 'revert' для удаления последней строки. Для завершения введите 'exit':");
// //             String input = scanner.nextLine();

// //             if (input.equalsIgnoreCase("exit")) {
// //                 break;
// //             }

// //             if (input.equalsIgnoreCase("print")) {
// //                 printStrings(list);
// //             } else if (input.equalsIgnoreCase("revert")) {
// //                 revertLastString(list);
// //             } else {
// //                 list.add(input);
// //             }
// //         }

// //         scanner.close();
// //     }

// //     private static void printStrings(LinkedList<String> list) {
// //         for (int i = list.size() - 1; i >= 0; i--) {
// //             System.out.println(list.get(i));
// //         }
// //     }

// //     private static void revertLastString(LinkedList<String> list) {
// //         if (!list.isEmpty()) {
// //             list.removeLast();
//         } else {
// // //             System.out.println("Нет строк для удаления.");
// // //         }
// // //     }
// // // }

// // // 1) Написать метод, который принимает массив элементов, помещает их в стэк
// // // и выводит на консоль содержимое стэка.
// // // 2) Написать метод, который принимает массив элементов, помещает их в
// // // очередь и выводит на консоль содержимое очереди.

// // import java.util.Arrays;
// // // import java.util.LinkedList;
// // // import java.util.Queue;
// // // import java.util.Stack;

// // // public class Main {
// // //     public static void main(String[] args) {
// // //         Integer[] elements = {1, 2, 3, 4, 5, 6, 7, 10};

// // //         System.out.println("Содержимое стека:");
// // //         printStack(elements);

// // //         System.out.println("Содержимое очереди:");
// // //         printQueue(elements);
// // //     }

// // //     // Метод для работы со стеком
// // //     public static <T> void printStack(T[] elements) {
// // //         Stack<T> stack = new Stack<>();
// // //         stack.addAll(Arrays.asList(elements));

// // //         while (!stack.isEmpty()) {
// // //             System.out.println(stack.pop());
// // //         }
// // //     }

// // //     // Метод для работы с очередью
// // //     public static <T> void printQueue(T[] elements) {
// // //         Queue<T> queue = new LinkedList<>();
// // //         queue.addAll(Arrays.asList(elements));

// // //         while (!queue.isEmpty()) {
// // //             System.out.println(queue.poll());
// // //         }
// // //     }
// // // }
// // // Реализовать стэк с помощью массива.
// // // Нужно реализовать методы:
// // // size(), empty(), push(), peek(), pop().

// // // 
// // import java.util.LinkedList;

// // class MyQueueInt {
// //     private LinkedList<Integer> queue;

// //     public MyQueueInt() {
// //         queue = new LinkedList<>();
// //     }

// //     public void enqueue(int element) {
// //         queue.add(element);
// //     }

// //     public int dequeue() {
// //         if (queue.isEmpty()) {
// //             throw new IllegalStateException("Queue is empty");
// //         }
// //         return queue.removeFirst();
// //     }

// //     public int first() {
// //         if (queue.isEmpty()) {
// //             throw new IllegalStateException("Queue is empty");
// //         }
// //         return queue.getFirst();
// //     }

// //     public LinkedList<Integer> getElements() {
// //         return new LinkedList<>(queue);
// //     }
// // }



// // // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// // public class Printer {
// //     public static void main(String[] args) {
// //         MyQueueInt queue;
// //         queue = new MyQueueInt();

// //         if (args.length == 0) {
// //         // При отправке кода на Выполнение, вы можете варьировать эти параметры
// //             queue.enqueue(1);
// //             queue.enqueue(10);
// //             queue.enqueue(15);
// //             queue.enqueue(5);
// //         } else {
// //             queue.enqueue(Integer.parseInt(args[0]));
// //             queue.enqueue(Integer.parseInt(args[1]));
// //             queue.enqueue(Integer.parseInt(args[2]));
// //             queue.enqueue(Integer.parseInt(args[3]));
// //         }

// //         System.out.println(queue.getElements());

// //         System.out.println(queue.dequeue());
// //         queue.dequeue();
// //         System.out.println(queue.getElements());

// //         System.out.println(queue.first());
// //     }
// // }
// // Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// // и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// // некоторую букву во втором слове, при этом
// // 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// // порядка следования. (Например, add - egg изоморфны)
// // 2. буква может не меняться, а остаться такой же. (Например, note - code)
// // Пример 1:
// // Input: s = "foo", t = "bar"
// // Output: false
// // Пример 2:
// // Input: s = "paper", t = "title"
// // Output: true

// // 
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Stack;

// public class BracketChecker {

//     public static void main(String[] args) {
//         String[] expressions = {
//                 "a+(d*3)",
//                 "[a+(1*3)",
//                 "[6+(3*3)]",
//                 "{a}[+]{(d*3)}",
//                 "<{a}+{(d*3)}>",
//                 "{a+]}{(d*3)}"
//         };

//         for (String expression : expressions) {
//             System.out.println(expression + " - " + isBalanced(expression));
//         }
//     }

//     public static boolean isBalanced(String expression) {
//         Stack<Character> stack = new Stack<>();
//         Map<Character, Character> bracketPairs = new HashMap<>();
//         bracketPairs.put(')', '(');
//         bracketPairs.put(']', '[');
//         bracketPairs.put('}', '{');
//         bracketPairs.put('>', '<');

//         for (char ch : expression.toCharArray()) {
//             if (bracketPairs.containsValue(ch)) {
//                 // Если это открывающая скобка, добавляем её в стек
//                 stack.push(ch);
//             } else if (bracketPairs.containsKey(ch)) {
//                 // Если это закрывающая скобка, проверяем стек
//                 if (stack.isEmpty() || stack.pop() != bracketPairs.get(ch)) {
//                     return false;
//                 }
//             }
//         }

//         // В конце стек должен быть пустым
//         return stack.isEmpty();
//     }
// }

// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022
// import java.util.HashMap;
// import java.util.Map;

// public class RomanToArabic {

//     public static void main(String[] args) {
//         String romanNumber = "MMXXII";
//         System.out.println(romanNumber + " = " + romanToArabic(romanNumber));
//     }

//     public static int romanToArabic(String roman) {
//         Map<Character, Integer> romanMap = new HashMap<>();
//         romanMap.put('I', 1);
//         romanMap.put('V', 5);
//         romanMap.put('X', 10);
//         romanMap.put('L', 50);
//         romanMap.put('C', 100);
//         romanMap.put('D', 500);
//         romanMap.put('M', 1000);

//         int result = 0;
//         int length = roman.length();
        
//         for (int i = 0; i < length; i++) {
//             int current = romanMap.get(roman.charAt(i));
//             if (i < length - 1) {
//                 int next = romanMap.get(roman.charAt(i + 1));
//                 if (current < next) {
//                     result -= current;
//                 } else {
//                     result += current;
//                 }
//             } else {
//                 result += current;
//             }
//         }

//         return result;
//     }
// }

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
// 6, 3}. Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.TreeSet;

// public class Seminar {
//     public static void main(String[] args) {
//         // Задание 1: HashSet
//         HashSet<Integer> hashSet = new HashSet<>();
//         int[] elements = {1, 2, 3, 2, 4, 5, 6, 3};
//         for (int element : elements) {
//             hashSet.add(element);
//         }
//         System.out.println("HashSet: " + hashSet);

//         // Задание 2: LinkedHashSet
//         LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//         for (int element : elements) {
//             linkedHashSet.add(element);
//         }
//         System.out.println("LinkedHashSet: " + linkedHashSet);

//         // Задание 3: TreeSet
//         TreeSet<Integer> treeSet = new TreeSet<>();
//         for (int element : elements) {
//             treeSet.add(element);
//         }
//         System.out.println("TreeSet: " + treeSet);
//     }
// }
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве



// import java.util.Random;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

// public class Seminar {
//     public static void main(String[] args) {
//         // Правильный вызов метода fillArray
//         int[] array = fillArray(1000, 25); 
//         // Правильный вывод массива
//         System.out.println(Arrays.toString(array)); 
//         System.out.println(uniquePersent(array));
//     }

//     public static int[] fillArray(int size, int limit) {
//         Random rnd = new Random();
//         // Правильное объявление массива
//         int[] arr = new int[size]; 
//         for (int i = 0; i < arr.length; i++) {
//             // Генерация случайных чисел с ограничением
//             arr[i] = rnd.nextInt(limit); 
//         }
//         return arr;
//     }

//     public static double uniquePersent(int[] arr) {
//         Set<Integer> uniqueValue = new HashSet<>();
//         for (int e : arr) {
//             uniqueValue.add(e);
//         }
//         return (double) (uniqueValue.size() * 100) / arr.length;
//     }
// }

// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
// приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

// public class Cat {
//     private String name;
//     private int age;
//     private String breed;
//     private String chipNumber;
//     private String owner;
//     private String contactNumber;
//     private String medicalHistory;
//     private String currentMedications;
//     private String vaccinations;

//     public Cat(String name, int age, String breed, String chipNumber, String owner, String contactNumber) {
//         this.name = name;
//         this.age = age;
//         this.breed = breed;
//         this.chipNumber = chipNumber;
//         this.owner = owner;
//         this.contactNumber = contactNumber;
//         this.medicalHistory = "";
//         this.currentMedications = "";
//         this.vaccinations = "";
//     }

//     public void addMedicalHistory(String entry) {
//         this.medicalHistory += entry + "\n";
//     }

//     public void updateVaccinations(String vaccination) {
//         this.vaccinations += vaccination + "\n";
//     }

//     public void addMedication(String medication) {
//         this.currentMedications += medication + "\n";
//     }

//     public void updateContactNumber(String number) {
//         this.contactNumber = number;
//     }

//     // getters and setters for fields if needed
// }

