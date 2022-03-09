import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    static Scanner scanner = new Scanner(System.in);
    private int id;
    private String title, publishDate, author, content;
    static float averageRate = 0;
    public News(){};
    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Publish date: " + this.getPublishDate());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Content: " + this.getContent());
        System.out.println("Average rate: " + getAverageRate());
        System.out.println();
    }
    static int[] rateList = new int[3];
    static void calculate(){
        for (int rate : rateList){
            averageRate+=rate;
        }
        averageRate/=3;
    }
    static int ID = 0;
    static ArrayList<News> newsList = new ArrayList<>();
    static void menu() {
        System.out.println("1-Insert news");
        System.out.println("2-View list news");
        System.out.println("3-Average rate");
        System.out.println("4-Exit");
        int index = Integer.parseInt((scanner.nextLine()));
        switch (index){
            case 1:
//                News temp = new News();
                String title = scanner.nextLine();
                String publishDate = scanner.nextLine();
                String author = scanner.nextLine();
                String content = scanner.nextLine();
                for (int i = 0; i < rateList.length; i++){
                    rateList[i] = Integer.parseInt(scanner.nextLine());
                }
                News temp = new News(ID++, title, publishDate, author, content,0);
                newsList.add(temp);
                menu();
                break;
            case 2:
                for (News news : newsList){
                    news.display();
                }
                menu();
                break;
            case 3:
                calculate();
                for (News news : newsList){
                    news.display();
                }
                menu();
                break;
            case 4:
                break;
        }
    }
    public static void main(String[] args) {

//        int choice;
//        choice = scanner.nextInt();
        menu();
    }
}
