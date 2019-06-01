public interface State {

    //List of all the events in the machine

    void turnOn();
    void turnOff();
    void internetOn();
    void internetOff();
    void fileRequest();
    void downloadAborted();
    void downloadError();
    void errorFixed();
    void movieOn();
    void restartMovie();
    void holdMovie();
    void movieOff();
    void resume();

    // List of all the difference states that exist in the system

   /* void movieDownloaderOff();

    void movieDownloaderOn();

    void idle();

    void processing();

    void deleteFile();

    void diskFree();

    void diskFull();

    void downloadFile();

    void downloading();

    void startWatching();

    void pause();

    void watching();

    void error();

    void internetStatus();
    */

}