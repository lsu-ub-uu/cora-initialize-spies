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

import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.uu.ub.cora.initialize.ModuleInitializer;
import se.uu.ub.cora.testutils.mcr.MethodCallRecorder;
import se.uu.ub.cora.testutils.mrv.MethodReturnValues;
import se.uu.ub.cora.testutils.spies.MCRSpy;

public class ModuleInitializeSpyTest {
	private static final String ADD_CALL = "addCall";
	private static final String ADD_CALL_AND_RETURN_FROM_MRV = "addCallAndReturnFromMRV";
	ModuleInitializerSpy moduleInitializer;
	private MCRSpy MCRSpy;
	private MethodCallRecorder mcrForSpy;

	@BeforeMethod
	public void beforeMethod() {
		MCRSpy = new MCRSpy();
		mcrForSpy = MCRSpy.MCR;
		moduleInitializer = new ModuleInitializerSpy();
	}

	@Test
	public void testMakeSureSpyHelpersAreSetUp() throws Exception {
		assertTrue(moduleInitializer.MCR instanceof MethodCallRecorder);
		assertTrue(moduleInitializer.MRV instanceof MethodReturnValues);
		assertSame(moduleInitializer.MCR.onlyForTestGetMRV(), moduleInitializer.MRV);
	}

	@Test
	public void testDefaultCreateAndStoreRecord() throws Exception {
		// assertTrue(moduleInitializer.createAndStoreRecord("authToken", "type",
		// null) instanceof DataRecordSpy);
	}

	@Test
	public void testCreateAndStoreRecord() throws Exception {
		// moduleInitializer.MCR = MCRSpy;
		// MCRSpy.MRV.setDefaultReturnValuesSupplier(ADD_CALL_AND_RETURN_FROM_MRV,
		// DataRecordSpy::new);
		//
		// DataGroupSpy recordGroup = new DataGroupSpy();
		// DataRecord retunedValue = moduleInitializer.createAndStoreRecord("authToken", "type",
		// recordGroup);
		//
		// mcrForSpy.assertMethodWasCalled(ADD_CALL_AND_RETURN_FROM_MRV);
		// mcrForSpy.assertParameter(ADD_CALL_AND_RETURN_FROM_MRV, 0, "authToken", "authToken");
		// mcrForSpy.assertParameter(ADD_CALL_AND_RETURN_FROM_MRV, 0, "type", "type");
		// mcrForSpy.assertParameter(ADD_CALL_AND_RETURN_FROM_MRV, 0, "recordGroup", recordGroup);
		// mcrForSpy.assertReturn(ADD_CALL_AND_RETURN_FROM_MRV, 0, retunedValue);
	}

	@Test
	public void testName() throws Exception {
		ModuleInitializer moduleInitializer = new ModuleInitializerSpy();
	}
}
