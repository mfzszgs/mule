package Service;
import javax.jws.WebService;
import message.FigureRequest;


@WebService
public interface DivService {
	int getDivResult(FigureRequest figureRequest);
}

