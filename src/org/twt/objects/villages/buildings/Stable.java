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

/** This class represents a stable building with its properties and calculations
 * 
 * @author JavaBeginner
 *
 */
public class Stable extends AbstractBuilding
{
    /** Construct a new stable building object
     * 
     * @param name The Name of the building
     * @param maxLevel The maximum level for this building
     * @param minLevel The minimum level for this building
     * @param wood The initial amount of wood needed to build this building
     * @param stone The initial amount of stone needed to build this building
     * @param iron The initial amount of iron needed to build this building
     * @param pop The initial population of this building
     * @param woodFactor The increase factor for the wood resource needed to build this building
     * @param stoneFactor The increase factor for the stone resource needed to build this building
     * @param ironFactor The increase factor for the iron resource needed to build this building
     * @param popFactor The increase factor for the population of this building
     * @param buildTime The initial time in seconds needed to build this building with main building level 1
     * @param buildTimeFactor The increase factor of the build time for this building
     * @param level1Points The points you get for this building at level 1
     */
    public Stable(String name, int maxLevel, int minLevel, int wood,
            int stone, int iron, int pop, double woodFactor,
            double stoneFactor, double ironFactor, double popFactor,
            double buildTime, double buildTimeFactor, int level1Points)
    {
        super(name, maxLevel, minLevel, wood, stone, iron, pop, woodFactor,
                stoneFactor, ironFactor, popFactor, buildTime, buildTimeFactor,
                level1Points);
    }
}
