# Java Database Internals

A practical, code-first learning lab for understanding how Java applications interact with relational databases.

This repository focuses on **small runnable examples**, concise notes, and exercises—not long, duplicated tutorials. The accompanying articles explain the concepts; this repository contains the code you can run and inspect.

## Learning tracks

| Track | What you'll explore | Status |
|---|---|---|
| [JDBC](./jdbc/README.md) | Connections, SQL execution, result mapping, CRUD, transactions, batching, and application structure | In progress |
| [SQL & Databases](./sql/README.md) | SQL queries, joins, constraints, relationships, and schema design | In progress |
| [ORM Fundamentals](./orm/README.md) | Object-relational mapping, persistence context, and entity lifecycle | Planned |
| [Hibernate](./hibernate/README.md) | Entity mapping, relationships, fetching, dirty checking, and generated SQL | Planned |

## How to use this repository

1. Choose a learning track.
2. Read its short module notes.
3. Run the example locally.
4. Inspect the SQL and output.
5. Complete the small exercise before moving on.

Examples will build around a shared booking domain so we can compare direct JDBC code with ORM-based persistence later.

## Requirements

- Java 17+
- Maven 3.9+
- Docker Engine and Docker Compose

## Start the database

Copy the example environment file:

```bash
cp .env.example .env
```

On Windows PowerShell:

```powershell
Copy-Item .env.example .env
```

Review the local credentials in `.env`, then start MariaDB:

```bash
docker compose up -d
docker compose ps
```

MariaDB is exposed on `localhost:3306`. The initialization script creates the sample `bookings` table and inserts a few rows when the database volume is first initialized.

> The initialization script runs only when MariaDB creates a fresh data directory. If you change it after the first startup, `docker compose down -v` removes the lab database volume so it can be initialized again. This deletes the data stored in that volume.

## Run the current JDBC example

Set the connection variables in the same terminal where you run Maven.

**macOS / Linux**

```bash
export DB_URL="jdbc:mariadb://localhost:3306/java_database_lab"
export DB_USERNAME="lab_user"
export DB_PASSWORD="lab_password"
mvn compile exec:java
```

**Windows PowerShell**

```powershell
$env:DB_URL = "jdbc:mariadb://localhost:3306/java_database_lab"
$env:DB_USERNAME = "lab_user"
$env:DB_PASSWORD = "lab_password"
mvn compile exec:java
```

These credentials are for the local learning environment only. Do not reuse them in a deployed application.

## Stop the database

```bash
docker compose down
```

To also delete the persisted lab data:

```bash
docker compose down -v
```

## Repository principles

- **Runnable over theoretical:** important concepts should have executable examples.
- **Show the database behavior:** inspect SQL, returned rows, and transaction effects.
- **One concept at a time:** keep examples small and focused.
- **Avoid premature abstraction:** introduce patterns such as DAO when they solve a problem we have encountered.
- **Keep the domain consistent:** reuse the booking schema where it makes comparisons easier.
- **No duplicated tutorials:** detailed explanations belong in the articles; the repository stays a practical companion.

## Articles

Articles will be linked from their corresponding track or module pages as they are published.
