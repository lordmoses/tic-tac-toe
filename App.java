import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {

	final static CardLayout cards = new CardLayout();

	final static TicTacToe xo = new TicTacToe();

	public static void main(String[] args) {
		final JPanel content = new JPanel();
		final JPanel frame = new JPanel();
		xo.getContentPane();
		xo.setBackground(Color.RED);
		final TicTacToe xxo = new TicTacToe(content, frame);

		StartPanelListener startPanelListener;

		new Thread(new Runnable() {
			public void run() {
				xo.setTitle("MOSES' SIMULATIONS LAB. copyrights 2013");
				xo.getContentPane();
				xo.setForeground(Color.RED);
				xo.setBackground(Color.RED);
				xo.setLayout(cards);

				xo.add(frame, "frame");
				xo.add(content, "content");

				xo.setListener(new StartPanelListener() {
					public void StartEvent() {

						switchToHome();
					}

					public void StartEvent2() {
						switchToGame();
					}
				});

				xo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				xo.setSize(730, 750);
				xo.setVisible(true);
				try {
					Thread.sleep(1300);
				} catch (InterruptedException ex) {
					Logger.getLogger(TicTacToe.class.getName()).log(
							Level.SEVERE, null, ex);
				}

				xo.playSound(2);
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
				}

				xxo.playSound2(13);
				try {
					Thread.sleep(44000);
				} catch (InterruptedException e) {
				}
				xxo.stop();
				xxo.playSound2(14);

			}
		}).start();
	}

	public static void switchToHome() {
		cards.show(xo.getContentPane(), "frame");
	}

	public static void switchToGame() {
		cards.show(xo.getContentPane(), "content");
	}
}
