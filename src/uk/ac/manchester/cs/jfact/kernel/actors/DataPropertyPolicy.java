package uk.ac.manchester.cs.jfact.kernel.actors;

/* This file is part of the JFact DL reasoner
Copyright 2011 by Ignazio Palmisano, Dmitry Tsarkov, University of Manchester
This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version. 
This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA*/
import uk.ac.manchester.cs.jfact.kernel.ClassifiableEntry;
import uk.ac.manchester.cs.jfact.kernel.TExpressionManager;
import uk.ac.manchester.cs.jfact.kernel.dl.interfaces.TDLExpression;

/** policy for data properties */
public class DataPropertyPolicy implements Policy {
	public boolean applicable(ClassifiableEntry p) {
		return p.getId() > 0;
	}

	public boolean needPlain() {
		return false;
	}

	public TDLExpression buildTree(TExpressionManager EM, ClassifiableEntry p) {
		return EM.DataRole(p.getName());
	}
}