package interfaces;
// loose coupling and highly cohesive
class CrediCard{
     void payment(){}
}
class Upi{void payment(){}}
class neft{void payment(){}}
class AdvanceMode{void payment(){}}
public class Billing {

    // cc, upi, neft, cod
    // notfify
    Payment payment;
    Billing(Payment payment){ //
        this.payment = payment;
    }

}
