/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s201060267
 */
package xmlcreate;
import java.io.*;

public class main {
    public static void main(String[] args) {
    try {
        OutputStream fout= new FileOutputStream("information.xml");
        OutputStream bout= new BufferedOutputStream(fout);
        OutputStreamWriter out
         = new OutputStreamWriter(bout, "8859_1");

        out.write("<?xml version=\"1.0\" ");
        out.write("encoding=\"ISO-8859-1\"?>\r\n");
        out.write("<class>\r\n");
        out.write("<Student>\r\n");
        out.write("<name> Chris </name>\r\n");
        out.write("<address> 1313 Mockingbird Lane </address>\r\n");
        out.write("<phone> 555-1313 </phone>\r\n");
        out.write("<sex> Female </sex>\r\n");
        out.write("</Student> \r\n");

        out.write("<Student>\r\n");
        out.write("<name> Cody </name>\r\n");
        out.write("<address> 211 Pine Street </address>\r\n");
        out.write("<phone> 555-9089 </phone>\r\n");
        out.write("<sex> Male </sex>\r\n");
        out.write("</Student> \r\n");
        out.write("</class>\r\n");

        out.flush();
        out.close();
      }
      catch (UnsupportedEncodingException e) {
        System.out.println(
         "This VM does not support the Latin-1 character set."
        );
      }
      catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
    
}
