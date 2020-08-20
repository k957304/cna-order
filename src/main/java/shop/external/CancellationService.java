
package shop.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

//@FeignClient(name="delivery", url="http://delivery:8080") // Cloud의 URL 정보
@FeignClient(name="delivery", url="${api.url.delivery}")
public interface CancellationService {

    @RequestMapping(method= RequestMethod.POST, path="/cancellations")
    public void cancel(@RequestBody Cancellation cancellation);

}