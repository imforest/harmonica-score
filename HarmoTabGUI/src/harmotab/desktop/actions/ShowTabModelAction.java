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

package harmotab.desktop.actions;

import harmotab.core.Localizer;
import harmotab.core.i18n;
import harmotab.desktop.DesktopController;
import harmotab.desktop.ActionIcon;
import harmotab.desktop.setupdialog.TrackSetupDialog;


/**
 *  Affichage de la fen�tre du mod�le de tablature
 */
public class ShowTabModelAction extends UserAction {
	private static final long serialVersionUID = 1L;
	
	public ShowTabModelAction() {
		super(
			Localizer.get(i18n.MENU_TAB_MODEL),
			ActionIcon.getIcon(ActionIcon.CONFIGURE)
		);
	}

	@Override
	public void run() {
		TrackSetupDialog dlg = TrackSetupDialog.create(
				null,
				DesktopController.getInstance().getCurrentSelection().getTrack());
		dlg.setVisible(true);
	}
}

