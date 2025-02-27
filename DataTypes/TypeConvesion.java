public class TypeConvesion {
    public static void main(String[] args) {
        //implicit type casting
        // byte->short->int->long->float->double
        byte b=10;
        short s=b;
        int i=s;
        long l=i;
        float f=l;
        double d=f;
        System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d);
        //explicit type casting
        //double->float->long->int->short->byte
        double dd=22.45;
        float ff=(float) dd;
        long ll=(long)ff;
        int ii=(int)ll;
        short ss=(short)ii;
        byte bb=(byte)ss;
        System.out.println(bb+" "+ss+" "+ii+" "+ll+" "+ff+" "+dd);

        
        
    }
}
