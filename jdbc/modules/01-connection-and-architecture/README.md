# 01 — JDBC connection and architecture

**Goal:** understand how a Java program obtains a database connection and which JDBC components are involved.

## Key ideas

- JDBC is the standard Java API for database access.
- The database vendor supplies the JDBC driver implementation.
- `DriverManager.getConnection(...)` asks a suitable driver to establish a connection.
- `Connection`, `Statement`, and `ResultSet` are JDBC interfaces.
- Try-with-resources closes JDBC resources when the block exits.

## Run

Start MariaDB using the [project setup](../../../README.md), then run the current example:

```bash
mvn compile exec:java
```

The current runnable entry point is `src/main/java/com/sabeer/database/jdbc/Main.java`.

## Inspect

Print these values from the opened connection:

- `connection.getClass().getName()`
- `connection.getMetaData().getDatabaseProductName()`
- `connection.getMetaData().getDatabaseProductVersion()`
- `connection.isValid(2)`

The concrete connection class is supplied by the MariaDB JDBC driver; it is not a class your application should instantiate directly.

## Exercise

1. Identify the JDBC URL's protocol, host, port, and database name.
2. Find the JDBC driver dependency in `pom.xml`.
3. Explain why application code declares the variable as `Connection` rather than the driver's concrete class.

## Article

Article link will be added when published.
