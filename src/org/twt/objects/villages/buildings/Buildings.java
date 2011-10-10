/* TWT - Tribal Wars Toolkit is a framework for the game "Die Stämme"
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
package org.twt.objects.villages.buildings;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/** Represents a list of {@link Building} objects.
 * 
 * @author JavaBeginner
 *
 */
public class Buildings
{
    /** The list to keep the building objects */
    private List<Building> buildings = new ArrayList<Building>();
    
    public Buildings(String serverURL) throws IOException, XPathExpressionException, ParserConfigurationException, SAXException
    {
        InputStream in = null;
        try
        {
            URL url = new URL(serverURL + "/interface.php?func=get_building_info");
            in = url.openStream();
            parseBuildingConfig(in);
        }
        finally
        {
            in.close();
        }
    }
    
    /** Parse the XML building configuration and create {@link Building} objects
     * @param input
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws XPathExpressionException
     */
    private void parseBuildingConfig(InputStream input) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException
    {
        String[] buildingNames ={"main", "barracks", "stable", "garage", "church", "church_f", "snob", "smith", "place", "statue", "market", "wood", "stone", "iron", "farm", "storage", "hide", "wall"};
        String[] valueNames = {"max_level", "min_level", "wood", "stone", "iron", "pop", "wood_factor", "stone_factor", "iron_factor", "pop_factor", "build_time", "build_time_factor"};
        int[] level1Points = {10, 16, 20, 24, 10, 10, 512, 19, 0, 24, 10, 6, 6, 6, 5, 6, 5, 8};
        
        // Create a XML document to parse
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(false);
        DocumentBuilder builder;
        Document doc = null;
        XPathExpression expr = null;
        builder = factory.newDocumentBuilder();
        doc = builder.parse(input);
        
        // Create a XPathFactory
        XPathFactory xFactory = XPathFactory.newInstance();
        
        // Create a XPath object
        XPath xpath = xFactory.newXPath();

        for (int i = 0; i < buildingNames.length; i++)
        {
            double[] buildingProperties = new double[12];
            for (int j = 0; j < valueNames.length; j++)
            {
                expr = xpath.compile("/config/" + buildingNames[i] + "/" + valueNames[j] + "/text()");  // Compile XPath expression
                String result = (String) expr.evaluate(doc, XPathConstants.STRING);  // Run the query and get the result
                if (!result.isEmpty())
                {
                    buildingProperties[j] = Double.parseDouble(result);
                }
                else
                {
                    buildingProperties[0] = 0;
                    break;
                }
            }
            if (buildingProperties[0] != 0)  // Test if properties-set was found in xml config 
            {
                buildings.add(new Building(buildingNames[i], (int) buildingProperties[0], (int) buildingProperties[1], (int) buildingProperties[2], (int) buildingProperties[3], (int) buildingProperties[4],
                        (int) buildingProperties[5], buildingProperties[6], buildingProperties[7], buildingProperties[8], buildingProperties[9],
                        buildingProperties[10], buildingProperties[11], level1Points[i]));
            }
        }
    }

}
