# Java learning

Small Java programs I wrote while learning Java at the ITS course, in the order I made them (Mar - Apr 2026). Each folder is a separate IntelliJ project, there is no build file. The folder names start with the order and the month.

| Folder | Date | What it is | What I was learning |
|---|---|---|---|
| [01-2026-03-digital-coding](01-2026-03-digital-coding) | Mar 2026 | Console school program (classes, students, teachers, subjects) that writes and reads a JSON file, plus a small menu with a student list and a HashMap, plus an animal inheritance exercise | Classes and getters/setters, `ArrayList`, `HashMap`, inheritance, Gson |
| [02-2026-03-javafx-login](02-2026-03-javafx-login) | Mar 2026 | My first JavaFX window: a login screen made with FXML | JavaFX, FXML and controllers, `@FXML`, alerts, a small animation |
| [03-2026-04-digital-library](03-2026-04-digital-library) | Apr 2026 | A "digital library" window: form to add a novel, list of books, save to a text file | Abstract class (`Book`) with `Novel` and `Essay`, JavaFX + FXML, writing a text file |

`01` is an earlier stage of [school-management-java](https://github.com/ari-kataki/school-management-java): same classes, but before the logger, the custom exception and the file renames. I kept it because it shows the step before.

## How to run

Everything was written in IntelliJ with JDK 25 and (for 02 and 03) the JavaFX SDK. No jars or SDK are in this repo.

- 01: put the Gson jar on the classpath, compile `src` and run `ITS` (JSON round trip) or `Main` (menu). The JSON file is written in the current folder.
- 02 and 03: add the JavaFX `lib` folder as a library and use the VM options `--module-path <path-to-javafx>/lib --add-modules javafx.controls,javafx.fxml`. Run `com.academy.Main` (02) or `com.library.app.Main` (03). The FXML file has to be copied next to the compiled classes, IntelliJ does that for you.

## Notes

These are learning exercises, so a lot of things are rough (comments left from lessons, code that is written in a very simple way). I did not clean them up.

## Known issues

- 02 has the demo login hardcoded in `LoginController` (`admin` / `1234`). It is a practice login, not a real one.
- 03 only adds novels (the button says so), the `Essay` class is never used by the window.
- Names of the people in the sample data of 01 are made up.

## Left out

- Compiled output, `.idea` files, zips with copies of the sources.
- The course logos used in the first login screen (not mine), the login in 02 works without them.
- The JavaFX SDK, the IntelliJ template project (`HelloApplication`) and the Maven wrapper that were next to the library app.
