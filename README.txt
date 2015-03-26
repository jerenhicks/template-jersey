How to set up

- Run 'mvn install' to pull down dependancies.
- In Eclipse, utilize the embedded Tomcat 8 server and add the package to it.
- Start server.

URLS:

http://localhost:8080/com.ocean.template.jersey/test     {GET, DELETE, PUT}
http://localhost:8080/com.ocean.template.jersey/api-docs
http://localhost:8080/com.ocean.template.jersey/api-docs/test

New controllers can be added in the controllers directory and then hit at /api-docs/controller_path.