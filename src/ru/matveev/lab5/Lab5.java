package ru.matveev.lab5;
import java.io.*;
import java.util.*;

public class Lab5 {
    public static int key = -1;
    public static Figure test = new Figure();
    public static List<Figure> baze = new ArrayList();
    
    public static void main(String[] args) throws IOException {
      
        
        while(key!=0)
        {
            System.out.println("1 - Создать простую фигуру");
            System.out.println("2 - Создать треугольник");
            System.out.println("3 - Создать четырехугольник");
            System.out.println("4 - Создать пятиугольник");
            System.out.println("5 - Создать шестиугольник");
            System.out.println("6 - Вывод списка с детальной информацией");
            System.out.println("7 - Удаление по id");
            System.out.println("8 - Сортировка по id");
            System.out.println("9 - Сортировка по периметру");
            System.out.println("10- Сортировка по фигуре");
            System.out.println("11- Переместить фигуру в точку");
            System.out.println("12- Отразить относительно Ох");
            System.out.println("13- Отразить относительно Оу");
            
            System.out.println("0 - Выход");
            InputStreamReader isr = new InputStreamReader(System.in); 
            BufferedReader br = new BufferedReader(isr); 

            Scanner in = new Scanner(System.in);
            key = in.nextInt();
            switch(key)
            {
                case 1:
                    System.out.println("Введите id: ");
                    int id = in.nextInt();
                    System.out.println("Введите x: ");
                    int x = in.nextInt();
                    System.out.println("Введите y: ");
                    int y = in.nextInt();
                    
                    System.out.println("Введите фигуру: ");
                    String name = in.next();
                    System.out.println("Введите периметр: ");
                    String perimetr = br.readLine();
                    System.out.println("Введите площадь: ");
                    String square = br.readLine();
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    int pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Figure(id,x,y,name,square,perimetr));}
                    else {baze.add(new Figure(id,x,y,name,square,perimetr));}
                    
                    break;
                case 3:
                    System.out.println("Введите id: ");
                    id = in.nextInt();
                    System.out.println("Введите x: ");
                    x = in.nextInt();
                    System.out.println("Введите y: ");
                    y = in.nextInt();
                    name = "Четырехугольник";
                    System.out.println("Введите периметр: ");
                    perimetr = br.readLine();
                    System.out.println("Введите площадь: ");
                    square = br.readLine();
                    System.out.println("Введите вид четырехугольника: ");
                    String univ = br.readLine();
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Quadrangle(id,x,y,name,square,perimetr,univ));}
                    else {baze.add(new Quadrangle(id,x,y,name,square,perimetr,univ));}
                    
                
                    break;
                case 4:
                    System.out.println("Введите id: ");
                    id = in.nextInt();
                    name = "Пятиугольник";
                    System.out.println("Введите x: ");
                    x = in.nextInt();
                    System.out.println("Введите y: ");
                    y = in.nextInt();
                    System.out.println("Введите периметр: ");
                    perimetr = br.readLine();
                    System.out.println("Введите площадь: ");
                    square = br.readLine();
                    System.out.println("Введите тип пятиугольника: ");
                    String type_pen = br.readLine();
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Pentagon(id,x,y,name,square,perimetr,type_pen));}
                    else {baze.add(new Pentagon(id,x,y,name,square,perimetr,type_pen));}

                   
                    break;                
                case 2:
                    System.out.println("Введите id: ");
                    id = in.nextInt();
                    name = "Треугольник";
                    System.out.println("Введите x: ");
                    x = in.nextInt();
                    System.out.println("Введите y: ");
                    y = in.nextInt();
                    System.out.println("Введите периметр: ");
                    perimetr = br.readLine();
                    System.out.println("Введите площадь: ");
                    square = br.readLine();
                    System.out.println("Введите тип треугольника: ");
                    String type_tr = br.readLine();
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Triangle(id,x,y,name,square,perimetr,type_tr));}
                    else {baze.add(new Triangle(id,x,y,name,square,perimetr,type_tr));}
                    
                    break;
               case 5:
                    System.out.println("Введите id: ");
                    id = in.nextInt();
                    name = "шестиугольник"; 
                    System.out.println("Введите x: ");
                    x = in.nextInt();
                    System.out.println("Введите y: ");
                    y = in.nextInt();
                    System.out.println("Введите периметр: ");
                    perimetr = br.readLine();
                    System.out.println("Введите площадь: ");
                    square = br.readLine();
                    System.out.println("Введите тип шестиугольника: ");
                    String thex = br.readLine();
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Hexagon(id,x,y,name,square,perimetr,thex));}
                    else {baze.add(new Hexagon(id,x,y,name,square,perimetr,thex));}
                    
                    break;
               case 6:
                   
                   //Iterator it = baze.iterator();
                  // int k = 1;
                   for(Figure test: baze)
                  {
                      test.print();
                  }
                  /* while (it.hasNext())
                   {
                       test = (Figure) it.next();
                       System.out.print(k+": ");
                       test.print();
                       k++;
                   }*/
                   
                   break;
              case 7:
                  System.out.print("Введите id: ");
                  int id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure) baze.get(i);
                   if (test.id == id1) 
                   {
                        baze.remove(i);
                        System.out.println("Удаление произведено!"); 
                        i = baze.size();
                   }
                  }
                  break;
              case 8:
                  
                 for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure)baze.get(i);
                   test.SortType = 1;
                   baze.set(i,test);
                  }
                  Collections.sort(baze);
                  break;
              case 9:
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure)baze.get(i);
                   test.SortType = 2;
                   baze.set(i,test);
                  }
                  Collections.sort(baze);
                  break;
              case 10:
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure)baze.get(i);
                   test.SortType = 3;
                   baze.set(i,test);
                  }
                  Collections.sort(baze);
                  break;
              case 11:
                  System.out.print("Введите id: ");
                  id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure) baze.get(i);
                   if (test.id == id1) 
                   {
                       System.out.println("Введите х,у: "); 
                       int xx = in.nextInt();
                       int yy = in.nextInt();
                       test.move(xx, yy);
                       baze.set(i,test);
                        System.out.println("Перемещение произведено!"); 
                        
                   }
                  }
                  break;
              case 12:
                  System.out.print("Введите id: ");
                  id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure) baze.get(i);
                   if (test.id == id1) 
                   {
                       
                       test.mirrorOfX();
                       baze.set(i,test);
                        System.out.println("Отражение произведено!"); 
                        
                   }
                  }
                  break;
              case 13:
                  System.out.print("Введите id: ");
                  id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure) baze.get(i);
                   if (test.id == id1) 
                   {
                       
                       test.mirrorOfY();
                       baze.set(i,test);
                        System.out.println("Отражение произведено!"); 
                        
                   }
                  }
                  break;
                  
            }
        }
    }
}
