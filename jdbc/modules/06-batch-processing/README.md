# 06 — Batch processing and generated keys

**Goal:** insert or update multiple records efficiently and retrieve generated database IDs.

## Key ideas

- Batch processing groups parameter sets for execution.
- Use `addBatch()` and `executeBatch()` with a `PreparedStatement`.
- Understand the returned update counts and batch failure behavior.
- Request generated keys when an inserted row uses an auto-increment key.

## Example to build

Insert several bookings in a batch, then insert one booking and retrieve its generated ID.

## Exercise

Compare a loop that executes each insert separately with a batch. Observe the code and database results; do not assume batching always means one network round trip.

## Article

Article link will be added when published.
