class Member {
    String name;
    double purchaseAmount;
    
    Member(String name, double purchaseAmount) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }
    
    void getDiscount() {
        double discount = 0;
        double finalPrice = purchaseAmount;
        
        System.out.println("Member: " + name);
        System.out.println("Purchase: " + purchaseAmount);
        System.out.println("Final price: " + finalPrice);
        System.out.println();
    }
}

class GoldMember extends Member {
    GoldMember(String name, double purchaseAmount) {
        super(String name, double purchaseAmount);
    }
    void getDiscount() {
        double discount;
    }
    
    if (purchaseAmount >= 1000) {
        discount = purchaseAmount * 0.10;
    }else {
        discount = purchaseAmount * 0.05;
    }
    
    double finalPrice = purchaseAmount - discount;
    
    System.out.println("Member: " + name);
    System.out.println("Purchase: " + purchaseAmount);
    System.out.println("Discount: " + discount);
    System.out.println("Final Price: " + finalPrice);
    System.out.println();
} 

class Main {
    public static void main(String[] args) {
        
    }
}
