# 03 — ResultSet and Java type mapping

**Goal:** read query results correctly and map SQL column types to Java types.

## Key ideas

- A `ResultSet` cursor starts before the first row; call `next()` to advance.
- Read columns using their labels or indexes.
- Match Java types to SQL types rather than converting everything to strings or floating-point numbers.
- Use `BigDecimal` for SQL `DECIMAL` values such as money.

## Common mappings

| SQL type | Java type |
|---|---|
| `BIGINT` | `long` / `Long` |
| `VARCHAR` | `String` |
| `DECIMAL` | `BigDecimal` |
| `DATE` | `LocalDate` |
| `TIMESTAMP` | `LocalDateTime` |
| `BOOLEAN` | `boolean` / `Boolean` |

## Exercise

Read all bookings and map `amount` to `BigDecimal`. Explain why `double` is not the preferred representation for monetary values.

## Article

Article link will be added when published.
