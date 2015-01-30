package Service;
import javax.jws.WebService;
import message.FigureRequest;


@WebService
public interface SubService {
	int getSubResult(FigureRequest figureRequest);
}

