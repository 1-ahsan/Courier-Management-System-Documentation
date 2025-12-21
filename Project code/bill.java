class Bill {
    private float amount;
    private float discount;
    private float totalAmount;
    private boolean billStatus;

    public Bill(float amount, float discount) {
        this.amount = amount;
        this.discount = discount;
        this.totalAmount = amount - discount;
        this.billStatus = false;
    }
}