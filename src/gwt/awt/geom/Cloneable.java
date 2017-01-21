/*
 * VAlbum2 manages photo collection and presents it offline and online.
 * Copyright (C) 2017 Bernhard Haumacher and others
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package gwt.awt.geom;

/**
 * Workaround for GWT not supporting Object#clone().
 * 
 * <p>
 * By placing a Cloneable interface compatible with <code>java.lang.Cloneable</code> into each
 * package with classes implementing <code>Cloneable</code>, the code can be compiled without errors
 * by the GWT compiler, even if the <code>clone()</code> method implementations carry the
 * <code>@Override</code> annotation.
 * </p>
 * 
 * @author <a href="mailto:haui@haumacher.de">Bernhard Haumacher</a>
 * @version $Revision: $ $Author: $ $Date: $
 */
public interface Cloneable {

	/**
	 * Clone method compatible with java.lang.Cloneable#clone()
	 */
	public Object clone();

}
