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
package org.twt.objects.worlds;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/** A container for the world data parsed from the config XML file
 *  you can get from deXX.die-staemme.de/interface.php?func=get_config
 *  
 * @author jb
 *
 */
public class World
{
    /** Number of the world */
    private final String worldId;
    
    /** Game speed */
    private double speed;
    
    /** Unit speed */
    private double unitSpeed;
    
    /** Morale
     *  0 = not active
     *  1 = points based
     *  2 = time based 
     */
    private int morale;
//    
//    /** Build queue
//     * 0 = not active
//     * 1 = active
//     */
//    private final int buildQueue;
//    
//    /** Demolish buildings (headquarters level 15 needed)
//     * 0 = not active
//     * 1 = active
//     */
//    private final int buildDestroy;
//    
//    private final int miscLogLosses;
//    private final int miscKillRanking;
//    private final int miscTutorial;
//    private final int miscMillisArrival;
//    /** cancellation period for attacks */
//    private final int miscCommandCancelTime;
//    /** cancellation period for trades */
//    private final int miscTradeCancelTime;
//    private final int miscOnlineTime;
//    private final int miscMorePremium;
//    private final long miscStartChristmasTree;
//    private final long miscEndChristmasTree;
//    
//    /** beginner protection */
//    private final int newbieDays;
//    /** beginner relation protection */
//    private final int newbieRatioDays;
//    /** maximum relation attacker : defender */
//    private final int newbieRatio;
//    
//    /** Basic configuration for resources production, construction time, recruiting costs and unit strength
//     * 1 = world 1 and 2
//     * 3 = world 3
//     * 4 = world 4
//     * 5 = world 5
//     * 6 = world 6 and 7
//     */
//    private final int gameBaseConfig;
//    
//    /** Paladin active
//     * 0 = not active
//     * 1 = active
//     * 2 = active and can use advanced items
//     */
//    private final int gameKnight;
//    
//    /** Paladin can find advanced items
//     * 0 = not active
//     * 1 = active
//     */
//    private final int gameKnightNewItems;
//    
//    /** Archer and mounted archer active
//     * 0 = not active
//     * 1 = active
//     */
//    private final int gameArcher;
//    private final int gameTech;
//    /** Scouting system */
//    private final int gameSpy;
//    /** Farm rule */
//    private final int gameFarmLimit;
//    private final double gameBarbarianRise;
//    private final int gameBarbarianMaxPoints;
//    private final int gameHauls;
//    private final int gameHaulsBase;
//    private final int gameHaulsMax;
//    
//    private final int buildingsBaseSetting;
//    private final int buildingsHbOffset;
//    private final int buildingsHbFactor;
//    private final int buildingsCustomMain;
//    private final int buildingsCustomFarm;
//    private final int buildingsCustomStorage;
//    private final int buildingsCustomPlace;
//    private final int buildingsCustomBarracks;
//    private final int buildingsCustomChurch;
//    private final int buildingsCustomChurchF;
//    private final int buildingsCustomSmith;
//    private final int buildungsCustomWood;
//    private final int buildingsCustomStone;
//    private final int buildingsCustomIron;
//    private final int buildingsCustomMarket;
//    private final int buildingsCustomStable;
//    private final int buildingsCustomWall;
//    private final int buildingsCustomGarage;
//    private final int buildingsCustomHide;
//    private final int buildingsCustomSnob;
//    private final int buildingsCustomStatue;
//    
//    private final int snobGold;
//    /** Rebuild lost noblemen cheap */
//    private final boolean snobCheapRebuild;
//    private final int snobSimple;
//    private final int snobRise;
//    /** Maximum noble distance */
//    private final int snobMaxDist;
//    private final int snobFactor;
//    private final int snobCoinWood;
//    private final int snobCoinStone;
//    private final int snobCoinIIron;
//    
//    private final int allyWarsEnabled;
//    private final boolean allyNoHarm;
//    private final boolean allyNoOtherSupport;
//    private final boolean allyNoLeave;
//    private final boolean allyNoAdmin;
//    private final int allyLimit;
//    private final int allyFixedAllies;
//    private final int allyDiplomacy;
//    private final int allyReservationManager;
//    private final int allyPointsMemberCount;
//    private final boolean allyBypassIgmBlock;
//    private final boolean allyAdminBypassIgmBlock;
//    private final int allyWarsMemberRequirement;
//    private final int allyWarsPointsRequirement;
//    private final int allyWarsAutoacceptDays;
//    
//    private final int winCheck;
//    private final int winPoints;
//    private final int winVillages;
//    private final int winHours;
//    
//    private final int coordMapSize;
//    private final int coordFunc;
//    private final int coordEmptyVillages;
//    private final int coordBonusVillages;
//    private final int coordBonusNew;
//    private final int coordInner;
//    private final int coordSelectStart;
//    private final int coordVillageMoveWait;
//    private final int coordNobleRestart;
//    private final int coordWorldMap;
//    private final boolean coordLegacyScenery;
//    
//    private final int sitterAllow;
//    
//    private final int sleepActive;
//    private final int sleepDelay;
//    private final int sleepMin;
//    private final int sleepMax;
//    private final int sleepMinAwake;
//    private final int sleepMaxAwake;
//    private final int sleepWarnTime;
//    
//    private final int nightActive;
//    private final int nightStartHour;
//    private final int sleepEndHour;
//    private final int sleepDefFactor;
    
    /** Creates an new world instance for the given worldId from a XML config string
     * @param worldId
     * @param xmlConfig
     * @throws XPathExpressionException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public World(String worldId, String xmlConfig) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        this.worldId = worldId;
        StringReader in = new StringReader(xmlConfig);
        
        parseConfig(in);
    }
    
    /** Creates an new world instance for the given worldId from a XML config StringReader
     * @param worldId
     * @param xmlConfig
     * @throws XPathExpressionException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public World(String worldId, StringReader xmlConfig) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        this.worldId = worldId;
        parseConfig(xmlConfig);
    }
    
    /** Parse the XML configuration and and populate the instance variables with the results
     * @param input
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws XPathExpressionException
     */
    private void parseConfig(StringReader input) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException
    {
        // Create a XML document to parse
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document doc = null;
        XPathExpression expr = null;
        builder = factory.newDocumentBuilder();
        doc = builder.parse(new InputSource(input));
        
        // Create a XPathFactory
        XPathFactory xFactory = XPathFactory.newInstance();
        
        // Create a XPath object
        XPath xpath = xFactory.newXPath();

        // find and set the game speed
        expr = xpath.compile("//config/speed/text()");    // Compile the XPath expression
        speed = Double.parseDouble((String) expr.evaluate(doc, XPathConstants.STRING));    // Run the query and get the result
        
        // find and set the unit speed
        expr = xpath.compile("//config/unit_speed/text()");    // Compile the XPath expression
        unitSpeed = Double.parseDouble((String) expr.evaluate(doc, XPathConstants.STRING));    // Run the query and get the result
        
        // find and set the morale setting
        expr = xpath.compile("//config/moral/text()");    // Compile the XPath expression
        morale = Integer.parseInt((String) expr.evaluate(doc, XPathConstants.STRING));    // Run the query and get the result
    }
    
    /** Get the Id of the world
     * @return The Id of the world
     */
    public String getWorldId()
    {
        return worldId;
    }
    
    /** Get the game speed
     * @return The game speed
     */
    public double getSpeed()
    {
        return speed;
    }
    
    /** Get the unit speed
     * @return The unit speed
     */
    public double getUnitSpeed()
    {
        return unitSpeed;
    }
    
    /** Get the morale setting
     *  0 = not active
     *  1 = points based
     *  2 = time based
     *  @return morale 
     */
    public int getMorale()
    {
        return morale;
    }
}
