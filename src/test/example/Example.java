/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package test.example;

import com.example.matrix.components.frame.MatrixMainFrame;
import com.example.matrix.components.menu.MatrixMenu;
import com.example.matrix.components.menu.MatrixMenuBar;
import com.example.matrix.components.menu.MatrixMenuItems;
import com.example.matrix.components.panel.MatrixMainPanel;
import com.example.matrix.components.panel.MatrixPanel;
import com.example.matrix.parameter.MatrixFrameParameter;

import javax.swing.*;
import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class Example {

    public static void main(String[] args) {

        // メニュー作成
        LinkedList<MatrixMenu> menuList = new LinkedList<>();

        // メニュー１
        LinkedList<MenuItem> itemList1 = new LinkedList<>();
        itemList1.add(new MenuItem("Menu1"));
        itemList1.add(new MenuItem("Menu2"));
        itemList1.add(new MenuItem("Menu3"));
        MatrixMenuItems mnItems1 = new MatrixMenuItems(itemList1);

        LinkedList<MenuItem> itemList2 = new LinkedList<>();
        itemList2.add(new MenuItem("Content1"));
        itemList2.add(new MenuItem("Content2"));
        MatrixMenuItems mnItems2 = new MatrixMenuItems(itemList2);

        LinkedList<MatrixMenuItems> menuItemsList = new LinkedList<>();
        menuItemsList.add(mnItems1);
        menuItemsList.add(mnItems2);

        // メニューリストにメニュー１を追加
        MatrixMenu menu1 = new MatrixMenu(menuItemsList);
        menuList.add(menu1);

        // パラメータ作成
        MatrixFrameParameter param = new MatrixFrameParameter();
        param.setTitle("Example Frame");
        param.setDimension(new Dimension(640, 480));
        param.setMenuBar(new MatrixMenuBar(menuList));
        param.setMenuVisible(true);

        // フレーム作成
        ExampleFrame frame = new ExampleFrame(param);

    }

}

class ExampleFrame extends MatrixMainFrame {

    /**
     * コンストラクタです。
     *
     * @param parameter
     */
    public ExampleFrame(MatrixFrameParameter parameter) {
        super(parameter);
        getPnlMain().add(new JLabel("Welcome to Java Frame APP!!!"));
        getPnlMain().add(new JButton("SAMPLE BUTTON"));
        // 可視設定
        setVisible(true);
    }

}
