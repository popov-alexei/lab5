package ru.matveev.lab5;
import java.io.*;
import java.util.*;
    class Quadrangle extends Figure {
        public String type_qu;
        Quadrangle(int id1, int x1, int y1, String name1, String square1, String perimetr1, String uni)
        {id = id1; x=x1; y=y1; name = name1; square = square1; perimetr = perimetr1; type_qu = uni;}
        void print(){System.out.printf("id-%-3s x:%-3s y:%-3s Фигура: %-15s Площадь: %-2s Периметр: %-4s Тип четырехугольника: %s\n",Integer.toString(id),Integer.toString(x),Integer.toString(y),name,square,perimetr,type_qu);}        
    }