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

import junit.framework.Assert;
import org.junit.Test;

public class TestSnobBuilding
{

    @Test
    public void testSnobBuilding()  // All test values are taken from world de68 - world-4-style
    {
        int[] woodNeeded = {0, 15000, 30000, 60000};
        int[] stoneNeeded = {0, 25000, 50000, 100000};
        int[] ironNeeded = {0, 10000, 20000, 40000};
        int[] popNeededTotal = {0, 80, 94, 110};
//        int[][] buildTimeNeeded = {{2, 12, 2506}, {2, 13, 2386}, {2, 14, 2273}, {2, 15, 2165}, {2, 16, 2062}, {2, 17, 1963}, {2, 18, 1870}, {2, 19, 1781}, {2, 20, 1696}};
        int[] totalPoints = {0, 512, 614, 737};
        
        Snob s = new Snob("Adelshof", 1, 0, 15000, 25000, 10000, 80, 2, 2, 2, 1.17, 40500, 1.2, 512);

        for (int i=1;i<woodNeeded.length;i++)
        {
            Assert.assertEquals(woodNeeded[i], s.getWoodNeeded(i));
        }
       
        for (int i=1;i<stoneNeeded.length;i++)
        {
            Assert.assertEquals(stoneNeeded[i], s.getStoneNeeded(i));
        }
        
        for (int i=1;i<ironNeeded.length;i++)
        {
            Assert.assertEquals(ironNeeded[i], s.getIronNeeded(i));
        }
        
        for (int i=1;i<popNeededTotal.length;i++)
        {
            Assert.assertEquals(popNeededTotal[i], s.getPopNeededTotal(i));
            Assert.assertEquals(popNeededTotal[i] - popNeededTotal[i-1], s.getPopNeeded(i));
        }
        
//        for (int i=0;i<buildTimeNeeded.length;i++)
//        {
//            Assert.assertEquals(buildTimeNeeded[i][2], s.getBuildTimeNeeded(buildTimeNeeded[i][0], buildTimeNeeded[i][1]));
//        }
        
        for (int i=1;i<totalPoints.length;i++)
        {
            Assert.assertEquals(totalPoints[i], s.getTotalPoints(i));
            Assert.assertEquals(totalPoints[i] - totalPoints[i-1], s.getNewPoints(i));
        }
    }

}
