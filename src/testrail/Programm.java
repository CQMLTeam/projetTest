package testrail;

import java.util.HashMap;
import java.util.Map;

public class Programm {
	private APIClient client;
	public Programm() {
		client = new APIClient(" https://projetcqml.testrail.io/");
		client.setUser("djibydieng1991@gmail.com");
		client.setPassword("RLfBfa./VqKziyb2ud5l");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public void addresult (int runID,int testID,boolean status) throws Exception {
		
		/**
		 * Add results for case
		 */
		Map data = new HashMap();
		data.put("status_id", new Integer(1));
		if(status) 
			data.put("comment", "Le test a reussi");
		else
			data.put("comment", "Le test a echoue");
		JSONObject r = (JSONObject) client.sendPost("add_result_for_case/"+runID+"/"+testID, data);
	}
	
	public static void main(String[] args) throws Exception{
		
		Programm prog = new Programm();
		prog.addresult(1, 1, true);
		prog.addresult(2, 2, true);
		prog.addresult(3, 3, true);
	}

}
