// public class prog {                     * классы после него всегда отображатса имя java файла например мы работаем java.prog поэтому после него prog
//     public static void main(String[] args) {
//         System.out.println("world12");
//     }
// // }
// public class prog{
//     public static void main(String[] args){
//         int a = 5;
//         System.out.println(a);
//     }
// }
// public class prog{
    
//     public static void main(String[] arg){
//        int a = 12;
//         System.out.println(a++);
//         System.out.println(a);
//         System.out.println(a++);
//     }
// }

// public class prog{
    
//     public static void main(String[] arg){
//        int a = 12;
//        int b = 5;
//        System.out.println(a | b);
// }
// }

// public class prog{
    
//     public static void main(String[] arg){
//       String a = "asa1a";
//       boolean b = a.length() > 2 && a.charAt(3) == '1';
//       System.out.println(b);
// }
// }

// public class prog {

//     public static void main(String[] arg){
//         int[] arr = new int[] {1, 2, 3, 4, 5}; 
//         System.out.println(arr.length);
//     }
// }


// public class Program {
//     public static void main(String[] args) {
//     int[][] arr = new int[3][5];
   
//     for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j < arr[i].length; j++) {
//     System.out.printf("%d ", arr[i][j]);
//     }
//     System.out.println();
//     }
//     }
//    }
   
// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("name: ");
//  String name = iScanner.nextLine();
//  System.out.printf("hello, %s!", name);
//  iScanner.close();
//  }
// }

// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  int x = iScanner.nextInt();
//  System.out.printf("double a: ");
//  double y = iScanner.nextDouble();
//  System.out.printf("%d + %f = %f", x, y, x + y);
//  iScanner.close();
// }}
// public class prog {
//     public static void main(String[] args) {
//     int a = 1, b = 2;
//     int c = a + b;
//     String res = a + " + " + b + " = " + c;
//     System.out.println(res);
//     }
//    }
//    public class Program {
//  public static void main(String[] args) {
//  int a = 1, b = 2;
//  int c = a + b;
//  String res = String.format("%d + %d = %d \n", a, b, c);
//  System.out.printf("%d + %d = %d \n", a, b, c);
//  System.out.println(res);
//  }
// }
// import java.util.Scanner;

// public class prog {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int x = n % 10;
//         int y = n / 100;
//         int z = n / 10 % 10;
//         int res = x * y * z;
//         int sum = x + y + z;
//         int dif = res - sum;
//         System.out.println(dif);
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Вводим количество чисел в последовательности
//         int N = sc.nextInt();
        
//         // Вводим саму последовательность чисел
//         int[] numbers = new int[N];
//         for (int i = 0; i < N; i++) {
//             numbers[i] = sc.nextInt();
//         }
        
//         // Подсчитываем количество положительных чисел, после которых идет отрицательное число
//         int count = 0;
//         for (int i = 0; i < N - 1; i++) {
//             if (numbers[i] > 0 && numbers[i + 1] < 0) {
//                 count++;
//             }
//         }
        
//         // Выводим результат
//         System.out.println(count);
        
//         sc.close();
//     }
// // }
// public class prog {

//   public static void main(String[] arg){
//      String input = "guess";
//      int length = input.length(); // length = 5
//      int mid = length / 2; // mid = 2
//      String firstHalf, secondHalf;
//     if (length % 2 == 0) {
//     firstHalf = input.substring(0, mid); // "gu"
//     secondHalf = input.substring(mid); // "ess"
// }   else {
//     firstHalf = input.substring(0, mid + 1); // "gue"
//     secondHalf = input.substring(mid + 1); // "ss"
//     String result = secondHalf + firstHalf; // "ssgue"
//     System.out.println("Результат: " + result); // Результат: ssgue

// }
//   }
// }
// public class Main {
//   public static void main(String[] args) {
//       // Начало измерения времени
//       long startTime = System.nanoTime();
      
//       // Создание объекта StringBuilder
//       StringBuilder sb = new StringBuilder();
      
//       // Добавление 1,000,000 символов '+'
//       for (int i = 0; i < 1000000; i++) {
//           sb.append("+");
//       }

//       // Преобразование StringBuilder в строку
//       String result = sb.toString();
      
//       // Конец измерения времени
//       long endTime = System.nanoTime();
      
//       // Вычисление времени выполнения
//       long duration = endTime - startTime;

//       // Вывод времени выполнения в наносекундах и миллисекундах
//       System.out.println("Время выполнения (нс): " + duration);
//       System.out.println("Время выполнения (мс): " + (duration / 1_000_000.0));
//   }
// }

// Что такое API для нас: строки
// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках

// Работа с файловой системой
// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения
// файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые
// находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог