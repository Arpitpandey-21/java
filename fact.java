public class fact {
    public static void main(String[] args) {
        int i;
        if(args.length==0)
        {
        }
        int n = Integer.parseInt(args[0]);
        int fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is=");
        System.out.print(fact);
    }
    
}
