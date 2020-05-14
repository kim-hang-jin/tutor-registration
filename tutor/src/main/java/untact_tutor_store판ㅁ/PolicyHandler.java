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
    public void wheneverSalesCancellationApproved_RequestCancelForTutoring(@Payload SalesCancellationApproved salesCancellationApproved){

        if(salesCancellationApproved.isMe()){
            System.out.println("##### listener RequestCancelForTutoring : " + salesCancellationApproved.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverApprovedForSale_ChangeOfTutoringStatus(@Payload ApprovedForSale approvedForSale){

        if(approvedForSale.isMe()){
            System.out.println("##### listener ChangeOfTutoringStatus : " + approvedForSale.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSalesCancellationApproved_ChangeOfTutoringStatus(@Payload SalesCancellationApproved salesCancellationApproved){

        if(salesCancellationApproved.isMe()){
            System.out.println("##### listener ChangeOfTutoringStatus : " + salesCancellationApproved.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverApprovedForSale_TutorRegistrationRequest(@Payload ApprovedForSale approvedForSale){

        if(approvedForSale.isMe()){
            System.out.println("##### listener TutorRegistrationRequest : " + approvedForSale.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSatisfactionAnswered_SatisfactionStatusChange(@Payload SatisfactionAnswered satisfactionAnswered){

        if(satisfactionAnswered.isMe()){
            System.out.println("##### listener SatisfactionStatusChange : " + satisfactionAnswered.toJson());
        }
    }

}
