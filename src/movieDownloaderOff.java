public class movieDownloaderOff implements State {

    Machine machine;

    public movieDownloaderOff(Machine newMachine) {
        machine = newMachine;
    }

    @Override
    public void movieDownloaderOff() {
        System.out.println("Movie downloader is off already");
    }

    @Override
    public void movieDownloaderOn() {
        System.out.println("Turning Movie downloader on");
        machine.setState(machine.movieDownloaderOn);
        System.out.println("Movie downloader is on");
    }

    @Override
    public void idle() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void processing() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void deleteFile() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void diskFree() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void diskFull() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void downloadFile() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void downloading() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void startWatching() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void pause() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void watching() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void error() {
        System.out.println("You must turn on movie downloader first");
    }

    @Override
    public void internetStatus() {
        System.out.println("You must turn on movie downloader first");
    }
}