
class Library{
    String[] books;
    int noOfBooks;
    Library(){
this.books=new String[100];
noOfBooks=0;
    }

    void AddBooks(String Book){
        noOfBooks++;
       this.books[noOfBooks]=Book;
        System.out.println(Book+" Book has been added");

    }
 void ShowAvialableBooks(){
for (String Book:this.books){
    if (Book==null){
   continue;}
    System.out.println(Book);
}
    }
    void issuedBooks(String book){
        for (int i=0;i<this.books.length;i++) {
            if (this.books[i].equals(book)) {
                System.out.println("Book Has been issued");
                books[i] = null;
                return;
            }
        }

        System.out.println("Book is not yet");
    }
void returnn(String book){
        AddBooks(book);
    }
}
 class Excercise_Library {
    public static void main(String[] args) {
Library m1=new Library();
m1.AddBooks("Success");
m1.AddBooks("C++");
m1.AddBooks("Java");
m1.AddBooks("DSA");
 m1.ShowAvialableBooks();
 m1.issuedBooks("C++");
 m1.ShowAvialableBooks();
    }
}
