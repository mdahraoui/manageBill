package domains;

import java.time.LocalDateTime;

import javax.persistence.*;

@MappedSuperclass
	public abstract class AbstractEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Version
	    private int version;

	    private LocalDateTime createdAt;

	    @PrePersist
	    private void init(){
	        createdAt = LocalDateTime.now();
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public LocalDateTime getCreatedAt() {
			return createdAt;
		}
	}

