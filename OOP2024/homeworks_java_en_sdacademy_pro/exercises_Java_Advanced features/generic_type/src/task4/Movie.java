package task4;

class Movie extends MediaContent {
    private String director;
    public Movie(String director, String title) {
        super(title);
        this.director = director;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
