public class FrontDesk {
    public Valet valet;
    public HouseKeeping housekeeping;
    public Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.housekeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void requestVehiclePickup(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(String roomNumber) {
        housekeeping.cleanRoom(roomNumber);
    }

    public void requestLuggageCarts(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}
