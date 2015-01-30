package Service;
import javax.jws.WebService;
import message.FigureRequest;


@WebService
public interface MulService {
	int getMulResult(FigureRequest figureRequest);
}

