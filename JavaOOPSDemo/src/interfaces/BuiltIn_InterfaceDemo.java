package interfaces;

import java.util.function.*;

class ConsumerImp implements Consumer<Integer>{
    @Override
    public void accept(Integer integer) {
        System.out.println("impl class "+integer);
    }
}
public class BuiltIn_InterfaceDemo {

    public static void main(String[] args) {
        Consumer<Integer> consumer1 = new ConsumerImp();
        Consumer<Integer> consumer2 = new Consumer<Integer>(){
            @Override
            public void accept(Integer o) {
                System.out.println("anonymous class " +o);
            }
        };
        Consumer<Integer> consumer3 = p -> System.out.println("lambda "+p);
        consumer3.accept(300);
        consumer2.accept(908);
        consumer1.accept(67567);
        // Supplier, Function, Predicate
        Supplier<String> stringSupplier = () -> "Hello";
        System.out.println(stringSupplier.get());

        Predicate<String> predicate = s -> s.length() > 5;

        predicate.and(s-> s.endsWith("jpg"));

        System.out.println(predicate.test("hello.jpg"));
        // T - String is type, R - Integer is result
        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("Hello"));

        BiConsumer<Integer, Integer> biConsumer = (n1, n2)-> System.out.println(n1+n2);
        biConsumer.accept(10,20);

        /**
         * functional interface
         * 1. @FuntionalInterface : mandate that an interface can have only 1
         * abstract method but can have any number of default and static methods
         * 2. only with functional interfaces is the lambda syntax used
         * 2. lambdas are just a concise way of providing the implementation of the
         * abstract method in the functional interface
         */
        //







    }
}
