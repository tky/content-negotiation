Content Negotiation using Spring MVC!
=====================================

## Run
mvn jetty:run

## JSON(default)
http://localhost:8080/sample/1
{
  "sampleModel" : {
    "name" : "name",
    "id" : 1
  }
}
## JSONP
http://localhost:8080/sample/1?callback=f
f({"sampleModel":{"name":"name","id":1}});
