package Abstract;

/**
 * @author Thoriq
 */
public abstract class A { 
    abstract public void method2(); // Deklarasi method abstrak

    public void method1() { // Method konkrit dengan implementasi
        System.out.println("Method konkrit dari class A");
    }
}
