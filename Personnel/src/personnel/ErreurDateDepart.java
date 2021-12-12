package personnel;
import java.time.LocalDate;

public class ErreurDateDepart extends Exception {
	public ErreurDateDepart (LocalDate dateDebut, LocalDate datefin)
	{
		System.out.println("La date d'arrivée : "+ dateDebut+" est inférieur à la date de départ :"+ datefin);
	}

}
