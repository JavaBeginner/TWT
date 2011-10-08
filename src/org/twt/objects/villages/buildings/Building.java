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

/** This class represents a building with its properties and calculations
 * 
 * @author JavaBeginner
 *
 */
public class Building
{
    /** Name of the building */
    private String name;
    
    /** The maximum level for this building */
    private int maxLevel;
    
    /** The minimum level for this building */
    private int minLevel;
    
    /** The initial amount of wood needed to build this building */
    private int wood;
    
    /** The initial amount of stone needed to build this building */
    private int stone;
    
    /** The initial amount of iron needed to build this building */
    private int iron;
    
    /** The initial population of this building */
    private int pop;
    
    /** The increase factor for the wood resource needed to build this building */
    private double woodFactor;
    
    /** The increase factor for the stone resource needed to build this building */
    private double stoneFactor;
    
    /** The increase factor for the iron resource needed to build this building */
    private double ironFactor;
    
    /** The increase factor for the population of this building */
    private double popFactor;
    
    /** The initial time in seconds needed to build this building */
    private double buildTime;
    
    /** The increase factor of the build time for this building */
    private double buildTimeFactor;
    
    /** The points you get for this building at level 1. */
    private int level1Points;
    
    /** Construct a new building object
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
    public Building(String name, int maxLevel, int minLevel, int wood, int stone, int iron, int pop, double woodFactor, 
                    double stoneFactor, double ironFactor, double popFactor, double buildTime, double buildTimeFactor, int level1Points)
    {
        setName(name);
        setMaxLevel(maxLevel);
        setMinLevel(minLevel);
        setWood(wood);
        setStone(stone);
        setIron(iron);
        setPop(pop);
        setWoodFactor(woodFactor);
        setStoneFactor(stoneFactor);
        setIronFactor(ironFactor);
        setPopFactor(popFactor);
        setBuildTime(buildTime);
        setBuildTimeFactor(buildTimeFactor);
        setLevel1Points(level1Points);
    }
    
    /** Set the Name of the building
     * @param name The Name of the building
     */
    private void setName(String name)
    {
        this.name = name;
    }
    
    /** Get the Name of the building
     * @return The Name of the building
     */
    public String getName()
    {
        return name;
    }
    
    /** Set the maximum level for this building
     * @param maxLevel The maximum level for this building
     */
    private void setMaxLevel(int maxLevel)
    {
        this.maxLevel = maxLevel;
    }
    
    /** Get the maximum level for this building
     * @return The maximum level for this building
     */
    public int getMaxLevel()
    {
        return maxLevel;
    }
    
    /** Set the minimum level for this building
     * @param minLevel The minimum level for this building
     */
    private void setMinLevel(int minLevel)
    {
        this.minLevel = minLevel;
    }
    
    /** Get the minimum level for this building
     * @return The minimum level for this building
     */
    public int getMinLevel()
    {
        return minLevel;
    }
    
    /** Set the initial amount of wood needed to build this building
     * @param wood The initial amount of wood needed to build this building
     */
    private void setWood(int wood)
    {
        this.wood = wood;
    }
    
    /** Get the initial amount of wood needed to build this building
     * @return The initial amount of wood needed to build this building
     */
    public int getWood()
    {
        return wood;
    }
    
    /** Set the initial amount of stone needed to build this building
     * @param stone The initial amount of stone needed to build this building
     */
    private void setStone(int stone)
    {
        this.stone = stone;
    }
    
    /** Get the initial amount of stone needed to build this building
     * @return The initial amount of wood needed to build this building
     */
    public int getStone()
    {
        return stone;
    }
    
    /** Set the initial amount of iron needed to build this building
     * @param iron The initial amount of wood needed to build this building
     */
    private void setIron(int iron)
    {
        this.iron = iron;
    }
    
    /** Get the initial amount of iron needed to build this building
     * @return The initial amount of wood needed to build this building
     */
    public int getIron()
    {
        return iron;
    }
    
    /** Set the initial population of this building
     * @param pop The initial population of this building
     */
    private void setPop(int pop)
    {
        this.pop = pop;
    }
    
    /** Get the initial population of this building
     * @return The initial population of this building
     */
    public int getPop()
    {
        return pop;
    }
    
    /** Set the increase factor for the wood resource needed to build this building
     * @param woodFactor The increase factor for the wood resource needed to build this building
     */
    private void setWoodFactor(double woodFactor)
    {
        this.woodFactor = woodFactor;
    }
    
    /** Get the increase factor for the wood resource needed to build this building
     * @return The increase factor for the wood resource needed to build this building
     */
    public double getWoodFactor()
    {
        return woodFactor;
    }
    
    /** Set the increase factor for the stone resource needed to build this building
     * @param stoneFactor The increase factor for the stone resource needed to build this building
     */
    private void setStoneFactor(double stoneFactor)
    {
        this.stoneFactor = stoneFactor;
    }
    
    /** Get the increase factor for the stone resource needed to build this building
     * @return The increase factor for the stone resource needed to build this building
     */
    public double getStoneFactor()
    {
        return stoneFactor;
    }
    
    /** Set The increase factor for the iron resource needed to build this building
     * @param ironFactor The increase factor for the iron resource needed to build this building
     */
    private void setIronFactor(double ironFactor)
    {
        this.ironFactor = ironFactor;
    }
    
    /** Get the increase factor for the iron resource needed to build this building
     * @return The increase factor for the iron resource needed to build this building
     */
    public double getIronFactor()
    {
        return ironFactor;
    }
    
    /** Set the increase factor for the population of this building
     * @param popFactor The increase factor for the population of this building
     */
    private void setPopFactor(double popFactor)
    {
        this.popFactor = popFactor;
    }
    
    /** Get the increase factor for the population of this building
     * @return The increase factor for the population of this building
     */
    public double getPopFactor()
    {
        return popFactor;
    }
    
    /** Set the time in seconds needed to build this building with main building level 1
     * @param buildTime The time in seconds needed to build this building with main building level 1
     */
    private void setBuildTime(double buildTime)
    {
        this.buildTime = buildTime;
    }
    
    /** Get the time in seconds needed to build this building with main building level 1
     * @return The time in seconds needed to build this building with main building level 1
     */
    public double getBuildTime()
    {
        return buildTime;
    }
    
    /** Set the increase factor of the build time for this building
     * @param buildTimeFactor The increase factor of the build time for this building
     */
    private void setBuildTimeFactor(double buildTimeFactor)
    {
        this.buildTimeFactor = buildTimeFactor;
    }
    
    /** Get the increase factor of the build time for this building
     * @return The increase factor of the build time for this building
     */
    public double getBuildTimeFactor()
    {
        return buildTimeFactor;
    }
    
    /** Get the amount of wood needed to build level x
     * @param level The level for the resource calculation
     * @return The amount of wood needed to build the level
     */
    public int getWoodNeeded(int level)
    {
        double woodNeeded = wood * Math.pow(woodFactor, level-1);
        return (int) Math.round(woodNeeded);
    }
    
    /** Get the amount of stone needed to build level x
     * @param level The level for the resource calculation
     * @return The amount of stone needed to build the level
     */
    public int getStoneNeeded(int level)
    {
        double stoneNeeded = stone * Math.pow(stoneFactor, level-1);
        return (int) Math.round(stoneNeeded);
    }
    
    /** Get the amount of iron needed to build level x
     * @param level The level for the resource calculation
     * @return The amount of iron needed to build the level
     */
    public int getIronNeeded(int level)
    {
        double ironNeeded = iron * Math.pow(ironFactor, level-1);
        return (int) Math.round(ironNeeded);
    }
    
    /** Get the total population needed for level x
     * @param level The level for the population calculation
     * @return The total population needed for level x
     */
    public int getPopNeededTotal(int level)
    {
        double popNeededTotal = pop * Math.pow(popFactor, level-1);
        return (int) Math.round(popNeededTotal);
    }
    
    /** Get the additional population needed for level x
     * @param level The level for the population calculation
     * @return The additional population needed for level x
     */
    public int getPopNeeded(int level)
    {
        int popNeeded;
        
        if (level == 1)
        {
            popNeeded = getPopNeededTotal(level);
            return popNeeded;
        }
        else
        {
            popNeeded = getPopNeededTotal(level) - getPopNeededTotal(level - 1);
            return popNeeded;
        }
    }
    
    /** Set the points you get for this building at level 1
     * @param points The points you get for this building at level 1
     */
    private void setLevel1Points(int points)
    {
        level1Points = points;
    }
    
    /** Get the build time in seconds needed for level x with main building on level y
     * @param level The level for the build time calculation
     * @param levelMain The level of the main building for the build time calculation
     * @return The build time in seconds
     */
    public int getBuildTimeNeeded(int level, int levelMain)
    {
        final double buildTimeFactorMainBase = 0.952381;
        final double buildTimeFactorMain;
        final double buildTimeNeeded;
        
        buildTimeFactorMain = Math.pow(buildTimeFactorMainBase, levelMain);
        buildTimeNeeded = buildTime * Math.pow(buildTimeFactor, (level - 1)) * buildTimeFactorMain;
        
        return (int) Math.round(buildTimeNeeded);
    }
    
    /** Get the total points for this building at level x
     * @param level The level of the building
     * @return The total points of the building
     */
    public int getTotalPoints(int level)
    {
        double totalPoints = level1Points * Math.pow(1.2, (level-1));
        return (int) Math.round(totalPoints);
    }
    
    /** Get the new (additional) points for this building at level x
     * @param level The level of the building
     * @return The additional points you get for level x
     */
    public int getNewPoints(int level)
    {
        int newPoints;
        
        if (level == 1)
        {
            newPoints = level1Points;
            return newPoints;
        }
        else
        {
            newPoints = getTotalPoints(level) - getTotalPoints(level - 1);
            return newPoints;
        }
    }
}
