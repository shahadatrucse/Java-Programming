public class JavaVariables {
    /* Examples to understand the types of data in Java
        static int n = 1000;//static variable

        void method(){
            int m =10;//local variable
        }
        public static void main (String args[])
        {
            int p =50;//Instance variables
            System.out.println(n);
        }
    } */
    /*Java Variable Example: Add Two Numbers
    public static void main(String args[]){
        int a = 20;
        int b = 30;
        int c = a+b;
        System.out.println(c);
    }*/
    /* Java variables example : Narrowing (TypeCasting)
    public static void main(String args[]){
        float b = 10.5f;
        int a = (int)b;
        System.out.println(b);
        System.out.println(a);



    }*/

    // Java Variable Example : Overflow
    public static void main(String args[]){
        int a=130;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);
    }
}
