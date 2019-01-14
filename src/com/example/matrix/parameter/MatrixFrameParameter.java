/*
 *
 *   Copyright 2018 Xena.
 *
 *   This software is released under the MIT License.
 *   http://opensource.org/licenses/mit-license.php
 *
 */

package com.example.matrix.parameter;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import com.example.matrix.components.menu.MatrixMenuBar;


public class MatrixFrameParameter {

	/** タイトル */
	private String title = "NO TITLE";

	/** メニューの可視 */
	private boolean isMenuVisible = false;

	/** メニュー */
	private MatrixMenuBar menuBar;

	/** デコレーション */
	private boolean isUndecorated = false;

	/** 透過度 */
	private int transparencyRate = 0;

	/** 背景色 */
	private Color backgroundColor = new Color(255, 255, 255, 255);

	/** サイズ */
	private Dimension dimension = new Dimension(100, 100);

	/** X座標 */
	private int locationX = 0;

	/** Y座標 */
	private int locationY = 0;

	/** 初期位置 */
	private Component locationRelativeTo = null;

	/** 可変可能 */
	private boolean isResizable = true;

	/**
	 * タイトルを設定します。
	 * <BR><BR>
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * メニューバーを設定します。
	 * <BR><BR>
	 * @param menuBar
	 */
	public void setMenuBar(MatrixMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	/**
	 * 独自デコレーションの可否を設定します。
	 * <BR><BR>
	 * @param isUndecorated 独自デコレーションの可否（可能の場合true）を渡します。
	 */
	public void setUndecorated(boolean isUndecorated) {
		this.isUndecorated = isUndecorated;
	}

	/**
	 * メニューの可視可否を設定します。
	 * <BR><BR>
	 * @param isMenuVisible メニューの可視可否を渡します。
	 */
	public void setMenuVisible(boolean isMenuVisible) {
		this.isMenuVisible = isMenuVisible;
	}

	/**
	 * 透過度を設定します。
	 * @param transparencyRate 透過度を渡します。
	 */
	public void setTransparencyRate(int transparencyRate) {
		this.transparencyRate = transparencyRate;
	}

	/**
	 * 背景色を設定します。
	 * <BR><BR>
	 * @param backgroundColor 背景色を渡します。
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * サイズを設定します。
	 * <BR><BR>
	 * @param dimension サイズを渡します。
	 */
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	/**
	 * X座標を設定します。
	 * <BR><BR>
	 * @param locationX X座標を設定します。
	 */
	public void setLcationX(int locationX) {
		this.locationX = locationX;
	}

	/**
	 * Y座標を設定します。
	 * <BR><BR>
	 * @param locationY Y座標を設定します。
	 */
	public void setLcationY(int locationY) {
		this.locationY = locationY;
	}

	/**
	 * 初期位置を設定します。
	 * <BR><BR>
	 * @param locationRelativeTo 基準となるコンポーネントを渡します。
	 */
	public void setLocationRelativeTo(Component locationRelativeTo) {
		this.locationRelativeTo = locationRelativeTo;
	}

	/**
	 * 可変可否を設定します。
	 * <BR><BR>
	 * @param isResizable 可変の可否（可の場合true）を渡します。
	 */
	public void setResizable(boolean isResizable) {
		this.isResizable = isResizable;
	}

	/**
	 * タイトルを取得します。
	 * <BR><BR>
	 * @return タイトルを返却します。
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * メニューバーを取得します。
	 * <BR><BR>
	 * @return メニューバーを返却します。
	 */
	public MatrixMenuBar getMenuBar() {
		return this.menuBar;
	}

	/**
	 * デコレーション可否を取得します。
	 * <BR><BR>
	 * @return 独自デコレーションが可能の場合trueを返します。
	 */
	public boolean isUndecorated() {
		return this.isUndecorated;
	}

	/**
	 * 透過度を取得します。
	 * <BR><BR>
	 * @return 透過度を返却します。
	 */
	public int getTransparencyRate() {
		return this.transparencyRate;
	}

	/**
	 * 背景色を取得します。
	 * <BR><BR>
	 * @return 背景色を返却します。
	 */
	public Color getBackgroundColor() {
		return this.backgroundColor;
	}

	/**
	 * サイズを取得します。
	 * <BR><BR>
	 * @return サイズを返却します。
	 */
	public Dimension getDimension() {
		return this.dimension;
	}

	/**
	 * X座標を取得します。
	 * <BR><BR>
	 * @return X座標を返却します。
	 */
	public int getLocationX() {
		return this.locationX;
	}

	/**
	 * Y座標を取得します。
	 * <BR><BR>
	 * @return Y座標を返却します。
	 */
	public int getLocationY() {
		return this.locationY;
	}

	/**
	 * 初期位置の基準となるコンポーネントを取得します。
	 * <BR><BR>
	 * @return 初期位置の基準となるコンポーネントを返却します。
	 */
	public Component getLocationRelativeTo() {
		return this.locationRelativeTo;
	}

	/**
	 * 可変可否を取得します。
	 * <BR><BR>
	 * @return 可変可の場合trueを返却します。
	 */
	public boolean isResizable() {
		return this.isResizable;
	}

	/**
	 * メニュー可視の可否を取得します。
	 * <BR><BR>
	 * @return メニュー可視の場合trueを返却します。
	 */
	public boolean isMenuVisible() {
		return this.isMenuVisible;
	}

}
