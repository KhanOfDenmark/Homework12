import java.net.SocketOption;

class Book {    //1. Создание класса Book
    private String title;
    private Author author;
    private int yearOfPublication;
    public Book (String title, Author author, int yearOfPublication){   //3. Создание конструктора
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitle(){   //4. Создание геттеров для всех полей класса
        return this.title;
    }
    public String getAuthor(){
        return this.author.getAuthor();
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int year){
        this.yearOfPublication = year; //5. Создание сеттера для "Года публикации"
    }
}

class Author {  //2. Создание класса Author
    private String firstName;
    private String lastName;
    public Author (String firstName, String lastName){  //3. Создание конструктора
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Author (String author){
        String[] inintials = author.split(" ");
        this.firstName = inintials[0];
        this.lastName = inintials[1];
    }
    public String getFirstName(){   //4. Создание геттеров для всех полей класса
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAuthor(){
        return (this.firstName +this.lastName);
    }
}

public class Main { //6. Создание отдельного класса для запуска приложения
    public static void main(String[] args) {
        System.out.println("***");
        Author firstAuthor = new Author("Geremy Nikelson");
        Author secondAuthor = new Author("Viliam", "Stivenson");
        Book firstBook = new Book("A spoon on the road"
                ,firstAuthor,1986);
        Book secondBook = new Book("Lost in the intertemporal"
                ,secondAuthor,1962);
        System.out.println(firstBook.getTitle() +" | "  //Вывод данных первой книги
                +firstBook.getAuthor() +" "
                +firstBook.getYearOfPublication());
        System.out.println(secondBook.getTitle() +" | " //Вывод данных второй книги
                +secondBook.getAuthor() +" "
                +secondBook.getYearOfPublication());

        System.out.println("---Изменения---");
        secondBook.setYearOfPublication(1964); //7. Изменение года публикации второй книги
        System.out.println(secondBook.getTitle() +" | " //Вывод обновлённых данных второй книги
                +secondBook.getAuthor() +" "
                +secondBook.getYearOfPublication());
        System.out.println("***");
    }
}