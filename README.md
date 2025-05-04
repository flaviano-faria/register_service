# Register Service

## Overview
This project demonstrates a simple registration system using the Adapter design pattern in Java. It provides a unified interface to retrieve identification information for both physical and legal persons, abstracting the underlying service implementations.

## Project Structure
```
src/
  br/com/register/
    adapter/
      IPersonAdapter.java
      PhysicalPersonAdapter.java
      LegalPersonAdapter.java
    service/
      PhysicalPersonService.java
      LegalPersonService.java
    entity/
      PhisicalPerson.java
      LegalPerson.java
    app/
      PersonExec.java
```

## How It Works
- **Entities**: `PhisicalPerson` and `LegalPerson` represent different types of persons.
- **Services**: `PhysicalPersonService` and `LegalPersonService` provide methods to retrieve IDs for each person type.
- **Adapters**: `PhysicalPersonAdapter` and `LegalPersonAdapter` implement the `IPersonAdapter` interface, adapting the respective services to a common interface.
- **App**: `PersonExec` demonstrates usage by retrieving IDs for both person types using their adapters.

## Adapter Design Pattern in This Project
The Adapter pattern is used to allow the application to interact with different person services (`PhysicalPersonService` and `LegalPersonService`) through a common interface (`IPersonAdapter`).

- **IPersonAdapter**: Defines a standard method `getId(String payload)`.
- **PhysicalPersonAdapter** and **LegalPersonAdapter**: Implement `IPersonAdapter` and internally use their respective services to fetch the ID, adapting the service-specific method to the common interface.

This approach allows the main application (`PersonExec`) to work with different person types in a uniform way, promoting flexibility and scalability.

## Example Usage
```java
String x = "1234";
PhysicalPersonService ppS = new PhysicalPersonService();
PhysicalPersonAdapter ppA = new PhysicalPersonAdapter(ppS);
System.out.println(ppA.getId(x));

LegalPersonService lps = new LegalPersonService();
LegalPersonAdapter lpa = new LegalPersonAdapter(lps);
System.out.println(lpa.getId(x));
```

## Benefits of the Adapter Pattern Here
- **Decouples** the application logic from specific service implementations.
- **Easily extendable** to support new person types by adding new adapters.
- **Promotes code reuse** and maintainability.

---

*This project is a simple demonstration of the Adapter pattern in Java for educational purposes.* 