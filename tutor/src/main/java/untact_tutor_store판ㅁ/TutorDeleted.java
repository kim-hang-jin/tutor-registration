package untact_tutor_store판ㅁ;

public class TutorDeleted extends AbstractEvent {

    private Long id;

    public TutorDeleted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
