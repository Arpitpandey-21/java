public class add {
    public static void main(String[] args) {
    
         if(args.length<2)
         {
       
         return;
         }
         int a=Integer.parseInt(args[0]);
         int b=Integer.parseInt(args[1]);
         int c=a+b;
         System.out.println("the sum =");
         System.out.print(c);
    }
    
}
