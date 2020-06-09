package oopLec;

import java.util.Date;

public class Post {

    public static String nameOfBlog = "Justin's Blog";
    public static int numberOfSiteViews = 1212;

//    ====== Instance Properties =====
//    These pieces of info are conventionally private - which means they cannot be accessed outside of the class
    private int numberOfPostViews;
    private Date createdAt;
    private Date editedAt;
    private String title;
    private String content;
    private String category;
    private Person author;

//    setter method
    public void setTitle(String title){
        this.title = title;
    }
//    getter method
    public String getTitle(){
        return this.title;
    }

//    instance method
    public void printSummary() {
        System.out.printf("Title: %s%nContent: %s", this.title, this.content);
    }

//    ==========================


    public static String returnLongerPostTitle(Post p1, Post p2) {
        if (p1.title.length() > p2.title.length()) {
            return p1.title;
        } else {
            return p2.title;
        }

    }

    public static void main(String[] args) {
       Post post1 = new Post();
       post1.title = "This is a Name";

       Post post2 = new Post();
       post2.title = "Short Name";

        String longerTitle = Post.returnLongerPostTitle(post1, post2);
        System.out.println(longerTitle);
    }



}
