package org.ns.oops.service.impl;


import org.ns.oops.pojos.Cart;
import org.ns.oops.pojos.Product;
import org.ns.oops.pojos.enums.EXECMETHOD;
import org.ns.oops.pojos.enums.PaymentType;
import org.ns.oops.service.CashierService;
import org.ns.oops.service.ExecutorService;

public class ExecutorServiceImpl implements ExecutorService {

    private CashierService cashierService = new CashServiceImpl();

    public Object execute(EXECMETHOD method, Object... value) {

        switch (method) {

            case ADD:
                cashierService.add((Product) value[0], (Cart) value[1]);
                break;
            case NEW:
                return cashierService.createCart();
            case REMOVE:
                cashierService.remove((String) value[0], (Cart) value[1]);
                break;
            case PAY:
                cashierService.pay((Cart) value[0], (PaymentType) value[1]);
                break;
        }

        return null;
    }
}
