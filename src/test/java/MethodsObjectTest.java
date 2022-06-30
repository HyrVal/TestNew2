
public class MethodsObjectTest {

//MethodsObject methodsObject=new MethodsObject ();

   public static void   main (String[] args){
        MethodsObject user = new MethodsObject("Ivan", 23);
        MethodsObject user1= new MethodsObject("Ivan", 23);

       System.out.println(user.toHashKode());
       System.out.println(user1.toHashKode());

       System.out.println(user.toStringHashKode());
       System.out.println(user1.toStringHashKode());

       System.out.println(user.toString());
       System.out.println(user1.toString());

       System.out.println(user.equals(user==user1));
       System.out.println(user.equals(user1));

 //   public void stringTest(){
 //         hashCode().

    }

}
