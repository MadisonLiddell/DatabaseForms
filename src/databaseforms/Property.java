package databaseforms;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class containing all fields from MySQL Property table
 * @author Madison Liddell
 */
public class Property {
    int prop_code, 
            fk_agent_id, 
            prop_zipcode;
    float prop_worth;
    String prop_type, 
            prop_owner_fname, prop_owner_lname,
            prop_address, prop_city, prop_state;
    public enum prop_state2 //WIP
    {
        ALABAMA("Alabama"), ALASKA("Alaska"), ARIZONA("Arizona"), ARKANSAS("Arkansas"), 
        CALIFORNIA("California"), COLORADO("Colorado"), CONNECTICUT("Connecticut"), 
        DELAWARE("Delaware"), FLORIDA("Florida"), GEORGIA("Georgia"), HAWAII("Hawaii"), 
        IDAHO("Idaho"), ILLINOIS("Illinois"), INDIANA("Indiana"), IOWA("Iowa"), 
        KANSAS("Kansas"), KENTUCKY("Kentucky"), LOUISIANA("Louisiana"), MAINE("Maine"), 
        MARYLAND("Maryland"),MASSACHUSETTS("Massachusetts"), MICHIGAN("Michigan"), 
        MINNESOTA("Minnesota"), MISSISSIPPI("Mississippi"), MISSOURI("Missouri"), 
        MONTANA("Montana"), NEBRASKA("Nebraska"), NEVADA("Nevada"), 
        NEW_HAMPSHIRE("New Hampshire"), NEW_JERSEY("New Jersey"), NEW_MEXICO("New Mexico"), 
        NEW_YORK("New York"), NORTH_CAROLINA("North Carolina"), NORTH_DAKOTA("North Dakota"), 
        OHIO("Ohio"), OKLAHOMA("Oklahoma"), OREGON("Oregon"),PENNSYLVANIA("Pennsylvania"),
        RHODE_ISLAND("Rhode Island"), SOUTH_CAROLINA("South Carolina"), 
        SOUTH_DAKOTA("South Dakota"), TENNESSEE("Tennessee"), TEXAS("Texas"), 
        UTAH("Utah"), VERMONT("Vermont"),VIRGINIA("Virginia"), WASHINGTON("Washington"), 
        WEST_VIRGINIA("West Virginia"), WISCONSIN("Wisconsin"), WYOMING("Wyoming");
    
        private final String name;
        prop_state2(String name)
        {
            this.name = name;
        }
        public String getName() {return this.name;}
    }
    //constructor initializes all fields
    Property(int code, String type, String addr, String ownerf, String ownerl,
            float worth, String city, String state, int zip, int agentid)
    {//same order as mysql setup
        prop_code = code;
        prop_type = type; 
        prop_address = addr;
        prop_owner_fname = ownerf;
        prop_owner_lname = ownerl;
        prop_worth = worth;
        prop_city = city;
        prop_state = state;
        prop_zipcode = zip;
        fk_agent_id = agentid;
    }
    // Insert data into property mysql table
    void insert(Property p)
    {
        try{                   
            JDBCConnect jdbc = new JDBCConnect();   
            // connect to db and create query
            PreparedStatement statement = jdbc.conn.prepareStatement("INSERT INTO TABLE_NAME('property') VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            statement.setInt(1, p.prop_code);           // fill in the property fields
            statement.setString(2, p.prop_type);          
            statement.setString(3, p.prop_address);          
            statement.setString(4, p.prop_owner_fname);          
            statement.setString(5, p.prop_owner_lname);          
            statement.setFloat(6, p.prop_worth);          
            statement.setString(7, p.prop_city);          
            statement.setString(8, p.prop_state);          
            statement.setInt(9, p.prop_zipcode);          
            statement.setInt(10, p.fk_agent_id);          
            
            statement.executeUpdate();                  // execute the insert command
            
            jdbc.disconnect();                          // disconnect
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    /*public enum test 
    {
        Alabama,
        Alaska,
        Arizona,
        Arkansas,
        California,
        Colorado,
        Connecticut,
        Delaware,
        Florida,
        Georgia,
        Hawaii,
        Idaho,
        Illinois,
        Indiana,
        Iowa,
        Kansas,
        Kentucky,
        Louisiana,
        Maine,
        Maryland,
        Massachusetts,
        Michigan,
        Minnesota,
        Mississippi,
        Missouri,
        Montana,
        Nebraska,
        Nevada,
        NewHampshire,
        NewJersey,
        NewMexico,
        NewYork,
        NorthCarolina,
        NorthDakota,
        Ohio,
        Oklahoma,
        Oregon,
        Pennsylvania,
        RhodeIsland,
        SouthCarolina,
        SouthDakota,
        Tennessee,
        Texas,
        Utah,
        Vermont,
        Virginia,
        Washington,
        WestVirginia,
        Wisconsin,
        Wyoming
            }*/
    
}
