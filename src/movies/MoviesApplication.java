package movies;
import java.util.Arrays;
import util.Input;



public class MoviesApplication {
 static Movie[] movies = MoviesArray.findAll();


 public static void viewAllMovies(){
     for (Movie movie : movies) {
         System.out.println(movie.getName() + " -- " + movie.getCategory());

     }
 }

 public static void viewAnimated(){
     for (Movie movie : movies){
         if(movie.getCategory().equalsIgnoreCase("animated")){
             System.out.println(movie.getName() + " -- " + movie.getCategory());

         }
     }
 }

    public static void viewDrama(){
        for (Movie movie : movies){
            if(movie.getCategory().equalsIgnoreCase("drama")){
                System.out.println(movie.getName() + " -- " + movie.getCategory());

            }
        }
    }

    public static void viewHorror(){
     for (Movie movie : movies){
         if(movie.getCategory().equalsIgnoreCase("horror")){
             System.out.println(movie.getName() + " -- " + movie.getCategory());
         }
     }
 }

    public static void viewScifi(){
     for(Movie movie : movies){
         if(movie.getName().equalsIgnoreCase("scifi")){
             System.out.println(movie.getName() + " -- " + movie.getCategory());
         }
     }
    }


    public static void main(String[] args) {
        Input in = new Input();
        boolean loop;

        do {
//            System.out.println("Would you like to look up a movie?");
//            loop = in.yesNo();

            System.out.printf("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");
            int input = in.getInt();
            if(input == 0){

                System.out.println("Thank you for using this app!");
                break;
            }
            if(input == 1){
             viewAllMovies();
            }
            if(input == 2){
             viewAnimated();
            }
            if(input == 3){
            viewDrama();
            }
            if(input == 4){
            viewHorror();
            }
            if(input == 5){
            viewScifi();
            }
            System.out.println("Would you like to look up another list of movies?");
            loop = in.yesNo();
        }while(loop);
        System.out.println("Thank you for using this app!");
    }
}
