
# Coding Problem: Sales Taxes 
Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is  an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions. 

When I purchase items, I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total  cost of the items, and the total amounts of sales taxes paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price  of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax. 

*Write an application that prints out the receipt details for these shopping baskets:* 
## INPUT 	
*Input 1:* 
1 book at 12.49 
1 music CD at 14.99 
1 chocolate bar at 0.85 

*Input 2:* 
1 imported box of chocolates at 10.00 
1 imported bottle of perfume at 47.50 

*Input 3:* 
1 imported bottle of perfume at 27.99 
1 bottle of perfume at 18.99 
1 packet of headache pills at 9.75 
1 imported box of chocolates at 11.25 

## OUTPUT 
*Output 1:* 
1 book: 12.49 
1 music CD: 16.49 
1 chocolate bar: 0.85 
Sales Taxes: 1.50 
Total: 29.83 

*Output 2:* 
1 imported box of chocolates: 10.50 
1 imported bottle of perfume: 54.65 
Sales Taxes: 7.65 
Total: 65.15 

*Output 3:* 
1 imported bottle of perfume: 32.19 
1 bottle of perfume: 20.89 
1 packet of headache pills: 9.75 
1 imported box of chocolates: 11.85 
Sales Taxes: 6.70 
Total: 74.68

# Solución 1:
## español
*Para solucionar este problema de código he implementado un pequeño Proyecto en Java llamado tax-liferay-java. 
Para esto he usado Liferay Developer Studio 3.9 y Java 1.8.*

*Para ejecutar el programa he añadido las siguientes instrucciones.*

```
java -jar tax-liferay-java.jar %s where %s is 1,2 or 3
example: java -jar tax-liferay-java 1
```

El programa reconoce el argumento inicial que puede ser 1, 2 o 3.

Luego trae desde ItemShopBasketDummyServiceUtil una lista de ItemShopBasket, imprime el imput, luego imprime el output, calculando el impuesto.

Este cálculo lo realicé con un patrón decorator.

## english

To solve this coding problem I have implemented a small project in Java called tax-liferay-java. For this I have used Liferay Developer Studio 3.9 andJava 1.8.
To run the program I have added the following instructions.
```
java -jar tax-liferay-java %s where %s is 1,2 or 3
example: java -jar tax-liferay-java 1
```
The program recognizes the initial argument which can be 1, 2 or 3.
Then it brings from ItemShopBasketDummyServiceUtil a list of ItemShopBasket, prints the imput, then prints the output, calculating the tax.
I did this calculation with a decorator pattern.



#Solución 2
## español
Los proyectos tax-portlet y tax-liferay, son modulos de liferay para la versión 7.2.2 CE. 
El proyecto tax-liferay contiene los módulos tax-liferay-api y tax-liferay-service.
Para la persistencia he utilizado MySQL 5.7.

El modelo de datos es simple y similar al proyecto en Java. Existen dos clases ItemShopBasket y ShopBasket. 
Al momento de desplegar el servicio se crearán las tablas 
```
jb_itemshopbasket
jb_shopbasket
```
El desarrollo ha sido minimalista por una cuestion de tiempo.
Al desplegar el service y el portlet, se debe añadir a la página de inicio el Componente (portlet/witget) "Tax".
En el select se debe escoger cual es la Canasta que desea ver y presionar el botón "View".
Esto mostrará en pantalla el detalle de la canasta.

Cuando se inicia por primera vez el witget, éste valida que existan registros en la tabla, y en caso de no existir la crea por defecto. Se adjunta scrip de mysql para restaurar la BD en caso de que sea necesario. Para ingresar al portal y ver el componente se debe utilizar las siguientes credenciales:
```
User: test@liferay.com
Pass: test
```
## english
The projects tax-portlet and tax-liferay, are liferay modules for version 7.2.2 CE. 
The project tax-liferay contains the modules tax-liferay-api and tax-liferay-service.
For the persistence I used MySQL 5.7.

The data model is simple and similar to the Java project. There are two classes ItemShopBasket and ShopBasket. 
When the service is deployed the tables will be created 
```
jb_itemshopbasket
jb_shopbasket
```
The development has been minimalist for a matter of time.
When deploying the service and the portlet, the component (portlet/witget) "Tax" must be added to the home page.
In the select you must choose which is the Basket you want to see and press the "View" button.
This will show the detail of the basket on the screen.

When the witget is started for the first time, it validates that there are records in the table, and if there are not, it creates them by default. It is attached mysql script to restore the DB in case it is necessary. To enter the portal and view the component, you must use the following credentials
```
User: test@liferay.com
Pass: test
```







