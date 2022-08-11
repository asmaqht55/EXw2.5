package com.example.employees;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
@RequestMapping("api/v1/employ")
public class EmployController {

    ArrayList<Employe> EmployController = new ArrayList<>();

    @GetMapping
    public ResponseEntity getname() {
        return ResponseEntity.status(200).body(EmployController);
    }

    @PostMapping
    public ResponseEntity addtask(@RequestBody @Valid Employe employe, Errors errors) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new EmployMassage(message, 400));
        }
        EmployController.add(employe);
        return ResponseEntity.status(201).body(new EmployMassage("TASK ADDED!", 201));
    }

    @PutMapping("/{index}")
    public  ResponseEntity updatetask(@PathVariable int index, @RequestBody @Valid Employe employe,Errors errors) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new EmployMassage(message, 400));
        }
        EmployController.add(employe);
        return ResponseEntity.status(201).body(new EmployMassage("TASK UPDATED", 201));
    }

    @DeleteMapping("/{index}")
    public ResponseEntity deletetask(@PathVariable int index,Errors errors) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new EmployMassage(message, 400));
        }
        EmployController.remove(index);
        return ResponseEntity.status(201).body(new EmployMassage("TASK UPDATED", 201));
    }

}
