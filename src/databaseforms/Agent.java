package databaseforms;

import java.util.Date;

/**
 * Class containing all fields from MySQL Agent table
 * @author Madison Liddell
 */
public class Agent {
    String agent_fname, agent_lname,
            agent_address, agent_city, agent_state;
    int agent_id, agent_zipcode,
            fk_off_code;
    double agent_phone;
    java.util.Date agent_date_join;
    public enum agent_state2 //WIP for fun
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
        agent_state2(String name)
        {
            this.name = name;
        }
        public String getName() {return this.name;}
    }
    
    Agent(String fname, String lname, int id, double phone, String addr, Date join,
            String city, String state,int zip, int offcode )
    {//follows same order as mysql setup
        agent_fname = fname;
        agent_lname = lname;
        agent_id = id;
        agent_phone = phone;
        agent_address = addr;
        agent_date_join = join;
        agent_city = city;
        agent_state = state;
        agent_zipcode = zip;
        fk_off_code = offcode;
    }
}
