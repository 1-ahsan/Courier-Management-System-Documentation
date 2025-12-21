class Customer extends User {
    private String city;
    private String country;
    private String address;
    private String phoneNumber;
    private Shipment shipmentHistory[];

    public Customer(int id, String name, String email, String userName, String password, 
                   String city, String country, String address, String phoneNumber) {
        super(id, name, email, userName, password);
        this.city = city;
        this.country = country;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.shipmentHistory=null;
    }

    public void bookShipment(Shipment s) { 
        
    }
    public void trackShipment(Shipment s) {
        
    }
    public void makePayment(PaymentGateway pg) { 
        
    }
    public void giveFeedback(String feedback) {
        
    }

}