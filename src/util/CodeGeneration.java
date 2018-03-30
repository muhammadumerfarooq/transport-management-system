/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Calendar;
import java.util.Date;

public class CodeGeneration {
   
    private static CodeGeneration instance = null;
    protected CodeGeneration() {
      // Exists only to defeat instantiation.
    }
    public static CodeGeneration getInstance() {
    
        if(instance == null) {
            instance = new CodeGeneration();
        }
        return instance;
    }
    public String GenerateCompanyCode(int ID)
    {
        String CodeNum = Integer.toString(ID);
        Date date = new Date(); // your date
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String year = Integer.toString(cal.get(Calendar.YEAR));
        
        return year+"-"+CodeNum;
    }
    
}
