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
package org.twt.objects.units;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import junit.framework.Assert;

import org.junit.Test;
import org.twt.objects.villages.units.Unit;
import org.twt.objects.villages.units.Units;
import org.xml.sax.SAXException;

public class TestUnits
{
    @Test
    public void testUnits() throws XPathExpressionException, IOException, ParserConfigurationException, SAXException
    {
        Units u = new Units("http://de68.die-staemme.de");  //Test with the values of world de68 - world-4-style
        
        testSpearUnit(u);        
    }
    
    public void testSpearUnit(Units u)
    {
        Unit spear = u.getUnit("spear");
        Assert.assertEquals(50, spear.getWood());
        Assert.assertEquals(30, spear.getStone());
        Assert.assertEquals(10, spear.getIron());
        Assert.assertEquals(1, spear.getPop());
        Assert.assertEquals(18.000000000504, spear.getSpeed(), 0);
        Assert.assertEquals(10, spear.getAttack());
        Assert.assertEquals(15, spear.getDefense());
        Assert.assertEquals(45, spear.getDefenseCavalry());
        Assert.assertEquals(20, spear.getDefenseArcher());
        Assert.assertEquals(25, spear.getCarry());
        Assert.assertEquals(637.5, spear.getBuildTime(), 0);
    }
}
