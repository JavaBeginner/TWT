/* TWT - Tribal Wars Toolkit is a framework for the game "Die St�mme"
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
package org.twt.objects.worlds;

import org.junit.Assert;
import org.junit.Test;

public class TestWorlds
{
    @Test
    public void testWorlds() throws Exception
    {
        String configFileData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?><config><speed>1.6</speed><unit_speed>0.625</unit_speed><moral>2</moral><build_queue>1</build_queue>" +
                                "<build><destroy>1</destroy></build><misc><log_losses>1</log_losses><kill_ranking>2</kill_ranking><tutorial>3</tutorial><millis_arrival>1</millis_arrival>" +
                                "<command_cancel_time>600</command_cancel_time><trade_cancel_time>300</trade_cancel_time><online_time>300</online_time><more_premium>1</more_premium> +" +
                                "<start_christmas_tree>1291590000</start_christmas_tree><end_christmas_tree>1294354740</end_christmas_tree></misc><newbie><days>5</days><ratio_days>60</ratio_days>" +
                                "<ratio>20</ratio></newbie><game><base_config>6</base_config><knight>2</knight><knight_new_items>1</knight_new_items><archer>1</archer><tech>2</tech><spy>10</spy>" +
                                "<farm_limit>0</farm_limit><church></church><fake_limit>1</fake_limit><barbarian_rise>0.003</barbarian_rise><barbarian_max_points>1500</barbarian_max_points>" +
                                "<hauls>1</hauls><hauls_base>1000</hauls_base><hauls_max>100000</hauls_max></game><buildings><base_setting>0</base_setting><hb_offset>15000</hb_offset><hb_factor>1000</hb_factor>" +
                                "<custom_main>-1</custom_main><custom_farm>-1</custom_farm><custom_storage>-1</custom_storage><custom_place>-1</custom_place><custom_barracks>-1</custom_barracks>" +
                                "<custom_church>-1</custom_church><custom_church_f>-1</custom_church_f><custom_smith>-1</custom_smith><custom_wood>-1</custom_wood><custom_stone>-1</custom_stone>" +
                                "<custom_iron>-1</custom_iron><custom_market>-1</custom_market><custom_stable>-1</custom_stable><custom_wall>-1</custom_wall><custom_garage>-1</custom_garage><custom_hide>-1</custom_hide>" +
                                "<custom_snob>-1</custom_snob><custom_statue>-1</custom_statue></buildings><snob><gold>1</gold><cheap_rebuild></cheap_rebuild><simple>1</simple><rise>2</rise><max_dist>70</max_dist>" +
                                "<factor>1</factor><coin_wood>28000</coin_wood><coin_stone>30000</coin_stone><coin_iron>25000</coin_iron></snob><ally><wars_enabled>1</wars_enabled><no_harm></no_harm>" +
                                "<no_other_support></no_other_support><no_leave></no_leave><no_admin></no_admin><limit>0</limit><fixed_allies>0</fixed_allies><diplomacy>1</diplomacy>" +
                                "<reservation_manager>1</reservation_manager><points_member_count>40</points_member_count><bypass_igm_block></bypass_igm_block><admin_bypass_igm_block></admin_bypass_igm_block>" +
                                "<wars_member_requirement>5</wars_member_requirement><wars_points_requirement>15000</wars_points_requirement><wars_autoaccept_days>7</wars_autoaccept_days></ally><win><check>0</check>" +
                                "<points>0</points><villages>0</villages><hours>0</hours></win><coord><map_size>1000</map_size><func>4</func><empty_villages>5</empty_villages><bonus_villages>10</bonus_villages>" +
                                "<bonus_new>1</bonus_new><inner>6000</inner><select_start>1</select_start><village_move_wait>336</village_move_wait><noble_restart>1</noble_restart><worldmap>1</worldmap>" +
                                "<legacy_scenery></legacy_scenery></coord><sitter><allow>1</allow></sitter><sleep><active>0</active><delay>60</delay><min>6</min><max>10</max><min_awake>12</min_awake>" +
                                "<max_awake>36</max_awake><warn_time>10</warn_time></sleep><night><active>1</active><start_hour>0</start_hour><end_hour>8</end_hour><def_factor>2</def_factor></night></config>";
        
        World w = new World("de68", configFileData);
        Assert.assertEquals("de68", w.getWorldId());
        Assert.assertEquals(1.6, w.getSpeed(), 0);
        Assert.assertEquals(0.625, w.getUnitSpeed(), 0);
        Assert.assertEquals(2, w.getMorale());
    }
}
