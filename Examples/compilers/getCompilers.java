package compilers;
/**
 * Example presents usage of the successful getCompilers() API method  
 */

import com.SphereEngine.Api.CompilersClientV3;
import com.google.gson.JsonObject;

public class getCompilers 
{

	public static void main(String[] args) 
	{
		CompilersClientV3 client = new CompilersClientV3(
				"<access_token>", 
				"<endpoint>");
		
		JsonObject response = client.getCompilers();
	}	
}
