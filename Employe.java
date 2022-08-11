package com.example.employees;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;

@AllArgsConstructor
@Data
public class Employe {
 @NotNull (message = "Can't be empty")
 @Size  (min=4,max=15,message = "The name must be more than 4 char")
 private String name ;
 @NotNull(message ="Can't be empty")
 @Size(min=2,max=10,message = "The ID most be more than 2")
 private int ID;
@NotNull(message ="Can't be empty" )
@Max(value = 25,message = "The age must be more than 25")
 private int age;
@AssertFalse (message = "try agin !")
private boolean onLeave =false;
@NotNull (message = "Can't be empty")
@Digits(message="Number should contain For 4 digits.", fraction = 0, integer = 4)
private int employmentYear;
@NotNull (message = "Can't be empty")
private int annualLeave;

}
