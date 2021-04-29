package inheritance.polymorphism;

class ConversionDemo{
public static void main(String args[]){
int x = 10;
long y = 20;
//x = y;
y = x;
//java's automatic conversion
System.out.println(y);
byte b;
int i=512;
System.out.println("\nConversion of int to byte.");
b = (byte) i;
System.out.println("i and b " + i + " " + b);
double d = 24.456767;
System.out.println("\nConversion of double to int.");
i = (int) d;
System.out.println("d and i " + d + " " + i);
}
}
