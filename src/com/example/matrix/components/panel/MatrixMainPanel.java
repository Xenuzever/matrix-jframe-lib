/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.panel;

import javax.swing.border.TitledBorder;


import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;

public class MatrixMainPanel extends MatrixPanel {

	/** デフォルトシリアルバージョン */
	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタです。
	 * <BR><BR>
	 */
	public MatrixMainPanel() {
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		setBorder(null);
		setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), 
				"Contents", TitledBorder.LEADING,
				TitledBorder.ABOVE_TOP, null, new Color(64, 64, 64)));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		construct();
	}

	/**
	 * 画面構築を行います。
	 */
	protected void construct(){
		//
	}

}
