package MediaManager;

import repository.IMediaStore;
import repository.Sound;
import repository.AudioDB;
import repository.Helper;

public class MediaManagerImpl implements  IMediaStore  {
	private Sound sound;
	private AudioDB audioDB;
	
	public MediaManagerImpl() {}
	
	public void setSound(Sound sound) {
		Helper.assertNull(this.sound);
		this.sound = sound;
	}
	public void setAudioDB(AudioDB audioDB) {
		Helper.assertNull(this.audioDB);
		this.audioDB = audioDB;
	}
	
	//Implementing download from interface IMediaStore
	@Override
	public void download () {
		Helper.assertNotNull(this.sound);
		Helper.assertNotNull(this.audioDB);
		//TODO: implement
	}
	//Implementing upload from interface IMediaStore
	@Override
	public void upload () {
		Helper.assertNotNull(this.sound);
		Helper.assertNotNull(this.audioDB);
		//TODO: implement
	}
}
