package me.jayy.jayapi.Managers.Tablist;

import me.jayy.jayapi.Managers.Tablist.Utils.setTeam;
import me.jayy.jayapi.Managers.Tablist.Utils.updateTabList;
import me.jayy.jayapi.Managers.Tablist.Utils.updateTeam;
import org.bukkit.entity.Player;


/** @ClassType Manager Class */
/** @ClassInfo Manages Tab Lists */

public class TabList_Manager {


    /** ----------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                           */
    /** @UtilInfo       Updates the Tab List for a Player                                                                                   */
    /** @ParameterInfo  • player: Player to setScoreboard the Tab List for                                                                         */
    /**                 • headerString: Text for the Header                                                                                 */
    /**                 • headerColor: Color for the Header                                                                                 */
    /**                 • footerString: Text for the Footer                                                                                 */
    /**                 • footerColor: Color for the Footer                                                                                 */
    /** ----------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                     */
    public static void updateTabList(Player player, String headerString, String headerColor, String footerString, String footerColor) {
        updateTabList.updateTabList(player, headerString, headerColor, footerString, footerColor);
    }
    /**                                                                                                                                     */
    /** ----------------------------------------------------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                     */
    /** @UtilInfo       Sets the Team of a Player                                                     */
    /** @ParameterInfo  • player: Player to change the Team of                                        */
    /**                 • teamName: Name of the Team of the Player                                    */
    /** --------------------------------------------------------------------------------------------- */
    /**                                                                                               */
    public static void setTeam(Player player, String teamName) {
        setTeam.setTeam(player, teamName);
    }
    /**                                                                                               */
    /** --------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                           */
    /** @UtilInfo       Updates the Prefix and/or Suffix of a Team                          */
    /** @ParameterInfo  • teamName: Name of the Team to change the Prefix and/or Suffix of  */
    /**                 • prefix: Prefix of the Team (set to "/" to only change the Suffix) */
    /**                 • suffix: Suffix of the Team (set to "/" to only change the Prefix) */
    /** ----------------------------------------------------------------------------------- */
    /**                                                                                     */
    public static void updateTeam(String teamName, String prefix, String suffix) {
        updateTeam.updateTeam(teamName, prefix, suffix);
    }
    /**                                                                                     */
    /** ----------------------------------------------------------------------------------- */


}
