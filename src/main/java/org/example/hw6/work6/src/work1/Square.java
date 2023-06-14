package org.example.hw6.work6.src.work1;

// Квадрат
public class Square extends Figure {

    int height;
    int width;

    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
}
