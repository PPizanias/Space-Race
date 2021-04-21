package edu.ysu.student.ppizanias.spacerace;

import java.awt.Color;

public class Asteroid {
    private Integer x;
    private Integer y;
    private Color color;
    
    public Asteroid(Integer x, Integer y){
        this.x = x;
        this.y = y;
        this.color = Color.WHITE;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
