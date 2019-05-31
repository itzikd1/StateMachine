public class Machine {

    //all the states that exist in machine
    State movieDownloaderOff;
    State movieDownloaderOn;
    State idle;
    State processing;
    State deleteFile;
    State diskFree;
    State diskFull;
    State downloadFile;
    State downloading;
    State startWatching;
    State pause;
    State watching;
    State error;
    State internetStatus;

    //current state - we change this inorder to change state
    State state;

    //global variables
    boolean internetOn = false;
    int capacity = 100;
    boolean second = false;
    int userScore = 0;

    public Machine() {

        movieDownloaderOff = new movieDownloaderOff(this);
        movieDownloaderOn = new movieDownloaderOn(this);
        idle = new idle(this);
        processing = new processing(this);
        deleteFile = new deleteFile(this);
        diskFree = new diskFree(this);
        diskFull = new diskFull(this);
        downloadFile = new downloadFile(this);
        downloading = new downloading(this);
        startWatching = new startWatching(this);
        pause = new pause(this);
        watching = new watching(this);
        error = new error(this);
        internetStatus = new internetStatus(this);

        state = movieDownloaderOff;

    }


    //Change state
    void setState(State newState) {
        state = newState;
    }

    //Here we do all the function of the program

    public void turnOnMovieDownlaoder() {
        state.movieDownloaderOn();

    }

    public void turnOffMovieDownlaoder() {
        state.movieDownloaderOff();


    }

    public void idle() {
        System.out.println("idle mode");
    }
}