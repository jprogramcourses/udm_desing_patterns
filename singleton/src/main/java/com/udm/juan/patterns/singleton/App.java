package com.udm.juan.patterns.singleton;

import com.udm.juan.patterns.singleton.eager.EagerRegistry;
import com.udm.juan.patterns.singleton.lazy.LazyRegistryIODH;
import com.udm.juan.patterns.singleton.lazy.LazyRegistryWithDCL;

public class App {
    
    public static void main(String[] args) {
    	
    	EagerRegistry registry = EagerRegistry.getInstance();
    	EagerRegistry registry2 = EagerRegistry.getInstance();
    	System.out.println("EagerRegistry");
    	System.out.println(registry == registry2);
    	
    	LazyRegistryWithDCL lazyRegistry1 = LazyRegistryWithDCL.getInstance();
    	LazyRegistryWithDCL lazyRegistry2 = LazyRegistryWithDCL.getInstance();
    	System.out.println("LazyRegistry");
    	System.out.println(lazyRegistry1 == lazyRegistry2);
    	
    	LazyRegistryIODH.getInstance();
    	LazyRegistryIODH.getInstance();
    	LazyRegistryIODH.getInstance();
    	LazyRegistryIODH.getInstance();
    	
    }
    
}
