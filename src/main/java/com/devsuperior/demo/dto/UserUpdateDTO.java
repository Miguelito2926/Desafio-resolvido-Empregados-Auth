package com.devsuperior.demo.dto;



import com.devsuperior.demo.services.validation.UserUpdateValid;

import java.io.Serial;
import java.io.Serializable;
@UserUpdateValid
public class UserUpdateDTO  extends UserDTO implements Serializable{
	@Serial
	private static final long serialVersionUID = 1L;
}
