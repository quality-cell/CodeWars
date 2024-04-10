package org.example.kyu4;

import java.util.*;

public class TopDownMovementSystem {
    private int direction;
    private Tile position;
    private List<Integer> allPressKey;
    private HashMap<Integer, Boolean> keysMap;
    private boolean hasMoved;

    public TopDownMovementSystem(int x, int y) {
        position = new Tile(x,y);
        direction = 8;
        hasMoved = false;

        keysMap = new HashMap<>();
        allPressKey = new ArrayList<>();
        keysMap.put(8, false);
        keysMap.put(2, false);
        keysMap.put(4, false);
        keysMap.put(6, false);
    }

    public Tile getPosition()  { return position; }
    public int  getDirection() { return direction; }

    public void update() {
        List<Integer> pressKey = new ArrayList<>();

        for (var i: keysMap.entrySet()) {
            if (Input.getState(i.getKey()) != i.getValue()) {
                pressKey.add(i.getKey());
            }
        }

        for (Integer i: new int[] {6, 4, 2, 8}) {
            if (Input.getState(i) != keysMap.get(i)) {
                if (Input.getState(i)) {
                    direction = i;
                    allPressKey.add(i);
                    keysMap.replace(i, true);
                } else {
                    if (!allPressKey.isEmpty() && allPressKey.get(allPressKey.size() - 1).equals(i) && !checkAllRelease()) {
                        direction = allPressKey.size() > 1 ? allPressKey.get(allPressKey.size() - 2) : direction;
                        hasMoved = true;
                    } else if (Input.getState(direction) && !hasMoved) {
                        move();

                        hasMoved = true;
                    }

                    allPressKey.remove(i);
                    keysMap.replace(i, false);
                }
            } else if (pressKey.isEmpty() && keysMap.get(i) && i == direction){
                move();
            }
        }

        hasMoved = false;
    }

    private boolean checkAllRelease() {
        for (var i: keysMap.entrySet()) {
            if (Input.getState(i.getKey())) {
                return false;
            }
        }

        return true;
    }

    private void move() {
        switch (direction) {
            case 8:
                position = new Tile(position.x(), position.y() + 1);
                break;
            case 2:
                position = new Tile(position.x(), position.y() - 1);
                break;
            case 4:
                position = new Tile(position.x() - 1, position.y());
                break;
            case 6:
                position = new Tile(position.x() + 1, position.y());
                break;
        }
    }
}

class Tile {
    private int x;
    private int y;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }


    @Override
    public String  toString(){
        return "("+x+","+y+")";
    }

    @Override
    public int hashCode() {
        return x*34 + y*234 %3;
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Tile)) {
            return false;
        } else {
            return this.x == ((Tile) other).x && this.y == ((Tile) other).y;
        }

    }
}

class Input {
    public static HashMap<Integer, Boolean> keys = new HashMap<>();
    static {
        keys.put(2, false);
        keys.put(4, false);
        keys.put(6, false);
        keys.put(8, false);
    }

    public static boolean getState(int key) {
        return keys.get(key);
    }

    public static void release(int key) {
        keys.replace(key, false);
    }

    public static void press(int key) {
        keys.replace(key, true);
    }

    public static void clear() {
        keys = new HashMap<>();
        keys.put(2, false);
        keys.put(4, false);
        keys.put(6, false);
        keys.put(8, false);
    }
}
