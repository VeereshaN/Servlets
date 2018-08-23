# Servlets
<p>This page is about servlets</p>

## Servlet description

```js
    Servlets 
```
##ServletConfig 
<p>ServletConfig object is created by web container for each servlet to pass information to a servlet during initialization.This object can be used to get configuration information from web.xml file.

when to use : if any specific content is modified from time to time. you can manage the Web application easily without modifing servlet through editing the value in web.xml

Your web.xml look like :

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

This way you can get value in servlet :

public void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
     //getting paramValue
    ServletConfig config=getServletConfig();  
    String driver=config.getInitParameter("paramName"); 
    } </p>


    ##ServletContext
    <p> web container create one ServletContext object per web Application. This object is used to get information from web.xml

when to use : If you want to share information to all sevlet, it a better way to make it available for all servlet.

web.xml look like :

<web-app>  
 ......  

  <context-param>  
    <param-name>paramName</param-name>  
    <param-value>paramValue</param-value>  
  </context-param>  
 ......  
</web-app>  

This way you can get value in servlet :

public void doGet(HttpServletRequest request,HttpServletResponse response)  
throws ServletException,IOException  
{  
 //creating ServletContext object  
ServletContext context=getServletContext();  

//Getting the value of the initialization parameter and printing it  
String paramName=context.getInitParameter("paramName");   
}  </p>
