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
public class prog {
  public static void main(String[] args) {
      int n = 234;
      int x = n % 10;
      int y = n / 100;
      int z = n / 10 % 10;
      int res = x * y * z;
      int sum = x + y + z;
      int dif = res - sum;
      System.out.println(dif);
  }
}git remote add origin https://github.com/doniyorjumaniyazov/Java_train.git
