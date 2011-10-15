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

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import junit.framework.Assert;

import org.junit.Test;
import org.xml.sax.SAXException;

public class TestBuildings
{
    @Test
    public void testBuildings() throws XPathExpressionException, IOException, ParserConfigurationException, SAXException
    {
        Buildings b = new Buildings("http://de68.die-staemme.de"); //Test with the values of world de68 - world-4-style
        
        testMainBuilding(b);
        testBarracksBuilding(b);
        testStableBuilding(b);
        testGarageBuilding(b);
        testSnobBuilding(b);
        
    }

    public void testMainBuilding(Buildings b)
    {
        // Test main building
        Building main = b.getBuilding("main");
        
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

        for (int i=1;i<woodNeeded.length;i++)
        {
            Assert.assertEquals(woodNeeded[i], main.getWoodNeeded(i));
        }

        for (int i=1;i<stoneNeeded.length;i++)
        {
            Assert.assertEquals(stoneNeeded[i], main.getStoneNeeded(i));
        }

        for (int i=1;i<ironNeeded.length;i++)
        {
            Assert.assertEquals(ironNeeded[i], main.getIronNeeded(i));
        }

        for (int i=1;i<popNeededTotal.length;i++)
        {
            Assert.assertEquals(popNeededTotal[i], main.getPopNeededTotal(i));
            Assert.assertEquals(popNeededTotal[i] - popNeededTotal[i-1], main.getPopNeeded(i));
        }
    
        for (int i=0;i<buildTimeNeeded.length;i++)
        {
            Assert.assertEquals(buildTimeNeeded[i][1], main.getBuildTimeNeeded(buildTimeNeeded[i][0], buildTimeNeeded[i][0]-1));
        }

        for (int i=1;i<totalPoints.length;i++)
        {
            Assert.assertEquals(totalPoints[i], main.getTotalPoints(i));
            Assert.assertEquals(totalPoints[i] - totalPoints[i-1], main.getNewPoints(i));
        }
    }
    
    public void testBarracksBuilding(Buildings b)
    {
     // Test barracks building
        Building barracks = b.getBuilding("barracks");
        
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

        for (int i=1;i<woodNeeded.length;i++)
        {
            Assert.assertEquals(woodNeeded[i], barracks.getWoodNeeded(i));
        }

        for (int i=1;i<stoneNeeded.length;i++)
        {
            Assert.assertEquals(stoneNeeded[i], barracks.getStoneNeeded(i));
        }

        for (int i=1;i<ironNeeded.length;i++)
        {
            Assert.assertEquals(ironNeeded[i], barracks.getIronNeeded(i));
        }

        for (int i=1;i<popNeededTotal.length;i++)
        {
            Assert.assertEquals(popNeededTotal[i], barracks.getPopNeededTotal(i));
            Assert.assertEquals(popNeededTotal[i] - popNeededTotal[i-1], barracks.getPopNeeded(i));
        }

        for (int i=0;i<buildTimeNeeded.length;i++)
        {
            Assert.assertEquals(buildTimeNeeded[i][2], barracks.getBuildTimeNeeded(buildTimeNeeded[i][0], buildTimeNeeded[i][1]));
        }

        for (int i=1;i<totalPoints.length;i++)
        {
            Assert.assertEquals(totalPoints[i], barracks.getTotalPoints(i));
            Assert.assertEquals(totalPoints[i] - totalPoints[i-1], barracks.getNewPoints(i));
        }
    }
    
    public void testStableBuilding(Buildings b)
    {
        // Test stable building
        Building stable = b.getBuilding("stable");
        
        int[] woodNeeded = {0, 270, 340, 429, 540, 681, 857, 1080, 1361, 1715, 2161, 2723,
                3431, 4323, 5447, 6864, 8648, 10897, 13730, 17300, 21797};
        int[] stoneNeeded = {0, 240, 307, 393, 503, 644, 825, 1056, 1351, 1729, 2214, 2833,
                 3627, 4642, 5942, 7606, 9736, 12462, 15951, 20417, 26134};
        int[] ironNeeded = {0, 260, 328, 413, 520, 655, 826, 1040, 1311, 1652, 2081, 2622,
                3304, 4163, 5246, 6609, 8328, 10493, 13221, 16659, 20990};
        int[] popNeededTotal = {0, 8, 9, 11, 13, 15, 18, 21, 24, 28, 33, 38, 45, 53, 62, 72, 84, 99, 115, 135, 158};
        int[][] buildTimeNeeded = {{4, 12, 3608}, {4, 13, 3436}, {4, 14, 3273}, {4, 15, 3117}, {4, 16, 2969}, {4, 17, 2827}, {4, 18, 2693}, {4, 19, 2564}, {4, 20, 2442}};
        int[] totalPoints = {0, 20, 24, 29, 35, 41, 50, 60, 72, 86, 103, 124, 149, 178, 214, 257, 308, 370, 444, 532, 639};

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
    
    public void testGarageBuilding(Buildings b)
    {
        // Test garage building
        Building garage = b.getBuilding("garage");
        
        int[] woodNeeded = {0, 300, 378, 476, 600, 756, 953, 1200, 1513, 1906,
                2401, 3026, 3812, 4804, 6053, 7626};
        int[] stoneNeeded = {0, 240, 307, 393, 503, 644, 825, 1056, 1351, 1729,
                 2214, 2833, 3627, 4642, 5942, 7606};
        int[] ironNeeded = {0, 260, 328, 413, 520, 655, 826, 1040, 1311, 1652,
                2081, 2622, 3304, 4163, 5246, 6609};
        int[] popNeededTotal = {0, 8, 9, 11, 13, 15, 18, 21, 24, 28, 33, 38, 45, 53, 62, 72};
        int[][] buildTimeNeeded = {{2, 12, 2506}, {2, 13, 2386}, {2, 14, 2273}, {2, 15, 2165}, {2, 16, 2062}, {2, 17, 1963}, {2, 18, 1870}, {2, 19, 1781}, {2, 20, 1696}};
        int[] totalPoints = {0, 24, 29, 35, 41, 50, 60, 72, 86, 103, 124, 149, 178, 214, 257, 308};

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
    
    public void testSnobBuilding(Buildings b)
    {
        // Test snob building
        Building snob = b.getBuilding("snob");
        
        int[] woodNeeded = {0, 15000, 30000, 60000};
        int[] stoneNeeded = {0, 25000, 50000, 100000};
        int[] ironNeeded = {0, 10000, 20000, 40000};
        int[] popNeededTotal = {0, 80, 94, 110};
//        int[][] buildTimeNeeded = {{2, 12, 2506}, {2, 13, 2386}, {2, 14, 2273}, {2, 15, 2165}, {2, 16, 2062}, {2, 17, 1963}, {2, 18, 1870}, {2, 19, 1781}, {2, 20, 1696}};
        int[] totalPoints = {0, 512, 614, 737};
        
        for (int i=1;i<woodNeeded.length;i++)
        {
            Assert.assertEquals(woodNeeded[i], snob.getWoodNeeded(i));
        }
       
        for (int i=1;i<stoneNeeded.length;i++)
        {
            Assert.assertEquals(stoneNeeded[i], snob.getStoneNeeded(i));
        }
        
        for (int i=1;i<ironNeeded.length;i++)
        {
            Assert.assertEquals(ironNeeded[i], snob.getIronNeeded(i));
        }
        
        for (int i=1;i<popNeededTotal.length;i++)
        {
            Assert.assertEquals(popNeededTotal[i], snob.getPopNeededTotal(i));
            Assert.assertEquals(popNeededTotal[i] - popNeededTotal[i-1], snob.getPopNeeded(i));
        }
        
//        for (int i=0;i<buildTimeNeeded.length;i++)
//        {
//            Assert.assertEquals(buildTimeNeeded[i][2], s.getBuildTimeNeeded(buildTimeNeeded[i][0], buildTimeNeeded[i][1]));
//        }
        
        for (int i=1;i<totalPoints.length;i++)
        {
            Assert.assertEquals(totalPoints[i], snob.getTotalPoints(i));
            Assert.assertEquals(totalPoints[i] - totalPoints[i-1], snob.getNewPoints(i));
        }
    }
}
