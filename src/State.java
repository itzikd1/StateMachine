public interface State {

    // List of all the difference states that exist in the system

    void movieDownloaderOff();

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

}