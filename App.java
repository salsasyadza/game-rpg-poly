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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Static Polymorphism pada class Hero
        Hero hero = new Hero();
        hero.move();
        hero.move("left");

        // Static Polymorphism pada class Enemy
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(3);

        // Dynamic Polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character character = new Hero();
        character.move();
        
        character = new Enemy();
        character.move();
        
        character = new Witch();
        character.move();
        
        character = new Fighter();
        character.move();

        // Dynamic Polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Witch witch = new Witch();
        Character fighter = (Character) witch;
        fighter.move();
    }

    // Method untuk mengubah objek Witch menjadi objek Fighter
    public static Fighter convertToFighter(Character character) {
        if (character instanceof Witch) {
            Witch witch = (Witch) character;
            Fighter fighter = new Fighter();
            return fighter;
        } else {
            return null;
        }
    }
}
    
    
    

