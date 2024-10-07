//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        
        frontDesk.requestVehiclePickup("ABC-123");
        frontDesk.requestRoomCleaning("101");
        frontDesk.requestLuggageCarts(3);
    }
}