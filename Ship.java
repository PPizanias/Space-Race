package edu.ysu.student.ppizanias.spacerace;

import java.awt.Color;
import java.awt.event.ActionEvent;

public class Ship {
    private  Integer x;
    private  Integer y;
    private Color color;
    private Integer width;
    private Integer height;
    
    public Ship(Integer x, Integer y ){
        this.x = x;
        this.y = y;
        this.color = Color.WHITE;
    }
   
    public void restart(){
      this.x = 200;
      this.y = 250;
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

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
    
}
