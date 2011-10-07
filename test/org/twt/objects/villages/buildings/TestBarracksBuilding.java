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

public class TestBarracksBuilding
{

    @Test
    public void testBarracksBuilding()  // All test values are taken from world de68 - world-4-style
    {
        int[] woodNeeded = {0, 200, 252, 318, 400, 504, 635, 800, 1008, 1271, 1601, 2017, 2542, 3202, 4035, 5084,
                            6406, 8072, 10170, 12814, 16146, 20344, 25634, 32298, 40696, 51277};
        int[] stoneNeeded = {0, 170, 218, 279, 357, 456, 584, 748, 957, 1225, 1568, 2007, 2569, 3288, 4209, 5388,
                            6896, 8827, 11298, 14462, 18511, 23695, 30329, 38821, 49691, 63605};
        int[] ironNeeded = {0, 90, 113, 143, 180, 227, 286, 360, 454, 572, 720, 908, 1144, 1441, 1816, 2288,
                            2883, 3632, 4577, 5767, 7266, 9155, 11535, 14534, 18313, 23075};
        int[] popNeededTotal = {0, 7, 8, 10, 11, 13, 15, 18, 21, 25, 29, 34, 39, 46, 54, 63, 74, 86, 101, 118, 138, 162, 189, 221, 259, 303};
        int[][] buildTimeNeeded = {{1, 3, 972}, {2, 3, 1166}, {2, 4, 1111}, {2, 5, 1058}, {3, 5, 1269}, {4, 5, 1523},
                                   {6, 12, 1559}, {6, 13, 1485}, {6, 14, 1414}, {6, 15, 1347}, {6, 16, 1282}, {6, 17, 1221},
                                   {6, 18, 1163}, {6, 19, 1108}, {6, 20, 1055}};
        int[] totalPoints = {0, 16, 19, 23, 28, 33, 40, 48, 57, 69, 83, 99, 119, 143, 171, 205, 247, 296, 355, 426, 511, 613, 736, 883, 1060, 1272};
        
        Barracks b = new Barracks("Kaserne", 25, 0, 200, 170, 90, 7, 1.26, 1.28, 1.26, 1.17, 1125, 1.2, 16);

        for (int i=1;i<woodNeeded.length;i++)
        {
            Assert.assertEquals(woodNeeded[i], b.getWoodNeeded(i));
        }
       
        for (int i=1;i<stoneNeeded.length;i++)
        {
            Assert.assertEquals(stoneNeeded[i], b.getStoneNeeded(i));
        }
        
        for (int i=1;i<ironNeeded.length;i++)
        {
            Assert.assertEquals(ironNeeded[i], b.getIronNeeded(i));
        }
        
        for (int i=1;i<popNeededTotal.length;i++)
        {
            Assert.assertEquals(popNeededTotal[i], b.getPopNeededTotal(i));
            Assert.assertEquals(popNeededTotal[i] - popNeededTotal[i-1], b.getPopNeeded(i));
        }
        
        for (int i=0;i<buildTimeNeeded.length;i++)
        {
            Assert.assertEquals(buildTimeNeeded[i][2], b.getBuildTimeNeeded(buildTimeNeeded[i][0], buildTimeNeeded[i][1]));
        }
        
        for (int i=1;i<totalPoints.length;i++)
        {
            Assert.assertEquals(totalPoints[i], b.getTotalPoints(i));
            Assert.assertEquals(totalPoints[i] - totalPoints[i-1], b.getNewPoints(i));
        }
    }

}
