package com.cmlanche.javafx.layouts.stackpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by cmlanche on 2017/12/2.
 *
 */
public class StackPaneTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("StackPane测试");
        // 使用绝对路径来获取你的fxml文件路径，不依赖于某个类的位置
        // Parent root = FXMLLoader.load(getClass().getResource("/com/cmlanche/javafx/layouts/stackpane/stackpanetest.fxml"));
        // 或者使用相对路径，它是相对你的class的所在位置而言的，依赖于你的加载类
        Parent root = FXMLLoader.load(getClass().getResource("stackpanetest.fxml"));
        // 给对话框Stage构建一个场景Scene
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        // 设置让对话框处于屏幕中间
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
