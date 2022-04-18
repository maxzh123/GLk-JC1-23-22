package springboot.topjava.ru;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")

public class PaymentController {
    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    private static volatile int helloCount = 0;

    @GetMapping
    public BaseResponse showStatus() {
        return new BaseResponse(SUCCESS_STATUS, 1);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Привет "+ ++helloCount;
    }

    @GetMapping("/formula")
    public int hello(@RequestParam(value = "x") Integer x, @RequestParam(value = "y") Integer y) {
        return x+y*(x-y*x);
    }



    @PostMapping("/pay")
    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {

        final BaseResponse response;

        if (sharedKey.equalsIgnoreCase(key)) {
            int userId = request.getUserId();
            String itemId = request.getItemId();
            double discount = request.getDiscount();
            // Process the request
            // ....
            // Return success response to the client.
            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else {
            response = new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
        }
        return response;
    }
}
