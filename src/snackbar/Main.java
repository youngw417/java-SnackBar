/*
Customer 1 cash on hand $37.75
Quantity of snack 4 is 21

Customer 1 cash on hand $35.75
Quanity of snack 3 is 29

Customer 2 cash on hand $28.14
Quantity of snack 4 is 19

Customer 1 cash on hand $45.75

Customer 1 cash on hand $44.75
Quantity of snack 2 is 35

Quantity of snack 3 is 41

customer 2 cash on hand $22.14
Quantity of snack 3 is 38
*/
package snackbar;
public class Main{

    private static void workWithData(){
        VendingMachine vm1 = new VendingMachine("Dining");
        VendingMachine vm2 = new VendingMachine("Library");
        Snack cc = new Snack("Chocolate Chip Cookiee", 10, 2.50, vm1.getId());
        Snack coke = new Snack("Coka Cola", 15, 1.40, vm1.getId());
        Snack pchip = new Snack("potato chip", 16, 2.90, vm2.getId());
        Snack splite = new Snack("Splite", 8, 1.70, vm1.getId());
        Snack rb = new Snack("Red Bull", 35, 5.50, vm2.getId());

        Customer james = new Customer("James Park", 50.0);
        Customer young = new Customer("Young Won", 50.0);
        System.out.println("*** Welcome to Snack Bar ***");
        System.out.println(james.getName() + " cash on hand " + james.getCash());
        System.out.println("Quanitity of " + cc.getName() + " is " + cc.getQuantity());
        System.out.println(cc);
        System.out.println(coke);
        james.buySnack(9.90);
        System.out.println(james.getName() + " cash on hand " + james.getCash());
        cc.buySnack(3);
        System.out.println("Quanitity of " + cc.getName() + " is " + cc.getQuantity());
        young.buySnack(12.00);
        System.out.println(young.getName() + " cash on hand " + young.getCash());
        cc.buySnack(5);
        System.out.println("Quanitity of " + cc.getName() + " is " + cc.getQuantity());
        System.out.println(young.getName() + " has id of " + young.getId());
    }

    public static void main(String[] args){

        workWithData();

    }

}