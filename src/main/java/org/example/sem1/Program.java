package org.example.sem1;

/*
1. Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
2. Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода
сделанного в предыдущем задании.
3. Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)
4. Переопределите метод toString для Товара, запустите программу, после этого переопределите для
наследника этот метод, после запуска обратите внимание на изменение поведения.
� Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)

 */
public class Program {
    public static void main(String[] args) {

        Vending vending = new FruitVending();
        Vending hotVending = new HotBeveragesVending();

        Product product1 = new Apple("Apple", 20, 1L);
        Product product2 = new Orange("Orange", 30, 2L);
        Product product3 = new Banana("Banana", 25, 3L);
        HotBeverages product4 = new Milk("Milk", 15, 4L, 10L);


        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);
        hotVending.addProduct(product4);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Orange"));
        System.out.println(vending.getProduct("Banana"));
        System.out.println();
        System.out.println(vending.getProduct(1L));
        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(5L));
        System.out.println(hotVending.getProduct(4L));

    }
}
