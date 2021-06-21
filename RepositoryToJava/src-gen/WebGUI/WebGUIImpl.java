package WebGUI;

import repository.HTTP;
import repository.IMediaStore;
import repository.Helper;

public class WebGUIImpl implements  HTTP  {
	private IMediaStore iMediaStore;
	
	public WebGUIImpl() {}
	
	public void setIMediaStore(IMediaStore iMediaStore) {
		Helper.assertNull(this.iMediaStore);
		this.iMediaStore = iMediaStore;
	}
	
	//Implementing HTTPDownload from interface HTTP
	@Override
	public void HTTPDownload () {
		Helper.assertNotNull(this.iMediaStore);
		//TODO: implement
	}
	//Implementing HTTPUpload from interface HTTP
	@Override
	public void HTTPUpload () {
		Helper.assertNotNull(this.iMediaStore);
		//TODO: implement
	}
}
