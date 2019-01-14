/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.menu;

import java.util.LinkedList;

import javax.swing.JMenu;

public class MatrixMenu extends JMenu {

	/** デフォルトシリアルバージョン */
	private static final long serialVersionUID = 1L;

	/** メニューリスト */
	private LinkedList<MatrixMenuItems> menuItemList;

	/**
	 * コンストラクタです。
	 * @param menuList メニュー
	 */
	public MatrixMenu(LinkedList<MatrixMenuItems> menuItemList) {
		this.menuItemList = menuItemList;
	}

	/**
	 * メニューアイテムリストを取得します。
	 * @return メニューアイテムリストを返却します。
	 */
	public LinkedList<MatrixMenuItems> getMenuItemList() {
		return this.menuItemList;
	}

}
