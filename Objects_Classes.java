public class Objects_Classes {
    /* Syntax to declare a class:
    class <class_name>{
        field;
        method;
    }

     */
        /* int id =100;
        String name= "Shahdat";
        public static void main(String args[]){
            Objects_Classes s1= new Objects_Classes();
            System.out.println(s1.id);
            System.out.println(s1.name);
        }
        */
    int roll;
    String name ;
    void insertRecord(int r,String s){
        roll=r;
        name=s;
    }
    void displayRecord(int roll,String name){
        System.out.println(roll+" "+name);
    }
    public static void main(String args[]){
        /*Student s2 = new Student();
        s2.name="Ripon";
        s2.roll=991;
        Student s3 = new Student();
        s3.name="Shahadat";
        s3.roll=992;
        //System.out.println(s2.roll+" "+s2.name);
        //System.out.println(s3.roll+" "+s3.name);
        s2.displayRecord();
        s3.displayRecord();*/

        new Objects_Classes().displayRecord(0001,"Shahadat");
}
}










    //Object and Class Example: main outside the class
    /* class Student{
        long roll;
        String name ;
        void insertRecord(int r,String s){
            roll=r;
            name=s;
        }
        void displayRecord(){
            System.out.println(roll+" "+name);
        }
    }

     */
