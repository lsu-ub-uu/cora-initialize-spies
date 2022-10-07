/*
 * Copyright 2022 Uppsala University Library
 *
 * This file is part of Cora.
 *
 *     Cora is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Cora is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Cora.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.uu.ub.cora.initialize.spies;

import se.uu.ub.cora.initialize.ModuleInitializer;
import se.uu.ub.cora.initialize.SelectOrder;
import se.uu.ub.cora.testutils.mcr.MethodCallRecorder;
import se.uu.ub.cora.testutils.mrv.MethodReturnValues;

public class ModuleInitializerSpy implements ModuleInitializer {
	public MethodCallRecorder MCR = new MethodCallRecorder();
	public MethodReturnValues MRV = new MethodReturnValues();

	public ModuleInitializerSpy() {
		MCR.useMRV(MRV);
		// MRV.setDefaultReturnValuesSupplier("createAndStoreRecord", DataRecordSpy::new);
	}

	@Override
	public <T extends SelectOrder> T loadOneImplementationBySelectOrder(Class<T> factoryClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T loadTheOnlyExistingImplementation(Class<T> factoryClass) {
		// TODO Auto-generated method stub
		return null;
	}

}
