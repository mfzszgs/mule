package Service;
import javax.jws.WebService;
import message.FigureRequest;


@WebService
public interface AddService {
	int getAddResult(FigureRequest figureRequest);
}

