package br.com.kualit.payroll.services;

import br.com.kualit.payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.00, days);
    }
}
