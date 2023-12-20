package RnDObjectClass;



public class ObjectClass {

    public static void main(String[] args) {
        String s1= "A";
        String s2="A";

        String s3="AB";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        SampleClass obj1= new SampleClass();
        SampleClass obj2=new SampleClass();
        SampleClass obj3=obj1;

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());



        System.out.println(obj1.equals(obj2));


        System.out.println(obj1.equals(obj3));
        System.out.println(obj1==obj2);
        System.out.println(obj1==obj3);



    }


}
