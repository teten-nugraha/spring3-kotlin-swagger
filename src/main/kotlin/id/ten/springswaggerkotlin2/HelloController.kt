package id.ten.springswaggerkotlin2

import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class HelloController {

    @Operation(summary = "Get all users", description = "Returns a list of users")
    @GetMapping("/users")
    fun getUsers(): List<String> {
        return listOf("Alice", "Bob", "Charlie")
    }

}