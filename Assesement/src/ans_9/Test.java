package ans_9;

public class Test {
	public static void main(String[] args) {
        Customer customer1 = new Customer("A");
        customer1.setMember(true);
        customer1.setMemberType("Premium");
        Discount discount1 = new Discount();
        Visit visit1 = new Visit(customer1, discount1);
        visit1.setServiceExpense(100);
        visit1.setProductExpense(50);
        System.out.println("Total expense for " + customer1.getName() + ": $" + visit1.getTotalExpense());

        Customer customer2 = new Customer("B");
        customer2.setMember(true);
        customer2.setMemberType("Gold");
        Discount discount2 = new Discount();
        Visit visit2 = new Visit(customer2, discount2);
        visit2.setServiceExpense(80);
        visit2.setProductExpense(70);
        System.out.println("Total expense for " + customer2.getName() + ": $" + visit2.getTotalExpense());

        Customer customer3 = new Customer("C");
        customer3.setMember(false);
        Discount discount3 = new Discount();
        Visit visit3 = new Visit(customer3, discount3);
        visit3.setServiceExpense(120);
        visit3.setProductExpense(40);
        System.out.println("Total expense for " + customer3.getName() + ": $" + visit3.getTotalExpense());
    }

}
