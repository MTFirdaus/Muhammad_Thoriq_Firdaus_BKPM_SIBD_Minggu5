/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Thoriq
 */
public class DynamicDispatch_T {
    public static void main(String args[]) {
        A_T a = new A_T();
        B_T b = new B_T();
        C_T c = new C_T();
        A_T ref; // Reference of type A

        ref = b; // ref refers to B's object
        ref.callThis(); // Calls B's method

        ref = c; // ref refers to C's object
        ref.callThis(); // Calls C's method

        ref = a; // ref refers to A's object
        ref.callThis(); // Calls A's method
    }
}
