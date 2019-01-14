/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.logic;

import com.example.matrix.parameter.MatrixFrameParameter;
import com.example.matrix.components.frame.MatrixMainFrame;

public class MatrixLogic {

	/** ロジック */
	private static MatrixLogic logic;

	/** メインフレーム */
	private static MatrixMainFrame mainFrame;

	public static void initialize(MatrixFrameParameter mainFrameParameter) {
		mainFrame = new MatrixMainFrame(mainFrameParameter);
	}

	/**
	 * システムの統括情報を取得します。
	 * @return システムの統括情報を返却します。
	 */
	public static MatrixLogic getLogic() {
		return logic;
	}

	/**
	 * メイン画面を取得します。
	 * @return メイン画面を返却します。
	 */
	public static MatrixMainFrame getMainFrame() {
		return mainFrame;
	}

}
