package com.enigma.model;

public class Robot{

    private Integer postX;
    private Integer postY;
    private Integer batry = 0;
    private char[] commands;
    Direction dir;
    private final String FORWARD = "F";
    private final String BACKWARD = "B";
    private final String RIGHT = "R";
    private final String LEFT = "L";

    public Robot(Integer x, Integer y, Direction dir ) {
        this.postX = x;
        this.postY = y;
        this.dir = dir;
    }

    public void setBatry(Integer batry) {
        this.batry = this.batry + batry;
    }

    void turnRight(){
        this.dir = this.dir.getRight();
    }
    void turnLeft(){
        this.dir = this.dir.getLeft();
    }

    public void setMove(){
        if (this.dir.equals(Direction.NORTH)){
            this.postY++;
        }else if (this.dir.equals(Direction.EAST)){
            this.postX++;
        }else if (this.dir.equals(Direction.SOUTH)){
            this.postY--;
        }else if (this.dir.equals(Direction.WEST)){
            this.postX--;
        }
    }

    public void move(String movement) {
        if (movement.equals(RIGHT)) {
            turnRight();
        } else if (movement.equals(LEFT)) {
            turnLeft();
        } else if (movement.equals(FORWARD)) {
            this.setMove();
        }
    }

    public String setCommands(String commands) {
        this.commands = commands.toUpperCase().toCharArray();
        return commands;
    }

    public void run() {
        for (int i = 0; i < this.commands.length; i++) {
            if (batry == 0 ){
                System.out.println("-----------------------------------------");
                System.out.println("Batry Robot Telah Habis");
                break;
            }
            move (String.valueOf(commands[i]));
            System.out.println(getPosition());
            if ((i + 1)%3 == 0){
                batry -=1;
            }
        }
    }

    public String getPosition() {
        return "Position = (" + this.postX + "," + this.postY + ")     Direction = "+ this.dir ;
    }

    public String print() {
        return "Coordinate & Direction Akhir Robot =  " +
                "postX = " + postX +
                ", postY = " + postY +
                ", Direction Akhir = " + this.dir +
                ", Batry = " + batry ;
    }
}