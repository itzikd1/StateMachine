public abstract class On implements State {

    Machine machine;

    public On(Machine newMachine) {
        machine = newMachine;

    }

    @Override
    public void turnOff() {
        System.out.println("exit on state");
        System.out.println("enter off state");
        machine.setState(machine.off);
    }

    public void turnOn()
    {
        System.out.println("enter idle state");
        machine.setState(machine.idle);

    }

    /*
    @Override
    public void movieDownloaderOff() {
        System.out.println("Turning Movie downloader off");
        machine.setState(machine.movieDownloaderOff);
        System.out.println("Movie downloader is off");
    }

    @Override
    public void movieDownloaderOn() {
        System.out.println("Movie downloader is on already");
    }

    @Override
    public void idle() {
        System.out.println("idle mode");
    }

    @Override
    public void processing() {

    }

    @Override
    public void deleteFile() {

    }

    @Override
    public void diskFree() {

    }

    @Override
    public void diskFull() {

    }

    @Override
    public void downloadFile() {

    }

    @Override
    public void downloading() {

    }

    @Override
    public void startWatching() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void watching() {

    }

    @Override
    public void error() {

    }

    @Override
    public void internetStatus() {

    }

    public String getStateName()
    {
        return "On";
    }
    */
}