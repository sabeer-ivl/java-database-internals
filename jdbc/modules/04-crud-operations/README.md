# 04 — CRUD operations

**Goal:** create, read, update, and delete records with JDBC.

## Key ideas

- Use `executeQuery()` for statements that return a `ResultSet`, typically SELECT.
- Use `executeUpdate()` for INSERT, UPDATE, and DELETE; it returns the affected-row count.
- Use `PreparedStatement` for values supplied at runtime.
- Check affected-row counts when an operation is expected to modify a record.

## Example to build

Implement create, find-by-ID, update, and delete operations for the booking table.

## Exercise

Attempt to update a booking ID that does not exist. Inspect the affected-row count and decide how the application should respond.

## Article

Article link will be added when published.
