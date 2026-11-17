# 05 — Transactions

**Goal:** group multiple database operations into one atomic unit of work.

## Key ideas

- A transaction groups operations that should succeed or fail together.
- JDBC connections use auto-commit by default.
- Use `setAutoCommit(false)`, then `commit()` or `rollback()`.
- Keep transactions focused and avoid holding them open longer than necessary.

## Example to build

Model a booking operation that updates more than one table. If any required step fails, roll back the entire operation.

## Exercise

Force an error between two writes. Verify that rollback prevents a partially completed operation.

## Article

Article link will be added when published.
