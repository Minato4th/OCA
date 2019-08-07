package PackagesImports;

//import java.util.Date;            won't work together
//import java.sql.Date;

import java.util.Date;            //will work together
import java.sql.*;

//import java.util.*;            //won't work together
//import java.sql.*;
//import java.util.Date;         ned to include one of them


public class Import {

    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(10,10,10);

    }
}
