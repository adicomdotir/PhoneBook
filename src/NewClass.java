/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adicom
 */
public class NewClass<T> {
    public T n;

    public NewClass(T n) {
        this.n = n;
    }
    
    public <E> void f(E p) {
        System.out.println("" + p);
    }
}
