package untact_tutor_store판ㅁ;

public class TutoringRegistered extends AbstractEvent {

    private Long id;

    public TutoringRegistered(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
