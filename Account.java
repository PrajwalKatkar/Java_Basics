class Balance{
    int accNo;
    double bal;
    Balance(){
        System.out.println("Inside cons1");
        bal = 0;
    }
    Balance(double b){
        System.out.println("Inside cons2");
        bal = b;
    }
    
    Balance(int a , double b){
        System.out.println("Inside cons3");
        bal = b;
        accNo=a;
    }
   
}
class Account {
    public static void main(String args[]){
        Balance b1 = new Balance();
        Balance b2 = new Balance(100);
        Balance b3 = new Balance(1201,10000);
        System.out.println("b1.bal = " +b1.bal);
        System.out.println("b2.bal = " +b2.bal);
        System.out.println("b3.bal = " +b3.bal + "b3.accNo = " + b3.accNo);
        
    }
    
}
