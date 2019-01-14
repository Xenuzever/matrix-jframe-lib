/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.panel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

import com.example.matrix.constant.copyright.MatrixCopyrightConstant;

import java.awt.Color;

public class MatrixBottomPanel extends MatrixPanel {

	/** デフォルトシリアルバージョン */
	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタです。
	 */
	public MatrixBottomPanel() {
		setBackground(Color.WHITE);
		setBorder(new EmptyBorder(0, 0, 10, 0));
		JLabel lblCopyright = new JLabel(MatrixCopyrightConstant.INITIALIZE);
		lblCopyright.setForeground(Color.DARK_GRAY);
		lblCopyright.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		add(lblCopyright);
	}

}
