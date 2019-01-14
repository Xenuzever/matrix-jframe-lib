/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.interfaces;

import com.example.matrix.logic.MatrixLogic;

public interface MatrixComponentInterface {

	/**
	 * ロジックを取得します。
	 * @return ロジックを返却します。
	 */
	public abstract MatrixLogic getLogic();

}
