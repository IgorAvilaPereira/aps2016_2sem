/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public interface Duck {
    default void quack() {
      System.out.println("<silence>");
    }
    default void fly() {
      System.out.println("I don't fly, yet!");
    }
}
