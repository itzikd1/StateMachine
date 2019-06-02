import java.util.ArrayList;
import java.util.List;

public class Machine {

    //to change the list to queue
    public List<File> movies;
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
    //the file we pulled in processing
    public File file;

    //current state - we change this inorder to change state
    State state;

    //global variables

    //to understand how to turn off and turn on the internet
    boolean internetOn = true;
    int capacity = 100;
    boolean second = false;
    int userScore = 0;
    public boolean fileInDownload = false;

    public Machine() {

        // TODO: 02/06/2019 both on and idle are "new idle"maybe need to fix?  Itzik
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
        movies = new ArrayList<>();

        state = off;

    }


    //Change state
    void setState(State newState) {

        state = newState;

        if(state instanceof processing)
        {
            ((processing) state).doMethod();
        }
        else if(state instanceof diskFree)
        {
            ((diskFree) state).checkCondition();
        }
        else if(state instanceof diskFull)
        {
            ((diskFull) state).checkCondition();
        }
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