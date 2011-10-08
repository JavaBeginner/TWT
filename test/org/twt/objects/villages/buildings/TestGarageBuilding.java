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

public class TestGarageBuilding
{

    @Test
    public void testGarageBuilding()  // All test values are taken from world de68 - world-4-style
    {
        int[] woodNeeded = {0, 300, 378, 476, 600, 756, 953, 1200, 1513, 1906,
                            2401, 3026, 3812, 4804, 6053, 7626};
        int[] stoneNeeded = {0, 240, 307, 393, 503, 644, 825, 1056, 1351, 1729,
                             2214, 2833, 3627, 4642, 5942, 7606};
        int[] ironNeeded = {0, 260, 328, 413, 520, 655, 826, 1040, 1311, 1652,
                            2081, 2622, 3304, 4163, 5246, 6609};
        int[] popNeededTotal = {0, 8, 9, 11, 13, 15, 18, 21, 24, 28, 33, 38, 45, 53, 62, 72};
        int[][] buildTimeNeeded = {{2, 12, 2506}, {2, 13, 2386}, {2, 14, 2273}, {2, 15, 2165}, {2, 16, 2062}, {2, 17, 1963}, {2, 18, 1870}, {2, 19, 1781}, {2, 20, 1696}};
        int[] totalPoints = {0, 24, 29, 35, 41, 50, 60, 72, 86, 103, 124, 149, 178, 214, 257, 308};
        
        Building garage = new Building("Werkstatt", 15, 0, 300, 240, 260, 8, 1.26, 1.28, 1.26, 1.17, 3750, 1.2, 24);

        for (int i=1;i<woodNeeded.length;i++)
        {
            Assert.assertEquals(woodNeeded[i], garage.getWoodNeeded(i));
        }
       
        for (int i=1;i<stoneNeeded.length;i++)
        {
            Assert.assertEquals(stoneNeeded[i], garage.getStoneNeeded(i));
        }
        
        for (int i=1;i<ironNeeded.length;i++)
        {
            Assert.assertEquals(ironNeeded[i], garage.getIronNeeded(i));
        }
        
        for (int i=1;i<popNeededTotal.length;i++)
        {
            Assert.assertEquals(popNeededTotal[i], garage.getPopNeededTotal(i));
            Assert.assertEquals(popNeededTotal[i] - popNeededTotal[i-1], garage.getPopNeeded(i));
        }
        
        for (int i=0;i<buildTimeNeeded.length;i++)
        {
            Assert.assertEquals(buildTimeNeeded[i][2], garage.getBuildTimeNeeded(buildTimeNeeded[i][0], buildTimeNeeded[i][1]));
        }
        
        for (int i=1;i<totalPoints.length;i++)
        {
            Assert.assertEquals(totalPoints[i], garage.getTotalPoints(i));
            Assert.assertEquals(totalPoints[i] - totalPoints[i-1], garage.getNewPoints(i));
        }
    }

}
