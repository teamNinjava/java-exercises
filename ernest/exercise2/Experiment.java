public class Experiment {

  public static void main (String [] args) {
    
    byte myByte = 123;
    short myShort = myByte;
    int myInt = myShort;
    long myLong = myInt; 
    float myFloat = myLong;
    double myDouble = myFloat;
    
    System.out.println("myByte "+myByte);
    System.out.println("myShort "+myShort);
    System.out.println("myInt "+myInt);
    System.out.println("myLong "+myLong);
    System.out.println("myFloat "+myFloat);
    System.out.println("myDouble "+myDouble);

    int maxInt = Integer.MAX_VALUE;
    int maxIntPlusOne = maxInt + 1;                    
    System.out.println("Max Int is "+ maxInt);
    System.out.println("Max Int + 1 as int is "+(maxIntPlusOne));
    float maxIntFloat = maxInt;
    System.out.println("Max Int as float is "+maxIntFloat);

  }
}
