# 07 — Exception and resource management

**Goal:** handle JDBC failures and release database resources reliably.

## Key ideas

- `Connection`, `Statement`, and `ResultSet` are resources that should be closed.
- Prefer try-with-resources over manual close calls.
- JDBC failures are reported through `SQLException`.
- Inspect useful exception details such as message, SQL state, and vendor error code.
- Avoid swallowing exceptions or logging secrets such as database passwords.

## Example to build

Handle a failed query and report a useful error without exposing credentials. Compare the primary exception with any suppressed exceptions from resource closing.

## Exercise

Cause a controlled SQL error and inspect its SQL state and vendor code.

## Article

Article link will be added when published.
