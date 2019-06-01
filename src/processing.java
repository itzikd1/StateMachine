public class processing extends On {

    Machine machine;

    public processing(Machine newMachine) {
        super(newMachine);
        machine = newMachine;

    }


    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {
        System.out.println("exit processing state");
        super.turnOff();
    }

    public void doMethod() {
        System.out.println("exit processing state");
        System.out.println("enter diskFree state");
        machine.file = machine.movies.get(0);
        machine.setState(machine.diskFree);

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