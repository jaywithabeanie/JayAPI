<!-- Introduction -->
# JayAPI
Spigot API for Minecraft 1.8


<!-- Content Table / Managers -->
## Managers
* [Config](#config)
* [Inventory](#inventory)
* [ItemStack](#itemstack)
* [NPC](#npc)
* [Player](#player)
* [Rank](#rank)
* [Title](#title)


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

<!-- NPC -->
## NPC
Name | Type | Description
---- | ---- | -----------
`NPC_Manager` | Manager | Manages NPCs
`createNPC` | Util | Creates an NPC with given data
`getLocation` | Util | Returns an NPC's Location
`getNPCs` | Util | Returns a list of all NPCs
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
`setSubRanks` | Util | Sets the Sub-Ranks of a Rank (inherits Permissions)

<!-- Title -->
## Title
Name | Type | Description
---- | ---- | -----------
`Title_Manager` | Manager | Manages Titles
`sendTitle` | Util | Displays a Title to a Player
