# JayAPI - Documentation

## Content Table
* [Item Manager](#item_manager)
* [Inventory Manager](#inventory_manager)

--------------
## `item_manager`

* ### `createInventoryItem(material, amount, type, displayName, lore)`

Type | Description
------------ | -------------
**Method Type** | `ItemStack` method
**Method Info** | Creates an `ItemStack` to be used inside of an `Inventory`
**Parameter Info**<br>‎<br>‎<br>‎<br>‎ | • `material`: `Material` of the `ItemStack`<br>• `amount`: Amount of the `Item` within the `ItemStack`<br>• `type`: `Data` type of the `ItemStack` (used for colored wool, durability on tools, etc.)<br>• `displayName`: Custom name displayed for the `ItemStack`<br>• `lore`: `Lore` of the `ItemStack` (use `\n` to add more lines)

--------------

## `inventory_manager`

* ### `createInventory(rowCount, title, inventorySlot_itemData)`

Type | Description
------------ | -------------
**Method Type** | `Inventory` method
**Method Info** | Creates an `Inventory`
**Parameter Info**<br>‎<br>‎<br>‎<br>‎ | • `rowCount`: Amount of rows in the `Inventory`<br>• `title`: `Title` of the `Inventory`<br>• `inventorySlot_itemData`: `HashMap` containing all the data regarding the `Item` for the corresponding `Inventory` slot (as Strings)<br>• `displayName`: Custom name displayed for the `ItemStack`<br>• `lore`: `Lore` of the `ItemStack` (use `\n` to add more lines)

--------------
