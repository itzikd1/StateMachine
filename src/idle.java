public class idle extends On {

    Machine machine;

    public idle(Machine newMachine) {
        super(newMachine);
        machine = newMachine;
    }

    @Override
    public void turnOn() {
        System.out.println("enter idle state");
        machine.setState(machine.idle);
    }

    @Override
    public void turnOff() {
        System.out.println("exit idle state");
        super.turnOff();

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

    }

    @Override
    public void movieDownloaderOn() {

    }

    @Override
    public void idle() {
        System.out.println("machine is in idle mode");

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
    */
}