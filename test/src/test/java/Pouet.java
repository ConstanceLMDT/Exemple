import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Pouet {

    @InjectMocks
    PriceService testee;

    @Mock
    PriceRepository priceRepository;

    @Test
    void shouldFindPrices() {

    }
}
