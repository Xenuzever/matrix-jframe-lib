/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.components.frame;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import com.example.matrix.parameter.MatrixFrameParameter;
import com.example.matrix.components.menu.MatrixMenuBar;

abstract class MatrixFrame extends JFrame implements ComponentListener, MouseListener, MouseMotionListener {

	/** デフォルトシリアルバージョン */
	private static final long serialVersionUID = 1L;

	/** パラメータ */
	protected MatrixFrameParameter parameter;

	/** メニュー */
	private MatrixMenuBar menu;

	/** ポインタ */
	private Point mouseDownCompCoords;

	/**
	 * コンストラクタです。
	 * @param パラメタータを渡します。
	 */
	public MatrixFrame(MatrixFrameParameter parameter) {
		initialize(parameter);
	}

	/**
	 * 初期化を行います。
	 */
	private void initialize(MatrixFrameParameter parameter) {
		this.parameter = parameter;
		// タイトルの設定
		setTitle(this.parameter.getTitle());
		// メニューの設定
		if (this.parameter.isMenuVisible()) setMenu(this.parameter.getMenuBar());
		// サイズの設定
		setSize(this.parameter.getDimension());
		// 場所の設定
		setLocation(this.parameter.getLocationX(), this.parameter.getLocationY());
		// サイズ変更可否の設定
		setResizable(this.parameter.isResizable());
		// デコレーション設定
		setUndecorated(this.parameter.isUndecorated());
		if (this.parameter.isUndecorated()) setBackground(this.parameter.getBackgroundColor());
		// 相対場所設定
		setLocationRelativeTo(this.parameter.getLocationRelativeTo());
		// 最小サイズ設定
		setMinimumSize(new Dimension(550, 500));
		// リスナ設定
		setListener();
		// 構築
		construct();
		// クローズオペレーション設定
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * コンポーネントの構築を行います。
	 */
	public abstract void construct();

	/**
	 * メニューを設定します。
	 * @param matrixMenu メニューを渡します。
	 */
	public void setMenu(MatrixMenuBar matrixMenu) {
		setJMenuBar(matrixMenu);
	}

	// ========================================
	// コンポネント
	// ========================================

	/**
	 * メニューを初期化します。
	 * @return メニューを返却します。
	 */
	public MatrixMenuBar getMenu() {
		if (menu == null) {
			menu = this.parameter.getMenuBar();
			menu.setBackground(this.parameter.getBackgroundColor());
		}
		return menu;
	}

	// ========================================
	// リスナ
	// ========================================

	public void setListener() {
		// リスナを付加
		addComponentListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	@Override
	public void componentResized(ComponentEvent e) {
	}

	@Override
	public void componentMoved(ComponentEvent e) {
	}

	@Override
	public void componentShown(ComponentEvent e) {
	}

	@Override
	public void componentHidden(ComponentEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseDownCompCoords = null;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseDownCompCoords = e.getPoint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point currCoords = e.getLocationOnScreen();
		setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
	}

}
