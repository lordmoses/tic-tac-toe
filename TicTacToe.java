import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// for the AudioClip

public class TicTacToe extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel frame;
	private JButton box1, box2, box3, box4, box5, box6, box7, box8, box9,
			refresh, b1, b2, b3, control;
	private JLabel cat, result, Ceo;
	private ImageIcon kitten, ceo, x, o;
	@SuppressWarnings("unused")
	private static JPanel content;
	private int move = 0, Xs = 0, Os = 0;
	boolean analyze, attempt1, attempt2, proceed, win, hard, easy;
	private JButton move1, move2, move3, move4, mymove1, mymove2, mymove3,
			movehard;
	private HashSet<JButton> set1, set2, set3, set4, set5, set6, set7, set8,
			set9, temp, diff;
	@SuppressWarnings("rawtypes")
	private ArrayList<HashSet> setArray;
	private AudioClip clip, clip1;
	static StartPanelListener startPanelListener;
	JPanel panel;

	public TicTacToe() {
	}

	public void actionPerformed(ActionEvent event) {
		move++;
		if (event.getSource() == box1) {
			box1.setText("X");
			box1.setIcon(x);
			box1.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box1);
					checkWin();
				}
			}
		} else if (event.getSource() == box2) {
			box2.setText("X");
			box2.setIcon(x);
			box2.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box2);
					checkWin();
				}
			}
		} else if (event.getSource() == box3) {
			box3.setText("X");
			box3.setIcon(x);
			box3.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box3);
					checkWin();
				}
			}
		} else if (event.getSource() == box4) {
			box4.setText("X");
			box4.setIcon(x);
			box4.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box4);
					checkWin();
				}
			}
		} else if (event.getSource() == box5) {
			box5.setText("X");
			box5.setIcon(x);
			box5.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box5);
					checkWin();
				}
			}
		} else if (event.getSource() == box6) {
			box6.setText("X");
			box6.setIcon(x);
			box6.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box6);
					checkWin();
				}
			}
		} else if (event.getSource() == box7) {
			box7.setText("X");
			box7.setIcon(x);
			box7.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box7);
					checkWin();
				}
			}
		} else if (event.getSource() == box8) {
			box8.setText("X");
			box8.setIcon(x);
			box8.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box8);
					checkWin();
				}
			}
		} else if (event.getSource() == box9) {
			box9.setText("X");
			box9.setIcon(x);
			box9.setEnabled(false);
			playSound(9);
			checkWin();
			if (easy == true) {
				if (checkWin() == false) {
					randomFill();
					checkWin();
				}
			} else {
				if (checkWin() == false) {
					AI(box9);
					checkWin();
				}
			}
		} else if (event.getSource() == refresh) {
			box1.setText("");
			box1.setIcon(null);
			box1.setEnabled(true);
			box2.setText("");
			box2.setIcon(null);
			box2.setEnabled(true);
			box3.setText("");
			box3.setIcon(null);
			box3.setEnabled(true);
			box4.setText("");
			box4.setIcon(null);
			box4.setEnabled(true);
			box5.setText("");
			box5.setIcon(null);
			box5.setEnabled(true);
			box6.setText("");
			box6.setIcon(null);
			box6.setEnabled(true);
			box7.setText("");
			box7.setIcon(null);
			box7.setEnabled(true);
			box8.setText("");
			box8.setIcon(null);
			box8.setEnabled(true);
			box9.setText("");
			box9.setIcon(null);
			box9.setEnabled(true);
			result.setText("");
			// disableButtons();
			// addListeners();
			win = false;
			move = 0;
			CreateSet();
			playSound(10);

		} else if (event.getSource() == b1) {
			playSound(3);
			easy = true;
			hard = false;
			move = 0;
			startPanelListener.StartEvent2();
		} else if (event.getSource() == b2) {
			playSound(3);
			hard = false;
			easy = false;
			move = 0;
			startPanelListener.StartEvent2();
		} else if (event.getSource() == b3) {
			playSound(3);
			hard = true;
			easy = false;
			move = 0;
			startPanelListener.StartEvent2();
		}
	}

	public void AI(JButton m) {
		if (move == 1) {
			move1 = m;
			if (!(move1 == box5)) {
				box5.setText("O");
				box5.setIcon(o);
				mymove1 = box5;
				box5.setEnabled(false);
			} else {
				box1.setText("O");
				box1.setIcon(o);
				mymove1 = box1;
				box1.setEnabled(false);
			}
		}

		else if (move == 2) {
			move2 = m;
			analyze = false;
			analyze(move1, move2);
			if (analyze == true) {
				Attempt1();
				if (attempt1 == false) {
					if ((mymove1 == box1) || (mymove1 == box3)
							|| (mymove1 == box7) || (mymove1 == box9)) {
						specialCase(box3);
						if (attempt1 == false) {
							specialCase(box7);
						}
					} else {
						specialCase(box2);
						if (attempt1 == false) {
							specialCase(box4);
						}
					}
				}
			} else if (analyze == false) {
				// hard diffilculty level
				if (hard == true) {
					if ((move1 == box1) || (move1 == box3) || (move1 == box7)
							|| (move1 == box9)) {
						movehard = move1;
					} else {
						movehard = move2;
					}

				} else {
					movehard = move1;
				}
				analyze(movehard, mymove1);

				if (analyze == true) {
					Attempt1();
					// well this occurence never happens
					if (attempt1 == false) {
						Attempt2(set1);
					}
				}
			}
		} else if (move == 3) {
			analyze = false;
			move3 = m;
			Attack(mymove1, mymove2);
			if (proceed == false) {
				analyze(move1, move3);

				if (analyze == true) {
					Attempt1();
					if (attempt1 == false) {
						analyze(move2, move3);
						if (analyze == true) {
							Attempt1();
						} else if (analyze == false) {
							analyze(mymove1, mymove2);
							if (analyze == true) {
								Attempt1();
								if (attempt1 == false) {
									randomFill();
								}
							} else if (analyze == false) {
								for (HashSet a : setArray) {
									Attempt2(a);
									if (attempt2 == true) {
										break;
									}
								}
							}
						}
					}
				}

				else if (analyze == false) {
					analyze(move2, move3);
					if (analyze == true) {
						Attempt1();
						if (attempt1 == false) {
							analyze(mymove1, mymove2);
							if (analyze == true) {
								Attempt1();
								if (attempt1 == false) {
									randomFill();
								}
							} else if (analyze == false) {
								randomFill();
							}
						}
					} else if (analyze == false) {
						analyze(mymove1, mymove2);
						if (analyze == true) {
							Attempt1();
							if (attempt1 == false) {
								randomFill();
							}
						} else if (analyze == false) {
							randomFill();
						}
					}
				}
			}
		} else if (move == 4) {
			analyze = false;
			move4 = m;
			Attack(mymove1, mymove3);
			if (proceed == false) {
				Attack(mymove2, mymove3);
			}
			if (proceed == false) {
				analyze(move1, move4);
				if (analyze == true) {
					Attempt1();
					if (attempt1 == false) {
						analyze(move2, move4);
						if (analyze == true) {
							Attempt1();
							if (attempt1 == false) {
								analyze(move3, move4);
								if (analyze == true) {
									Attempt1();
									// unlikely
									if (attempt1 == false) {
										randomFill();
									}
								} else {
									randomFill();
								}
							}
						} else if (analyze == false) {
							analyze(move3, move4);
							if (analyze == true) {
								Attempt1();
								// unlikely
								if (attempt1 == false) {
									randomFill();
								}
							} else {
								randomFill();
								;
							}
						}
					}
				} else if (analyze == false) {
					analyze(move2, move4);
					if (analyze == true) {
						Attempt1();
						if (attempt1 == false) {
							analyze(move3, move4);
							if (analyze == true) {
								Attempt1();
								// unlikely
								if (attempt1 == false) {
									randomFill();
								}
							} else if (attempt1 == false) {
								randomFill();
							}
						}
					} else if (analyze == false) {
						analyze(move3, move4);
						if (analyze == true) {
							Attempt1();

							if (attempt1 == false) {
								randomFill();
							}

						}// rare
						else if (analyze == false) {
							randomFill();
						}
					}
				}
			}
		} else if (move == 5) {
			checkWin();
			if (checkWin() == false) {
				result.setText("TIE: CAT'S GAME.. BUDDY !!");
				playSound(6);
			}
		}
	}

	public void analyze(JButton a, JButton b) {
		if (((a == box2) && (b == box6)) || ((a == box6) && (b == box2))) {
			temp.add(box3);
			analyze = true;
		} else if (((a == box4) && (b == box2)) || ((a == box4) && (b == box4))) {
			temp.add(box1);
			analyze = true;
		} else if (((a == box6) && (b == box8)) || ((a == box8) && (b == box6))) {
			temp.add(box9);
			analyze = true;
		} else if (((a == box4) && (b == box8)) || ((a == box8) && (b == box4))) {
			temp.add(box7);
			analyze = true;
		} else {
			analyze = false;
			diff.add(a);
			diff.add(b);
			for (HashSet x : setArray) {
				if ((x.contains(a) && x.contains(b))) {
					temp = x;
					temp.removeAll(diff);
					diff.clear();
					analyze = true;
					break;
				}
			}
		}
	}

	public void Attempt1() {
		attempt1 = false;
		if (analyze == true) {
			for (JButton y : temp) {
				if ((y.getText() == "X") || (y.getText() == "O")) {
					attempt1 = false;
					temp.clear();
					break;
				}
				y.setText("O");
				y.setIcon(o);
				y.setEnabled(false);
				if (move == 2) {
					mymove2 = y;
				} else if (move == 3) {
					mymove3 = y;
				}
				temp.clear();
				attempt1 = true;
			}
		}
	}

	public void Attempt2(HashSet<JButton> set) {
		attempt2 = false;
		for (JButton y : set) {
			if ((!(y.getText() == "X")) && (!(y.getText() == "O"))) {
				y.setText("O");
				y.setIcon(o);
				y.setEnabled(false);
				mymove2 = y;
				attempt2 = true;
				break;
			}
		}
	}

	public void Attack(JButton x, JButton y) {
		analyze(x, y);
		if (analyze == true) {
			Attempt1();
			if (attempt1 == false) {
				proceed = false;
			} else {
				proceed = true;
			}

		} else {
			proceed = false;
		}
	}

	public void specialCase(JButton i) {
		temp.add(i);
		analyze = true;
		Attempt1();
	}

	public boolean checkWin() {
		CreateSet();
		Xs = 0;
		Os = 0;
		for (int x = 0; x < 8; x++) {
			Xs = 0;
			Os = 0;
			set9 = setArray.get(x);
			for (JButton a : set9) {

				if (a.getText() == "X") {
					Xs++;
				}
				if (a.getText() == "O") {
					Os++;
				}
			}
			if (Xs == 3) {
				result.setText("PLAYER WON GOOD JOB!!");
				playSound(4);
				disableButtons();
				win = true;
				break;
			}
			if (Os == 3) {
				result.setText("SMART COMPUTER WON !");
				Os++;
				if (hard == true) {
					playSound(8);
				} else {
					playSound(5);
				}
				disableButtons();
				win = true;
				break;
			}
		}
		return win;
	}

	public void CreateSet() {
		set1 = new HashSet<JButton>();
		set1.add(box1);
		set1.add(box2);
		set1.add(box3);
		set2 = new HashSet<JButton>();
		set2.add(box1);
		set2.add(box4);
		set2.add(box7);
		set3 = new HashSet<JButton>();
		set3.add(box1);
		set3.add(box5);
		set3.add(box9);
		set4 = new HashSet<JButton>();
		set4.add(box2);
		set4.add(box5);
		set4.add(box8);
		set5 = new HashSet<JButton>();
		set5.add(box3);
		set5.add(box5);
		set5.add(box7);
		set6 = new HashSet<JButton>();
		set6.add(box3);
		set6.add(box6);
		set6.add(box9);
		set7 = new HashSet<JButton>();
		set7.add(box4);
		set7.add(box5);
		set7.add(box6);
		set8 = new HashSet<JButton>();
		set8.add(box7);
		set8.add(box8);
		set8.add(box9);
		diff = new HashSet<JButton>();
		set9 = new HashSet<JButton>();
		setArray = new ArrayList<HashSet>();
		temp = new HashSet<JButton>();
		setArray.add(set1);
		setArray.add(set2);
		setArray.add(set3);
		setArray.add(set4);
		setArray.add(set5);
		setArray.add(set6);
		setArray.add(set7);
		setArray.add(set8);
	}

	public void addListeners() {
		box1.addActionListener(this);
		box2.addActionListener(this);
		box3.addActionListener(this);
		box4.addActionListener(this);
		box5.addActionListener(this);
		box6.addActionListener(this);
		box7.addActionListener(this);
		box8.addActionListener(this);
		box9.addActionListener(this);
		refresh.addActionListener(this);
	}

	public void removeListeners() {
		box1.removeActionListener(this);
		box2.removeActionListener(this);
		box3.removeActionListener(this);
		box4.removeActionListener(this);
		box5.removeActionListener(this);
		box6.removeActionListener(this);
		box7.removeActionListener(this);
		box8.removeActionListener(this);
		box9.removeActionListener(this);
	}

	public void randomFill() {
		// CreateSet();
		if (move == 5) {
			result.setText("TIE: CAT'S GAME.. BUDDY !!");
			playSound(6);
		} else {
			for (HashSet a : setArray) {
				Attempt2(a);
				if (attempt2 == true) {
					break;
				}
			}
		}
	}

	public void chooseDifficulty() {
		frame.setLayout(new BorderLayout());
		frame.setSize(730, 750);
		b1 = new JButton("Easy");
		b1.setForeground(Color.BLUE);
		b1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b2 = new JButton("Hard");
		b2.setForeground(Color.GREEN);
		b2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b3 = new JButton("Please Don't");
		b3.setForeground(Color.RED);
		b3.setFont(new Font("Lucida Grande", Font.BOLD, 28));

		ceo = new ImageIcon(getClass().getResource("photo2.JPG"));
		Ceo = new JLabel(ceo);

		JPanel picturePanel = new JPanel();
		picturePanel.setBackground(Color.RED);

		JPanel imagePanel = new JPanel();
		imagePanel.setBackground(Color.GREEN);

		JPanel ButtonsPanel = new JPanel();
		ButtonsPanel.setBackground(Color.RED);

		ButtonsPanel.setPreferredSize(new Dimension(730, 100));
		picturePanel.setPreferredSize(new Dimension(730, 250));
		imagePanel.setPreferredSize(new Dimension(730, 500));

		picturePanel.setLayout(new FlowLayout());
		ButtonsPanel.setLayout(new FlowLayout());
		imagePanel.setLayout(new FlowLayout());

		b1.setPreferredSize(new Dimension(200, 100));
		ButtonsPanel.add(b1);
		b2.setPreferredSize(new Dimension(200, 100));
		ButtonsPanel.add(b2);
		b3.setPreferredSize(new Dimension(200, 100));
		ButtonsPanel.add(b3);

		imagePanel.add(new JLabel(new ImageIcon(getClass().getResource(
				"image5.gif"))));
		
		
		
		JLabel label = new JLabel(
				"<html><big><center>" + "X&O App v0.1<br>"
						+ "Copyright \u00a9 2013 Moses Ike<br>"
						+ "All Rights Reserved."
						+ "<center></big></html>");
		label.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 16));
		picturePanel.add(label);
		
		
		
		picturePanel.add(Ceo);
	
		//picturePanel.add(new JLabel(new ImageIcon(getClass().getResource(
		//		"photo.JPG"))));

		frame.add(ButtonsPanel, BorderLayout.NORTH);
		frame.add(imagePanel, BorderLayout.CENTER);
		frame.add(picturePanel, BorderLayout.SOUTH);

		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.addActionListener(this);
	}

	public void playSound(int a) {
		String b = "welcome.wav";
		try {
			if (a == 1) {
				b = "welcome.wav";
			} else if (a == 2) {
				b = "mode.wav";
			} else if (a == 3) {
				b = "ready.wav";
			} else if (a == 4) {
				b = "win.wav";
			} else if (a == 5) {
				b = "lose.wav";
			} else if (a == 6) {
				b = "tie.wav";
			} else if (a == 10) {
				b = "refresh.wav";
			} else if (a == 7) {
				b = "kirk.wav";
			} else if (a == 8) {
				b = "hard.wav";
			} else if (a == 9) {
				b = "beep.wav";
			}

			clip = Applet.newAudioClip(getClass().getResource(b));
			clip.play();
		} catch (Exception e) {
		}
	}

	public void playSound2(int aa) {
		String c = "welcome.wav";
		try {

			if (aa == 13) {
				c = "tpain1.wav";
			} else if (aa == 14) {
				c = "tpain2.wav";
			}

			clip1 = Applet.newAudioClip(getClass().getResource(c));
			clip1.loop();

		} catch (Exception e) {
		}
	}

	public void stop() {
		clip1.stop();
	}

	public void disableButtons() {
		box1.setEnabled(false);
		box2.setEnabled(false);
		box3.setEnabled(false);
		box4.setEnabled(false);
		box5.setEnabled(false);
		box6.setEnabled(false);
		box7.setEnabled(false);
		box8.setEnabled(false);
		box9.setEnabled(false);
	}

	public TicTacToe(JPanel content, JPanel frame) {

		this.content = content;
		this.frame = frame;
		// play(getCodeBase(), "music.wav");
		// playSound(11);// plays the music.wav
		playSound(1);// welcome
		// choose mode//playSound(2);
		// playSound(7);
		// play(getCodeBase(),"beep.wav"); this the the simplest way to play in
		// JApplet
		// sound
		win = false;
		hard = true;
		easy = false;

		content.setLayout(new GridLayout(4, 3));

		content.setBackground(Color.RED);

		box1 = new JButton("");
		content.add(box1);
		box2 = new JButton("");
		content.add(box2);
		box3 = new JButton("");
		content.add(box3);
		box4 = new JButton("");
		content.add(box4);
		box5 = new JButton("");
		content.add(box5);
		box6 = new JButton("");
		content.add(box6);
		box7 = new JButton("");
		content.add(box7);
		box8 = new JButton("");
		content.add(box8);
		box9 = new JButton("");
		content.add(box9);
		refresh = new JButton("Refresh");
		refresh.setForeground(Color.BLACK);
		refresh.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		content.add(refresh);
		panel = new JPanel();

		result = new JLabel("");
		control = new JButton("HOME PAGE");
		control.setForeground(Color.BLACK);
		control.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		control.setPreferredSize(new Dimension(100, 100));

		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.ORANGE);
		panel.add(result, BorderLayout.CENTER);
		panel.add(control, BorderLayout.SOUTH);
		content.add(panel);

		kitten = new ImageIcon(getClass().getResource("kitten2.gif"));
		x = new ImageIcon(getClass().getResource("xx.GIF"));
		o = new ImageIcon(getClass().getResource("ooo.png"));
		cat = new JLabel(kitten);
		content.add(cat);

		CreateSet();
		addListeners();

		content.setVisible(true);
		content.setSize(730, 750);
		chooseDifficulty();

		control.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startPanelListener.StartEvent();
			}
		});
	}

	public void setListener(StartPanelListener startPanelListener) {
		this.startPanelListener = startPanelListener;

	}
}
