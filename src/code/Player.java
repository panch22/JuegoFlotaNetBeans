/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author crist
 */
public class Player {
    private String nombre;
    private int turn;
    private int[][] playBoard;

    public Player(String nombre, int turn, int[][] playBoard) {
        this.nombre = nombre;
        this.turn = turn;
        this.playBoard = playBoard;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[][] getPlayBoard() {
        return playBoard;
    }

    public void setPlayBoard(int[][] playBoard) {
        this.playBoard = playBoard;
    }    
}
