class BusinessClient {
    private String orgName;
    private String orgType;
    private String phoneNumber;
    private String address;
    private String city;
    private String country;
    private Date contractStartDate;
    private Date contractEndDate;

    public BusinessClient(int id, String name, String email, String userName, String password,
                          String orgName, String orgType, String phoneNumber, String address, 
                          String city, String country, Date start, Date end) {
        super(id, name, email, userName, password);
        this.orgName = orgName;
        this.orgType = orgType;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.country = country;
        this.contractStartDate = start;
        this.contractEndDate = end;
    }

    // Getters and Setters...
    public String getOrgName() { 
        
    }
}