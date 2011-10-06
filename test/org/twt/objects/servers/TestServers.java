package org.twt.objects.servers;

import java.io.IOException;

import org.junit.Test;
import org.twt.objects.servers.Server;
import org.twt.objects.servers.Servers;

public class TestServers
{
    @Test
    public void serversTest() throws IOException
    {
        Servers s = new Servers();
        
        Server de23 = s.getServer("de23");
    }

}
