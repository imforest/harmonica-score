/**
 * This file is part of HarmoTab.
 *
 * @copyright Copyright (c) 2011 HarmoTab
 * @license GPL-3.0
 * 
 * HarmoTab is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *   
 * HarmoTab is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with HarmoTab.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author E. Revert (erevert@harmotab.com)
 */

package harmotab.desktop.browser;

import harmotab.core.ScoreController;

import java.awt.*;
import javax.swing.*;


public class OnlineBrowser extends Browser {
	private static final long serialVersionUID = 1L;


	//
	// Constructeur
	//

	public OnlineBrowser(ScoreController controller) {
		setLayout(new BorderLayout());
		add(new JLabel("<html><i>Incoming feature</i></html>"), BorderLayout.CENTER);
	}
	
	//
	// Attributs
	//
	
	
}

