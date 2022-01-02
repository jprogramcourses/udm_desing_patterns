package com.udm.juan.patterns.singleton.lazy;

/**
 * Although this implementation solves the multi-threading issue with lazy
 * initialization using volatile and double check locking.
 * 
 * @author juand
 *
 */
public class LazyRegistryWithDCL {

	private LazyRegistryWithDCL() {

	}

	private static volatile LazyRegistryWithDCL INSTANCE;

	public static LazyRegistryWithDCL getInstance() {
		if (INSTANCE == null) {
			synchronized (LazyRegistryWithDCL.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazyRegistryWithDCL();
				}
			}
		}
		return INSTANCE;

	}

}
