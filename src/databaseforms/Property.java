package databaseforms;

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
