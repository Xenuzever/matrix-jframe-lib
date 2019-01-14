/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.panel;

import java.awt.Color;

import javax.swing.BoxLayout;

public class MatrixNorthPanel extends MatrixPanel {

	/** デフォルトシリアルバージョン */
	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタです。
	 */
	public MatrixNorthPanel() {
		initialize();
	}

	/**
	 * 初期化を行います。
	 */
	private void initialize() {
		setBackground(Color.WHITE);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}

}
