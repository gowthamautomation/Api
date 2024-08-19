package org.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login_output_popjo {
	 private int status;
	    private String message;
	    private Data data;
	    private String refer_msg;
	    private int cart_count;
	    private String role;

}
