package bookmain;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.BookDao;
import dto.Book;

public class TestBook {
	public static void main(String args[]) throws SQLException
	{
		BookDao bookdao=new BookDao("jdbc:mysql://localhost:3306/cts","root","root");
		bookdao.connect();
		Book book=new Book(1009,"data science","mathews",5650);
		Scanner s=new Scanner(System.in);
		while(true)
		{
		System.out.println("1.list all the books");
		System.out.println("2.delete the books");
		System.out.println("3.update the books");
		System.out.println("4.insert the books");
		System.out.println("5.quit");
		System.out.println("Enter the choice");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1:List<Book> books=bookdao.listAllBooks();
					for(Book b:books)
					{
						System.out.println(b.getTitle()+" "+b.getAuthor());
					}
					break;
			case 2:System.out.println("Enter the id to delete");
					int id2=s.nextInt();
					Book book3=new Book(id2);
					bookdao.deleteBook(book3);
					System.out.println("Entered id row is deleted");
					break;
			case 3:System.out.println("Enter name,author and price for updated");
					String name1=s.next();
					String author1=s.next();
					float price1=s.nextFloat();
					int id1=s.nextInt();
					Book book2=new Book(id1,name1,author1,price1);
					bookdao.updateBook(book2);
					System.out.println("The row must be updated");
					break;
			case 4:System.out.println("Enter book id,name,author and price");
			        int id=s.nextInt();
			        String name=s.next();
			        String author=s.next();
			        float price=s.nextFloat();
			        Book book1=new Book(id,name,author,price);
					bookdao.insertBook(book1);
					System.out.println("Book inserted");
					break;
			case 5:System.exit(0);
		}
		}
	}
}
