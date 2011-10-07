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

public class TestMainBuilding
{

    @Test
    public void testMainBuilding() // All test values are taken from world de68 - world-4-style
    {
        int[] woodNeeded = {0, 90, 113, 143, 180, 227, 286, 360, 454, 572, 720, 908, 1144, 1441, 1816, 2288, 2883, 3632,
                            4577, 5767, 7266, 9155, 11535, 14534, 18313, 23075, 29074, 36633, 46158, 58159, 73280};
        int[] stoneNeeded = {0, 80, 102, 130, 166, 211, 270, 344, 438, 559, 712, 908, 1158, 1476, 1882, 2400, 3060, 3902,
                            4975, 6343, 8087, 10311, 13146, 16762, 21371, 27248, 34741, 44295, 56476, 72007, 91809};
        int[] ironNeeded = {0, 70, 88, 111, 140, 176, 222, 280, 353, 445, 560, 706, 890, 1121, 1412, 1779, 2242, 2825,
                            3560, 4485, 5651, 7120, 8972, 11304, 14244, 17947, 22613, 28493, 35901, 45235, 56996};
        int[] popNeededTotal = {0, 5, 6, 7, 8, 9, 11, 13, 15, 18, 21, 24, 28, 33, 38, 45, 53, 62, 72, 84, 99,
                                116, 135, 158, 185, 216, 253, 296, 347, 406, 475};
        int[][] buildTimeNeeded = {{2, 643}, {3, 735}, {4, 840}, {5, 960}, {6, 1097}, {12, 2444}, {13, 2793}, {14, 3192},
                                   {15, 3648}, {16, 4169}, {17, 4764}, {18, 5445}, {19, 6223}, {20, 7112}, {21, 8128}};
        int[] totalPoints = {0, 10, 12, 14, 17, 21, 25, 30, 36, 43, 52, 62, 74, 89, 107, 128, 154, 185, 222, 266, 319,
                             383, 460, 552, 662, 795, 954, 1145, 1374, 1648, 1978};
        
        Main m = new Main("Hauptgebäude", 30, 1, 90, 80, 70, 5, 1.26, 1.275, 1.26, 1.17, 562.5, 1.2, 10);

        for (int i=1;i<woodNeeded.length;i++)
        {
            Assert.assertEquals(woodNeeded[i], m.getWoodNeeded(i));
        }
       
        for (int i=1;i<stoneNeeded.length;i++)
        {
            Assert.assertEquals(stoneNeeded[i], m.getStoneNeeded(i));
        }
        
        for (int i=1;i<ironNeeded.length;i++)
        {
            Assert.assertEquals(ironNeeded[i], m.getIronNeeded(i));
        }
        
        for (int i=1;i<popNeededTotal.length;i++)
        {
            Assert.assertEquals(popNeededTotal[i], m.getPopNeededTotal(i));
            Assert.assertEquals(popNeededTotal[i] - popNeededTotal[i-1], m.getPopNeeded(i));
        }
                
        for (int i=0;i<buildTimeNeeded.length;i++)
        {
            Assert.assertEquals(buildTimeNeeded[i][1], m.getBuildTimeNeeded(buildTimeNeeded[i][0]));
        }
        
        for (int i=1;i<totalPoints.length;i++)
        {
            Assert.assertEquals(totalPoints[i], m.getTotalPoints(i));
            Assert.assertEquals(totalPoints[i] - totalPoints[i-1], m.getNewPoints(i));
        }
    }
}
