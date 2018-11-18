package javabasics;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
 
public class App {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        
       
        // Create JSON Array from String
        //String jsonString = "{\"firstName\":\"Sergey\",\"lastName\":\"Kargopolov\"}";
        

        	 String jsonString1="{\n" + 
        	 		"  \"data\": [\n" + 
        	 		"    {\n" + 
        	 		"      \"attributes\": {\n" + 
        	 		"        \"deployed\": false,\n" + 
        	 		"        \"name\": \"testdemo33\",\n" + 
        	 		"        \"description\": \"testdemocheck1\",\n" + 
        	 		"        \"type\": \"Script\",\n" + 
        	 		"        \"hostedUrl\": \"\",\n" + 
        	 		"        \"modifiedBy\": \"\",\n" + 
        	 		"        \"jsonContent\": {\"boot\":[{\"task\":\"logics: d2\"}]},\n" + 
        	 		"        \"deployedBy\": \"\",\n" + 
        	 		"        \"deployedDate\": null,\n" + 
        	 		"        \"displayWarningMessage\": false\n" + 
        	 		"      },\n" + 
        	 		"      \"type\": \"Tag\"\n" + 
        	 		"    }\n" + 
        	 		"  ]\n" + 
        	 		"}";
        JsonParser jsonParser = new JsonParser();
        JsonObject objectFromString = jsonParser.parse(jsonString1).getAsJsonObject();
 
        System.out.println(objectFromString.toString());
        
        // Convert JSON Array String into JSON Array 
        String jsonArrayString = "[\"Russian\",\"English\",\"French\"]";
        JsonArray arrayFromString = jsonParser.parse(jsonArrayString).getAsJsonArray();
        
        System.out.println(arrayFromString.toString());
        
        
        // Convert JSON Array String into Java Array List
         Gson googleJson = new Gson();
         ArrayList javaArrayListFromGSON = googleJson.fromJson(arrayFromString, ArrayList.class);
         
         System.out.println(javaArrayListFromGSON);
         ObjectMapper mapper = new ObjectMapper();
         Map<String,Object> map = mapper.readValue(jsonString1, Map.class);
         JsonNode rootNode = mapper.readTree(jsonString1);
         Example ex = mapper.readValue(jsonString1, Example.class);
        System.out.println("NAMEEEEEEEEE: "+ex.getData().get(0).getAttributes().getName());

        //Convert Java Plain Object into JSON
        Person personPojo = new Person();
        personPojo.setFirstName("Sergey");
        personPojo.setLastName("Kargopolov");

        Gson gsonBuilder = new GsonBuilder().create();
        String jsonFromPojo = gsonBuilder.toJson(personPojo);
        
        System.out.println(jsonFromPojo);

        // Convert Java Map into JSON 
        Map personMap = new HashMap();
        personMap.put("firstName", "Sergey");
        personMap.put("lastName", "Kargopolov");
        String jsonFromJavaMap = gsonBuilder.toJson(personMap);
        
        System.out.println(jsonFromJavaMap);

        // Convert Java Array into JSON
        List languagesArrayList = new ArrayList();
        languagesArrayList.add("Russian");
        languagesArrayList.add("English");
        languagesArrayList.add("French");
        
        String jsonFromJavaArrayList = gsonBuilder.toJson(languagesArrayList);
        
        System.out.println(jsonFromJavaArrayList);
       
    }

   

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonPropertyOrder({
    "deployed",
    "name",
    "description",
    "type",
    "hostedUrl",
    "modifiedBy",
    "jsonContent",
    "deployedBy",
    "deployedDate",
    "displayWarningMessage"
    })
    public static class Attributes {

    @JsonProperty("deployed")
    private Boolean deployed;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("type")
    private String type;
    @JsonProperty("hostedUrl")
    private String hostedUrl;
    @JsonProperty("modifiedBy")
    private String modifiedBy;
    @JsonProperty("jsonContent")
    private JsonContent jsonContent;
    @JsonProperty("deployedBy")
    private String deployedBy;
    @JsonProperty("deployedDate")
    private Object deployedDate;
    @JsonProperty("displayWarningMessage")
    private Boolean displayWarningMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public Attributes(){}
    
    @JsonProperty("deployed")
    public Boolean getDeployed() {
    return deployed;
    }

    @JsonProperty("deployed")
    public void setDeployed(Boolean deployed) {
    this.deployed = deployed;
    }

    @JsonProperty("name")
    public String getName() {
    return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
    this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
    return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
    this.description = description;
    }

    @JsonProperty("type")
    public String getType() {
    return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
    this.type = type;
    }

    @JsonProperty("hostedUrl")
    public String getHostedUrl() {
    return hostedUrl;
    }

    @JsonProperty("hostedUrl")
    public void setHostedUrl(String hostedUrl) {
    this.hostedUrl = hostedUrl;
    }

    @JsonProperty("modifiedBy")
    public String getModifiedBy() {
    return modifiedBy;
    }

    @JsonProperty("modifiedBy")
    public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    }

    @JsonProperty("jsonContent")
    public JsonContent getJsonContent() {
    return jsonContent;
    }

    @JsonProperty("jsonContent")
    public void setJsonContent(JsonContent jsonContent) {
    this.jsonContent = jsonContent;
    }

    @JsonProperty("deployedBy")
    public String getDeployedBy() {
    return deployedBy;
    }

    @JsonProperty("deployedBy")
    public void setDeployedBy(String deployedBy) {
    this.deployedBy = deployedBy;
    }

    @JsonProperty("deployedDate")
    public Object getDeployedDate() {
    return deployedDate;
    }

    @JsonProperty("deployedDate")
    public void setDeployedDate(Object deployedDate) {
    this.deployedDate = deployedDate;
    }

    @JsonProperty("displayWarningMessage")
    public Boolean getDisplayWarningMessage() {
    return displayWarningMessage;
    }

    @JsonProperty("displayWarningMessage")
    public void setDisplayWarningMessage(Boolean displayWarningMessage) {
    this.displayWarningMessage = displayWarningMessage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }
    
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }

    }

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonPropertyOrder({
    "task"
    })
    public static class Boot {

    @JsonProperty("task")
    private String task;
    @JsonCreator
    public Boot() {}
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("task")
    public String getTask() {
    return task;
    }

    @JsonProperty("task")
    public void setTask(String task) {
    this.task = task;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }

    }
   

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonPropertyOrder({
    "attributes",
    "type"
    })
    public static class Datum1 {

    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("attributes")
    public Attributes getAttributes() {
    return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
    }

    @JsonProperty("type")
    public String getType() {
    return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
    this.type = type;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }

    }
 
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonPropertyOrder({
    "data"
    })
    public static class Example {

    @JsonProperty("data")
    private List<Datum1> data = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonCreator
    public Example() {}
    @JsonProperty("data")
    public List<Datum1> getData() {
    return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum1> data) {
    this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }

    }
   
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonPropertyOrder({
    "boot"
    })
    public static class JsonContent {

    @JsonProperty("boot")
    private List<Boot> boot = null;
    @JsonCreator
    public JsonContent() {}
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("boot")
    public List<Boot> getBoot() {
    return boot;
    }

    @JsonProperty("boot")
    public void setBoot(List<Boot> boot) {
    this.boot = boot;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }

    }
}
