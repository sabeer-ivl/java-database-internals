# 02 — Statement vs PreparedStatement

**Goal:** execute SQL safely and understand parameter binding.

## Key ideas

- `Statement` executes SQL text as supplied.
- `PreparedStatement` represents SQL with parameter placeholders.
- Bind values with typed setter methods such as `setLong`, `setString`, and `setBigDecimal`.
- Avoid building SQL by concatenating user-provided values; use parameter binding to prevent SQL injection through values.

## Example to build

Query a booking by its ID using a `PreparedStatement`. Compare it with a deliberately unsafe string-concatenated query and observe why the latter is dangerous. Do not run destructive injection examples against a real database.

## Exercise

Add a search by customer name using a placeholder. Try names containing an apostrophe and confirm that parameter binding handles them as data.

## Article

Article link will be added when published.
