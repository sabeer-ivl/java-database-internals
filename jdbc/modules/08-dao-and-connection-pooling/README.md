# 08 — DAO and connection pooling

**Goal:** separate persistence code from application logic and understand how applications manage connections.

## Key ideas

- A DAO (Data Access Object) groups database operations behind an application-focused API.
- Keep SQL and row mapping out of unrelated business logic.
- A connection pool reuses managed connections instead of opening a new physical database connection for every operation.
- In production applications, prefer a configured `DataSource` and a pool over calling `DriverManager` throughout the codebase.
- A pool manages connection lifecycle; it does not remove the need to close connections borrowed by application code.

## Example to build

Refactor the booking queries into a small DAO. Then compare direct `DriverManager` usage with obtaining connections from a `DataSource`.

## Exercise

Identify which responsibilities belong in the DAO and which belong in the calling service. Explain why a pooled connection should still be closed by the borrower.

## Article

Article link will be added when published.
