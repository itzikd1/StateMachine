public class error extends On {

    Machine machine;

    public error(Machine newMachine) {
        super(newMachine);
        machine = newMachine;

    }


    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {
        System.out.println("exit error state");
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
}