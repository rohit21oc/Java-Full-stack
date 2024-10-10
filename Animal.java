class Animal{
    public void disp(){
        System.out.println("calling....");
    }
   public class Dog extends Animal{
        public void disp(){
            System.out.println("vibrating........");
        }
    }        public static void main(String args[]){
          Animal sc=new Animal();
            sc.disp();
            sc.disp();
    }
}
