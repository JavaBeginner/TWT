package org.twt.objects.servers;

/** This class encapsulates a single set of
 *  server-id (e.g. de45) and server-URL (e.g. http://de45.die-staemme.de)
 *  
 * @author jb
 *
 */
public class Server
{
    /** The id of the server (e.g. de45) */
    private String serverId;
    
    /** The URL of the server (e.g. http://de45.die-staemme.de) */
    private String serverURL;
    
    
    /** Creates a new server instance with the given Id and URL
     * @param Id   The Id of this server (e.g. de45)
     * @param URL  The URL of this server (e.g. http://de45.die-staemme.de)
     */
    public Server(String Id, String URL)
    {
        this.setServerId(Id);
        this.setServerURL(URL);
    }

    /** Get the Id of the server
     * @return The Id of the server
     */
    public String getServerId()
    {
        return serverId;
    }

    /** Set the Id of the server (e.g. de45)
     * @param serverId The Id of the server
     */
    public void setServerId(String serverId)
    {
        this.serverId = serverId;
    }

    /** Get the URL of the server (e.g. http://de45.die-staemme.de)
     * @return The URL of the server
     */
    public String getServerURL()
    {
        return serverURL;
    }

    /** Set the URL of the server (e.g. http://de45.die-staemme.de)
     * @param serverURL The URL of the server
     */
    public void setServerURL(String serverURL)
    {
        this.serverURL = serverURL;
    }
}
