package pl.hexagon.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hexagon.application.port.in.CreateFooInputPort;

@RestController
public class FooResource {
    private final CreateFooInputPort createFooInputPort;

    public FooResource(CreateFooInputPort createFooInputPort) {
        this.createFooInputPort = createFooInputPort;
    }

    @GetMapping("/")
    ResponseEntity<?> foo() {
        return ResponseEntity.ok("status running");
    }

    @GetMapping("/foo")
    ResponseEntity<?> createFoo(CreateFooDto createFooDto) {
        var createFooCommand = new CreateFooInputPort.FooCreateCommand(createFooDto.getTitle());
        createFooInputPort.createFoo(createFooCommand);
        return ResponseEntity.accepted().build();
    }
}
