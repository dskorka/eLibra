package infrastructure.web.subscriber;

import application.subscriber.command.SubscriberCommand;
import application.subscriber.service.SubscriberService;
import infrastructure.web.JsonResponse;
import infrastructure.web.JsonResponseType;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Damian on 13.08.2017
 */
@RestController
class SubscriberController {

    private final SubscriberService subscriberService;

    SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @PostMapping("/subscribe")
    ResponseEntity<JsonResponse> subscribe(@Valid @RequestBody SubscriberCommand command, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(
                    new JsonResponse(JsonResponseType.ERROR, getErrorsMessage(bindingResult)),
                    new HttpHeaders(),
                    HttpStatus.BAD_REQUEST
            );
        }

        subscriberService.sendEmailToSubscriber(command);

        return new ResponseEntity<>(
                new JsonResponse(JsonResponseType.SUCCESS, Collections.singletonList("Operacja zakończyła się pomyślnie!")),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    private List<String> getErrorsMessage(BindingResult bindingResult) {
        return bindingResult
                .getAllErrors()
                .stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());
    }
}