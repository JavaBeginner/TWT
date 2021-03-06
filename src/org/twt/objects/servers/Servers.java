/* TWT - Tribal Wars Toolkit is a framework for the game "Die St�mme"
 * Copyright (C) 2011  JavaBeginner  twt.ds@gmx.de
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.twt.objects.servers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.twt.CONSTANTS;

/** Represents a list of {@link Server} objects.
 * 
 * @author JavaBeginner
 *
 */
public class Servers
{
    /** The list to keep the server objects */
    private List<Server> servers = new ArrayList<Server>();
    
    /**Tries to retrieve the serverlist from the in {@link CONSTANTS} defined DS_SERVERLIST_URL,
     * creates a {@link Server} object for every server found and stores the object
     * in a ArrayList
     * 
     * @throws IOException
     */
    public Servers() throws IOException
    {
        BufferedReader in = null;
        String inputLine;
        try
        {
            URL url = new URL(CONSTANTS.DS_SERVERLIST_URL);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            inputLine = in.readLine();
        }
        finally
        {
            in.close();
        }
        
        parse(inputLine);
    }
    
    /** Parse the input and create {@link Server} objects
     * 
     * @param input
     */
    private void parse(String input)
    {
        String id;
        String URL;
        
        int index = 2; // input starts with a: ...
        int end = input.indexOf(':', index);
        int ax = Integer.valueOf(input.substring(index, end));
        index = input.indexOf('{') + 1; // start of array data
        for (int i = 0; i < ax; i++)
        {
            int start = input.indexOf('\"', index) + 1;
            int stop = input.indexOf('\"', start);
            id = input.substring(start, stop);
            index = stop + 1;
            start = input.indexOf('\"', index) + 1;
            stop = input.indexOf('\"', start);
            URL = input.substring(start, stop);
            index = stop + 1;
            servers.add(new Server(id, URL));
        }
    }
    
    /** Get the {@link Server} object for the given Id
     * @param id The Id of the �{@link Server}
     * @return The {@link Server} object, null = no object to the given Id found
     */
    public Server getServer(String id)
    {
        Server resultServer = null;
        
        for (Server s : servers)
        {
            if (id.equals(s.getServerId()))
            {
                resultServer = s;
                break;
            }
        }
        
        return resultServer;
    }

}
