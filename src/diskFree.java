public class diskFree extends On {

    Machine machine;

    public diskFree(Machine newMachine) {
        super(newMachine);
        machine = newMachine;

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {
        System.out.println("exit diskFree state");
        super.turnOff();
    }

    public void checkCondition()
    {
        if(machine.file.getSize() > machine.capacity)
        {
            System.out.println("Alert - There is no place in the disk!");
            System.out.println("exit diskFree state");
            System.out.println("enter diskFull state");
            machine.setState(machine.diskFull);
        }
        else if(machine.internetOn && machine.capacity>=machine.file.getSize()){



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