package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){ //the constructor is for creating new movies
        this.name = name;
        this.category = category;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }

}
