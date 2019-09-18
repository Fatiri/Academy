package com.enigma.model;

public class Mobil {

    private Integer postX;
    private Integer postY;
    private Integer fuel = 0;
    private char[] commands;

    private final String FORWARD = "F";
    private final String BACKWARD = "B";
    private final String RIGHT = "R";
    private final String LEFT = "L";

    public Mobil(Integer x, Integer y) {
        this.postX = x;
        this.postY = y;
    }

    public void setFuel(Integer fuel) {
        this.fuel = this.fuel + fuel;
    }

    public void move(String movement) {
        if (movement.equals(FORWARD)) {
            this.postX++;
        } else if (movement.equals(BACKWARD)) {
            this.postY--;
        } else if (movement.equals(RIGHT)) {
            this.postX++;
        } else if (movement.equals(LEFT)) {
            this.postY--;
        }
    }

    public String setCommands(String commands) {
        this.commands = commands.toCharArray();
        return commands;
    }
    //
    public void run() {
        for (int i = 0; i < this.commands.length; i++) {
            if (fuel == 0 ){
                System.out.println("-----------------------------------------");
                System.out.println("Bahan Bakar Telah Habis");
                break;
            }
            move (String.valueOf(commands[i]));
            System.out.println(commands[i] + getPosition());
            if ((i + 1)%3 == 0){
                fuel -=1;
            }
        }
    }

    public String getPosition() {
        return "(" + this.postX + "," + this.postY + ")";
    }

    public String print() {
        return "Mobil { " +
                "postX = " + postX +
                ", postY = " + postY +
                ", fuel = " + fuel +
                '}';
    }
}