package fun.func.thanks;

public class vendingMachine {
    int price = 80; //商品价格
    int balance; //用户当前还剩多少钱
    int total; //用户总共花了多少

    vendingMachine() {
        total = 0;
    }

    vendingMachine(int price) {
        this.price = price;
    }

    void showPrompt(){
        System.out.println("Welcome");
    }

    void showBalance(){
        System.out.println("Your balance is $" + balance);
    }

    void showSpend(){
        System.out.println("You spent $" + price);
    }

    void insertMoney(int amount){
        balance = balance + amount;
        System.out.println("You inserted $" + amount + ", your balance is $" + balance);
    }

    void getFood(){
        if (balance >= price) {
            System.out.println("Here you are");
            balance = balance - price;
            total = total + price;
            showSpend();
            showBalance();
        }
    }

    public static void main(String[] args) {
         vendingMachine vm = new vendingMachine(20);
         vm.showPrompt();
         vm.showBalance();
         vm.insertMoney(100);
         vm.getFood();
    }
}
