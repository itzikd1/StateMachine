public class Machine {

    //all the states that exist in machine
    public State off;
    public State on;
    public State idle;
    public State processing;
    public State deleteFile;
    public State diskFree;
    public State diskFull;
    public State downloadFile;
    public State downloading;
    public State startWatching;
    public State pause;
    public State watching;
    public State error;
    public State internetStatus;

    //current state - we change this inorder to change state
    State state;

    //global variables
    boolean internetOn = false;
    int capacity = 100;
    boolean second = false;
    int userScore = 0;

    public Machine() {

        off = new Off(this);
        on = new idle(this);
        idle = new idle(this);
        processing = new processing(this);
        deleteFile = new deleteFile(this);
        diskFree = new diskFree(this);
        diskFull = new diskFull(this);
        downloadFile = new downloading(this);
        downloading = new downloading(this);
        startWatching = new startWatching(this);
        pause = new pause(this);
        watching = new watching(this);
        error = new error(this);
        internetStatus = new internetStatus(this);

        state = off;

    }


    //Change state
    void setState(State newState) {
        state = newState;
    }


    State getState() {
        return state;
    }

    //Here we do all the function of the program
/*
    public void turnOnMovieDownlaoder() {
        state.movieDownloaderOn();

    }

    public void turnOffMovieDownlaoder() {
        state.movieDownloaderOff();


    }

    public void idle() {
        System.out.println("idle mode");
    }
    */
}