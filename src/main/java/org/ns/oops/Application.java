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


        ExecutorService executorService = new ExecutorServiceImpl();
        Cart cartA = (Cart) executorService.execute(EXECMETHOD.NEW);
        executorService.execute(EXECMETHOD.ADD, new Product(), cartA);
        executorService.execute(EXECMETHOD.ADD, new Product(), cartA);
        executorService.execute(EXECMETHOD.ADD, new Product(), cartA);
        executorService.execute(EXECMETHOD.ADD, new Product(), cartA);
        executorService.execute(EXECMETHOD.PAY, cartA, PaymentType.COD);

    }
}


