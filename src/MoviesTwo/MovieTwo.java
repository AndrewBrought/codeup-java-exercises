package MoviesTwo;

public class MovieTwo {
    private String movie;
    private String category;

    public MovieTwo(String movie, String category){
        this.movie = movie;
        this.category = category;
    }

    public void setMovie(String movie){
        this.movie = movie;
    }

    public String getMovie (){
        return movie;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }


}
