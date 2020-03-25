package org.ns.oops.service;

import org.ns.oops.pojos.enums.EXECMETHOD;

public interface ExecutorService {

    // nothing but executes and matches and borrows components that we need
    public Object execute(EXECMETHOD method, Object ... value);

}
