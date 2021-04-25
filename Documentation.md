# JayAPI - Documentation

## Content Table
* [Item Manager](#item_manager)
* [Inventory Manager](#inventory_manager)

--------------

## `config_manager`

* ### `createConfig(folderPath, fileName)`

Type | Description
------------ | -------------
**Method Type** | `Void` method
**Method Info** | Creates a config `File`
**Parameter Info**<br>‎ | • `directoryPath (String)`: Path the config `File` will be created in (use `.` to separate directories - eg. `".ExamplePlugin.ExampleFolder."`)<br>• `fileName (String)`: Name the config `File` will be given

* ### `getConfig(folderPath, fileName)` 

Type | Description
------------ | -------------
**Method Type** | `FileConfiguration` method
**Method Info** | Returns a config `File` located in a given path
**Parameter Info**<br>‎ | • `directoryPath (String)`: Path the config `File` is located in (use `.` to separate directories - eg. `".ExamplePlugin.ExampleFolder."`)<br>• `fileName (String)`: Name of the config `File`

* ### `saveConfig(folderPath, fileName, configFile)` 

Type | Description
------------ | -------------
**Method Type** | `Void` method
**Method Info** | Creates a config `File`
**Parameter Info**<br>‎ | • `directoryPath`: Path the config `File` will be saved in (use `.` to separate directories - eg. `".ExamplePlugin.ExampleFolder."`)<br>• `fileName (String)`: Name the config `File` will be saved as<br>• `yamlConfiguration`: `YamlConfiguration File` to save

--------------

## `inventory_manager`

* ### `createInventory(rowCount, title, inventorySlot_itemData)`

Type | Description
------------ | -------------
**Method Type** | `Inventory` method
**Method Info** | Creates an `Inventory`
**Parameter Info**<br>‎<br>‎ | • `rowCount (Integer)`: Amount of rows in the `Inventory`<br>• `title (String)`: `Title` of the `Inventory`<br>• `inventorySlot_itemData (HashMap)`: `HashMap` containing all the [data](#createinventoryitemmaterial-amount-type-displayname-lore) regarding the `Item` for the corresponding `Inventory` slot (as `Strings`)

--------------

## `item_manager`

* ### `createInventoryItem(material, amount, type, displayName, lore)`

Type | Description
------------ | -------------
**Method Type** | `ItemStack` method
**Method Info** | Creates an `ItemStack` to be used inside of an `Inventory`
**Parameter Info**<br>‎<br>‎<br>‎<br>‎ | • `material (Material)`: `Material` of the `ItemStack`<br>• `amount (Integer)`: Amount of the `Item` within the `ItemStack`<br>• `type (Integer)`: `Data` type of the `ItemStack` (used for colored wool, durability on tools, etc.)<br>• `displayName (String)`: Custom name displayed for the `ItemStack`<br>• `lore (String)`: `Lore` of the `ItemStack` (use `\n` to add more lines)

--------------
