# 02 - javafx login

First JavaFX app: a login window (`login.fxml`) with a controller that checks that the fields are not empty, compares them with a hardcoded user and shows an alert. The button does a small scale animation when clicked.

Stack: Java, JavaFX (FXML).

Run: JavaFX on the module path (see the main README), run `com.academy.Main`.

Known issues:
- The user and password are written in `LoginController` (`admin` / `1234`), it is only a test.
- The first version had the logo of the course on top of the form. I took the image out (it is not mine) and removed it from `login.fxml`.
- In my version the window loaded `/com/its/umbria/com.academy/login.fxml` and the FXML pointed to `com.its.umbria.academy.LoginController`, left from moving the files around. I fixed both paths so the window opens.
