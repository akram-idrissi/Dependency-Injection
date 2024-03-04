package methodeAnnotations;

import org.springframework.stereotype.Component;

//@Component
public class DogSound implements ISound {

	@Override
	public void sound() {
		System.out.println("Dog says: woof woof woof");
	}
	
}
