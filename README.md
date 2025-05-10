| **Class**                                                          | **Role**                                                                                                                         |
| ------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------- |
| `Item.java`                                                        | A base class representing a generic item. Includes fields like `name`, `price`, and `quantity`.                           |
| `RefrigeratedItem.java`                                            | A subclass of `Item` with additional fields like `temperature`. It overrides methods for enhanced behavior.                      |
| `Warehouse.java`                                                   | Manages a list or array of `Item` objects (both regular and refrigerated). Includes methods like `addItem`, `getInventory`, etc. |
| `HW03CompileTest.java`                                             | Ensures the whole program compiles and runs correctly.                                                                           |
| `ItemTest.java`, `RefrigeratedItemTest.java`, `WarehouseTest.java` | Test classes verifying the logic in each respective class. Uses `System.out` or assertions to check correctness.          |
