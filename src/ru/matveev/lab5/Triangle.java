package ru.matveev.lab5;
import java.io.*;
import java.util.*;
 class Triangle extends Figure {
        public String type_tr;
        public String father;
        Triangle(int id1, int x1, int y1, String name1, String square1, String perimetr1, String mo)
        {
            id = id1; x=x1; y=y1; name = name1; square = square1; perimetr = perimetr1; type_tr = mo;
        }
        void print(){System.out.printf("id-%-3s x:%-3s y:%-3s Фигура: %-15s Площадь: %-2s Периметр: %-4s Тип треугольника: %s\n",Integer.toString(id),Integer.toString(x),Integer.toString(y),name,square,perimetr,type_tr);}        
    }