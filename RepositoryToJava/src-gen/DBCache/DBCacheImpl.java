package DBCache;

import repository.AudioDB;
import repository.Helper;

public class DBCacheImpl implements  AudioDB  {
	private AudioDB audioDB;
	
	public DBCacheImpl() {}
	
	public void setAudioDB(AudioDB audioDB) {
		Helper.assertNull(this.audioDB);
		this.audioDB = audioDB;
	}
	
	//Implementing addFile from interface AudioDB
	@Override
	public void addFile () {
		Helper.assertNotNull(this.audioDB);
		//TODO: implement
	}
	//Implementing queryDB from interface AudioDB
	@Override
	public void queryDB () {
		Helper.assertNotNull(this.audioDB);
		//TODO: implement
	}
}
