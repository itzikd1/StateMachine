import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class idle extends On {

    Machine machine;
    File newFile;


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
    public void fileRequest() {
        System.out.println("Enter the size of the file");
        // TODO: 02/06/2019 Itzik to ask from the user for size
        System.out.println("to ask from the user for size here!!!!!!!");
        newFile = new File(105);
        machine.movies.add(newFile);
        System.out.println("New file request");
        queueNotEmpty();
    }

    private void queueNotEmpty() {
        if(machine.capacity > newFile.getSize() && machine.internetOn && !machine.fileInDownload)
        {// TODO: 02/06/2019 changed from 0 to filesize Itzik
            machine.fileInDownload = true;
            System.out.println("exit idle state");
            System.out.println("enter processing state");
            machine.setState(machine.processing);

        }

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

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