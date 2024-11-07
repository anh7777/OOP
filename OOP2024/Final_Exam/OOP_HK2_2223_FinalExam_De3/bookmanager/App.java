package hus.oop.bookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        testOriginalData();
        testSortPagesOfBookIncreasing();
        testSortPagesOfBookDecreasing();
        testPriceOfBooksIncreasing();
        testPriceOfBooksDecreasing();
        testFilterBooksLowestPrice();
        testFilterBooksHighestPrice();
        testFilterBooksOfAuthor();
        testFilterBooksOfPublisher();
        testFilterBooksOfGenre();
    }

    public static void init() {
        String filePath = "data/books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                // Create a new book object and add it to the BookManager
                Book book = new Book(dataList.get(0), dataList.get(1), dataList.get(2), Integer.parseInt(dataList.get(3)), Integer.parseInt(dataList.get(4)), dataList.get(5));
                BookManager.getInstance().append(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        init();
        List<Book> books = BookManager.getInstance().getBookList();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("Original data:\n" + bookTitlesString);
    }

    public static void testSortPagesOfBookIncreasing() {
        init();
        List<Book> books = BookManager.getInstance().sortPagesIncreasing();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("Books sorted by pages in increasing order:\n" + bookTitlesString);
    }

    public static void testSortPagesOfBookDecreasing() {
        init();
        List<Book> books = BookManager.getInstance().sortPagesDecreasing();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("Books sorted by pages in decreasing order:\n" + bookTitlesString);
    }

    public static void testPriceOfBooksIncreasing() {
        init();
        List<Book> books = BookManager.getInstance().sortPriceIncreasing();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("Books sorted by price in increasing order:\n" + bookTitlesString);
    }

    public static void testPriceOfBooksDecreasing() {
        init();
        List<Book> books = BookManager.getInstance().sortPriceDecreasing();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("Books sorted by price in decreasing order:\n" + bookTitlesString);
    }

    public static void testFilterBooksLowestPrice() {
        init();
        List<Book> books = BookManager.getInstance().filterBooksLowestPrice(5);
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("5 books with the lowest price:\n" + bookTitlesString);
    }

    public static void testFilterBooksHighestPrice() {
        init();
        List<Book> books = BookManager.getInstance().filterBooksHighestPrice(5);
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("5 books with the highest price:\n" + bookTitlesString);
    }

    public static void testFilterBooksOfAuthor() {
        init();
        List<Book> books = BookManager.getInstance().filterBooksOfAuthor("J.K. Rowling");
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("Books written by J.K. Rowling:\n" + bookTitlesString);
    }

    public static void testFilterBooksOfPublisher() {
        init();
        List<Book> books = BookManager.getInstance().filterBooksOfPublisher("Oxford University Press");
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("Books published by Oxford University Press:\n" + bookTitlesString);
    }

    public static void testFilterBooksOfGenre() {
        init();
        List<Book> books = BookManager.getInstance().filterBooksOfGenre("Science Fiction");
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.println("Books of the Science Fiction genre:\n" + bookTitlesString);
    }
}