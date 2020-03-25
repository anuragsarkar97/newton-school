package org.ns.oops;

import org.ns.oops.pojos.Cart;
import org.ns.oops.pojos.Product;
import org.ns.oops.pojos.enums.EXECMETHOD;
import org.ns.oops.pojos.enums.PaymentType;
import org.ns.oops.service.ExecutorService;
import org.ns.oops.service.impl.ExecutorServiceImpl;

public class Application {
    // this is dumb
    public static void main(String... args) {
        // this is the place everything is invoked !
        // comments are super important
        // not shitty comments please

        // the function invocation
        // only one exxutor and it everything

        // asbtraction !!
        // strictly typed
        ExecutorService executorService = new ExecutorServiceImpl();
        Cart cartA = (Cart) executorService.execute(EXECMETHOD.NEW);
        executorService.execute(EXECMETHOD.ADD, new Product(), null);
        executorService.execute(EXECMETHOD.ADD, new Product(), cartA);
        executorService.execute(EXECMETHOD.ADD, new Product(), cartA);
        executorService.execute(EXECMETHOD.ADD, new Product(), cartA);
        executorService.execute(EXECMETHOD.PAY, cartA, PaymentType.COD);

    }
}
