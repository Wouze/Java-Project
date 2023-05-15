
 class Movie{
  public int movieId ; 
  public String name ;
  public String Genra;
  public int ageLimit;
  public int duration;
 
  // method ageLimit
 public void ageLimit(int Age){
     if(Age<ageLimit){
         System.out.println("Entry denied! Please choose a suitable movie");
         //keep entring age until it's >=ageLimit
     }
 }

    public Movie(int movieId, String name, String Genra, int ageLimit, int duration) {
        this.movieId = movieId;
        this.name = name;
        this.Genra = Genra;
        this.ageLimit = ageLimit;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("%s   %s   +%d   %d Min",name , Genra , ageLimit , duration);
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenra() {
        return Genra;
    }

    public void setGenra(String Genra) {
        this.Genra = Genra;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
   
}


