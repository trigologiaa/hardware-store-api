# JR Technical Test

## Main Exercise: REST API

A hardware store needs a REST API developed with Spring Boot that allows it to manage the different
tools and products available in its business.

The decision to develop an API is due to the fact that, in a later stage of the project, the goal is
to build an independent frontend that consumes its services.

All system information must be stored in a relational database, allowing data to be persisted safely
and in an organized manner.

Each tool must be registered within the system along with its main data, such as:

- Name
- ID
- Brand
- Category
- Price
- Available stock (or Quantity available in stock)
- Description

The system must allow performing the necessary CRUD operations to manage the hardware store's tools
or products:

- Register a new tool.
- View all registered tools.
- Retrieve a specific tool.
- Modify the data of an existing tool.
- Delete a tool from the system.

For the time being, the tools will not be related to other entities or tables.

The objective is to develop a complete CRUD for tools or products, correctly applying the
architecture of a Spring Boot application, using persistence with Spring Data JPA, and exposing the
data through a REST API.

## Extra Exercise: Graphical Interface

As an additional feature, a simple frontend using Thymeleaf can be implemented to allow interaction
with the system from a web graphical interface.

This frontend must allow viewing the list of tools and accessing forms to register, modify, and
delete tools in a simple and intuitive way.
