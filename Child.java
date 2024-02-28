public class Child extends Parentt{
    
    String nama = "Tom";
    int money = 200;

    public void car() {
        
        super.home();
        System.out.println("Child's car");
        
    }

    public void parentInfo(){
       super.nama ="adi";
        System.out.println("Parent's name : "+super.nama);
        System.out.println("Parent's moneyv : "+super.money);
    }

    public void childInfo(){
        System.out.println("Name : "+nama);
        System.out.println("Money : "+money);
    }


}
