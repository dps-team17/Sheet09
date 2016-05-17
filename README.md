#Distributed Systems Lab ­ Homework 9
##Introduction to Web­Services (10 points)
The goal of this assignment is to implement the simple computation service we have
already implemented using Sockets and RMI using Web­Services.
### Assignments:
#### 1. Implement a simple Computation Service
Implement a WebService offering the three binary operations + (addition), ­ (subtraction)
and * (multiplication) as well as the unary operation luc (lucas) for BigInteger values.
    
    a. Implement the Server and a Client. (4 points)
    
    b. Test whether the server is capable of handling multiple requests concurrently from
    one client / multiple clients. (2 points)
    
    c. Obtain the automatically generated WSDL file. Pick one method within your interface and describe     
    all the related parts within the WSDL. (2 points)
    
    d. Compare the times required for invoking a (primitive) int addition using
    
        i. a socket based implementation
        ii. a RMI based implementation
        iii. a WebService Based implementation
        iv. a direct call to a member function (2 points)

_Note: for assignment d) – run the operation invocation within a loop and obtain the
average execution time. Use your old implementations for comparison!_
