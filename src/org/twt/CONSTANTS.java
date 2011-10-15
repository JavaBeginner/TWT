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
package org.twt;

/** <p>This class encapsulates constants for the hole toolkit.</p>
 *  <p>All members are immutable.</p>
 *  
 * @author JavaBeginner
 *
 */
public final class CONSTANTS
{
    /** The base directory of the toolkit data */
    public final static String DATA_DIR = "./data";
    
    /** The base directory of the server data */
    public final static String SERVERS_DIR = DATA_DIR + "/server";
    
    /** The homepage URL of the game */
    public final static String DS_HOMEPAGE_URL = "http://die-staemme.de";
    
    /** The URL of the serverlist */
    public final static String DS_SERVERLIST_URL = DS_HOMEPAGE_URL + "/backend/get_servers.php";
    
    /** A string array with the building names of the game */
    public final static String[] BUILDING_NAMES = {"main", "barracks", "stable", "garage", "church", "church_f", "snob", "smith", "place", "statue", "market", "wood", "stone", "iron", "farm", "storage", "hide", "wall"};
    
    /** A string array with the names of the building properties */
    public final static String[] BUILDING_VALUE_NAMES = {"max_level", "min_level", "wood", "stone", "iron", "pop", "wood_factor", "stone_factor", "iron_factor", "pop_factor", "build_time", "build_time_factor"};
    
    /** A int array with the points at level 1 for each building */
    public final static int[] BUILDING_LEVEL_1_POINTS = {10, 16, 20, 24, 10, 10, 512, 19, 0, 24, 10, 6, 6, 6, 5, 6, 5, 8};
    
    /** A string array with the unit names of the game */
    public final static String[] UNIT_NAMES = {"spear", "sword", "axe", "archer", "spy", "light", "marcher", "heavy", "ram", "catapult", "knight", "snob", "militia"};
    
    /** A string array with the names of the unit properties */
    public final static String[] UNIT_VALUE_NAMES = {"wood", "stone", "iron", "pop", "speed", "attack", "defense", "defense_cavalry", "defense_archer", "carry", "build_time"};
    
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
