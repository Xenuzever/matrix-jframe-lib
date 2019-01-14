/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.menu;

import java.awt.MenuItem;
import java.util.LinkedList;

public class MatrixMenuItems {

	/** メニューアイテムリスト */
	private LinkedList<MenuItem> menuItemList;

	/**
	 * コンストラクタです。
	 * @param menuItems メニューアイテムを渡します。
	 */
	public MatrixMenuItems(LinkedList<MenuItem> menuItems) {
		this.menuItemList = menuItems;
	}

	/**
	 * メニューアイテムを取得します。
	 * @return メニューアイテムを返却します。
	 */
	public LinkedList<MenuItem> getMenuItemList() {
		return this.menuItemList;
	}

}
