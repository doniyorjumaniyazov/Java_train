// public class next {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//         c = a;
//         } else {
//         c = b;
//         }
//         System.out.println(c);
//         }
// }
// public class next {
//     public static void main(String[] args) {
//     int value = 321;
//     int count = 0;
//     while (value != 0) {
//     value /= 10;
//     count++;
//     }
//     System.out.println(count);
//     }
//    }
//    В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
// import java.time.LocalTime;

// public class next {
//     public static void main(String[] arg){
//         String a = "whats your name: ";
//         LocalTime currentTime = LocalTime.now();
        
//         if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(19, 0))) {
//             System.out.println("Doni");
//         }
//     }
// }
class Answer {
    public void printPrimeNums() {
        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Метод для проверки, является ли число простым
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
