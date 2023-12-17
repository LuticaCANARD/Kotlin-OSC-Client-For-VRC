package lutica_oscevent_adapter

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import tornadofx.*;


class MyView:View(){
    override val root = vbox{
        button("aaaa")
        label("ffff")
    }
}
class MainView :App(MyView::class)

fun main(args:Array<String>){
    launch<MainView>(args)
}