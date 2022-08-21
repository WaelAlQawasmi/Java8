package java8.MethodReference;

import java8.RerInterface;

public class merhodeReference {

   public merhodeReference(int x){
System.out.println(x+"FF");
    }

    public static void main(String[] args) {
//        Reference to a static method
        int i = 50;
        RerInterface refStatMethod=merhodeReference::cal;
        refStatMethod.calculate(8);


 //Reference to an Instance Method

        merhodeReference merhodeReferenceInstense=new merhodeReference(5);
        RerInterface refToinst=merhodeReferenceInstense::myMethode;
        refToinst.calculate(100);





        // Reference to a Constructor
        RerInterface refToConst=merhodeReference::new;
        refToConst.calculate(600);

    }

    private static void cal(int i) {
        System.out.println(i);
    }

    private  void myMethode(int i) {
        System.out.println(i);
    }

}
