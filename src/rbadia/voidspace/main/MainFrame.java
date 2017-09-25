package rbadia.voidspace.main;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * The game's main frame. Contains all the game's labels, file menu, and game screen.
 */
public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private LevelState levelState = null;
	
	private JLabel destroyedLabel;
	private JLabel destroyedValueLabel;
	
	private JLabel levelLabel;
	private JLabel levelValueLabel;

	private JLabel shipsLabel;
	private JLabel shipsValueLabel;
	
	/**
	 * This is the default constructor
	 */
	public MainFrame() {
		super();
		initialize();
	}

	public JLabel getLevelLabel() {
		return levelLabel;
	}

	public JLabel getLevelValueLabel() {
		return levelValueLabel;
	}

	public JLabel getShipsLabel() {
		return shipsLabel;
	}

	public JLabel getShipsValueLabel() {
		return shipsValueLabel;
	}

	public JLabel getDestroyedValueLabel() {
		return destroyedValueLabel;
	}

	public void setDestroyedValueLabel(JLabel destroyedValueLabel) {
		this.destroyedValueLabel = destroyedValueLabel;
	}

	public void setLevelLabel(JLabel levelLabel) {
		this.levelLabel = levelLabel;
	}

	public void setLevelValueLabel(JLabel levelValueLabel) {
		this.levelValueLabel = levelValueLabel;
	}

	public void setShipsLabel(JLabel shipsLabel) {
		this.shipsLabel = shipsLabel;
	}

	public void setShipsValueLabel(JLabel shipsValueLabel) {
		this.shipsValueLabel = shipsValueLabel;
	}
	
	/**
	 * This method initializes gameScreen	
	 * 	
	 * @return GameScreen
	 */
	public LevelState getLevelState() {
//		if (gameState == null) {
//			gameState = new Level1State();
//			gameState.setShipsValueLabel(shipsValueLabel);
//			gameState.setDestroyedValueLabel(destroyedValueLabel);
//			gameState.setLevelValueLabel(levelValueLabel);
//		}
		return levelState;
	}
	
	public void setLevelState(LevelState levelState) {
		this.levelState = levelState;
		this.jContentPane = null;
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(530, 480);
		//this.setContentPane(getJContentPane());
		this.setTitle("Mega Man");
//		this.setResizable(false);
		
		Dimension dim = this.getToolkit().getScreenSize();
		Rectangle bounds = this.getBounds();
		this.setLocation(
			(dim.width - bounds.width) / 2,
			(dim.height - bounds.height) / 2);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints6.gridy = 1;
			gridBagConstraints6.anchor = GridBagConstraints.WEST;
			gridBagConstraints6.weightx = 1.0D;
			gridBagConstraints6.gridx = 5;
			
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints5.gridy = 1;
			gridBagConstraints5.anchor = GridBagConstraints.EAST;
			gridBagConstraints5.weightx = 1.0D;
			gridBagConstraints5.gridx = 4;
			
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.anchor = GridBagConstraints.WEST;
			gridBagConstraints4.weightx = 1.0D;
			gridBagConstraints4.gridx = 3;
			
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints3.gridy = 1;
			gridBagConstraints3.anchor = GridBagConstraints.EAST;
			gridBagConstraints3.weightx = 1.0D;
			gridBagConstraints3.gridx = 2;
			
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints2.gridy = 1;
			gridBagConstraints2.anchor = GridBagConstraints.WEST;
			gridBagConstraints2.weightx = 1.0D;
			gridBagConstraints2.gridx = 1;
			
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints1.gridy = 1;
			gridBagConstraints1.anchor = GridBagConstraints.EAST;
			gridBagConstraints1.weightx = 1.0D;
			gridBagConstraints1.gridx = 0;
			
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.fill = GridBagConstraints.NONE;
			gridBagConstraints.gridwidth = 6;	
			shipsLabel = new JLabel("Ships Left: ");
			shipsValueLabel = new JLabel("3");
			destroyedLabel = new JLabel("Score: ");
			destroyedValueLabel = new JLabel("0");
			levelLabel = new JLabel("Level: ");
			levelValueLabel = new JLabel("1");
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getLevelState(), gridBagConstraints);
			jContentPane.add(shipsLabel, gridBagConstraints1);
			jContentPane.add(shipsValueLabel, gridBagConstraints2);
			jContentPane.add(destroyedLabel, gridBagConstraints3);
			jContentPane.add(destroyedValueLabel, gridBagConstraints4);
			jContentPane.add(levelLabel, gridBagConstraints5);
			jContentPane.add(levelValueLabel, gridBagConstraints6);
		}
		return jContentPane;
	}



}  //  @jve:decl-index=0:visual-constraint="10,10"
