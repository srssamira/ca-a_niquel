import javax.swing.text.AbstractDocument;

public class AppSystem {
    private ContentSlotMachine[] slotMachine;

    public AppSystem() {
        this.slotMachine = ContentSlotMachine.values();
    }

    public void initializeSystem() {
        int difficulty = IO.chooseDifficulty();
        ManipulationSlotMachine manipulationSlotMachine = new ManipulationSlotMachine(slotMachine, difficulty);
        manipulationSlotMachine.sortValues();

        boolean play = true;
        while (play) {

            int option = IO.menu();

            if (option == 1) manipulationSlotMachine.sortValues();
            else if (option == 2) play = false;
        }

    }
}
