
App name - Radiance <br>

<img src='./ProjectRadiance/AppSnap.png'>



  <br>
  <br>
  <br>

Summary <br>
<br>
This report outlines the design and implementation of an online renewal sources of energy platform where energy analysts can register and request resource to build up their industrial platform. They can request loans, supplies, subsidy from this platform and keep track of their requests. <br>
Introduction  <br> 
Application Architecture <br>
Class Diagram <br>
Key Features Use Cases <br>
Technology Stack <br>
Instructions to run the project <br>
 


1.	Introduction <br>
<br>
◾Radiance offers seamless cross-party integration, breaking down data silos and providing a centralized platform where stakeholders can collaborate, share data, and make informed decisions. <br>
◾	Radiance ensures all stakeholders adhere to the latest industry compliance regulations through strict validations throughout the platform. <br>
◾	The most important feature of Radiance is that it can establish connections between renewable energy production companies and financial institutions, thus streamlining the financing process and increasing transparency to attract potential investors. <br>
◾	Our ecosystem helps businesses optimize loan application process, procurement process, monitor shipping and enhance overall efficiency of the supply chain. <br>
◾	A dashboard report is available that involves real time monitoring of users who sign up and top performers on the platform. <br>
◾	What is included in this project: <br>
Deliverables: <br>
-	A workflow application including 5 enterprises, 7 organisation and 16 user roles 
-	(including sub departments) <br>
-	Presentation explaining entire ide and implementation. <br>
-	Included Report dashboard of the application. <br>
-	User Authentication (login for each user role accounts) <br>
-	ConfigureASystem file for data. And DB Integration <br>
 
 <br>
 <br>
 <br>
 <br>

2.	Application Architecture <br>

The application is implemented in NetBeans and integrated with DBO4 database. It is divided into 5 business Modules: <br>
1.	Energy Association <br>
2.	Bank Enterprise <br>
3.	Government Enterprise <br>
4.	Micro-Credit Enterprise <br>
5.	Supplier Enterprise <br>
<img src='RadianceArchitecturalDiagram.jpeg'>

<br>
<br>
<br>

3.	Application Class Diagram <br>
Please find the detailed implementation of the application below in the form of class diagram - <br>
<img src='RadianceClassdiagram (1).jpeg'>
 

 <br>
 <br>
 <br>
 <br>
 
4.	Key Technical Features: <br>
<br>
<br>
1.	SMS Integration: <br>
Purpose: Enable the application to send SMS notifications to users for important events or updates for subsidy approval.
Integrated with an SMS gateway service (Twilio) <br>
2.	Report Dashboard: <br>
Purpose: Provide a visual representation of key metrics and data trends for users. <br>
3.	DB Integration: <br>
Purpose: Establish a connection between the application and a database to store and retrieve data such as DBO4
4.	Status Updation: <br>
Purpose: Keep users informed about the status of their requests or transactions. Implementation:
Update the status of requests in the database. <br>
5.	User Authentication: <br>
Purpose: Ensure secure access to the application and its features. Created a login flow of all the users in the application. <br>
6.	Two-Process Request Workflow: <br>
Purpose: Manage complex processes that require approval or verification from multiple stages, such as Client check has been done post managerial flow. <br> 
7.	Document Upload and View Feature: <br>
Purpose: Allow users to upload and view documents within the application, such as proof of SSN , collateral etc. <br>
8.	Validations in Forms: <br>
Purpose: Ensure data integrity by validating user inputs on forms. Implementation, for example – phone number, email id of user. Implement client-side validations using JavaScript for immediate feedback. <br>
9.	Configuration File: <br>
Purpose: Centralize and manage application configuration settings. <br>
 
<br>
<br>
<br>
<br>

5.	Use Case (Application Workflow) <br>
 <br>
1.	System Admin <br>
View/Add/Delete Ecosystem:<br>
Use Case: Access network information, add new networks, delete existing ecosystem. View/Add/Delete Enterprise:
Use Case: Access enterprise details, add new enterprises, delete existing enterprises. View/Add/Delete Enterprise Admin:
Use Case: Manage enterprise administrators, view, add, or delete enterprise admin accounts.
2.	Energy Enterprise Admin <br>
View/Add/Delete Energy Organization: <br>
Use Case: Access energy organization details, add new organizations, delete existing organizations. <br>
View/Add/Delete Energy: <br>
Use Case: Manage energy-related information, add new energy records, delete existing energy records. <br>
3.	Bank Enterprise Admin <br>
View/Add/Delete Bank Manager Organization/Bank Client Check Organization: <br>
Use Case: Access and manage bank manager and client check organizations, add new organizations, delete existing ones. <br>
View/Add/Delete Bank Manager/Bank Client Check Officer: <br>
Use Case: Manage bank managers and client check officers, add new accounts, delete existing accounts. <br>
4.	Micro-Credit Enterprise Admin <br>
View/Add/Delete Micro-Credit Manager Organization/Micro-Finance Client Check Organization: <br>
Use Case: Access and manage micro-finance manager and client check organizations, add new organizations, delete existing ones. <br>
View/Add/Delete Micro- Credit Manager/Micro-Finance Client Check Officer: <br>
Use Case: Manage micro- Credit managers and client check officers, add new accounts, delete existing accounts. <br>
5.	Government Enterprise Admin <br>
View/Add/Delete Subsidy Manager Organization/Subsidy Client Check Organization: <br>
Use Case: Access and manage subsidy manager and client check organizations, add new organizations, delete existing ones. <br>
View/Add/Delete Subsidy Manager/Subsidy Client Check Officer: <br>
Use Case: Manage subsidy managers and client check officers, add new accounts, delete existing accounts. <br>
6.	Supplier Admin <br>
View/Add/Delete Electricity Supplier Organization/Material Supplier Organization/Equipment Supplier Organization: <br>
Use Case: Access and manage supplier organizations for electricity, material, and equipment, add new organizations, delete existing ones. <br>
View/Add/Delete Electricity Supplier Department/Material Supplier Department/Equipment Supplier Department:
Use Case: Manage supplier departments, add new departments, delete existing ones. <br>
7.	Energy Role <br>
View Loan/Micro-loan/Orders: <br>
Use Case: Access and view loan, micro-loan, and order information. Apply Loan/Micro-loan/Order Supplies: <br>
Use Case: Apply for a loan or micro-loan, place orders for supplies. <br>
8.	Bank Manager <br>
View Loan Application: <br>
Use Case: Access and view loan applications. Refer Application for Client Check: <br>
Use Case: Forward loan applications for client check. Approve/Reject Loan Application: <br>
Use Case: Make decisions on loan applications.
9.	Client Check Officer <br>
View Loan Application: <br>
Use Case: Access and view loan applications. Approve/Reject Loan Application: <br>
Use Case: Make decisions on loan applications. <br>
10.	Micro-Credit Manager <br>
View Loan Application:   <br>
Use Case: Access and view loan applications. Refer Application for Client Check: <br>
Use Case: Forward loan applications for client check. Approve/Reject Loan Application: <br>
Use Case: Make decisions on loan applications. <br>
11.	Micro-Credit Client Check Officer <br>
View Loan Application: <br>
Use Case: Access and view loan applications. Approve/Reject Loan Application: <br>
Use Case: Make decisions on loan applications. <br>
12.	Subsidy Manager <br>
View Subsidy Application: <br>
Use Case: Access and view subsidy applications. Refer Application for Client Check: <br>
Use Case: Forward subsidy applications for client check. Approve/Reject Loan Application/Subsidy: <br>
Use Case: Make decisions on subsidy applications. <br>
13.	Client Check Officer <br>
View Subsidy Application: <br>
Use Case: Access and view subsidy applications. Approve/Reject Loan Application/Subsidy: <br>
Use Case: Make decisions on subsidy applications. <br>
14.	Electricity Supply <br>
15.	Material Supply <br>
16.	Equipment Supply <br>
View Order: <br>
Use Case: Access and view order information. Ship/Reject Order: <br>
  <br>
Use Case: Full fill or reject orders. <br>
<br>
<br>
<br>

6.	Technology Stack<br>
<br>
The platform is built using a modern technology stack, including: <br>
●	IDE : Netbeans <br> 
●	Backend: Java<br>
●	Database : DBO4 <br>
●	SMS Integration: Twilio <br>

<br>
<br>
<br>









