public class Off implements State {

    Machine machine;

    public Off(Machine newMachine) {
        machine = newMachine;
    }

    @Override
    public void turnOn() {
        if(machine.internetOn) {
            System.out.println("exit off state");
            System.out.println("enter on state");
            machine.on.turnOn();
        }
        else
            System.out.println("The internet is off");

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void fileRequest() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }


    /*
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

    public String getStateName()
    {
        return "Off";
    }
    */
}