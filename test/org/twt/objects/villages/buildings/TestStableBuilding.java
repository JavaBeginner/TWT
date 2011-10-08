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

public class TestStableBuilding
{

    @Test
    public void testStableBuilding()  // All test values are taken from world de68 - world-4-style
    {
        int[] woodNeeded = {0, 270, 340, 429, 540, 681, 857, 1080, 1361, 1715, 2161, 2723,
                            3431, 4323, 5447, 6864, 8648, 10897, 13730, 17300, 21797};
        int[] stoneNeeded = {0, 240, 307, 393, 503, 644, 825, 1056, 1351, 1729, 2214, 2833,
                             3627, 4642, 5942, 7606, 9736, 12462, 15951, 20417, 26134};
        int[] ironNeeded = {0, 260, 328, 413, 520, 655, 826, 1040, 1311, 1652, 2081, 2622,
                            3304, 4163, 5246, 6609, 8328, 10493, 13221, 16659, 20990};
        int[] popNeededTotal = {0, 8, 9, 11, 13, 15, 18, 21, 24, 28, 33, 38, 45, 53, 62, 72, 84, 99, 115, 135, 158};
        int[][] buildTimeNeeded = {{4, 12, 3608}, {4, 13, 3436}, {4, 14, 3273}, {4, 15, 3117}, {4, 16, 2969}, {4, 17, 2827}, {4, 18, 2693}, {4, 19, 2564}, {4, 20, 2442}};
        int[] totalPoints = {0, 20, 24, 29, 35, 41, 50, 60, 72, 86, 103, 124, 149, 178, 214, 257, 308, 370, 444, 532, 639};
        
        Building stable = new Building("Stall", 20, 0, 270, 240, 260, 8, 1.26, 1.28, 1.26, 1.17, 3750, 1.2, 20);

        for (int i=1;i<woodNeeded.length;i++)
        {
            Assert.assertEquals(woodNeeded[i], stable.getWoodNeeded(i));
        }
       
        for (int i=1;i<stoneNeeded.length;i++)
        {
            Assert.assertEquals(stoneNeeded[i], stable.getStoneNeeded(i));
        }
        
        for (int i=1;i<ironNeeded.length;i++)
        {
            Assert.assertEquals(ironNeeded[i], stable.getIronNeeded(i));
        }
        
        for (int i=1;i<popNeededTotal.length;i++)
        {
            Assert.assertEquals(popNeededTotal[i], stable.getPopNeededTotal(i));
            Assert.assertEquals(popNeededTotal[i] - popNeededTotal[i-1], stable.getPopNeeded(i));
        }
        
        for (int i=0;i<buildTimeNeeded.length;i++)
        {
            Assert.assertEquals(buildTimeNeeded[i][2], stable.getBuildTimeNeeded(buildTimeNeeded[i][0], buildTimeNeeded[i][1]));
        }
        
        for (int i=1;i<totalPoints.length;i++)
        {
            Assert.assertEquals(totalPoints[i], stable.getTotalPoints(i));
            Assert.assertEquals(totalPoints[i] - totalPoints[i-1], stable.getNewPoints(i));
        }
    }

}
