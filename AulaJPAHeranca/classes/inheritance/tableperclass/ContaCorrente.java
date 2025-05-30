package classes.inheritance.tableperclass;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class ContaCorrente extends Conta implements Serializable {
    
    private static final long serialVersionUID = 1L;


}
