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

import javax.swing.JMenuBar;
import com.example.matrix.components.interfaces.MatrixComponentInterface;
import com.example.matrix.logic.MatrixLogic;

public class MatrixMenuBar extends JMenuBar implements MatrixComponentInterface {

	/** デフォルトシリアルバージョン */
	private static final long serialVersionUID = 1L;

	/**　メニューリスト */
	private LinkedList<MatrixMenu> menuList;

	/**
	 * コンストラクタです。
	 */
	public MatrixMenuBar(LinkedList<MatrixMenu> menuList) {
		this.menuList = menuList;
	}

	/**
	 * 初期化を行います。
	 */
	public void initialize() {
		setBorderPainted(false);
		setOpaque(true);
		construct();
	}

	/**
	 * メニュー構築を行います。
	 */
	protected void construct() {
		for (int i = 0; i < menuList.size(); i++) {
			add(menuList.get(i));
		}
	}

	/**
	 * ロジックを取得します。
	 * @return ロジックを返却します。
	 */
	public MatrixLogic getLogic() {
		return MatrixLogic.getLogic();
	}

}
