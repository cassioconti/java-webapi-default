# Google App Engine Standard Environment Rest API    
  
## Setup  
1. Update the `<application>` tag in `src/main/webapp/WEB-INF/appengine-web.xml`  
   with your project name.  
1. Update the `<version>` tag in `src/main/webapp/WEB-INF/appengine-web.xml`  
   with your version name.  
  
## Running locally    
    $ mvn appengine:devserver  
  
## Deploying    
    $ mvn appengine:update  