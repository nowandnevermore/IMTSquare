package tr.edu.metu.ii.AnyChange.product.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "PriceInformations")
public class PriceInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade=CascadeType.ALL)
    private PricePoint currentPrice;
    @OneToMany
    private List<PricePoint> priceHistory;
}
