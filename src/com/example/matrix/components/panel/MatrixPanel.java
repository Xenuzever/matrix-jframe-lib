/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.panel;

import javax.swing.JPanel;

import com.example.matrix.logic.MatrixLogic;
import com.example.matrix.components.interfaces.MatrixComponentInterface;

public class MatrixPanel extends JPanel implements MatrixComponentInterface {

	/** デフォルトシリアルバージョン */
	private static final long serialVersionUID = 1L;

	@Override
	public MatrixLogic getLogic() {
		return MatrixLogic.getLogic();
	}

}
