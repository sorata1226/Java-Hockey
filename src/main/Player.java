package main;

import java.awt.Color;
import java.awt.Graphics;

import listener.GameKeyListener;

public class Player {
	/**GameKeyListener Class*/
	private GameKeyListener key;
	/**Main Frame Class*/
	private MainPanel mp;
	/**PlayerA Position X*/
	private double player_a_position_x;
	/**PlayerB Position X*/
	private double player_b_position_x;
	/**PlayerA Position Y*/
	private double player_a_position_y;
	/**PlayerB Position Y*/
	private double player_b_position_y;
	/**PlayerA Color*/
	private static final Color PlayerA_Color = Color.BLUE;
	/**PlayerB Color*/
	private static final Color PlayerB_Color = Color.RED;
	/**Player Width*/
	private double playerWidth;
	/**Player High*/
	private double playerHigh;

	/* Player Speed */
	private double speed;


	/**Player Constructor
	 * @param mf MainFrame Class
	 * @param mp MainPanel Class
	 * @param key GameKeyListener Class*/
	public Player(MainPanel mp, GameKeyListener key) {
		this.mp = mp;
		this.key = key;

		//Playerの数値初期化
		playerWidth = 10;
		playerHigh = 100;
		speed = 100;

		//Playerの初期位置を設定する。
		player_a_position_x = mp.getPanelWeight() * 2 / 10;
		player_b_position_x = mp.getPanelWeight() * 8 / 10;

		player_a_position_y = mp.getPanelHeight() * 3/ 10;
		player_b_position_y = mp.getPanelHeight() * 3/ 10;

	}

	/**Move Player*/
	public void movePlayer() {

		/**Move A Player*/
		if (key.isDownkeypressed()) {
			player_a_position_y += 30;
		}
		else if (key.isUpkeypressed()) {
			player_a_position_y -= 30;
		}

		if (key.isDownkeypressed2()) {
			player_b_position_y += 30;
		}
		else if (key.isUpkeypressed2()) {
			player_b_position_y -= 30;
		}

	}


	/**Player Graphics
	 * @param g Graphics Class*/
	public void playerGraphics(Graphics g) {
		g.setColor(PlayerA_Color);
		g.fillRect((int)player_a_position_x, (int)player_a_position_y, (int)playerWidth, (int)playerHigh);
		g.setColor(PlayerB_Color);
		g.fillRect((int)player_b_position_x, (int)player_b_position_y, (int)playerWidth, (int)playerHigh);
	}

	public double getPlayerWidth() {
		return playerWidth;
	}
	public double getPlayerHeight() {
		return playerHigh;
	}
	public double getPlayer_a_position_x() {
		return player_a_position_x;
	}
	public double getPlayer_a_position_y() {
		return player_a_position_y;
	}
	public double getPlayer_b_position_x() {
		return player_b_position_x;
	}
	public double getPlayer_b_position_y() {
		return player_b_position_y;
	}
}