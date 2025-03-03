/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Thoriq
 */
public class DynamicDispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref; // Reference of type A

        ref = b; // ref refers to B's object
        ref.callThis(); // Calls B's method

        ref = c; // ref refers to C's object
        ref.callThis(); // Calls C's method

        ref = a; // ref refers to A's object
        ref.callThis(); // Calls A's method
    }
}
