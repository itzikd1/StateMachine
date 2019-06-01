public class Main {

    public static void main(String[] args) {
        System.out.println("Test for our machine" + System.lineSeparator());
        Machine machine = new Machine();
        //State currentState = machine.getState();
        machine.getState().turnOn();
        //machine.getState().turnOff();
        machine.getState().fileRequest();




        /*
        System.out.println("Order to do: go to idle mode");
        machine.idle();
        System.out.println(System.lineSeparator());

        System.out.println("Order to do: turn on machine");
        machine.turnOnMovieDownlaoder();
        System.out.println(System.lineSeparator());

        System.out.println("Order to do: turn on machine");
        machine.turnOnMovieDownlaoder();
        System.out.println(System.lineSeparator());

        System.out.println("Order to do: go to idle mode");
        machine.idle();
        System.out.println(System.lineSeparator());

        System.out.println("Order to do: turn off machine");
        machine.turnOffMovieDownlaoder();
        System.out.println(System.lineSeparator());

        System.out.println("Order to do: go to idle mode");
        machine.idle();
        System.out.println(System.lineSeparator());

        System.out.println("Order to do: turn off machine");
        machine.turnOffMovieDownlaoder();
        System.out.println(System.lineSeparator());

        System.out.println("Order to do: turn on machine");
        machine.turnOnMovieDownlaoder();
        System.out.println(System.lineSeparator());
        */

    }
}
