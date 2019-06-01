public abstract class downloadFile extends On {

    Machine machine;

    public downloadFile(Machine newMachine) {
        super(newMachine);
        machine = newMachine;

    }

    @Override
    public void turnOff() {
        System.out.println("exit downloadFile state");
        super.turnOff();
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

    }*/
}