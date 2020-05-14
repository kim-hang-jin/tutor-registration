package untact_tutor_store판ㅁ;

import untact_tutor_store판ㅁ.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaid_AccountTransferRequest(@Payload Paid paid){

        if(paid.isMe()){
            System.out.println("##### listener AccountTransferRequest : " + paid.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentCanceled_AccountTransferRequest(@Payload PaymentCanceled paymentCanceled){

        if(paymentCanceled.isMe()){
            System.out.println("##### listener AccountTransferRequest : " + paymentCanceled.toJson());
        }
    }

}
