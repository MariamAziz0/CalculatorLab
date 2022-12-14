package com.example.demo.calculate;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("")
public class CalculateController {

	@Autowired
	private CalculateService calculateService;
	
	
	@PostMapping({"/twoOperandOperator"})
	public Calculated twoOperandGet(@RequestBody Calculated calc) {
		calculateService.twoOperandOperator(calc);
		calc = calculateService.post();
		return calc;
	}
	
	
	@PostMapping({"/oneOperandOperator"})
	public Calculated oneOperandPost(@RequestBody Calculated calc) {
		calculateService.oneOperandOperator(calc);
		return calc;
	}
	
	
}
