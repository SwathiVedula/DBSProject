
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="OrderItemClient", url="https://localhost:8080/OrderItem")
public interface OrderItemClient {
    @GetMapping(value="/retrieveorderitem/{productCode}",consumes=MediaType.APPLICATION_JSON_VALUE)
    orderItems retrieveOrderItem(productCode);
}