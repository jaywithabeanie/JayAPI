<!-- Introduction -->
# JayAPI
Spigot API for Minecraft 1.8


<!-- Content Table / Managers -->
## Managers
* [Config](#config)
* [Inventory](#inventory)
* [ItemStack](#itemstack)
* [NPC](#npc)


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
