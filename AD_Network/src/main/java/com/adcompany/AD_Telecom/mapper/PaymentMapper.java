package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Payment;
import com.adcompany.AD_Telecom.model.PaymentModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PaymentMapper {

    PaymentModel toPaymentModel(Payment payment);

    Payment toPayment(PaymentModel paymentModel);
}
