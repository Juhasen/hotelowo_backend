package pl.juhas.hotelowo_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@With
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "review")
public class Review{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String title;

    private String content;

    private int rating;

    private Boolean wouldRecommend;


    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate reviewDate;

    @PrePersist
    protected void onCreate() {
        this.reviewDate = LocalDate.now();
    }
}
