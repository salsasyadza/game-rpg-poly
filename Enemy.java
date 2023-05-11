/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerpgp5;

/**
 *
 * @author salsa
 */
public class Enemy extends Character {
    public void move() {
        System.out.println("Enemy moved.");
    }

    public void move(int step) {
        System.out.println("Enemy moves " + step + " steps forwards");
    }
}
