# JDBC

Learn how Java communicates with a relational database using the JDBC API.

JDBC is the first implementation track in this repository. Work through the modules in order; each one adds a practical capability to the same MariaDB-backed booking example.

## Modules

1. [Connection and architecture](./modules/01-connection-and-architecture/README.md)
2. [Statement vs PreparedStatement](./modules/02-statement-vs-prepared-statement/README.md)
3. [ResultSet and Java type mapping](./modules/03-result-set-and-mapping/README.md)
4. [CRUD operations](./modules/04-crud-operations/README.md)
5. [Transactions](./modules/05-transactions/README.md)
6. [Batch processing and generated keys](./modules/06-batch-processing/README.md)
7. [Exception and resource management](./modules/07-resource-management/README.md)
8. [DAO and connection pooling](./modules/08-dao-and-connection-pooling/README.md)

## Before you start

Follow the setup instructions in the [root README](../README.md). You need Java 17+, Maven, Docker Compose, and a running MariaDB container.

## Learning approach

For each module: read the short notes, run the example, inspect the database behavior, and complete the exercise. Detailed explanations and walkthroughs will be linked to the corresponding articles as they are published.

## Scope

This track focuses on core JDBC. Framework-managed persistence, ORM, and Hibernate are covered separately.
