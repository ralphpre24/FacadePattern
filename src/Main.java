public class Main {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        
        frontDesk.requestVehiclePickup("ABC-123");
        frontDesk.requestRoomCleaning("101");
        frontDesk.requestLuggageCarts(3);
    }
}
