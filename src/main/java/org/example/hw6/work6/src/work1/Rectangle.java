package org.example.hw6.work6.src.work1;

// Прямоугольник

// Класс Квадрат наследует класс Прямоугольник. И при изменении одного, изменяется другой.
// Вводим абстрактный класс Фигура и наследуем от него два других.
public class Rectangle extends Figure{

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
