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
