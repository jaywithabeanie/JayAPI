<!-- Introduction -->
# JayAPI
Spigot API for Minecraft 1.8


<!-- Content Table / Managers -->
## Managers
* [BossBar](#bossbar)
* [Config](#config)
* [Inventory](#inventory)
* [ItemStack](#itemstack)
* [Message](#message)
* [NPC](#npc)
* [Player](#player)
* [Rank](#rank)
* [Scoreboard](#scoreboard)
* [TabList](#tablist)
* [Title](#title)
* [World](#world)


<!-- BossBar -->
## BossBar
Name | Type | Description
---- | ---- | -----------
`BossBar_Manager` | Manager | Manages Boss Bars
`removeBossBar` | Util | Removes the Boss Bar for a Player
`sendBossBar` | Util | Sends a Boss Bar to a Player
`Bar` | Assist | Assists with the creation and removal of Boss Bars

<!-- Config -->
## Config
Name | Type | Description
---- | ---- | -----------
`Config_Manager` | Manager | Manages config Files
`createConfig` | Util | Creates a config File
`getConfig` | Util | Returns a config File located in a given path
`saveConfig` | Util | Saves a config File in a given path

<!-- Inventory -->
## Inventory
Name | Type | Description
---- | ---- | -----------
`Inventory_Manager` | Manager | Manages Inventories
`createInventory` | Util | Creates an Inventory with given data
   
<!-- ItemStack -->
## ItemStack
Name | Type | Description
---- | ---- | -----------
`ItemStack_Manager` | Manager | Manages ItemStacks
`addEnchantments` | Util | Adds given Enchantments to an ItemStack
`addItemFlags` | Util | Adds given ItemFlags to an ItemStack
`createBookItemStack` | Util | Creates an ItemStack for a Book with given data
`createItemStack` | Util | Creates an ItemStack with given data
`createLeatherArmorItemStack` | Util | Creates an ItemStack for Leather Armor with given data
`createPotionItemStack` | Util | Creates an ItemStack for a Potion with given data
`createSkullItemStack` | Util | Creates an ItemStack for a Skull with given data

<!-- Message -->
## Message
Name | Type | Description
---- | ---- | -----------
`Message_Manager` | Manager | Manages Messages
`centerMessage` | Util | Returns a centered Message
`createClickableMessage` | Util | Returns a Clickable Message which runs a Command or opens a URL
`sendActionBarMessage` | Util | Sends a Message in the Action Bar
`sendMessage` | Util | Sends a Message to a World
`MessageCenter` | Enum | Contains and Manages character data to center Messages

<!-- NPC -->
## NPC
Name | Type | Description
---- | ---- | -----------
`NPC_Manager` | Manager | Manages NPCs
`createNPC` | Util | Creates an NPC with given data
`getLocation` | Util | Returns an NPC's Location
`getNPCs` | Util | Returns a list of all NPCs
`hideNPCs` | Util | Hides all NPCs for a Player
`showNPCs` | Util | Shows all NPCs in the same World to a Player
`PacketReader` | Event | Deals with Packets regarding NPCs
`RightClickNPCEvent` | Event | Creates the RightClickNPC Event
`PlayerJoin` | Event | Injects the PacketReader data to a Player upon joining the server
`PlayerQuit` | Event | Uninjects the PacketReader data to a Player upon leaving the server

<!-- Player -->
## Player
Name | Type | Description
---- | ---- | -----------
`Player_Manager` | Manager | Manages Players
`getFirstDateJoined` | Util | Returns the first Time and Date at which a Player first joined the server
`getLastDateJoined` | Util | Returns the last Time and Date at which a Player joined the server
`getName` | Util | Returns the name of a Player
`getPermissions` | Util | Returns a list of all Permissions of a Player
`getRank` | Util | Returns the Rank of a Player
`hasPermission(s)` | Util | Checks whether the Player has one or more Permissions
`hasRank` | Util | Checks whether the Player has a Rank
`isStaff` | Util | Checks whether a Player is considered Staff
`setRank` | Util | Sets the Rank of a Player
`PlayerJoin` | Event | Creates & Updates the Player config File upon joining the server

<!-- Rank -->
## Rank
Name | Type | Description
---- | ---- | -----------
`Rank_Manager` | Manager | Manages Ranks
`addRank` | Util | Adds a Rank with given data
`getPrefix` | Util | Returns the Prefix of a Rank
`getRankPermissions` | Util | Returns the Permissions of a Rank
`getSubRanks` | Util | Returns the SubRanks of a Rank
`grantRankPermission(s)` | Util | Grants one or more Permissions to a Rank
`hasPermission(s)` | Util | Checks whether a Rank has the given Permission(s)
`isStaff` | Util | Checks whether a Rank is considered Staff
`removeRank` | Util | Removes a Rank
`removeRankPermission(s)` | Util | Removes one or more Permissions from a Rank
`setPrefix` | Util | Sets the Prefix of a Rank
`setStaff` | Util | Changes whether a Rank is considered Staff
`setSubRanks` | Util | Sets the SubRanks of a Rank (inherits Permissions)

<!-- Scoreboard -->
## Scoreboard
Name | Type | Description
---- | ---- | -----------
`Scoreboard_Manager` | Manager | Manages Scoreboards
`addLine` | Util | Adds a line to the Scoreboard of a Player
`createScoreboard` | Util | Creates a Scoreboard from given data
`removeLine` | Util | Removes a line of text from the Scoreboard of a Player
`removeScoreboard` | Util | Removes the Scoreboard of a Player
`setScoreboard` | Util | Sets the Scoreboard of a Player
`setTitle` | Util | Sets the Title of a Scoreboard

<!-- TabList -->
## TabList
Name | Type | Description
---- | ---- | -----------
`TabList_Manager` | Manager | Manages Tab Lists
`updateTabList` | Util | Updates the Tab List for a Player
`setTeam` | Util | Sets the Team of a Player
`updateTeam` | Util | Updates the Prefix and/or Suffix of a Team

<!-- Title -->
## Title
Name | Type | Description
---- | ---- | -----------
`Title_Manager` | Manager | Manages Titles
`sendTitle` | Util | Displays a Title to a Player

<!-- World -->
## World
Name | Type | Description
---- | ---- | -----------
`World_Manager` | Manager | Manages Worlds
`loadWorld` | Util | Changes a Game Rule for a World
`setBorder` | Util | Sets the Border of a World
`setDifficulty` | Util | Sets the Difficulty of a World
`setGameRule` | Util | Changes a Game Rule for a World
`setSpawn` | Util | Sets the Spawn of a World
`setTime` | Util | Sets the Time of a World
`setWeather` | Util | Sets the Weather of a World
`teleportToWorld` | Util | Teleports a Player to a World
`unloadWorld` | Util | Unloads a World
