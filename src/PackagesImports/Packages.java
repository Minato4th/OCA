//import Static.*;              wont compile

package PackagesImports;

import Methods.Constructor;
import Static.*;
//import Static.Static1.method;             can't import methods and variables
//import Static.Static1.c;

import static Methods.Constructor.*;        // if there no static methods nothing will be shown
import static Methods.Method.vararg1;
import static Methods.Method.fdsa;
//import static Methods.Method.fly;         only static methods
//import  static Methods.Method.asdf;       and static variables

public class Packages {


    public static void main(String[] args) {
        int a = fdsa;
        Counter counter;
        vararg1(new int[]{1, 2, 3,});

        //    StringClass aClass    wont Compile because can't get class from main package


    }

    /*dklfjdfgklj           //dfkjdflk
    dfkgjdflkgj*/


}
