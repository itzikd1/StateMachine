public class idle implements State {

    Machine machine;

    public idle(Machine newMachine) {
        machine = newMachine;

    }

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
}