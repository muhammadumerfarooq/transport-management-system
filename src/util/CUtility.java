/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

public class CUtility {
   
    static final String key = "Encrypt";
    
    public String Encrypt(String Password)
    {
      StringBuffer sb = new StringBuffer (Password);
      int lenPassword = Password.length();
      int lenKey = key.length();
      for ( int i = 0, j = 0; i < lenPassword; i++, j++ ) 
      {
         if ( j >= lenKey ) j = 0;  
         // XOR the chars together. Must cast back to char to avoid compile error. 
         sb.setCharAt(i, (char)(Password.charAt(i) ^ key.charAt(j))); 
      }

      return sb.toString();
    }
     public String Decrypt(String Password)
    {
      StringBuffer sb = new StringBuffer (Password);
      int lenPassword = Password.length();
      int lenKey = key.length();
      for ( int i = 0, j = 0; i < lenPassword; i++, j++ ) 
      {
         if ( j >= lenKey ) j = 0;  
         // XOR the chars together. Must cast back to char to avoid compile error. 
         sb.setCharAt(i, (char)(Password.charAt(i) ^ key.charAt(j))); 
      }

      return sb.toString();
    }
}
