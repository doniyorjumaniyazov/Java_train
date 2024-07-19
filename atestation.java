import java.util.*;   // импортируем утили для java

public class Laptop {                   // создадим нужный класс
    private String brand; 
    private int ram; 
    private int storage; 
    private String os; 
    private String color; 

    public Laptop(String brand, int ram, int storage, String os, String color) {    // конструктор 
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }
                                                    // тепер возврашаем каждый поля для класса
    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    Override                                  //    метод для вывода инфо о ноутбуке
    public String toString() {
        return String.format("Laptop [brand=%s, ram=%dGB, storage=%dGB, os=%s, color=%s]", brand, ram, storage, os, color);
    }

    public static void main(String[] args) {                              // создание множеств
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(
            new Laptop("Dell", 16, 512, "Windows 10", "Black"),
            new Laptop("Apple", 8, 256, "macOS", "Silver"),
            new Laptop("HP", 32, 1024, "Windows 11", "White"),
            new Laptop("Asus", 16, 512, "Windows 10", "Blue")
        ));

        Map<Integer, String> criteria = Map.of(                   // создадим map для хранение критерий
            1, "ОЗУ", 
            2, "Объем ЖД", 
            3, "Операционная система", 
            4, "Цвет"
        );

        Scanner scanner = new Scanner(System.in);                  // запрос филтирации у ползовотеля
        Map<String, String> filters = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        criteria.forEach((key, value) -> System.out.println(key + " - " + value));

        while (true) {
            System.out.print("Введите номер критерия (или 0 для завершения ввода): ");
            int criterion = scanner.nextInt();
            if (criterion == 0) break;
            System.out.print("Введите минимальное значение для " + criteria.get(criterion) + ": ");
            String value = scanner.next();
            filters.put(criteria.get(criterion), value);
        }
                                          // филтирация ноутбков нужным критерием
        laptops.stream()
            .filter(laptop -> filters.entrySet().stream().allMatch(filter -> {
                switch (filter.getKey()) {
                    case "ОЗУ":
                        return laptop.getRam() >= Integer.parseInt(filter.getValue());
                    case "Объем ЖД":
                        return laptop.getStorage() >= Integer.parseInt(filter.getValue());
                    case "Операционная система":
                        return laptop.getOs().equalsIgnoreCase(filter.getValue());
                    case "Цвет":
                        return laptop.getColor().equalsIgnoreCase(filter.getValue());
                    default:
                        return false;
                }
            }))                               // вывод
            .forEach(System.out::println);

        scanner.close();
    }
}
