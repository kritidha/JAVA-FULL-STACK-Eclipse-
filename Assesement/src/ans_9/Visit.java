package ans_9;

public class Visit {
	private Discount discount;
    private double serviceExpense;
    private double productExpense;
	private Customer customer;

    public Visit(Customer customer, Discount discount) {
        this.customer = customer;
        this.discount = discount;
        serviceExpense = 0;
        productExpense = 0;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense() {
        double totalExpense = (serviceExpense * (1 - discount.getServiceDiscountRate(customer.getMemberType())))
                + (productExpense * (1 - discount.getProductDiscountRate()));
        return totalExpense;
    }


}
