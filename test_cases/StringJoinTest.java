

import java.io.*;

public class StringJoinTest
{

    String combine(String[] s, String glue)
    {
        int k=s.length;
        if (k==0)
            return null;
        StringBuilder out = new StringBuilder();
        out.append(s[0]);

        for (int x=1;x<k;++x)
            out.append(glue).append(s[x]);

        return out.toString();
    }

    void run()
    {
        String[] s = { "abc" , "abc" ,"abc" };
        String out;
        for ( int i = 0 ; i < 5000000 ; i++ ) {
            out = this.combine( s , "," );
            // System.out.println( out );
        }
    }
}
