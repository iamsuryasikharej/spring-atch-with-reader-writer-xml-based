

import org.springframework.batch.item.ItemProcessor;  

//Implementing the ItemProcessor interface 
public class CustomItemProcessor implements ItemProcessor<Tutorial,Object> {

	public Tutorial process(Tutorial item) throws Exception {
		System.out.println("processing item"+item);
		return null;
	}  




} 
