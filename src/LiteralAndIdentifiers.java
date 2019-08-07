/**
 * Created by aborisco on 1/22/2018.
 */
public class LiteralAndIdentifiers {


    int _aloha;
    int $same;
    int _$_$_$_$_$_;
    static int _;
    int _11234;
    int $_4544Klfdf;
    /*int 1234sdf  invalid
    int 3DPointClass // identifiers cannot begin with a number
    int hollywood@vine // @ is not a letter, digit, $ or _
    int *$coffee // * is not a letter, digit, $ or _
    int public // public is a reserved word*/


    int octal = 017; //from 0 to 7
    int hexadecimal = 0xFF; // from 0 to 9 including letters from A to F
    int binary = 0b10; // from 0 to 1 including B

    int million1 = 1000000;
    int million2 = 1_000_000;
    double annoyingButLegal = 1_00_0.0_0; // this one compiles

    /*double notAtStart = _1000.00; // DOES NOT COMPILE
    double notAtEnd = 1000.00_; // DOES NOT COMPILE
    double notByDecimal = 1000_.00; // DOES NOT COMPILE
    */


    boolean bol = false;
//    boolean bol = 1; will not compile, only true/false required

    byte b = 53;
    //byte b = 235; will not compile, too long

    char c1 = 'h';
    char c2 = 98;

    short s = 235;
//    short s = 235556; will not compile because too long

    int i = 1235546;

    long l = 74896555564L;
//    long l = 74896555564; will not compile because at first place it creates integer that is casted to Long

    //float f = 12.34; will not compile
    float f = 10.35f;

    double d = 35.345;

    // and from bigger to lower need to be cast
    int i1 = (int)1.0;
    short s3 = (short)1921222; // Stored as 20678
    int i2 = (int)9l;           // because 9l is long
    long l3 = 192301398193810323L;
//    long l4 = (long)192301398193810323; will not compile because Java understand that number is not integer

    //Overflow and Underflow
    int i4 = 2147483647+1; // -2147483648
    static int i5 = (int)21474836474556645643D; // 2147483648
    static int i6 = (int)21474836474556645643D + 123; // -2147483526
    static int i7 = (int)-21474836474556645643D - 123; // 2147483525


    public static void main(String[] args) {
        System.out.println(_);
        System.out.println(i5);
        System.out.println(i7);

        byte b = 127;
        b+=1;
        System.out.println(b);

        char c = (char) -122;
        System.out.println(c);

        char £$ = '£';

        String ghgggggggggggggggggggggggggggggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhjjjjjjjjjjjjjjjjjjjjjjjjjjjjj = "";
        ghgggggggggggggggggggggggggggggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhjjjjjjjjjjjjjjjjjjjjjjjjjjjjj.length();
    }
}
