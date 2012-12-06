package ru.matveev.lab5;
import java.io.*;
import java.util.*;

 interface Movable {
    
    void move(int x, int y); // перемещение в точку (x,)
    
}  
 interface Mirrorable {
    
   void mirrorOfX(); // симметрия относительно Ох
   void mirrorOfY(); // симметрия относительно Ох
    
}

class Figure implements Comparable <Figure>, Movable,Mirrorable {
        public int id;
        public String name;
        public int x,y;
        public String square;
        public String perimetr;
        public int SortType = 0;
        Figure(){}
        Figure(int id1, int x1, int y1, String name1, String square1, String perimetr1)
        {
            x=x1;
            y=y1;
            x=x1; y=y1; name = name1; id = id1; square = square1; perimetr = perimetr1;
        }
        void print(){System.out.printf("id-%-3s x:%-3s y:%-3s Фигура: %-15s Площадь: %-2s Периметр: %-4s\n",Integer.toString(id),Integer.toString(x),Integer.toString(y),name,square,perimetr);}

    
    public int compareTo(Figure t) {
      int res = 0;
      Figure other = (Figure) t;
      if (SortType == 1) //по айди
      { if (id > other.id) res = 1;
        if (id < other.id) res = -1;
      }
      if (SortType == 2) //по периметру
      {   res = perimetr.compareTo(other.perimetr);}
      if (SortType == 3) //по фамилии
      {   res = name.compareTo(other.name);}
      return res; 
    }

    @Override
    public void move(int x1, int y1) {
      x = x1;
      y = y1;
    }

    @Override
    public void mirrorOfX() {
        y = y*(-1);
    }

    @Override
    public void mirrorOfY() {
       x = x*(-1);
    }


       
    }