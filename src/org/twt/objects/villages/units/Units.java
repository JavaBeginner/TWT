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
package org.twt.objects.villages.units;

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

import org.twt.CONSTANTS;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/** Represents a list of {@link Unit} objects.
 * 
 * @author JavaBeginner
 *
 */
public class Units
{
    /** The list to keep the unit objects */
    private List<Unit> units = new ArrayList<Unit>();
    
    public Units(String serverURL) throws IOException, XPathExpressionException, ParserConfigurationException, SAXException
    {
        InputStream in = null;
        try
        {
            URL url = new URL(serverURL + "/interface.php?func=get_unit_info");
            in = url.openStream();
            parseUnitConfig(in);
        }
        finally
        {
            in.close();
        }
    }
    
    /** Parse the XML unit configuration and create {@link Unit} objects
     * @param input
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws XPathExpressionException
     */
    private void parseUnitConfig(InputStream input) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException
    {
        
        
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

        for (int i = 0; i < CONSTANTS.UNIT_NAMES.length; i++)
        {
            double[] UnitProperties = new double[CONSTANTS.UNIT_VALUE_NAMES.length];
            for (int j = 0; j < CONSTANTS.UNIT_VALUE_NAMES.length; j++)
            {
                expr = xpath.compile("/config/" + CONSTANTS.UNIT_NAMES[i] + "/" + CONSTANTS.UNIT_VALUE_NAMES[j] + "/text()");  // Compile XPath expression
                String result = (String) expr.evaluate(doc, XPathConstants.STRING);  // Run the query and get the result
                if (!result.isEmpty())
                {
                    UnitProperties[j] = Double.parseDouble(result);
                }
                else
                {
                    UnitProperties[0] = 0;
                    break;
                }
            }
            if (UnitProperties[0] != 0)  // Test if properties-set was found in xml config 
            {
                units.add(new Unit(CONSTANTS.UNIT_NAMES[i], (int) UnitProperties[0], (int) UnitProperties[1], (int) UnitProperties[2], (int) UnitProperties[3], UnitProperties[4],
                        (int) UnitProperties[5], (int) UnitProperties[6], (int) UnitProperties[7], (int) UnitProperties[8], (int) UnitProperties[9], UnitProperties[10]));
            }
        }
    }
    
    /** Get the {@link Unit} object for the given name
     * @param name The name of the ´{@link Unit}
     * @return The {@link Unit} object, null = no object to the given name found
     */
    public Unit getUnit(String name)
    {
        Unit resultUnit = null;
        
        for (Unit u : units)
        {
            if (name.equals(u.getName()))
            {
                resultUnit = u;
                break;
            }
        }
        
        return resultUnit;
    }

}
