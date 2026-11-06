# 03 - digital library

A small JavaFX window to add novels (title, author, year, genre), see the list and save it to `collection.txt`. `Book` is an abstract class with two children, `Novel` and `Essay`; `CollectionManager` keeps the list in a static `ArrayList`.

Stack: Java, JavaFX (FXML).

Run: JavaFX on the module path (see the main README), run `com.library.app.Main`. The file is saved in the folder you run it from.

Known issues:
- Only novels can be added, `Essay` is not used by the window.
- If the year is not a number it is saved as 0 without telling the user.
- The list is only in memory, `collection.txt` is never read back.
- The list is built with `+=` on a `String`, fine for a lesson.
