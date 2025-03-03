package Overriding;

/**
 *
 * @author Thoriq
 */
public class B extends A{
    public void tampilkanKeLayar(){
        super.tampilkanKeLayar();
        System.out.println("Method milik calss B dipanggil");
    }
}
