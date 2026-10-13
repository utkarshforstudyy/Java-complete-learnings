
public class typeconversion {
    public static void main(String[] args) {
        //implicit type conversion  
        
        // byte b=24;
        // int i;
        // i=b;
        // System.out.println(i);//24

        // char c = 'X';
        // int i;
        // i=c;
        // System.out.println(i);//88

        //explicit type conversion 
        
        // int i = 300;
        // byte b;
        // b = (byte) i; //-128,-127
        // System.out.println(b); //300%256=44

        //truncating data conversionn
        // float f=15.678f;
        // int i;
        // i  = (int) f;
        // System.out.println(i); //15

        //boolean to any data type 
        //these type conversionn is not possible 

        byte b = 50;    //automatic promtoed to int for calculation
        b = (byte) (b*2);  //100
        System.out.println(b);
   
    }
    

}
//imp note
// Conversion	Method
// int to double	double d = (double) i;
// double to int	int i = (int) d;
// String to int	Integer.parseInt(S);
// int to String	String.valueOf(i);