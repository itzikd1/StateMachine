public class diskFull extends On {

    Machine machine;

    public diskFull(Machine newMachine) {
        super(newMachine);
        machine = newMachine;

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {
        System.out.println("exit diskFull state");
        super.turnOff();
    }

    public void checkCondition()
    {
        if(!machine.second) {
            machine.second = true;
            System.out.println("exit diskFull state");
            System.out.println("enter diskFree state");
            machine.setState(machine.diskFree);
        }
        else
        {
            machine.second = false;
            machine.fileInDownload = false;
            machine.file = null;
            machine.userScore-=1;
            machine.second = true;
            System.out.println("exit diskFull state");
            System.out.println("enter idle state");
            machine.setState(machine.idle);
        }
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
}