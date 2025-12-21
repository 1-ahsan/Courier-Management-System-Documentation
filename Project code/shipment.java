class Shipment {
    private int id;
    private Customer sender;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhoneNumber;
    private String senderName;
    private String senderAddress;
    private String senderNumber;
    private Parcel[] parcels;
    private Complaint complain;

    public Shipment(int id, Customer sender, String rName, String rAddress, String rPhone) {
        this.id = id;
        this.sender = sender;
        this.receiverName = rName;
        this.receiverAddress = rAddress;
        this.receiverPhoneNumber = rPhone;
    }
}