package ans_9;

public class Discount {
	 private double serviceDiscountRate;
	    private double productDiscountRate;

	    public Discount() {
	        serviceDiscountRate = 0;
	        productDiscountRate = 0.1;
	    }

	    public double getServiceDiscountRate(String type) {
	        switch (type) {
	            case "Premium":
	                serviceDiscountRate = 0.2;
	                break;
	            case "Gold":
	                serviceDiscountRate = 0.15;
	                break;
	            case "Silver":
	                serviceDiscountRate = 0.1;
	                break;
	        }
	        return serviceDiscountRate;
	    }

	    public double getProductDiscountRate() {
	        return productDiscountRate;
	    }

}
