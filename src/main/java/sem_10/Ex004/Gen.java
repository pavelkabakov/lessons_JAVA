package sem_10.Ex004;

    public class Gen<T>{
        T ob;

        public Gen(T o){
            ob = o;
        }
    }

    class UseTest{
//        static void test(Gen<? super C> a){ // нижняя граница наследования
            static void test(Gen<? extends A> a){ // вехняя граница наследования
            //
        }

        public static void main(String[] args) {
            A a = new A();
            B b = new B();
            C c = new C();
            D d = new D();

            Gen<A> ga = new Gen<>(a);
            Gen<B> gb = new Gen<>(b);
            Gen<C> gc = new Gen<>(c);
            Gen<D> gd = new Gen<>(d);

            test(ga);
            test(gb);
            test(gc);
//            test(gd); // выдает ошибку так как класс выходит за границу обследования
        }
    }
