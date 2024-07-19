public class lecture {
    public static void main(String[] args) {
        Object o = 1; GetType(o); // java.lang.Integer
        o = 1.2; GetType(o); // java.lang.Double
        }
        static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
        }
       }
    


// // Object это тип унверсалный например int 1 можно object 1 string""fdsg" object "fdsg"  и так далее
// List – пронумерованный набор элементов.
// Коллекции. Функционал
// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список

// Итератор
// Получение итератора с целью более гибкой работы с данными URL
// Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
// Enumeration в Java Collections Framework. Итераторы отличаются от
// перечислений двумя способами:
// Итераторы позволяют вызывающей стороне удалять элементы из
// базовой коллекции во время итерации с четко определенной
// семантикой.
// hasNext(), next(), remove()