# Servlets
<p>This page is about servlets</p>

## Servlet description

```js
    Servlets 
```
## ServletConfig 
<p>ServletConfig object is created by web container for each servlet to pass information to a servlet during initialization.This object can be used to get configuration information from web.xml file.

when to use : if any specific content is modified from time to time. you can manage the Web application easily without modifing servlet through editing the value in web.xml

Your web.xml look like :
```js
 <web-app>  
      <servlet>  
        ......     
        <init-param>  
        <!--here we specify the parameter name and value -->
          <param-name>paramName</param-name>  
          <param-value>paramValue</param-value>  
        </init-param> 
        ......  
      </servlet>  
    </web-app>
```

This way you can get value in servlet :
```js
public void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
     //getting paramValue
    ServletConfig config=getServletConfig();  
    String driver=config.getInitParameter("paramName"); 
    } 
  
```
 </p>

## ServletContext
<p> web container create one ServletContext object per web Application. This object is used to get information from web.xml

when to use : If you want to share information to all sevlet, it a better way to make it available for all servlet.

web.xml look like :
```js
<web-app>  
 ......  

  <context-param>  
    <param-name>paramName</param-name>  
    <param-value>paramValue</param-value>  
  </context-param>  
 ......  
</web-app>  
```
This way you can get value in servlet :
```js
public void doGet(HttpServletRequest request,HttpServletResponse response)  
throws ServletException,IOException  
{  
 //creating ServletContext object  
ServletContext context=getServletContext();  

//Getting the value of the initialization parameter and printing it  
String paramName=context.getInitParameter("paramName");   
}  
```
</p>

## HttpSession
<p>
Http is stateless protocol and we need to maintain session, so web container will create one object to maintain the state of particular user this object is called HttpSession Object. When request comes to web container it will  create HttpSession object with unique id to it and container also provides HttpSession interface through which servlets can modify the HttpSession Object created by the container. Web container also sets a Cookie in the header of the HTTP response with cookie name and the unique session ID as its value.

The cookie is stored in the user browser, the client (user’s browser) sends this cookie back to the server for all the subsequent requests until the cookie is valid. The Servlet container checks the request header for cookies and get the session information from the cookie and use the associated session from the server memory.
</p>