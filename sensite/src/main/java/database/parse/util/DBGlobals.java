/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database.parse.util;

import almonds.Parse;
import almonds.ParseObject;
import database.parse.tables.ParsePhenomena;
import database.parse.tables.ParseSensor;
import java.net.URI;

/**
 *
 * @author jried31
 */
public class DBGlobals {
    static public String TABLE_PHENOMENA="tester";
    static public String TABLE_SENSOR="Sensor";

    public static String URL_GOOGLE_SEARCH="http://suggestqueries.google.com/complete/search?client=firefox&hl=en&q=WORD";
    //http://clients1.google.com/complete/search?noLabels=t&client=web&q=WORD";
    
    public static void InitializeParse(){

        //App Ids for Connecting to the Parse DB
        Parse.initialize("jEciFYpTp2b1XxHuIkmAs3yaP70INpkBDg9WdTl9", 	//Application ID
            "aPEXcVv80kHwfVJK1WEKWckePkWxYNEXBovIR6d5"); 	//Rest API Key
        
    }
}
