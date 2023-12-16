package lutica_oscevent_adapter

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import tornadofx.*;

class App {
    val greeting: String
        get() {
            return "Hello World????!"
        }
}

fun main(args:Array<String>){
    println(App().greeting)
}