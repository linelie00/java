//4-1
public class Main {
    int radius;
    String name;

    public Circle() { }

    public double getArea() {
        return 3.14 * radius * radius;
    }


    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);
    }
}

//4-2
import java.util.Scanner;

public class Rectangle {
   int width;
   int height;

   public int getArea() {
      return width*height;
   }

   public static void main(String[] args) {
      Rectangle rect = new Rectangle(); // 객체 생성
      Scanner scanner = new Scanner(System.in);
      System.out.print(">> ");

      rect.width = scanner.nextInt();
      rect.height = scanner.nextInt();

      System.out.println("사각형의 면적은 " + rect.getArea());

      scanner.close();
   }
}

//4-3
public class Circle {
    int radius;
    String name;

    public Circle() {
        radius = 1; name = "";
    }
    public Circle(int r, String n) {
        radius = r; name = n;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}

//4-4
public class Book {
    String title;
    String author;

    public Book(String t) {
        title = t; author = "작자미상";
    }

    public Book(String t, String a) {
        title = t; author = a;
    }

    public static void main(String [] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}

//4-5
public class Book {
   String title;
   String author;
   void show() { System.out.println(title + " " + author); }

   public Book() {
      this("", "");
      System.out.println("생성자 호출됨");
   }

   public Book(String title) {
      this(title, "작자미상");
   }

   public Book(String title, String author) {
      this.title = title; this.author = author;
   }
   public static void main(String [] args) {
      Book littlePrince = new Book("어린왕자", "생텍쥐페리");
      Book loveStory = new Book("춘향전");
      Book emptyBook = new Book();      
      loveStory.show();

      bible.show();
   }
}