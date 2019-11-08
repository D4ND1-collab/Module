public class GameOfLife{

    private int species;


    public GameOfLife(){
        this.species = 0;
    }


    public GameOfLife(int species){
        this.species = species;
    }


    public void setSpecies(int newSpecies){
        this.species = newSpecies;
    }


    public int getSpecies(){
        return this.species;
    }


    public boolean isAlive(){
        if ( this.species == 0 ) {
            return false;
        }
        else {
            return true;
        }
    }
}