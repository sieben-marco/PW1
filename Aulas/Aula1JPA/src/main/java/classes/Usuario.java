package classes;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremento
	private Long idUsusario;
	
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}
   
}
