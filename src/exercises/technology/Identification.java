package exercises.technology;

public abstract class Identification {
    int id;
    public Identification(int id){
        super();
       this.id = id;
    }
    public void idForEach(int id){
        this.id = id + 1;
    }

}
