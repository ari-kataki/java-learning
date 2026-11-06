# 01 - digital coding

My first Java exercises of the course.

- `src/School`: classes `SchoolClass`, `Student`, `Teacher`, `Subject`. `ITS.java` builds two classes, writes them to `elenco_classi.json` with Gson (`Utils.java`) and reads them back. A lot of lesson examples are left commented out in `ITS.java`.
- `src/School/Main.java`: console menu to add students to an `ArrayList` and show them.
- `src/School/StudentHashTable.java`: a student table with a `HashMap` and the matricola as key (not used by `Main`).
- `src/Animal`: `Animal`, `Duck`, `Fish`, `Zebra`, an inheritance exercise (not used by `ITS`).

Stack: Java, Gson.

Run: Gson jar on the classpath, compile `src/School/*.java` and `src/Animal/*.java`, run `ITS` or `Main`.

Known issues: `Main.java` and `StudentHashTable.java` were written for an older `Student` class (with `matr`), I changed `StudentHashTable` a little to use `getId()` and the name + surname so it compiles with the later `Student`. Both had a `package School;` line that the other files did not have, I removed it. The class names in the prints still say `School.Student`.
