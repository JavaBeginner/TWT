package org.twt;

/** <p>This class encapsulates constants for the hole toolkit.</p>
 *  <p>All members are immutable.</p>
 *  
 * @author jb
 *
 */
public final class CONSTANTS
{
    /** The homepage URL of the game */
    public final static String DS_HOMEPAGE_URL = "http://die-staemme.de";
    
    /** The URL of the serverlist */
    public final static String DS_SERVERLIST_URL = DS_HOMEPAGE_URL + "/backend/get_servers.php";
    
    /** The default constructor is suppressed by this private constructor
     *  This prevents the caller from constructing objects of this class
     */
    private CONSTANTS()
    {
        //this prevents even the native class from 
        //calling this constructor as well
        throw new AssertionError();
    }

}
