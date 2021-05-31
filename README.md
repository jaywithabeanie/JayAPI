<!-- Introduction -->
# JayAPI
Spigot API for Minecraft 1.8


<!-- Content Table / Managers -->
## Managers
* [Config](#config)
* [Inventory](#inventory)
* [ItemStack](#itemstack)


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
