package resources;
//Enum is special class in java which collection of constants or method

public enum ApiResources {
 AddApiResource("/maps/api/place/json"),
 getPlaceAPI("maps/api/place/json"),
 deletePlaceAPI("maps/api/place/json");
	private String resource;
	ApiResources(String resource){
		this.resource=resource;
		
	}
	public String getresource() {
		return resource;
	}
}
