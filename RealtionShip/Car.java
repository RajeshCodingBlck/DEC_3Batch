package RealtionShip;

public class Car {

	
	 Engine eng;
	 
	 MusicPlayer musicSystem;
	 
	 Car(){
		 eng= new Engine();
	 }
	 
	 public void StartCar() {
		  
		 eng.StartEngine();
	 }
	 
	 public void addMusicSystem() {
		 musicSystem= new MusicPlayer();
	 }
	 
	 public void PlayMusic() {
		 
		 if(musicSystem==null) {
			 System.out.println("Gaana Nahi Baja Sakte");
		 }else {
			 musicSystem.PlayMusic();
		 }
	 }
	 
}
