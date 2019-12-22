/*
 * Copyright (c) 1999, 2007, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package javax.swing.filechooser;

import java.io.File;

import javax.swing.Icon;

/**
 * <code>FileView</code> defines an abstract class that can be implemented to
 * provide the filechooser with UI information for a <code>File</code>. Each L&F
 * <code>JFileChooserUI</code> object implements this class to pass back the
 * correct icons and type descriptions specific to that L&F. For example, the
 * Microsoft Windows L&F returns the generic Windows icons for directories and
 * generic files. Additionally, you may want to provide your own
 * <code>FileView</code> to <code>JFileChooser</code> to return different icons
 * or additional information using {@link javax.swing.JFileChooser#setFileView}.
 *
 * <p>
 *
 * <code>JFileChooser</code> first looks to see if there is a user defined
 * <code>FileView</code>, if there is, it gets type information from there
 * first. If <code>FileView</code> returns <code>null</code> for any method,
 * <code>JFileChooser</code> then uses the L&F specific view to get the
 * information. So, for example, if you provide a <code>FileView</code> class
 * that returns an <code>Icon</code> for JPG files, and returns
 * <code>null</code> icons for all other files, the UI's <code>FileView</code>
 * will provide default icons for all other files.
 *
 * <p>
 *
 * For an example implementation of a simple file view, see
 * <code><i>yourJDK</i>/demo/jfc/FileChooserDemo/ExampleFileView.java</code>.
 * For more information and examples see <a href=
 * "http://java.sun.com/docs/books/tutorial/uiswing/components/filechooser.html">How
 * to Use File Choosers</a>, a section in <em>The Java Tutorial</em>.
 *
 * @see javax.swing.JFileChooser
 *
 * @author Jeff Dinkins
 *
 */
public abstract class FileView {
	public String getName(File f) {
		return null;
	};

	public String getDescription(File f) {
		return null;
	}

	public String getTypeDescription(File f) {
		return null;
	}

	public Icon getIcon(File f) {
		return null;
	}

	public Boolean isTraversable(File f) {
		return null;
	}

}