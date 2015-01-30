package Service;

import message.FigureRequest;

public class AddImp implements AddService {
	
	public int getAddResult(FigureRequest figureRequest) {
		return figureRequest.getFirstNum()+figureRequest.getSecondNum();
	}
}
