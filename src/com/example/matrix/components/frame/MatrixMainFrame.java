/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.frame;

import java.awt.BorderLayout;

import com.example.matrix.components.panel.MatrixMainPanel;
import com.example.matrix.parameter.MatrixFrameParameter;
import com.example.matrix.components.panel.MatrixBottomPanel;
import com.example.matrix.components.panel.MatrixNorthPanel;

public class MatrixMainFrame extends MatrixFrame {

	/** シリアルバージョン */
	private static final long serialVersionUID = -6167993083319113359L;

	/** ノースパネル */
	private MatrixNorthPanel pnlNorth;

	/** メインパネル */
	private MatrixMainPanel pnlMain;

	/** ボトムパネル */
	private MatrixBottomPanel pnlBottm;

	/**
	 * コンストラクタです。
	 *
	 * @param パラメタータを渡します。
	 */
	public MatrixMainFrame(MatrixFrameParameter parameter) {
		super(parameter);
	}

	/**
	 * コンポーネント構築
	 */
	@Override
	public void construct() {
		getContentPane().setBackground(this.parameter.getBackgroundColor());
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPnlNorth(), BorderLayout.NORTH);
		getContentPane().add(getPnlMain(), BorderLayout.CENTER);
		getContentPane().add(getPnlBottom(), BorderLayout.SOUTH);
	}

	// ==========================================================================================================
	// 部品定義
	// ==========================================================================================================

	/**
	 * メインパネルを初期化します。
	 *
	 * @return メインパネルを返却します。
	 */
	public MatrixMainPanel getPnlMain() {
		if (pnlMain == null) {
			pnlMain = new MatrixMainPanel();
		}
		return pnlMain;
	}

	/**
	 * 上部パネルを初期化します。
	 *
	 * @return 上部パネルを返却します。
	 */
	public MatrixNorthPanel getPnlNorth() {
		if (pnlNorth == null) {
			pnlNorth = new MatrixNorthPanel();
		}
		return pnlNorth;
	}

	/**
	 * 下部パネルを初期化します。
	 *
	 * @return 下部パネルを返却します。
	 */
	public MatrixBottomPanel getPnlBottom() {
		if (pnlBottm == null) {
			pnlBottm = new MatrixBottomPanel();
		}
		return pnlBottm;
	}

}
