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
    public void wheneverApprovedForSale_SalesRequestStatusChange(@Payload ApprovedForSale approvedForSale){

        if(approvedForSale.isMe()){
            System.out.println("##### listener SalesRequestStatusChange : " + approvedForSale.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSalesCancellationApproved_SalesRequestStatusChange(@Payload SalesCancellationApproved salesCancellationApproved){

        if(salesCancellationApproved.isMe()){
            System.out.println("##### listener SalesRequestStatusChange : " + salesCancellationApproved.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSalesRejected_SalesRequestStatusChange(@Payload SalesRejected salesRejected){

        if(salesRejected.isMe()){
            System.out.println("##### listener SalesRequestStatusChange : " + salesRejected.toJson());
        }
    }

}
