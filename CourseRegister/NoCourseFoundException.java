package basicprograms;

//create NoCourseFoundException for thorw exception
public class NoCourseFoundException extends RuntimeException {
	 public NoCourseFoundException(String name)
	 {
		 super(name);
	 }

}