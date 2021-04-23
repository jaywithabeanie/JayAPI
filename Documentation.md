# JayAPI - Documentation

## Content Table
* [Item Manager](#item-manager)
* [Inventory Manager](#inventory-manager)

--------------
## `item_manager`

* ### `createInventoryItem(material, amount, type, displayName, lore)`
Type | Description
------------ | -------------
**Method Type** | `ItemStack` Method
**Method Info** | Creates an `ItemStack` to be used inside of an `Inventory`
**Parameter Info**<br>‎<br>‎<br>‎<br>‎ | • `material - Material`: `Material` of the `ItemStack`<br>• `amount - Integer`: Amount of the `Item` within the `ItemStack`<br>• `type`: `Data` type of the `ItemStack` (used for colored wool, durability on tools, etc.)<br>• `displayName`: Custom name displayed for the `ItemStack`<br>• `lore`: `Lore` of the `ItemStack` (use `\n` to add more lines)

--------------

## `inventory_manager`

* ### `createInventory(rowCount, title,)`
