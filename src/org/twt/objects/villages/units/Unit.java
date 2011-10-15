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

public class Unit
{
    /** Name of the unit */
    private String name;
    
    /** The amount of wood needed to recruit the unit */
    private int wood;
    
    /** The amount of stone needed to recruit the unit */
    private int stone;
    
    /** The amount of iron needed to recruit the unit */
    private int iron;
    
    /** The population of the unit */
    private int pop;
    
    /** The speed of the unit */
    private double speed;
    
    /** The attack strength of the unit */
    private int attack;
    
    /** The defense strength of the unit when defending against infantry units */
    private int defense;
    
    /** The defensive strength of the unit when defending against cavalry units */
    private int defenseCavalry;
    
    /** The defensive strength of the unit when defending against archers and mounted archers */
    private int defenseArcher;
    
    /** How much haul the unit can carry */
    private int carry;
    
    /** The time needed to recruit the unit */
    private double buildTime;
    
    /** Construct a new unit object
     * @param name The name of the unit
     * @param wood The amount of wood needed to recruit the unit
     * @param stone The amount of stone needed to recruit the unit
     * @param iron The amount of iron needed to recruit the unit
     * @param pop The population of the unit
     * @param speed The speed of the unit
     * @param attack The attack strength of the unit
     * @param defense The defense strength of the unit when defending against infantry units
     * @param defenseCavalry The defensive strength of the unit when defending against cavalry units
     * @param defenseArcher The defensive strength of the unit when defending against archers and mounted archers
     * @param carry How much haul the unit can carry
     * @param buildTime The time neede to recruit the unit
     */
    public Unit(String name, int wood, int stone, int iron, int pop, double speed, int attack, int defense, int defenseCavalry, int defenseArcher, int carry, double buildTime)
    {
        setName(name);
        setWood(wood);
        setStone(stone);
        setIron(iron);
        setPop(pop);
        setSpeed(speed);
        setAttack(attack);
        setDefense(defense);
        setDefenseCavalry(defenseCavalry);
        setDefenseArcher(defenseArcher);
        setCarry(carry);
        setBuildTime(buildTime);
    }
    
    /** Set the name of the unit
     * @param name The name of the unit
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /** Get the name of the unit
     * @return The name of the unit
     */
    public String getName()
    {
        return this.name;
    }
    
    /** Set the amount of wood needed to recruit the unit
     * @param wood The amount of wood needed to recruit the unit
     */
    public void setWood(int wood)
    {
        this.wood = wood;
    }
    
    /** Get the amount of wood needed to recruit the unit
     * @return The amount of wood needed to recruit the unit
     */
    public int getWood()
    {
        return this.wood;
    }
    
    /** Set the amount of stone needed to recruit the unit
     * @param stone The amount of stone needed to recruit the unit
     */
    public void setStone(int stone)
    {
        this.stone = stone;
    }
    
    /** Get the amount of stone needed to recruit the unit
     * @return The amount of stone needed to recruit the unit
     */
    public int getStone()
    {
        return this.stone;
    }
    
    /** Set the amount of iron needed to recruit the unit
     * @param iron The amount of iron needed to recruit the unit
     */
    public void setIron(int iron)
    {
        this.iron = iron;
    }
    
    /** Get the amount of iron needed to recruit the unit
     * @return The amount of iron needed to recruit the unit
     */
    public int getIron()
    {
        return this.iron;
    }
    
    /** Set the population of the unit
     * @param pop The population of the unit
     */
    public void setPop(int pop)
    {
        this.pop = pop;
    }
    
    /** Get the population of the unit
     * @return The population of the unit
     */
    public int getPop()
    {
        return this.pop;
    }
    
    /** Set the speed of the unit
     * @param speed The speed of the unit
     */
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
    
    /** Get the speed of the unit
     * @return The speed of the unit
     */
    public double getSpeed()
    {
        return this.speed;
    }
    
    /** Set the attack strength of the unit
     * @param attack The attack strength of the unit
     */
    public void setAttack(int attack)
    {
        this.attack = attack;
    }
    
    /** Get the attack strength of the unit
     * @return The attack strength of the unit
     */
    public int getAttack()
    {
        return this.attack;
    }
    
    /** Set the defense strength of the unit when defending against infantry units
     * @param defense The defense strength of the unit when defending against infantry units
     */
    public void setDefense(int defense)
    {
        this.defense = defense;
    }
    
    /** Get the defense strength of the unit when defending against infantry units
     * @return The defense strength of the unit when defending against infantry units
     */
    public int getDefense()
    {
        return this.defense;
    }
    
    /** Set the defensive strength of the unit when defending against cavalry units
     * @param defenseCavalry The defensive strength of the unit when defending against cavalry units
     */
    public void setDefenseCavalry(int defenseCavalry)
    {
        this.defenseCavalry = defenseCavalry;
    }
    
    /** Get the defensive strength of the unit when defending against cavalry units
     * @return The defensive strength of the unit when defending against cavalry units
     */
    public int getDefenseCavalry()
    {
        return this.defenseCavalry;
    }
    
    /** Set the defensive strength of the unit when defending against archers and mounted archers
     * @param defenseArcher The defensive strength of the unit when defending against archers and mounted archers
     */
    public void setDefenseArcher(int defenseArcher)
    {
        this.defenseArcher = defenseArcher;
    }
    
    /** Get the defensive strength of the unit when defending against archers and mounted archers
     * @return The defensive strength of the unit when defending against archers and mounted archers
     */
    public int getDefenseArcher()
    {
        return this.defenseArcher;
    }
    
    /** Set how much haul the unit can carry
     * @param carry How much haul the unit can carry
     */
    public void setCarry(int carry)
    {
        this.carry = carry;
    }
    
    /** Get how much haul the unit can carry
     * @return How much haul the unit can carry
     */
    public int getCarry()
    {
        return this.carry;
    }
    
    /** Set the time needed to recruit the unit
     * @param buildTime The time needed to recruit the unit
     */
    public void setBuildTime(double buildTime)
    {
        this.buildTime = buildTime;
    }
    
    /** Get the time needed to recruit the unit
     * @return the time needed to recruit the unit
     */
    public double getBuildTime()
    {
        return this.buildTime;
    }
}
